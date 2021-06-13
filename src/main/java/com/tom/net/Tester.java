package com.tom.net;

import java.io.IOException;
import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com",80);
       }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
