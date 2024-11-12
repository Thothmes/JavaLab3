package ru.kulakov.BinTree;

public class Node {

    private int Value;
    private Node Parent;
    private Node RightChild;
    private Node LeftChild;

    public void Node (){
        this.Value = Integer.parseInt(null);
        this.Parent = null;
        this.RightChild = null;
        this.LeftChild = null;
    }

    public int getValue() {
        return Value;
    }

    public Node getRightChild() {
        return RightChild;
    }

    public Node getLeftChild() {
        return LeftChild;
    }

    public Node getParent() {
        return Parent;
    }

    public void setLeftChild(Node leftChild) {
        this.LeftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.RightChild = rightChild;
    }

    public void setParent(Node Parent) {
        this.Parent = Parent;
    }

    public void setValue(int value) {
        if (this.Value == 0) {
            this.Value = value;
        }
        else if (this.Value > 0) {
            if (this.Value < value) {
                if (this.RightChild != null) {
                    this.RightChild.setValue(value);
                }
                else {
                    this.RightChild = new Node();
                    this.RightChild.setParent(this);
                    this.RightChild.setValue(value);
                }
            }
            else if (this.Value > value) {
                if (this.LeftChild != null) {
                    this.LeftChild.setValue(value);
                } else {
                    this.LeftChild = new Node();
                    this.LeftChild.setParent(this);
                    this.LeftChild.setValue(value);
                }
            }
            else {
                System.out.print("Единственный доступный для этого значения узел уже имеет такое значение");
            }
        }
        else {
            System.out.print("Добавление отрицательных чисел нежелетельно, поскольку тогда возникнут проблемы с 0");
        }
    }

    public void delValue(int value) {
        if (this.Value == value) {
            if (this.Parent == null) {
                System.out.print("Корень удалять - не лучшая идея");
                return;
            }

            if (this.LeftChild == null && this.RightChild == null) {
                if (this.Parent.LeftChild == this) {
                    this.Parent.LeftChild = null;
                } else {
                    this.Parent.RightChild = null;
                }
            } else if (this.LeftChild == null) {
                if (this.Parent.LeftChild == this) {
                    this.Parent.LeftChild = this.RightChild;
                } else {
                    this.Parent.RightChild = this.RightChild;
                }
                this.RightChild.setParent(this.Parent);
            } else if (this.RightChild == null) {
                if (this.Parent.LeftChild == this) {
                    this.Parent.LeftChild = this.LeftChild;
                } else {
                    this.Parent.RightChild = this.LeftChild;
                }
                this.LeftChild.setParent(this.Parent);
            } else {
                Node successor = this.RightChild;
                while (successor.LeftChild != null) {
                    successor = successor.LeftChild;
                }
                this.Value = successor.Value;
                successor.delValue(successor.Value);
            }
        } else {
            if (this.LeftChild != null) {
                this.LeftChild.delValue(value);
            }
            if (this.RightChild != null) {
                this.RightChild.delValue(value);
            }
        }
    }

    public boolean containsValue(int value) {
        if (this.Value == value) {
            return true;
        }
        if (this.LeftChild != null && this.LeftChild.containsValue(value)) {
            return true;
        }
        if (this.RightChild != null && this.RightChild.containsValue(value)) {
            return true;
        }
        return false;
    }

    public void AllTree() {
        StringBuilder sb = new StringBuilder();
        inOrder(this, sb);
        System.out.println(sb);
    }

    private void inOrder(Node node, StringBuilder sb) {
        if (node != null) {
            sb.append(node.Value).append(" ");
            inOrder(node.LeftChild, sb);
            inOrder(node.RightChild, sb);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String ParentValue = new String();
        if (this.Parent == null) {
            ParentValue = "Не имеет родителя";
        }
        else {
            ParentValue = new String(String.valueOf(this.Parent.Value));
        }
        sb.append("Value: " + this.Value + '\n' + "Parent: " + ParentValue + '\n' + "LeftChild: " + this.LeftChild.Value + '\n' + "RightChild: " + this.RightChild.Value);
        return sb.toString();
    }
}
