package codeJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank1 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {


        int n = 10;


        int[] ar = {1,1, 3, 1, 2, 1, 3, 3, 3, 3};



        int result = Utilidades.sockMerchant(n, ar);
        System.out.println(result);

    }
}



