/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import javax.swing.JOptionPane;

/**
 *
 * @author neerajsah
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       for(int i=1;i<=4;i++)
       {
         for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
         System.out.println(i);
       }
       for(int i=4;i>=1;i--)
       {
         for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
         System.out.println(i);
       }
    }
    
}
