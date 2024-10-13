public class Main {
    public static void main(String[] args) {
        ControlUnit controlUnit = new ControlUnit();

        // Устанавливаем значения в регистры
        controlUnit.setRegisterValue(0, 10);
        controlUnit.setRegisterValue(1, 20);

        // Выполняем операцию ADD
        controlUnit.execute("ADD", 0, 1, 2);
        System.out.println("Результат сложения: " + controlUnit.getRegisterValue(2));

        // Выполняем операцию AND
        controlUnit.execute("AND", 0, 1, 2);
        System.out.println("Результат логического AND: " + controlUnit.getRegisterValue(2));
    }
}
