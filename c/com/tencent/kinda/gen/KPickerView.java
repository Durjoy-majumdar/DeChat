package com.tencent.kinda.gen;

import java.util.ArrayList;

public interface KPickerView extends KView {
    ArrayList<Integer> getCurrentSelectedRows();

    void setCallbackImpl(VoidListCallback voidListCallback);

    void setNormalData(ArrayList<ArrayList<String>> arrayList);

    void setSelectedRows(ArrayList<Integer> arrayList);

    void setSyncData(ArrayList<String> arrayList, ArrayList<ArrayList<String>> arrayList2);
}
