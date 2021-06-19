#include <iostream>
#include "node1.h"

struct NodeImplementation
{
private:
	Node *START;
	int SIZE;
public:
	NodeImplementation();
	void create_list(int);//1
	void add_at_beg(int);//2
	void add_at_after(int,int);//3
	void del(int);//4
	void display();//5
	void count();//6
	void rev();//7
	void search(int);//8
	int checkOcurance(int);//***
	Node* getStart();
};