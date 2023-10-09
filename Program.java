package OOPsem4homework;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        Box<Apple> box1Apple = new Box<Apple>();
        for (int i = 0; i < 6; i++) {
            box1Apple.addFruct(new Apple());

        }
        System.out.print("Вес коробки 1, с яблоками: ");
        System.out.println(box1Apple.getWeight());

    
        Box<Orange> box2Orange = new Box<Orange>();
        for (int i = 0; i < 4; i++) {
            box2Orange.addFruct(new Orange());

        }
        System.out.printf("Вес коробки 2, с апельсинами: %s\n", box2Orange.getWeight());

        // //попытка добавить в коробку другой класс фрукта
        // box1Apple.addFruct(new Orange()); // нельзя

        System.out.printf("Проверяем вес коробок 1 и 2 : " + (box1Apple.compare(box2Orange) ? "вес равный" : "вес разный") + ".\n");

        Box<Apple> box3Apple = new Box<>();

        box1Apple.boxTransfer(box3Apple);
        System.out.print("Вес коробки 3, с яблоками после пересыпания: ");
        System.out.println(box3Apple.getWeight());
        System.out.print("Вес коробки 1, с яблоками после пересыпания: ");
        System.out.println(box1Apple.getWeight());

        System.out.printf("Проверяем вес коробок 1 и 2 : " + (box1Apple.compare(box2Orange) ? "вес равный" : "вес разный") + ".\n");        

        // // попытка пересыпать апельсины в коробку предназначенную для яблок
        // box2Orange.boxTransfer(box1Apple); // нельзя

    }
}