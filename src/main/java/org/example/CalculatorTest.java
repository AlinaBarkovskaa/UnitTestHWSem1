package org.example;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90);

        double testResut = Calculator.calculatingDiscount(100, 100);
        assertThat(testResut).isZero();

        assertThat(Calculator.calculatingDiscount(100, 0)).isEqualTo(100);

        assertThat(Calculator.calculatingDiscount(0, 10)).isEqualTo(0);

        try {
            Calculator.calculatingDiscount(100, 101);
        } catch (ArithmeticException e){
            assertThat(e.getMessage()).isEqualTo("Процент скидки не может быть равен > 100%");
        }
        try {
            Calculator.calculatingDiscount(100, -1);
        }catch (ArithmeticException e){
            assertThat(e.getMessage()).isEqualTo("Процент скидки не может быть меньше 0");
        }
        try {
            Calculator.calculatingDiscount(-1, 10);
        }catch (ArithmeticException e){
            assertThat(e.getMessage()).isEqualTo("Сумма покупки не может быть отрицательной");
        }

    }
}