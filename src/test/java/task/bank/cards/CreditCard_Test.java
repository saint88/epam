package task.bank.cards;

import org.junit.Before;
import org.junit.Test;
import task.bank.cards.credits.CreditCard;
import task.bank.cards.credits.CreditCardAbs;
import task.constants.CurrencyData;

public class CreditCard_Test {

  private CreditCard creditCard = null;

  private float startBalance = 100.45f;
  private final float interestRate= 2;

  @Before
  public void createCreditCard() {
    creditCard = new CreditCard(startBalance, CurrencyData.Ruble, interestRate);
  }

  @Test
  public void startBalance() {
    assert creditCard.getBalance() - startBalance == 0: "Error: Start balance is wrong";
  }

  @Test
  public void nameOfCreditCardNotEmpty() {
    assert !creditCard.getName().isEmpty(): "Credit card name is empty";
  }

  @Test
  public void interestRate() {
    assert creditCard.getInterestRate() - interestRate == 0: "Error: Interest rate of credit card is wrong";
  }

  @Test
  public void addMoneyToCreditCard() {
    float actualBalance = creditCard.addMoneyToBalance(23.4567f).getBalance();
    assert actualBalance - (float)(Math.round((startBalance + 23.4567f) * 100.0) / 100.0) == 0:
        "Error: Balance after adding operation is wrong on credit card";
  }

  @Test
  public void minusMoneyToCreditCard() {
    float value = 12.98756f;
    float actualBalance = creditCard.minusMoneyFromBalance(value).getBalance();
    assert actualBalance - (float)(Math.round((startBalance - value) * 100.0) / 100.0) == 0:
        "Error: Balance after adding operation is wrong on credit card";
  }

  @Test
  public void getDutyValue() {
    float creditValue = 5;
    float actualDutyValue = creditCard.minusMoneyFromBalance(startBalance + creditValue).getDutyValue();

    assert actualDutyValue != 0 && actualDutyValue - creditValue == 0:
        String.format("Error: Duty value should be is %f", creditValue);

    float balance = creditCard.addMoneyToBalance(10f).getDutyValue();
    assert balance == 0: "Error: Duty value should be is 0";
  }
}
