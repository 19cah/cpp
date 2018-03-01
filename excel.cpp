/**
 *  Export data to Excel in C++
 * 
 *  @author: Carlos Abraham Hernandez
 *  @url: www.19cah.com, github.com/19cah
 */


#include <iostream>
#include <fstream>
#include<string>
#include <iomanip>
using namespace std;
int main()
{
	ofstream outdata;

    string name, lastName, age;
    string getName, getLastName, getAge;
    
    name = "Name";
    lastName = "Last Name";
    age = "Age";

    outdata.open("example.csv", ios::app);
    outdata << name << "," 
            << lastName << ", " 
            << age << ","<<  endl;

    for(int i = 0; i < 5; i++)
    {
        getName = "";
        getLastName = "";
        getAge = "";

        cout << "Get Information for user no. " << i + 1 << endl;
        cout << "Enter your name: "; getline(cin, getName);
        cout << "Enter your last name: "; getline(cin, getLastName);
        cout << "Enter your age: "; getline(cin, getAge);
        cout << endl;

    outdata << getName << "," 
            << getLastName << "," 
            << getAge << "," << endl;

    }
	return 0;
}
