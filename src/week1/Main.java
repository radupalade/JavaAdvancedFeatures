package week1;

public class Main {
    public static void main(String[] args) {

        Adress adress = new Adress("Iasi", "Copou", 4);
        SdaGroup grupa5 = new SdaGroup(adress);
        Student student = new Student(new Name("ionel", "mihai"), 5, 2);
        grupa5.addStudent(student);
        grupa5.addStudent(new Student(new Name("ionel", "ionica"), 2, 3));
        grupa5.addStudent(new Student(new Name("ionel", "ionica"), 2, 3));
        grupa5.addStudent(new Student(new Name("ionel", "ionica"), 2, 3));


        System.out.println(grupa5.toString());

    }
}
/*
        Name n = new Name("ion", "popescu");
        Student s = new Student(n, 23, 10);
        System.out.println(s.toString());

        Student s2 = new Student(new Name("gigi", "smecheru"), 45, 9);
        System.out.println(s2);*/
      /*  Printer printer = new Printer();
        printer.printPerson(s1);
      *

        Person p = new Person();
        System.out.println(p.toString());


       /* Main m = new Main();
        m.displayStatic();*/


/*
    public void display() {
        System.out.println("Hello display");
    }

    public static void displayStatic() {
        System.out.println("Hello display static");
        Main m = new Main();
        m.display(); // creem un constructor pt a putea apela display() in displayStatic()

    }
}
*/

      /*  Printer printer = new Printer();

        Person p1 = new Person("marcel", 5);
        Person p2 = new Person("marcel", 5);
        Person p3 = new Person("gigi", 5);
        Person p4 = new Person("marcel", 5);


        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        System.out.println(Person.count);
        System.out.println(p3.getName());

        Circle c1 = new Circle(1);
        Circle c2 = new Circle(12);
        System.out.println(c1.getR());
        System.out.println(c2.getR());
      */
        /*Person p2 = new Person("george", 6);

        Person p3 = new Person("Alin");
        Person p4 = new Person(30);
*/
        /*Person p1 = new Person();
        p1.setName("marcel");
        p1.setAge(5);
*/
//    printer.printPerson(p1);


//System.out.println(p1.getName() + " " + p1.getAge());


//System.out.println(p2.getName() + " " + p2.getAge());


//printer.printMessage("fanta de portocale", 10);
//inter.printMessage("cola", 9);

        /*int sum = printer.addNumbers(2,3);

        System.out.println("sum is: " + sum);*/
