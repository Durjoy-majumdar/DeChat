package com.tencent.kinda.gen;

import java.util.ArrayList;

public interface KCountryCallingCodeView extends KView {
    String getCountryCode();

    boolean getFocus();

    boolean getHideCode();

    String getNationality();

    String getPlaceHolder();

    void setCountryCode(String str);

    void setFocus(boolean z);

    void setHideCode(boolean z);

    void setNationality(String str);

    void setNationalityExcludeArray(ArrayList<String> arrayList);

    void setOnSelectCallback(KCountryCallingCodeViewOnSelectCallback kCountryCallingCodeViewOnSelectCallback);

    void setPlaceHolder(String str);
}
