/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionno14;

import java.util.Scanner;

/**
 *
 * @author Usman Ghani Mughal
 */

class Node
{
    int expo;
    int coeff;
    Node next;
    Node start;
    Node()
    {
        this.coeff=0;
        this.expo=0;
        this.next=null;
        this.start=null;
    }
    public void insert(int c,int e)
    {
        Node temp=new Node();
        temp.coeff=c;
        temp.expo=e;
        temp.next=null;
        if(e<0)
        {
            System.out.println("***Insrtion is not possible you gave Wrong number***");
        }
        else if(this.start==null)
        {
            this.start=temp;
        }
        else if(e>this.start.expo)
        {
            temp.next=this.start;
            this.start=temp;
        }
        else
        {
            Node move=this.start;
            if(move.expo==temp.expo)
            {
                move.coeff+=temp.coeff;
            }
            else
            {
               while(move.next!=null)
                 {
                   if(move.expo==temp.expo)
                    {
                      move.coeff+=temp.coeff;
                      return;
                    }
                   move=move.next;
                 }
               move.next=temp;
            }
            
        }
            
    }
    public void display()
    {
        if(this.start==null)
        {
            System.out.println("!!!sorry list is empty!!!");
        }
        else
        {
         Node move=this.start;
         while(move!=null)
         {
             System.out.print(move.coeff+"X^"+move.expo+"  ");
             move=move.next;
         }
        }
    }
    public Node multiply(Node obj2)
    {
        Node temp=new Node();
        
    }
}

public class QuestionNo14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Node obj=new Node();
        Node obj1=new Node();
        int co,ef,choice;
        while(true)
        {
         System.out.println("\npress 1 : Insert");
         System.out.println("press 2 : Display");
         System.out.println("press 3 : Multiply");
         System.out.print("Enter your choice : ");
         choice=sc.nextInt();
        switch(choice)
         {
            case 1:
            {
               System.out.print("Enter the coefficent :");
               co=sc.nextInt();
               System.out.print("Enter the Exponent   :");
               ef=sc.nextInt();
               obj.insert(co,ef);
               break;
            }
            case 2:
            {
               obj.display();
               break;
            }
            case 3:
            {
                System.out.print("Enter the Number You Want to multiply : ");
                co=sc.nextInt();
                break;
            }
            default:
            {
                System.out.println("Sorry you Give Wrong Input");
            }
         }   
        }
        
    }
    
}
