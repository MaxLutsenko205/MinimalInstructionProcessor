# Minimal Instruction Set Processor in Java

## Project Overview
This project simulates a simple processor using Java with a minimal instruction set. The processor can perform basic arithmetic (`ADD`, `SUB`) and logic operations (`AND`, `OR`), designed to demonstrate a fundamental understanding of processor architecture.

## Features
- **ALU (Arithmetic Logic Unit)**: Supports basic operations such as addition, subtraction, AND, and OR.
- **Registers**: 8 registers to store intermediate results.
- **Control Unit**: Decodes instructions and manages data flow between the ALU and registers.

## Architecture
The processor consists of:
1. **ALU**: Handles all arithmetic and logical computations.
2. **Register File**: Stores data in 8 registers.
3. **Control Unit**: Decodes instructions and triggers the appropriate ALU operation.
4. **Instruction Set**: Minimal set includes `ADD`, `SUB`, `AND`, `OR`.

## Code Structure
1. **ALU.java**: Implements the arithmetic and logic operations.
2. **Register.java**: Defines the register structure.
3. **ControlUnit.java**: Controls the flow of instructions and manages registers and ALU.
4. **Main.java**: Main program to test the processor functionality.

## How It Works
- The user sets values in registers using `setRegisterValue()`.
- Instructions like `ADD` and `SUB` are executed by calling the `execute()` method in `ControlUnit`.
- Results of operations are stored back in registers and can be retrieved with `getRegisterValue()`.

## Sample Usage
```java
ControlUnit controlUnit = new ControlUnit();
controlUnit.setRegisterValue(0, 10);  // Set Register 0 to 10
controlUnit.setRegisterValue(1, 20);  // Set Register 1 to 20

controlUnit.execute("ADD", 0, 1, 2);  // Perform ADD operation on R0 and R1, store result in R2
System.out.println("Result of ADD: " + controlUnit.getRegisterValue(2));  // Outputs: 30
