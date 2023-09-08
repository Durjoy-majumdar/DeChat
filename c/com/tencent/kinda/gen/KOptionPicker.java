package com.tencent.kinda.gen;

import java.util.ArrayList;

public interface KOptionPicker {
    void hide();

    void showImpl(ArrayList<Option> arrayList, VoidBoolOptionCallback voidBoolOptionCallback);
}
