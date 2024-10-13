// Класс для выполнения базовых арифметических и логических операций
public class ALU {

    // Метод для сложения двух регистров
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для вычитания двух регистров
    public int sub(int a, int b) {
        return a - b;
    }

    // Логическое И
    public int and(int a, int b) {
        return a & b;
    }

    // Логическое ИЛИ
    public int or(int a, int b) {
        return a | b;
    }
}
