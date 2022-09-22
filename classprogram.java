import java.util.*;
abstract class person
{ String gender;
  int age;
  abstract void profession();
  person(String x,int y)
  { gender=x;
    age=y;
  }
  public void display()
  { System.out.println("Gender:"+gender+" age:"+age);
}
}
 class student extends person
 {int clss;
   void profession() { System.out.println("I am a Student");}
   student(String x,int y,int z)
   { super(x,y);
     clss=z;
   }
   public void display()
   {super.display();
   System.out.println(" student of class:"+clss);
   }
   }
 class teacher extends person
 { String subject;
   teacher(String x,int y,String z)
   { super(x,y);
      subject=z;
     
   }
   void profession()
   {System.out.println("I am a teacher");
 }
 public void display()
 { super.display();
 System.out.println("The teacher teaches:"+subject);
 }}
public class hi {
public static void main(String args[])
{ Scanner sc= new Scanner(System.in);
System.out.println("1 for student and 2 for teacher:");
int a= sc.nextInt();
if(a==1)
	
{ System.out.println("Enter the gender,age and class in which the student is resp.:");
   String u= sc.next();
   int ag=sc.nextInt();
   int cl=sc.nextInt();
student st=new student(u,ag,cl);
st.profession();
st.display();
}
else
{System.out.println("Enter the gender,age and subject taught resp.:");
String u= sc.next();
int ag=sc.nextInt();
String cl=sc.next();
teacher st=new teacher(u,ag,cl);
st.profession();
st.display();
}
sc.close();
}}
