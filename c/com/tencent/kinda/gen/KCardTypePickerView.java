package com.tencent.kinda.gen;

import java.util.ArrayList;

public interface KCardTypePickerView extends KView {
    boolean getEnabled();

    boolean getFocus();

    void select(int i);

    void setEnabled(boolean z);

    void setFocus(boolean z);

    void setHint(String str);

    void setOnSelectCallback(KCardTypePickerViewOnSelectCallback kCardTypePickerViewOnSelectCallback);

    void setOptions(ArrayList<Option> arrayList);

    void setTextSize(float f);
}
