package task.bank;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;
import task.constants.CurrencyData;

import java.text.DecimalFormat;

@Getter
@AllArgsConstructor
public abstract class ProductAbs<T> {

  protected T updateBalance(float newBalance) {
    this.balance = newBalance;

    return (T)this;
  }

  private String name;
  private float balance;
  private CurrencyData currencyData;
}
