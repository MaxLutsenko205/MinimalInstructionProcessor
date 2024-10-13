public class ControlUnit {
    private final ALU alu = new ALU(); // Создаем ALU
    private final Register[] registers = new Register[8]; // 8 регистров

    public ControlUnit() {
        // Инициализация регистров
        for (int i = 0; i < registers.length; i++) {
            registers[i] = new Register();
        }
    }

    // Метод для выполнения инструкций
    public void execute(String instruction, int reg1, int reg2, int regDest) {
        switch (instruction) {
            case "ADD":
                registers[regDest].setValue(alu.add(registers[reg1].getValue(), registers[reg2].getValue()));
                break;
            case "SUB":
                registers[regDest].setValue(alu.sub(registers[reg1].getValue(), registers[reg2].getValue()));
                break;
            case "AND":
                registers[regDest].setValue(alu.and(registers[reg1].getValue(), registers[reg2].getValue()));
                break;
            case "OR":
                registers[regDest].setValue(alu.or(registers[reg1].getValue(), registers[reg2].getValue()));
                break;
            default:
                System.out.println("Неизвестная инструкция");
                break;
        }
    }

    // Метод для установки значений в регистры
    public void setRegisterValue(int register, int value) {
        registers[register].setValue(value);
    }

    // Метод для получения значений из регистров
    public int getRegisterValue(int register) {
        return registers[register].getValue();
    }
}
