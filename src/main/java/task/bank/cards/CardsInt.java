package task.bank.cards;

import task.bank.ProductAbs;

public interface CardsInt<T> {
  public T minusMoneyFromBalance(float value);
  public T addMoneyToBalance(float value);
}
