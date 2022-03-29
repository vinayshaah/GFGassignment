package com.gfg;

import java.util.HashMap;
import java.util.Map;

public class TreeOperations {

    private Node headOfBinaryTree = null;

    private Map<UserInfo,Integer> userToFreq = new HashMap<UserInfo,Integer>();

    public Map<UserInfo,Integer> findUserInfoMap(Node currentRoot){
        System.out.println("Current Root-->"+currentRoot.getUser().getName());
        Integer currentUserCount = userToFreq.get(currentRoot.getUser());
        if (currentUserCount == null){ //means that user does not exist
            userToFreq.put(currentRoot.getUser(), 1);
        } else {
            userToFreq.put(currentRoot.getUser(), ++currentUserCount);
        }
        if(currentRoot.getLeft()!=null){
            findUserInfoMap(currentRoot.getLeft());
        }
        if(currentRoot.getRight()!=null){
            findUserInfoMap(currentRoot.getRight());
        }
        return userToFreq;
    }

    public void createTree(Node node) {
        Node nodetraverser = headOfBinaryTree;
        if(nodetraverser == null){
            headOfBinaryTree = node;
        } else {
            while (nodetraverser.getLeft() != null) {
                nodetraverser = nodetraverser.getLeft();
            }
            nodetraverser.setLeft(node);
            nodetraverser.setRight(null);
        }
     }

    public Node getHeadOfBinaryTree() {
        return headOfBinaryTree;
    }
}
