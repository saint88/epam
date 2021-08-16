package task.bank.cards;

import lombok.Builder;
import task.bank.ProductAbs;
import task.bank.cards.credits.CreditCardAbs;
import task.constants.CurrencyData;

public abstract class CardsAbs<T> extends ProductAbs<T> implements CardsInt<T> {

  public CardsAbs(String name, float startBalance, CurrencyData currencyData) {
    super(name, startBalance, currencyData);
  }

  public T minusMoneyFromBalance(float value) {
    float newBalance = (float)(Math.round((this.getBalance() - value) * 100.0) / 100.0);
    return this.updateBalance(newBalance);
  }

  public T addMoneyToBalance(float value) {
    float newBalance = (float)(Math.round((this.getBalance() + value) * 100.0) / 100.0);
    return this.updateBalance(newBalance);
  }
}
