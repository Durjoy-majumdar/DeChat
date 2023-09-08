package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.NumberPicker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;

/* renamed from: com.tencent.mm.ui.widget.picker.OptionPicker */
public class OptionPicker extends NumberPicker {

    /* renamed from: d */
    public int f56599d;

    /* renamed from: e */
    public int f56600e;

    /* renamed from: f */
    public int f56601f;

    /* renamed from: g */
    public Context f56602g;

    public OptionPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56602g = context;
        mo26487a();
    }

    /* renamed from: a */
    public final void mo26487a() {
        this.f56599d = C74942w4.m89784a(this.f56602g, 120);
        this.f56601f = C74942w4.m89784a(this.f56602g, 20);
        C19879s.m21608c(this, getResources().getDrawable(C0966R.C0969drawable.alv));
        setDescendantFocusability(393216);
        C19879s.m21611f(this, this.f56602g.getResources().getColor(C0966R.color.a7f));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE || View.MeasureSpec.getMode(i) == 1073741824) {
            this.f56600e = View.MeasureSpec.getSize(i);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f56599d;
        if (measuredWidth > i4 || ((i3 = this.f56600e) > 0 && i4 > i3)) {
            int measuredWidth2 = getMeasuredWidth() + (this.f56601f * 2);
            int i5 = this.f56600e;
            if (i5 > 0 && i5 <= measuredWidth2) {
                measuredWidth2 = i5;
            }
            setMeasuredDimension(measuredWidth2, getMeasuredHeight());
            return;
        }
        setMeasuredDimension(i4, getMeasuredHeight());
    }

    @Deprecated
    public void setDisplayedValues(String[] strArr) {
        super.setDisplayedValues(strArr);
    }

    public final void setExtraPadding(int i) {
        this.f56601f = Math.max(i, 0);
    }

    public final void setMaxWidth(int i) {
        this.f56600e = i;
    }

    public final void setMinWidth(int i) {
        this.f56599d = i;
    }

    public void setOptionsArray(String[] strArr) {
        if (strArr != null) {
            setDisplayedValues((String[]) null);
            setMinValue(0);
            setMaxValue(Math.max(strArr.length - 1, 0));
            setWrapSelectorWheel(false);
            if (strArr.length <= 0) {
                strArr = null;
            }
            super.setDisplayedValues(strArr);
        }
    }

    public OptionPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56602g = context;
        mo26487a();
    }
}
