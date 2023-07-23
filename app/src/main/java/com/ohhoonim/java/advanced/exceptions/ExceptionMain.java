package com.ohhoonim.java.advanced.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain {

    public static void main(String[] args) {
        System.out.println("Exception의 이해");
        // Unchecked Exception
        // divide(234);
        // Checked Exception
        try (FileReader reader = new FileReader("sample.txt")){
            reader.read();
        } catch (IOException  e) {
            e.printStackTrace();
        } 

        for(int i = 0; i < 10; i++) {
            //lllllll
        }

    }

    public static int divide(int number) {
        if (number > 10) {
            throw new MyNumberException("입력값이 10보다 큽니다.", new IllegalArgumentException(
                    "number값이 " + number, new NullPointerException("그냥 재미로 null")));
        }
        return number / 2;
    }
}
