package com.tom.box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box3 box3 = new Box3();

        int length;
        int height;
        int width;
        System.out.println("Please enter object's length.\n");
        length = scanner.nextInt();
        System.out.println("Please enter object's width.\n");
        width = scanner.nextInt();
        System.out.println("Please enter object's height.\n");
        height = scanner.nextInt();

        System.out.println("length:" + length +"\t" +
                            "width:" + width + "\t" +
                            "height:" + height);
        if (box3.validate(length,width,height)){
            System.out.println(box3.getName() + "\t" + "$:" + box3.getPrice());
        }
    }
}
