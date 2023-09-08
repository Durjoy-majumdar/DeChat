package com.tencent.kinda.gen;

public interface KBankEditView extends KView {
    boolean getFocus();

    FontStyle getFontStyle();

    String getSelectedBankType();

    DynamicColor getTextColor();

    float getTextSize();

    void openBankSelectView();

    void setData(ITransmitKvData iTransmitKvData);

    void setFocus(boolean z);

    void setFontStyle(FontStyle fontStyle);

    void setOnSeletBankCallback(KBankEditViewOnSeletBankCallback kBankEditViewOnSeletBankCallback);

    void setSelected(String str);

    void setTextColor(DynamicColor dynamicColor);

    void setTextSize(float f);
}
