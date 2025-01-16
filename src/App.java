
public class App {

    public static void main(String[] args) {

        String name = "Wadz";
        int number = 71;

        Calculator answer = new Calculator();

        answer.setNumber(7, 23, 17);

        System.out.println("------------------------Calculator--------------------------");
        System.out.println(name + " " + number);
        Age age = new Age(25);
        age.checkAge();
        System.out.println();

        System.out.println("Addition = " + answer.addition());
        System.out.println("Subtraction = " + answer.subtract());
        System.out.println("Division = " + answer.division());
        System.out.println("Multiplication = " + answer.multiplication());

        System.out.println();
        System.out.println("-------------------------Basic Intro-------------------------");
        System.out.println();

        Person person1 = new Person("Wadz", "Sampaloc Mnl.", 24);
        person1.intro();

        Person person2 = new Person("Abu-Zair", "Jolo, Sulu", 25);
        person2.intro();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 1");

        Person info = new Person(
                "Wadz Ibbara",
                "BSIT",
                "wadzwadz@gmail.com");
        System.out.println(info);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 2");

        Person info1 = new Person(
                "Abu-zair Ibbara",
                "BSIT",
                "zair@gmail.com");
        System.out.println(info1);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 3");

        Person info2 = new Person(
                "Boss Bossing",
                "BSIT",
                "boss@gmail.com");
        System.out.println(info2);

        System.out.println();
        System.out.println("-----------------------Basic Info---------------------------");

        // Creating ClientInfo objects
        ClientInfo client = new ClientInfo(
                116,
                "Wadz",
                "Ibbara",
                "wadz@gmail.com",
                "09123456789",
                "1020-D Quezon Boulevard",
                "Single",
                "Male",
                25);

        System.out.println(client);
        System.out.println();
        ClientInfo client1 = new ClientInfo(
          116,
          "Abu-Zair",
          "Ibbara",
          "zair@gmail.com",
          "09123456789",
          "Jolo, Sulu",
          "Single",
          "Male",
          25);

        System.out.println(client1);

        System.out.println();
        System.out.println("-----------------------Basic Pattern---------------------------");

        SimplePattern patternExample = new SimplePattern();
        String[] pattern = patternExample.getMe();

        for (String line : pattern) {
            System.out.println(line);
        }
    }

}
