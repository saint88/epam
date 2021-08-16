package task.bank.cards.credits;

import task.bank.ProductAbs;
import task.constants.CurrencyData;

public class CreditCard extends CreditCardAbs<CreditCard> {

  public CreditCard(float startBalance, CurrencyData currencyData, float interestRate) {
    super("Кредитная карта", startBalance, currencyData, interestRate);
  }
}
