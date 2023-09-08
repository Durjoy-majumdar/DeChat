package com.tencent.kinda.gen;

import java.util.ArrayList;

public interface KBankCardTypePickerView extends KView {
    boolean getFocus();

    String getValue();

    void setBankCardType(ArrayList<BankCardType> arrayList);

    void setFocus(boolean z);

    void setOnSelectCallback(KBankCardTypePickerViewOnSelectCallback kBankCardTypePickerViewOnSelectCallback);

    void setSelectedBankCardType(BankCardType bankCardType);

    void setValue(String str);
}
