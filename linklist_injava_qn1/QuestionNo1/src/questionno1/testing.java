/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionno1;

/**
 *
 * @author Usman_Ghani_Mughal
 */
public class testing {
    public static void main(String args[])
    {
        String eq1= "3+4i";
        String eq2 = "3-4i";
        
        double arr[] = new double[15];
        for(int i = 0; i<eq1.length();i++)
        {
            for(int j=0; j<eq2.length();j++)
            {
                int x = Check(eq1.charAt(i));
                int y = Check(eq2.charAt(i));
                
                
            }
        }
    }
    public static int Check(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-':
            case '*':
            case '%':
            case '/':
                return 1;
            case 'i':
                return 2;
            default:
                return 3;
        }
    }
}
