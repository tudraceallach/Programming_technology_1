import file1.Arrays;
import file1.ConditionalStatements;
import file1.LoopOperatorParam;
import file1.LoopOperatorsPrePost;
import file3.Employee;
import file3.FractionalNumber;
import file3.Product;
import file3.Room;

public class Main {

    public static void products() {
        Product prod = new Product("Пряник", 125, 2020);
        prod.getInfo();

        System.out.println(prod.productAge() + "\n");
        prod.increasePrice();
        prod.setManufacturer("AnnCake");

        prod.getInfo();
        System.out.printf("$%.2f\n\n", prod.usdCost());
    }

    public static void employees() {
        Employee[] emps = new Employee[2];
        emps[0] = new Employee("Иванов", 15000, 1995);
        emps[1] = new Employee("Мышкина", "Кассир", 20000, 1994);

        for (Employee e : emps) {
            e.getInfo();
            e.increaseSalary();
            e.getInfo();
        }
    }

    public static void numbers() {
        FractionalNumber f = new FractionalNumber(1,12);
        f.getInfo();
    }

    public static void rooms() {
        Room r = new Room(25,10, 5);
        r.getInfo();
    }

    public static void main(String[] args){

        ConditionalStatements c = new ConditionalStatements();
//        c.one();
//        c.two();
//        c.three();
//        c.four();
//        c.five();
//        c.six();
        LoopOperatorsPrePost l = new LoopOperatorsPrePost();
//        l.one();
//        l.two();
//        l.three();
//        l.four();
        LoopOperatorParam p = new LoopOperatorParam();
//        p.one();
//        p.two();
//        p.three();
//        p.four();
        Arrays a = new Arrays();
//        a.one();
//        a.two();
//        a.three();
//        a.four();
//        a.five();
        a.six();
//        a.seven();
        // file3
//        products();
//        employees();
//        rooms();
//        numbers();

    }
}
