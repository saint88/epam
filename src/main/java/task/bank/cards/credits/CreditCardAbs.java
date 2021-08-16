package task.bank.cards.credits;

import lombok.Builder;
import lombok.Getter;
import task.bank.ProductAbs;
import task.bank.cards.CardsAbs;
import task.bank.cards.CardsInt;
import task.constants.CurrencyData;

public abstract class CreditCardAbs<T> extends CardsAbs<T> {

  public CreditCardAbs(String name, float startBalance, CurrencyData currencyData, float interestRate) {
    super(name, startBalance, currencyData);
    this.interestRate = interestRate;
  }

  @Getter
  protected float interestRate;

  public float getDutyValue() {
    float balance = this.getBalance();
    return balance < 0 ? Math.abs(balance): 0;
  }
}
