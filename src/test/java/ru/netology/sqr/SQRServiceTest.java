package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "150,500,10"
    })

    public void calcSQRService(int min, int max, int expected){
        SQRService service = new SQRService();


        int result = service.sqrInterval(min, max);

        Assertions.assertEquals(expected, result);
    }
}