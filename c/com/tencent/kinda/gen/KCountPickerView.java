package com.tencent.kinda.gen;

public interface KCountPickerView extends KView {
    boolean getFocus();

    String getValue();

    void setDefaultCount(int i);

    void setFocus(boolean z);

    void setOnSelectCallback(KCountPickerViewOnSelectCallback kCountPickerViewOnSelectCallback);

    void setValue(String str);
}
