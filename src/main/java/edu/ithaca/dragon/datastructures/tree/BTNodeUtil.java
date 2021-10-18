package edu.ithaca.dragon.datastructures.tree;

public class BTNodeUtil{

    /**
     * @return the total count of all nodes connected to root (including root)  
     */
    public static <T> int nodeCount(BTNode<T> root){
        return -1;
    }

    /**
     * @return true if itemToFind is in any node connected to root, false otherwise 
     */
    public static <T> boolean contains(BTNode<T> root, T itemToFind){
        return false;
    }

    /**
     * makes a string with the root, then the subtree left of root, then the subtree right of root
     */
    public static <T> String preOrderString(BTNode<T> root){
        if (root == null){
            return "";
        }
        else {
            return root.getItem().toString() + ", " + preOrderString(root.getLeft()) + preOrderString(root.getRight()); 
        }
    }

    /**
     * makes a string with the root, then the subtree left of root, then the subtree right of root
     */
    public static <T> String postOrderString(BTNode<T> root){
        //TODO
        return "";
    }

    /**
     * makes a string with the root, then the subtree left of root, then the subtree right of root
     */
    public static <T> String inOrderString(BTNode<T> root){
        //TODO
        return "";
    }

    /**
     * @return the height of the given tree as an int
     * height is counted as the longest single chain of edges between the root and any ancestor
     * the height of a tree with a single node is then 0 (no edges)
     * the hieght of an empty tree (no nodes) is -1  
     */
    public static <T> int height(BTNode<T> root){
        //TODO
        return -1;
    }

    /**
     * @post a node is added somewhere below the root, in order to keep the tree balanced
     */
    public static <T> void balancedAdd(BTNode<T> root, T newKey){
        if (root == null){
            throw new IllegalArgumentException("Can't add to a non-existant root");
        }
        else {
            if (root.getLeft() == null){
                root.setLeft(new BTNode<>(newKey));
            }
            else if (root.getRight() == null){
                root.setRight(new BTNode<>(newKey));
            }
            else {
                if (height(root.getLeft())> height(root.getRight())){
                    balancedAdd(root.getRight(), newKey);
                }
                else {
                    balancedAdd(root.getLeft(), newKey);
                }
            }
        }
    }
    
}
