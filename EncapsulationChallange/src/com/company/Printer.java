package com.company;

public class Printer {
    private int tonerLevel;
    private int numberOfPage;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel < 0) {
            System.out.println("Fill up toner");
        }
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPage = 0;
        this.isDuplex = isDuplex;
    }

    public int usedToner (int toner) {
        if (toner > 0 && toner <= 100) {
            if (this.tonerLevel + toner > 100) {
                return -1;
            }
            this.tonerLevel += toner;
            return tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint = pages/2 + pages % 2;
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPage += pagesToPrint;

        return pagesToPrint;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }
}
