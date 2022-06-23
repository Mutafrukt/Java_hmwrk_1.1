public class Main {
    public static void main(String[] args) {
        System.out.println("Приветствуем!");
        int amount = 1000;
        int rublesToOneMile = 20;
        int bonus = amount / rublesToOneMile;
        System.out.println("Стоимость билета: " + amount + " р");
        System.out.println("Начислено бонусных миль: " + bonus);
        System.out.println("Спасибо, что выбрали авиакомпанию 'Крутое пике', оставайтесь с нами!");
    }
}
