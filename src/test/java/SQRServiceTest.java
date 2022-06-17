import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService.SQRService;

public class SQRServiceTest {

    @Test
    public void calcSQR() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcSQR(400,600);

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void calcSQROne() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(400,500);

        Assertions.assertEquals(expected,actual);

    }
}
