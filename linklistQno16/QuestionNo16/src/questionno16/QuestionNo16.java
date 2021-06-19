/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionno16;

/**
 *
 * @author Usman Ghani Mughal
 */

import java.util.Scanner;

class Node
{
    private int data;
    private Node next;
    private Node start;
    public Node()
    {
     this.data=0;
     this.next=null;
    }
    public void reverse()
    {
     if(this.start.next!=null)
     {
         Node pos1,pos2,pos3;
         pos1=this.start;
         pos2=pos1.next;
         pos3=pos2.next;
         pos1.next=null;
         pos2.next=pos1;
         while(pos3!=null)
         {
             pos1=pos2;
             pos2=pos3;
             pos3=pos3.next;
             pos2.next=pos1;
         }
         this.start=pos2;
     }
     else
     {
         System.out.println("SOrry!!! list canont be Reverse");
     }
    }
    public void count()
    {
        Node q=this.start;
        int count=0;
        while(q!=null)
        {
            count++;
            q=q.next;
        }
         System.out.println("Number of elements are : "+count);
         
    }
    public void display()
    {
        if(this.start==null)
        {
            System.out.println(" List is empty ") ;
        }
        else
        {
            Node p=this.start;
            while(p!=null)
            {
                System.out.print(" "+p.data);
                p=p.next;
                
            }
        }
    }
    public void insert(int d)
    {
        Node q;
	if(this.start==null)
	{
		
		Node temp=new Node();
		temp.data=d;
		temp.next=null;
		this.start=temp;
	}
        else
	{
		Node temp=new Node();
		temp.data=d;
		temp.next=null;
		q=this.start;
		while(q.next!=null)
		{
                    System.out.println("ok we are in");
			q=q.next;
		}
		q.next=temp;
	}
        
    }
    
 public   void del()
{
	if(this.start==null)
	{
             System.out.println("Sorry list is empty");
	}
        else if(this.start.next==null)
        {
            this.start=this.start.next;
        }
        else
	{
		Node p=this.start;
		while(p.next.next!=null)
		{
		   p=p.next;
		}
                p.next=null;
	}
}

}

public class QuestionNo16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Node obj=new Node();
        int val,choice;
        while(true)
        {
         System.out.println("\npress 1 : Insert");
         System.out.println("press 2  : delete");
         System.out.println("press 3  : display");
         System.out.print("Enter your choice : ");
         choice=sc.nextInt();
        switch(choice)
         {
            case 1:
            {
               System.out.println("Enter the value you want to place :");
               val=sc.nextInt();
               obj.insert(val);
               break;
            }
            case 2:
            {
               obj.del();
               break;
            }
            case 3:
            {
                obj.display();
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
