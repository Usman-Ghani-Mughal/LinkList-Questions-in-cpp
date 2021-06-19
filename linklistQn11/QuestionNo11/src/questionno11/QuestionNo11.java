/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionno11;

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
    public void createlist(int d)
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
                    
			q=q.next;
		}
		q.next=temp;
	}
        
    }
    public void addatbeg(int val)
    {
        Node n=new Node();
        n.data=val;
        n.next=start;
        this.start=n;
        
    }
    public void addAfter(int d,int pos)
    {
        Node temp,q;
       	int i;
	q=this.start;
	for(i=0;i<pos;i++)
	{
		q=q.next;
		if(q==null)
		{
                        System.out.println("There are less than "+pos+" elements");
			return;
		}
	}
	temp=new Node();
	temp.next=q.next;
	temp.data=d;
	q.next=temp;
    }
 public   void del(int d)
{
	if(this.start==null)
	{
             System.out.println("Sorry list is empty");
	}
        else if(this.start.data==d)
        {
            this.start=this.start.next;
        }
	else
	{
		Node p=this.start;
		while(p.next!=null)
		{
			if(p.next.data==d)
			{
				p.next=p.next.next;
                                System.out.println("Data has been Deleted");
				return;
			}
			p=p.next;
		}
                System.out.println("Data has not been found");
	}
}
 void search(int d)
{
	Node p=this.start;
        int pos=1;
		while(p!=null)
		{
			if(p.data==d)
			{
                                 System.out.println("Item "+d+" found at position "+pos);
			}
			p=p.next;
                        pos++;
		}
		System.out.println("Item "+d+" not found in list");
}
 
 public void evenOddSplit(Node l2,Node l3)
 {
     while(this.start!=null)
     {   
         if(this.start.data%2==0)
         {
             l2.createlist(this.start.data);
             
         }
         else
         {
             l3.createlist(this.start.data);
         }
         this.start=this.start.next;
     }
 }
}

public class QuestionNo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
            Node obj=new Node();
            Node obj1=new Node();
            Node obj2=new Node();
            int position,val,choice;
            while(true)
            {
             System.out.println("\npress 1 : createList");
             System.out.println("press 2 : addAtBeg");
             System.out.println("press 3 : addAFter");
             System.out.println("press 4 : del ");
             System.out.println("press 5 : count");
             System.out.println("press 6 : display");
             System.out.println("press 7 : search");
             System.out.println("press 8 : Reverse");
             System.out.println("press 9 : l1,l2,l3");
             System.out.print("Enter your choice : ");
             choice=sc.nextInt();
            switch(choice)
             {
                case 1:
                {
                   System.out.println("Enter the value you want to place :");
                   val=sc.nextInt();
                   obj.createlist(val);
                   break;
                }
                case 2:
                {
                   System.out.println("Enter the value you want to place :");
                   val=sc.nextInt();
                   obj.addatbeg(val);
                   break;
                }
                case 3:
                {
                    System.out.println("Enter the position where you want to add :");
                    position=sc.nextInt();
                    System.out.println("Enter the value you want to add :");
                    val=sc.nextInt();
                    obj.addAfter(position,val);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the value you want to del :");
                    val=sc.nextInt();
                    obj.del(val);
                    break;
                }
                case 5:
                {
                    obj.count();
                    break;
                }
                case 6:
                {
                    obj.display();
                    break;
                }
                case 7:
                {
                    System.out.println("Enter the value you want to search :");
                    val=sc.nextInt();
                obj.search(val);
                    break;
                }
                case 8:
                {
                    obj.reverse();
                    break;
                }
                case 9:
                {
                   obj.evenOddSplit(obj1, obj2);
                   obj1.display();
                   System.out.println("\n");
                   obj2.display();
                   System.out.print("\nl1");
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
