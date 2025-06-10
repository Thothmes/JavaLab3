package ru.kulakov.BinTree;

/**
 * Класс, представляющий бинарное дерево.
 * Содержит корневой узел дерева.
 */
public class BinaryTree {

    private Node root;

    /**
     * Конструктор для создания пустого дерева.
     */
    public BinaryTree() {
        this.root = null;
    }

    /**
     * Возвращает корневой узел дерева.
     *
     * @return корневой узел
     */
    public Node getRoot() {
        return root;
    }

    /**
     * Устанавливает корневой узел дерева.
     *
     * @param root новый корневой узел
     */
    public void setRoot(Node root) {
        this.root = root;
    }
}