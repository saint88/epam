package task.bank.deposits;

import task.constants.CurrencyData;

public class Deposit extends DepositsAbs {

  public Deposit(float startBalance, CurrencyData currencyData) {
    super("Депозит", startBalance, currencyData);
  }
}
