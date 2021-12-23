package com.mouritech;

import java.io.IOException;

public class ReadChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        char c;
        System.out.println("Enter a character");
        c = (char)System.in.read();
        System.in.read();
        System.out.println("You entered " + c);
	}

}
