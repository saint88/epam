package task.bank.cards;

import task.constants.CurrencyData;

public class CurrencyDebitCard extends CardsAbs<CurrencyDebitCard> {

  public CurrencyDebitCard(float startBalance) {
    super("Валютная дебетовая карта", startBalance, CurrencyData.Dollar);
  }
}
