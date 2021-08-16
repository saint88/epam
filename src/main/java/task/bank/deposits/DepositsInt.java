package task.bank.deposits;

public interface DepositsInt<T> {
  public T addMoneyToBalance(float value);
  public int close();
}
