package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @CsvSource(value = {
            "'zareg',1000_60,true,30",
    }

    )
    @ParameterizedTest
    void shouldCalculate(String name, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

//        long amount = 1000_60;
//        boolean registered = true;
//        long expected =30;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
}