# Number Of Digits – Java Program

##  Description
Number Of Digits is a simple Java program that counts the total number of digits in a given integer using a `while` loop and integer division.

##  Objective
- Understand `while` loops in Java.
- Learn integer division.
- Practise counter variables and basic arithmetic operations.
- Improve problem-solving skills.

##  Technologies Used
- **Language:** Java
- **Input:** Scanner class
- **Concepts:** While loop, variables, arithmetic operators

##  Source Code
```java
import java.util.*;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int Count = 0;

        while (num > 0) {
            num = num / 10;
            ++Count;
        }

        System.out.println("Number of Digits is : " + Count);
        sc.close();
    }
}
```

##  Sample Output
```text
Input:
12345

Output:
Number of Digits is : 5
```

##  How It Works
1. Read an integer from the user.
2. Initialize the digit counter to `0`.
3. Divide the number by `10` repeatedly.
4. Increment the counter after each division.
5. Print the total number of digits.

##  How to Run
1. Install the Java Development Kit (JDK).
2. Save the source code as `NumberOfDigits.java`.
3. Open a terminal in the file's directory.
4. Compile the program:
   ```bash
   javac NumberOfDigits.java
   ```
5. Run the program:
   ```bash
   java NumberOfDigits
   ```

## Learning Outcome
This project demonstrates how loops and integer division can be used to solve basic programming problems in Java.

## 📄 License
This project is open-source and available for learning and educational purposes.
