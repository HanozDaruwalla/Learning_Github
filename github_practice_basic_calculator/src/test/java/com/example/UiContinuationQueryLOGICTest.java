package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class UiContinuationQueryLOGICTest {
    @Test
    void Ui_Continue_Query_LOGIC_Test() {
        calculator_class calculator = new calculator_class();
        Main main_class = new Main();
        char user_response = 'Y';

        assertEquals('Y', main_class.Ui_Continue_Query_LOGIC(calculator, 'Y'));
        assertEquals('y', user_response);
        assertEquals('N', user_response);
        assertEquals('n', user_response);
        assertEquals("Success", Main.Success_String);
        assertEquals("Failure", Main.Failure_String);
        assertEquals("Invalid", Main.Invalid_String);

    }
}
