package task.bank.cards;

import org.junit.Before;
import org.junit.Test;
import task.bank.cards.credits.CreditCard;
import task.constants.CurrencyData;

public class DebitCard_Test {

  private CardsAbs<DebitCard> debitCard = null;
  private CardsAbs<CurrencyDebitCard> debitCurrencyCard = null;

  private float startBalance = 245.13f;

  @Before
  public void createDebitCard() {
    this.debitCard = new DebitCard(startBalance);
    this.debitCurrencyCard = new CurrencyDebitCard(startBalance);
  }

  @Test
  public void addMoneyToDebitAndCurrencyDebitCard() {
    float actualBalance = debitCard.addMoneyToBalance(23.4567f).getBalance();
    assert actualBalance - (float)(Math.round((startBalance + 23.4567f) * 100.0) / 100.0) == 0:
          "Error: Balance after adding operation is wrong on debit card";

    actualBalance = debitCurrencyCard.addMoneyToBalance(23.4567f).getBalance();
    assert actualBalance - (float)(Math.round((startBalance + 23.4567f) * 100.0) / 100.0) == 0:
        "Error: Balance after adding operation is wrong on debit currency card";
  }

  @Test
  public void minusMoneyToDebitAndCurrencyDebitCard() {
    float actualBalance = debitCard.minusMoneyFromBalance(23.4567f).getBalance();
    assert actualBalance - (float)(Math.round((startBalance - 23.4567f) * 100.0) / 100.0) == 0:
        "Error: Balance after adding operation is wrong on debit card";

    actualBalance = debitCurrencyCard.minusMoneyFromBalance(23.4567f).getBalance();
    assert actualBalance - (float)(Math.round((startBalance - 23.4567f) * 100.0) / 100.0) == 0:
        "Error: Balance after adding operation is wrong on debit currency card";
  }

  @Test
  public void debitProductNameNotEmpty() {
    assert !debitCard.getName().isEmpty(): "Debit card name is empty";
    assert !debitCurrencyCard.getName().isEmpty(): "Debit card name is empty";
  }
}
