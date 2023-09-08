package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import com.tencent.kinda.framework.widget.base.KindaPickerViewImpl;
import com.tencent.kinda.gen.KPickerView;
import com.tencent.kinda.gen.VoidListCallback;
import java.util.ArrayList;

public class MMKPickerView extends MMKView<KindaPickerViewImpl<String>> implements KPickerView {
    public ArrayList<Integer> getCurrentSelectedRows() {
        return ((KindaPickerViewImpl) this.view).getCurrentItems();
    }

    public void setCallbackImpl(final VoidListCallback voidListCallback) {
        ((KindaPickerViewImpl) this.view).setOnSelectChangeListener(new KindaPickerViewImpl.OnSelectChangeListener() {
            public void onSelected(ArrayList<Integer> arrayList) {
                VoidListCallback voidListCallback = voidListCallback;
                if (voidListCallback != null) {
                    voidListCallback.call(arrayList);
                }
            }
        });
    }

    public void setNormalData(ArrayList<ArrayList<String>> arrayList) {
        if (arrayList != null) {
            ((KindaPickerViewImpl) this.view).setIndividualPicker(arrayList);
        }
    }

    public void setSelectedRows(ArrayList<Integer> arrayList) {
        ((KindaPickerViewImpl) this.view).setCurrentItems(arrayList);
    }

    public void setSyncData(ArrayList<String> arrayList, ArrayList<ArrayList<String>> arrayList2) {
        ((KindaPickerViewImpl) this.view).setLinkagePicker(arrayList, arrayList2);
    }

    public KindaPickerViewImpl createView(Context context) {
        T kindaPickerViewImpl = new KindaPickerViewImpl(context);
        this.view = kindaPickerViewImpl;
        KindaPickerViewImpl kindaPickerViewImpl2 = (KindaPickerViewImpl) kindaPickerViewImpl;
        return kindaPickerViewImpl;
    }
}
