package task.bank.deposits;

import task.bank.ProductAbs;
import task.constants.CurrencyData;

public abstract class DepositsAbs<T> extends ProductAbs<T> implements DepositsInt<T> {

  public DepositsAbs(String name, float startBalance, CurrencyData currencyData) {
    super(name, startBalance, currencyData);
  }

  public T addMoneyToBalance(float value) {
    return this.updateBalance(this.getBalance() + value);
  }

  public int close() {
    return 0;
  }
}
