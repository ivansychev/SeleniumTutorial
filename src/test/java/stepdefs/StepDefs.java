package stepdefs;

import com.ivansychev.examples.OpenDBO;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import resources.Driver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class StepDefs {
    @Дано("^Клиент захотел открыть брокерский счет$")
    public void клиент_захотел_открыть_брокерский_счет() throws InterruptedException {
        Driver.webDriver.get("https://www.sberbank.ru/ru/person");
        Thread.sleep(5000);
        Driver.webDriver.get("https://online.sberbank.ru/CSAFront/index.do?_ga=2.99842204.363545992.1580808321-35751654.1578926633#/");
        Thread.sleep(3000);
        System.out.println("LOG: Клиент захотел открыть счет");
    }

    @Когда("^Клиент нажал на кнопку открытия брокерского счета в Личном Кабинете$")
    public void клиент_нажал_на_кнопку_открытия_брокерского_счета_в_Личном_Кабинете() {
        System.out.println("LOG: Клиент нажал на кнопку");
    }

    @Тогда("^Клиент успешно открыл брокерский счет$")
    public void клиент_успешно_открыл_брокерский_счет() {
        assertEquals("Success", OpenDBO.openDBO());
    }
}
