package ru.kulakov.BinTree;

/**
 * Класс, представляющий узел бинарного дерева.
 * Содержит значение, ссылки на родителя, левого и правого потомков.
 */
public class Node {

    private int value;
    private Node parent;
    private Node rightChild;
    private Node leftChild;

    /**
     * Конструктор для создания узла.
     * Инициализирует все поля как null, значение как 0.
     */
    public Node() {
        this.value = 0;
        this.parent = null;
        this.rightChild = null;
        this.leftChild = null;
    }

    public int getValue() {
        return value;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getParent() {
        return parent;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    /**
     * Устанавливает значение в узел.
     * Если узел пустой (значение 0), устанавливает значение.
     * Иначе рекурсивно добавляет значение в поддерево.
     *
     * @param value значение для добавления
     */
    public void setValue(int value) {
        if (this.value == 0) {
            this.value = value;
            return;
        }

        if (value > this.value) {
            if (this.rightChild == null) {
                this.rightChild = new Node();
                this.rightChild.setParent(this);
            }
            this.rightChild.setValue(value);
        } else if (value < this.value) {
            if (this.leftChild == null) {
                this.leftChild = new Node();
                this.leftChild.setParent(this);
            }
            this.leftChild.setValue(value);
        }
    }

    /**
     * Удаляет значение из дерева.
     * Рекурсивно ищет узел с заданным значением и удаляет его.
     *
     * @param value значение для удаления
     */
    public void delValue(int value) {
        if (this.value == value) {
            deleteNode();
            return;
        }

        if (value < this.value && leftChild != null) {
            leftChild.delValue(value);
        } else if (value > this.value && rightChild != null) {
            rightChild.delValue(value);
        }
    }

    private void deleteNode() {
        if (leftChild == null && rightChild == null) {
            replaceInParent(null);
        } else if (leftChild == null) {
            replaceInParent(rightChild);
            rightChild.setParent(parent);
        } else if (rightChild == null) {
            replaceInParent(leftChild);
            leftChild.setParent(parent);
        } else {
            Node successor = findSuccessor();
            this.value = successor.value;
            successor.delValue(successor.value);
        }
    }

    private void replaceInParent(Node newNode) {
        if (parent != null) {
            if (parent.leftChild == this) {
                parent.setLeftChild(newNode);
            } else {
                parent.setRightChild(newNode);
            }
        }
    }

    private Node findSuccessor() {
        Node node = rightChild;
        while (node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }

    /**
     * Проверяет наличие значения в дереве.
     * Использует бинарный поиск.
     *
     * @param value искомое значение
     * @return true если значение найдено, иначе false
     */
    public boolean containsValue(int value) {
        if (this.value == value) {
            return true;
        }
        if (value < this.value && leftChild != null) {
            return leftChild.containsValue(value);
        }
        if (value > this.value && rightChild != null) {
            return rightChild.containsValue(value);
        }
        return false;
    }

    /**
     * Возвращает строковое представление дерева.
     * Значения выводятся в порядке префиксного обхода (корень-левый-правый).
     *
     * @return строка со значениями дерева
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        preOrder(this, sb);
        return sb.toString().trim();
    }

    private void preOrder(Node node, StringBuilder sb) {
        if (node != null) {
            sb.append(node.value).append(" ");
            preOrder(node.leftChild, sb);
            preOrder(node.rightChild, sb);
        }
    }
}