package com.tencent.kinda.framework.widget.base;

import com.tencent.kinda.gen.KOptionPicker;
import com.tencent.kinda.gen.Option;
import com.tencent.kinda.gen.VoidBoolOptionCallback;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import java.util.ArrayList;

public class MMKOptionsPicker implements KOptionPicker {
    private C7045j optionPicker;

    public void hide() {
        C7045j jVar = this.optionPicker;
        if (jVar != null) {
            jVar.mo8101d();
        }
    }

    public void showImpl(ArrayList<Option> arrayList, VoidBoolOptionCallback voidBoolOptionCallback) {
    }
}
