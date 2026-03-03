package joelorie.github.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

  @Test
  void shouldReturnAFor90AndAbove() {
    assertEquals("Grade: A", GradeCalculator.getGrade(95));
  }

  @Test
  void shouldReturnBFor80s() {
    assertEquals("Grade: B", GradeCalculator.getGrade(85));
  }

  @Test
  void shouldReturnCFor70s() {
    assertEquals("Grade: C", GradeCalculator.getGrade(75));
  }

  @Test
  void shouldReturnDFor60s() {
    assertEquals("Grade: D", GradeCalculator.getGrade(65));
  }

  @Test
  void shouldReturnFForBelow60() {
    assertEquals("Grade: F", GradeCalculator.getGrade(50));
  }

  @Test
  void shouldRejectInvalidScore() {
    assertEquals("Score must be between 0 and 100.",
        GradeCalculator.getGrade(120));
  }
}