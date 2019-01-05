package Main;

public class Player {
    private String Name;
    private int Tries=0;
    private int Money=0;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getTries() {
        return Tries;
    }

    public void setTries(int tries) {
        Tries = tries;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }
}
