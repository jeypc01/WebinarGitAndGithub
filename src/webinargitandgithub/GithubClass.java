/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webinargitandgithub;

import java.util.Scanner;

/**
 *
 * @author Jeycood
 */
public class GithubClass {
    
    public void Print(){
        System.out.println("This is a great Webinar, I am changing this class from Github");             
    }
    
    public void PrintMyName(){
        
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Could you type you name?: " );

        String name = scanner.nextLine();
        System.out.println("My name is: " + name);
    
    
    }
}
