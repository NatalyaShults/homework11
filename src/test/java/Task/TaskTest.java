package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    public void testMatchesForSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("родителям");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("родителям");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Бабушке");

        Assertions.assertFalse(actual);
    }


    @Test
    public void testMatchesForEpicWhenTrue() {
        Epic epic = new Epic(55, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Хлеб");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForEpicWhenFalse() {
        Epic epic = new Epic(55, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Колбаса");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMatchesForMeetingWhenTrue() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean actual = meeting.matches("Приложение");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForMeetingWhenFalse() {
        Meeting meeting = new Meeting(555,"Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean actual = meeting.matches("Позвонить");

        Assertions.assertFalse(actual);
    }

}