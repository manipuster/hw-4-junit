package tests.gb;

import my.triangle.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {

    private static final Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @BeforeEach
    void setUpTest(){
        logger.info("\t\tBEFORE ONE TEST");
    }

    @Test
    public void areaGivenTriangleReturnsArea () throws Exception {
        Triangle t = new Triangle(5.0f, 8.0f, 10.0f);
        Assertions.assertEquals(19.81f, t.area(), 0.001);
    }

    @ParameterizedTest
    @CsvSource({"5.0f, 5.0f, 10.0f", "5.0f, 10.0f, 5.0f", "10.0f, 5.0f, 5.0f"})
    public void triangleGivenInvalidSizesThrowsException (float a, float b, float c){
        Assertions.assertThrows(
                Exception.class,
                ()-> new Triangle (a, b, c)
        );
    }

}
