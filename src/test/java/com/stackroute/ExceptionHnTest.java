package com.stackroute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ExceptionHnTest {
    ExceptionHn obj1= new ExceptionHn();
    @Test
    public void checkNegativeArrayException()
    {
        String expectedname="Class java.lang.NegativeArraySizeException";
        String actualname=obj1.negativeexception();

        assertEquals(expectedname,actualname);
        assertNu

    }

    @Test
    public void checkIndexoutofboundexception()
    {
        String expectedname="Class java.lang.IndexOutOfBoundsException";
        String actualname=obj1.indexoutOfBoundException();

        assertEquals(expectedname,actualname);

    }


    @Test
    public void checknullpointerexception()
    {
        String expectedname="Class java.lang.NullPointerException";
        String actualname=obj1.nullPointerException();

        assertEquals(expectedname,actualname);

    }


}