package com.tencent.kinda.gen;

public interface KProfessionEditView extends KView {
    boolean getFocus();

    String getProfessionName();

    int getProfessionType();

    void setData(ITransmitKvData iTransmitKvData);

    void setDefaultProfession(int i, String str);

    void setFocus(boolean z);

    void setOnSelectProfessionCallback(KProfessionEditViewOnSelectProfessionCallback kProfessionEditViewOnSelectProfessionCallback);
}
