package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoDaoTest {

  @Test
  void newTodoCanBeAdded() {
    Todo expected = new Todo("test", "id123", Status.ACTIVE);
    TodoDao.add(expected);
    Assertions.assertTrue(TodoDao.all().contains(expected));
  }

}
