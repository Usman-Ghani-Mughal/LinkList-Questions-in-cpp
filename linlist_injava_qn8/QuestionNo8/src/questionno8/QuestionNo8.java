/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionno8;

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
    private int size;
    public Node()
    {
        this.size=0;
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
                this.size++;
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
                this.size++;
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
        this.size++;
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
                                this.size--;
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
 void swapNthMth(int m,int n)
{
	
	if(this.start==null)
	{
                System.out.println("lsit is Empty!!!");
	}
	else if(m==n)
	{
            System.out.println("Both positions are same Swaping is not possible");
	}
	else if((m<1 || m>this.size) || (n<1 || n>this.size))
	{
            System.out.println("You gave wrong position swaping is not possible");
	}
	else
	{
		int mth,nth;
		Node move=this.start;
		Node x=new Node();
		if(m>n)
		{
			for(int i=1;i<m;i++)
			{
				
				if(i==n)
				{
					x=move;//now x is pointing at n
				}
				move=move.next;
			}
			mth=move.data;//mth have data of m
			move.data=x.data;//setting nth data into mthn data
			x.data=mth; // setting mth data into nth data
		}
		else
		{
			for(int i=1;i<n;i++)
			{
				
				if(i==m)
				{
					x=move;
				}
				move=move.next;
			}
			nth=move.data;
			move.data=x.data;
			x.data=nth;
		}
	}
	
}
}
public class QuestionNo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
            Node obj=new Node();
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
             System.out.println("press 9 : Swap mth and nth");
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
                    int m,n;
                    System.out.print("Enter the value of Mth :");
                    m=sc.nextInt();
                    System.out.print("Enter the value of Nth :");
                    n=sc.nextInt();
                    obj.swapNthMth(m, n);
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
