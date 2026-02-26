// class object example
class  Student{
    int id;
    String name;
    void display(int a){
        System.out.println(a);
        System.out.println(id + " " + name);
    }
}
class Sample{
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.id = 101;
    s1.name = "Sam";
    s1.display(10);
    Student s2 = new Student();
    s2.id = 102;
    s2.name = "sssshhhhhee";
    s2.display(20);
    }
}
