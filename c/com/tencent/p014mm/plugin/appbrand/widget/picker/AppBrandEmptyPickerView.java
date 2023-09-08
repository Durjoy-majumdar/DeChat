package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandEmptyPickerView */
public class AppBrandEmptyPickerView extends View implements C17925e<Object> {
    public AppBrandEmptyPickerView(Context context) {
        super(context);
    }

    public Object currentValue() {
        return null;
    }

    public View getView() {
        return this;
    }

    public void onAttach(C22784g gVar) {
    }

    public void onDetach(C22784g gVar) {
    }

    public void onHide(C22784g gVar) {
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C0966R.dimen.ajb), 1073741824));
    }

    public void onShow(C22784g gVar) {
    }
}
