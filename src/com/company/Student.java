package com.company;

class Name {
    String name;
    public String getName(String name)
    {
        this.name = name;
        return name;
    }
}
class ID {
    int id;
    public int getID(int id)
    {
        this.id=id;
        return id;
    }
}
class Phone_Number {
    int mobileno;
    public int getPhone_Number(int mobileno)
    {
        this.mobileno = mobileno;
        return mobileno;
    }
}
class Student_Marks{
    int Total_marks;
    public int getTotal_Marks(int Total_marks){
        this.Total_marks=Total_marks;
        return Total_marks;
    }
}
class Display_Details {
    public static void main(String[] args)
    {
        Name obj1 = new Name();
        System.out.println(obj1.getName("Rohan"));
        ID obj2 = new ID();
        System.out.println(obj2.getID(05));
        Phone_Number obj3 = new Phone_Number();
        System.out.println(obj3.getPhone_Number(111111111));
        Student_Marks obj4=new Student_Marks();
        System.out.println(obj4.getTotal_Marks(87));
    }
}
