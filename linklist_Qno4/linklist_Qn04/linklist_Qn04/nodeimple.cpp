#include <iostream>
#include "nodei.h"
using namespace std;

NodeImplementation::NodeImplementation()
	{
		this->SIZE=0;
		this->START=NULL;
	}
void NodeImplementation::create_list(int d)
{
	Node *move;
	Node *temp=new Node();
	temp->DATA=d;
	temp->NEXT=NULL;
	if(this->START==NULL)
	{
		//Node *temps=new Node();
		//this->START=temps;
		this->START=temp;
		this->SIZE++;
	}
	else
	{
		move=this->START;
		while(move->NEXT!=NULL)
		{
			move=move->NEXT;
		}
		move->NEXT=temp;
		this->SIZE++;
	}
}
void NodeImplementation::add_at_beg(int d)
{
	Node *temp=new Node();
	temp->DATA=d;
	temp->NEXT=this->START;
	this->START=temp;
	this->SIZE++;
}
void NodeImplementation::add_at_after(int pos,int d)
{
	if(pos==1)
	{
		this->add_at_beg(d);
	}
	else if(pos==this->SIZE+1)
	{
		this->create_list(d);
	}
	else if(pos>1&&pos<=this->SIZE)
	{
		Node *move=this->START;
		for(int i=1;i<pos-1;i++)
		{
			move=move->NEXT;
		}
		Node *temp=new Node();
		temp->DATA=d;
		temp->NEXT=move->NEXT;
		move->NEXT=temp;
		this->SIZE++;
	}
	else
	{
		cout<<"Sorry!!! you gave wrong position"<<endl;
	}
}
void NodeImplementation::del(int d)
{
	if(this->START==NULL)
	{
		cout<<"Sorry list is empty"<<endl;
	}
	else
	{
		Node *move=this->START;
		while(move!=NULL)
		{
			if(move->DATA==d)
			{
				Node *temp=move;
				move=move->NEXT;
				delete temp;
				this->SIZE--;
				return;
			}
			move=move->NEXT;
		}
		cout<<"Data has not been found"<<endl;
	}
}
void NodeImplementation::display()
{
	Node *move=this->START;
	if(this->START==NULL)
	{
		cout<<"List is Empty!!!!!!!"<<endl;
	}
	else
	{
		while(move!=NULL)
	     {
		   cout<<move->DATA<<" ";
		   move=move->NEXT;
	     }
	}
	
}
void NodeImplementation::count()
{
	int N=0;
	Node *move=this->START;
	while(move!=NULL)
	{
		N++;
		move=move->NEXT;
	}
	cout<<"Number of Elements are : "<<N<<endl;
} 
void NodeImplementation::rev()
{
	if(this->SIZE>1)
	{
		if(this->SIZE>1)
		{
			Node *pos1,*pos2,*pos3;
			pos1=this->START;
			pos2=pos1->NEXT;
			pos3=pos2->NEXT;
			pos1->NEXT=NULL;
			pos2->NEXT=pos1;
			while(pos3!=NULL)
			{
				pos1=pos2;
				pos2=pos3;
				pos3=pos3->NEXT;
				pos2->NEXT=pos1;
			}
			this->START=pos2;
		}
	}
	else
	{
		cout<<"Sorry!!! Reversing is not posible"<<endl;
	}
	
}
void NodeImplementation::search(int d)
{
	Node *move=this->START;
	int pos=0;
		while(move!=NULL)
		{
			if(move->DATA==d)
			{
				cout<<"Item "<<d<<" found at position "<<pos<<endl;
				return;
			}
			move=move->NEXT;
			pos++;
		}
		cout<<"Item"<<d<<"not found in list"<<endl;
}
void NodeImplementation::removefirTOlast()
{
	if(this->START==NULL)
	{
		cout<<"Sorry there is not node to move!!!! list is empty"<<endl;
	}
	else
	{
		Node *temp;
	    temp=this->START;
	    this->START=this->START->NEXT;
	    Node *move=this->START;
	    while(move->NEXT!=NULL)
	     {
		   move=move->NEXT;
	     }
	     temp->NEXT=NULL;
	     move->NEXT=temp;
	}
	
}