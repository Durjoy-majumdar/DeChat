package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C19879s;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import kg3.C76577a;
import vt0.C22784g;
import vt0.C22790m;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPicker */
public class AppBrandOptionsPicker extends NumberPicker implements C17925e<String> {

    /* renamed from: d */
    public String[] f49956d;

    /* renamed from: e */
    public int f49957e;

    /* renamed from: f */
    public int f49958f;

    /* renamed from: g */
    public int f49959g;

    public AppBrandOptionsPicker(Context context) {
        super(new ContextThemeWrapper(context, C0966R.style.a1a));
        C19879s.m21608c(this, getResources().getDrawable(C0966R.C0969drawable.f4488e0));
        C19879s.m21609d(this);
        C19879s.m21610e(this);
        C22790m.m26712a(this);
        this.f49957e = C76577a.m92151b(context, 100);
        this.f49959g = C76577a.m92151b(context, 20);
    }

    public Object currentValue() {
        String[] strArr = this.f49956d;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[getValue()];
    }

    public View getView() {
        return this;
    }

    public void onAttach(C22784g gVar) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19879s.m21606a(this);
    }

    public void onDetach(C22784g gVar) {
    }

    public void onHide(C22784g gVar) {
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE || View.MeasureSpec.getMode(i) == 1073741824) {
            this.f49958f = View.MeasureSpec.getSize(i);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f49957e;
        if (measuredWidth > i4 || ((i3 = this.f49958f) > 0 && i4 > i3)) {
            int measuredWidth2 = getMeasuredWidth() + (this.f49959g * 2);
            int i5 = this.f49958f;
            if (i5 > 0 && i5 <= measuredWidth2) {
                measuredWidth2 = i5;
            }
            setMeasuredDimension(measuredWidth2, getMeasuredHeight());
            return;
        }
        setMeasuredDimension(i4, getMeasuredHeight());
    }

    public void onShow(C22784g gVar) {
    }

    @Deprecated
    public void setDisplayedValues(String[] strArr) {
        super.setDisplayedValues(strArr);
    }

    public final void setExtraPadding(int i) {
        this.f49959g = Math.max(i, 0);
    }

    public final void setMaxWidth(int i) {
        this.f49958f = i;
    }

    public final void setMinWidth(int i) {
        this.f49957e = i;
    }

    public void setOptionsArray(String[] strArr) {
        if (strArr != null) {
            this.f49956d = strArr;
            setDisplayedValues((String[]) null);
            setMinValue(0);
            setMaxValue(Math.max(strArr.length - 1, 0));
            if (strArr.length <= 0) {
                strArr = null;
            }
            super.setDisplayedValues(strArr);
        }
    }
}
