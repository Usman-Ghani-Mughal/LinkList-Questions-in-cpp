/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionno17;

/**
 *
 * @author Usman Ghani Mughal
 */

import java.util.Scanner;



/**
 *
 * @author Usman Ghani Mughal
 */

class BubbleSort
{
    static int size=3;
    int n;
    int []arr=new int[size];
    BubbleSort()
    {
        this.n=0;
    }
    BubbleSort(int[] a)
    {
        this.arr=a;
        this.n=0;
    }
    BubbleSort(int si)
    {
        size=si;
        this.n=0;
    }
    public void bubbleSort()
    {
        int p=1;
        int flag;
        n=this.arr.length;
       // int temp;
        //int count=0;
        for(int passes=1;passes<=this.n-1;passes++)
        {
            flag=0;
            for(int comp=0;comp<=this.n-1-passes;comp++)
            {
                if(this.arr[comp]>this.arr[comp+1])
                {
                    //count++;
                    //System.out.println("condition true : "+count);
                    flag=1;
                    
                    this.swapsss(comp);
                }    
            }
            this.showArray(p);
            p++;
            if(flag==0)
            {
                return;
            }
        }
    }
    protected void swapsss(int com)
    {
        int temp;
        temp=this.arr[com];
        this.arr[com]=this.arr[com+1];
        this.arr[com+1]=temp;
    }
    public void getInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array");
        for(int i=0;i<size;i++)
        {
            this.arr[i]=sc.nextInt();
                    
        }
    }
    public void showArray()
    {
        System.out.println("/nyour array");
        for(int i=0;i<size;i++)
        {
            System.out.print(this.arr[i]+"  ");
        }
    }
    public void showArray(int pas)
    {
        System.out.println("\nAt : "+pas+" : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(this.arr[i]+"  ");
        }
    }
}
public class sorting {
    
}
