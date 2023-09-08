package com.tencent.kinda.gen;

public interface KValidDatePickerView extends KView {
    boolean getFocus();

    String getText();

    void setFocus(boolean z);

    void setOnSelectCallback(KValidDatePickerViewOnSelectCallback kValidDatePickerViewOnSelectCallback);
}
