/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package live_coding;

/**
 *
 * @author huawei
 */
public class Live_Coding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // problem 1; Odd or Even
        int Almeda = oddEven(15);
        System.out.println("Problem 1: " + Almeda);

        //^Triangle Classification
        System.out.println("Problem 2:");
        System.out.println(classifyTriangle(4, 5, 6));
        System.out.println(classifyTriangle(5, 5, 3));
        System.out.println(classifyTriangle(5, 5, 5));
        System.out.println(classifyTriangle(1, 2, 3));
    }

    //problem 1; Odd or Even
    public static int oddEven(int Almeda) {

        if (Almeda % 2 == 0) {
            return 1; 
        } else {
            return 0;
        }
    }

    // Triangle Classification
    public static int classifyTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }

        if (a == b && b == c) {
            return 1;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 3;
        }
    }
}