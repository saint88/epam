package task.bank.deposits;

import org.junit.Before;
import org.junit.Test;
import task.constants.CurrencyData;

public class Deposit_Test {
  private DepositsAbs<Deposit> deposit = null;
  private final float startBalance = 450.67f;

  @Before
  public void createDeposit() {
    this.deposit = new Deposit(startBalance, CurrencyData.Ruble);
  }

  @Test
  public void addMoneyToDeposit() {
    float actualBalance = deposit.addMoneyToBalance(1500).getBalance();
    assert actualBalance == (float)(Math.round((startBalance + 1500) * 100.0) / 100.0):
        "Error: Balance after adding operation is wrong on deposit";
  }

  @Test
  public void nameOfDepositProductNotEmpty() {
    assert !deposit.getName().isEmpty(): "Error: Deposit product name is empty";
  }

  @Test
  public void closeDeposit() {
    assert deposit.close() == 0: "Error: Deposit close with error";
  }
}
