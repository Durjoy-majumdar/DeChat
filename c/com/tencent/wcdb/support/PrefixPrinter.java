package com.tencent.wcdb.support;

import android.util.Printer;

public class PrefixPrinter implements Printer {
    private final String mPrefix;
    private final Printer mPrinter;

    private PrefixPrinter(Printer printer, String str) {
        this.mPrinter = printer;
        this.mPrefix = str;
    }

    public static Printer create(Printer printer, String str) {
        return (str == null || str.equals("")) ? printer : new PrefixPrinter(printer, str);
    }

    public void println(String str) {
        Printer printer = this.mPrinter;
        printer.println(this.mPrefix + str);
    }
}
