package layer;
import java.util.Scanner;

import operations.*;
public class test {

public static void main(String[] args) {
// TODO Auto-generated method stub
	operations t=new operations();
Scanner s=new Scanner(System.in);
System.out.println("enter numbers");
int x=s.nextInt();
int y=s.nextInt();
System.out.println("Calculator:\n1:add\n2:sub\n3:mul\n4:div\n");

int opt=s.nextInt();

switch(opt)
{
case 1:t.add(x, y);
      break;
case 2:t.subtract(x, y);
        break;
case 3:t.multiply(x, y);
       break;
case 4:t.divide(x,y);
      break;
default:
System.out.println("invalid option");
}
s.close();
}
}

