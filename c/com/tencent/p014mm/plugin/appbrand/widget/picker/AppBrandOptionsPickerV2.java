package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import kg3.C76577a;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPickerV2 */
public class AppBrandOptionsPickerV2 extends YANumberPicker implements C17925e<String> {

    /* renamed from: u1 */
    public String[] f311597u1;

    /* renamed from: v1 */
    public int f311598v1;

    public AppBrandOptionsPickerV2(Context context) {
        super(context);
        setDividerHeight(C76577a.m92151b(context, 2));
        setDividerColor(Color.parseColor("#1AAD19"));
        setItemPaddingVertical(C76577a.m92151b(context, 8));
        setNormalTextColor(Color.parseColor("#A5A5A5"));
        setSelectedTextColor(-16777216);
    }

    public Object currentValue() {
        String[] strArr = this.f311597u1;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[getValue()];
    }

    public final View getView() {
        return this;
    }

    public void onAttach(C22784g gVar) {
    }

    public void onDetach(C22784g gVar) {
    }

    public void onHide(C22784g gVar) {
        mo149008q();
        MMHandler mMHandler = this.f311628X0;
        if (mMHandler != null) {
            mMHandler.sendMessageDelayed(mo148982g(1, 0, 0, (Object) null), 0);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.f311598v1;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onShow(C22784g gVar) {
    }

    public final void setForceWidth(int i) {
        this.f311598v1 = i;
    }

    public final void setOptionsArray(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            setEnabled(false);
            setVisibility(4);
            return;
        }
        setEnabled(true);
        setVisibility(0);
        this.f311597u1 = strArr;
        int minValue = getMinValue();
        int maxValue = (getMaxValue() - minValue) + 1;
        int length = strArr.length - 1;
        if ((length - minValue) + 1 > maxValue) {
            setDisplayedValues(strArr);
            setMaxValue(length);
            return;
        }
        setMaxValue(length);
        setDisplayedValues(strArr);
    }
}
