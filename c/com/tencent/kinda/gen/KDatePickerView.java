package com.tencent.kinda.gen;

public interface KDatePickerView extends KView {
    KDate currentDate();

    boolean getCanBeLongTerm();

    KDate getEndDate();

    boolean getFocus();

    KDate getSelectedDate();

    KDate getStartDate();

    DatePickerType getType();

    String getValue();

    void setCanBeLongTerm(boolean z);

    void setEndDate(KDate kDate);

    void setFocus(boolean z);

    void setHint(String str);

    void setOnSelectCallback(KDatePickerViewOnSelectCallback kDatePickerViewOnSelectCallback);

    void setOriginDate(int i, int i2, int i3);

    void setStartDate(KDate kDate);

    void setType(DatePickerType datePickerType);

    void setValue(String str);

    long timeForDate(KDate kDate);

    int yearOfNow();
}
