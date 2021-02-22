package org.planetf1.sample.actiontest.helloworld;

/**
* Hello class for testing
* @author planetf1
* 
*/

class HelloWorld {

    /**
     * secret number to save
     */
    private int i;

    /**
     * setter for i
     * 
     * @param value to set
     * @since 1.0
     */
    public void seti(int value) {
        i = value;
    }

/**
 * Just a main
 * @param args String[] Command line args 
 * @since 1.0
 */
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}