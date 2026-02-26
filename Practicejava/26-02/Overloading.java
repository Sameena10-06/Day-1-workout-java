class Student{
    Student(){
        System.out.println("its meee");
    }
    Student(float a){
        System.out.println(a);
    }
    Student(int a, int b){
        System.out.println(a+b);
    }
}
class Overloading {
    public static void main(String[]args){
        Student s1 = new Student();
        Student s2 = new Student(10.5f);
        Student s3 = new Student(10, 20);
    }
}
