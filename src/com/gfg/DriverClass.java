package com.gfg;

import java.util.Map;
import java.util.Scanner;

public class DriverClass {

    public  static void main(String[] args) throws Exception {
        System.out.println("Hello, started running DriverClass");
        Node node = null;
        UserInfo userInfo = null;
        TreeOperations treeOperations = new TreeOperations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many nodes do you need in tree?");
        int noOfNodes = scanner.nextInt();
        for(int i=1;i<=noOfNodes;i++) {
            userInfo = new UserInfo();
            System.out.print("Enter the user name");
            userInfo.setName(scanner.next());
            System.out.print("Enter the user age");
            userInfo.setAge(scanner.nextInt());
            System.out.print("Enter the user height");
            userInfo.setHeight(scanner.nextLong());
            node = new Node();
            node.setUser(userInfo);
            node.setLeft(null);
            node.setRight(null);
            treeOperations.createTree(node);
        }
        Map<UserInfo,Integer> userToFreq = treeOperations.findUserInfoMap(treeOperations.getHeadOfBinaryTree());
        System.out.println(userToFreq);
        //Iterating through the map
        for (var entry : userToFreq.entrySet()) {
            System.out.println(entry.getKey().getName() + "/" + entry.getValue());
        }

    }


}
