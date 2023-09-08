package com.tencent.kinda.gen;

public final class KDate {
    public int mDay;
    public int mMonth;
    public int mYear;

    public KDate() {
    }

    public KDate(int i, int i2, int i3) {
        this.mYear = i;
        this.mMonth = i2;
        this.mDay = i3;
    }

    public int getDay() {
        return this.mDay;
    }

    public int getMonth() {
        return this.mMonth;
    }

    public int getYear() {
        return this.mYear;
    }

    public String toString() {
        return "KDate{mYear=" + this.mYear + ",mMonth=" + this.mMonth + ",mDay=" + this.mDay + "}";
    }
}
