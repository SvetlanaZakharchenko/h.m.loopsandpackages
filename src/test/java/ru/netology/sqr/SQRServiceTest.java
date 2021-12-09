package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'squares in the range', 200, 300, 3",
            "'border start', 100, 300, 8",
            "'border end', 9000, 10000, 4"})
    void shouldSqrCeil(String name, int start, int end, int expected) {
        SQRService sqrService = new SQRService();

        int actual = sqrService.sqrCeil(start, end);

        assertEquals(expected, actual);
    }

}