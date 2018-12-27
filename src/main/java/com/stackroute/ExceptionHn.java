package com.stackroute;

import java.util.Scanner;

public class ExceptionHn {

    public String negativeexception()
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        try{
            int[] ar=new int[i];

        }
        catch (NegativeArraySizeException e)
        {
            return e.getClass().toString();

        }

        return null;
    }

    public String indexoutOfBoundException(){
        try {

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            return e.getClass().toString();
        }
return null;
    }
    public String nullPointerException(){
        try {

        }
        catch (NullPointerException e)
        {
            return e.getClass().toString();
        }
        return null;

    }

}
