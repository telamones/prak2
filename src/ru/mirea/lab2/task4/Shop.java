package ru.mirea.lab2.task4;

public class Shop {
    private static int n;
    private static Computer[] computers = new Computer[n];

    public Shop(int n) {
        this.n = n;
        computers = new Computer[n];
    }

    public void add(Computer comp) {
        for (int i = 0; i < this.n; i++) {
            if (this.computers[i] == null) {
                this.computers[i] = comp;
                break;
            }
        }
    }

    public void delete(int number) {
        this.computers[number - 1] = null;
    }


    public String toString() {
        String str = "";
        for (int i = 0; i < this.n; i++) {
            if (computers[i] != null) {
                str += (i + 1) + ") " + computers[i].toString() + "\n";
            }
        }
        return str;
    }
}
