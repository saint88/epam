package task.bank.cards;

import task.bank.ProductAbs;
import task.constants.CurrencyData;

public class DebitCard extends CardsAbs<DebitCard> {

  public DebitCard(float startBalance) {
    super("Дебетовая карта", startBalance, CurrencyData.Ruble);
  }
}
