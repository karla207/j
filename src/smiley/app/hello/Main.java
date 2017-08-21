/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smiley.app.hello;
import smiley.lib.HelloWorld;
/**
 *
 * @author smiley
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloWorld myHelloWorld = new HelloWorld();
        myHelloWorld.setName("Claudio");
        myHelloWorld.printStatus();
    }
    
}
