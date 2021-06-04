package achoo;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem2
{
    public static void main( String[] args )
    {
        Scanner a = new Scanner(System.in);
        System.out.print( "What is the input string? " );
        String str = a.nextLine();
        int l = str.length();
        System.out.println(str + " has " + l + " characters.");
    }
}
