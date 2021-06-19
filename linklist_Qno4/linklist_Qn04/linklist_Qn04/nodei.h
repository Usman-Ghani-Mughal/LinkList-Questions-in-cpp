#include <iostream>
#include "node.h"

struct NodeImplementation
{
private:
	Node *START;
	int SIZE;
public:
	NodeImplementation();
	void create_list(int);
	void add_at_beg(int);
	void add_at_after(int,int);
	void del(int);
	void display();
	void count();
	void rev();
	void search(int);
	void removefirTOlast();//4
};