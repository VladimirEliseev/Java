package com.company;
import java.io.*;
import java.util.*;
public class Main{

    public static void main(String[] args) throws IOException {
        InteABSServices iservice = null;
        iservice = new IPriceAbsService();
        Iwash iwash = iservice.getWash();
        System.out.println(iwash.getWashPrice());
    }
}