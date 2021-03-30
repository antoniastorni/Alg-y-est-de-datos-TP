package ARBOLES;

public interface BinaryTreee<T> {

        public BinaryTree();
        public BinaryTree(T o);
        public BinaryTree(T o, BinaryTree<T> tleft, BinaryTree<T> tright);
        public boolean isEmpty();
        public T getRoot();
        public BinaryTree<T> getRight();
        public BinaryTree<T> getLeft();
    }

}
