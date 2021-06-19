#include <iostream>
#include "node1.h"

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
	NodeImplementation splitting();
	Node* getStart();
	void set_size(Node *p);
};