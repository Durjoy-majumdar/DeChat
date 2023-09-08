package com.tencent.kinda.gen;

import java.util.ArrayList;

public interface KRegionEditView extends KView {
    boolean getAutoLocation();

    String getCity();

    String getCountry();

    boolean getFocus();

    String getProvince();

    boolean getShowDomesticCity();

    boolean getShowSelectedLocation();

    boolean isUSOrCA();

    void setAreaExcludeArray(ArrayList<String> arrayList);

    void setAutoLocation(boolean z);

    void setFocus(boolean z);

    void setOnRegionSelectedCallback(KRegionEditViewOnRegionSelectedCallback kRegionEditViewOnRegionSelectedCallback);

    void setOriginRegion(String str, String str2, String str3, String str4);

    void setShowDomesticCity(boolean z);

    void setShowSelectedLocation(boolean z);
}
