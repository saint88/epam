package task.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CurrencyData {
  Dollar("$"),
  Ruble("₽");

  private final String name;
}
