package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.platform.window.WxaWindowLayoutParams;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.c */
public class C84922c extends C84927e {

    /* renamed from: j */
    public Integer f247520j;

    /* renamed from: n */
    public Integer f247521n;

    /* renamed from: o */
    public Float f247522o;

    /* renamed from: p */
    public Integer f247523p;

    /* renamed from: q */
    public WxaWindowLayoutParams f247524q = new WxaWindowLayoutParams(-1, -1);

    public C84922c(Context context) {
        super(context);
        Log.m105924i("Luggage.WXA.AppBrandCenterInsideRuntimeFrameLayout", "AppBrandCenterInsideRuntimeFrameLayout: create");
    }

    public void addView(View view) {
        super.addView(view);
        mo117743b(view);
    }

    /* renamed from: b */
    public final void mo117743b(View view) {
        if (this.f247522o != null && Math.abs(view.getScaleX() - this.f247522o.floatValue()) >= 0.01f) {
            view.setScaleX(this.f247522o.floatValue());
            view.setScaleY(this.f247522o.floatValue());
        }
    }

    public ViewGroup.LayoutParams getWxaLayoutParams() {
        return this.f247524q;
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        Integer num;
        if (!(this.f247521n == null || (num = this.f247520j) == null)) {
            if (num.intValue() > 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.f247520j.intValue(), 1073741824);
            }
            if (this.f247521n.intValue() > 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(this.f247521n.intValue(), 1073741824);
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i15;
        Integer num = this.f247520j;
        if (num == null && this.f247521n == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        if (num == null || this.f247521n == null) {
            i6 = 0;
            i5 = 0;
        } else {
            i5 = ((i3 - i) / 2) - (num.intValue() / 2);
            i6 = ((i4 - i2) / 2) - (this.f247521n.intValue() / 2);
        }
        Integer num2 = this.f247523p;
        int intValue = num2 == null ? 17 : num2.intValue();
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (intValue == 17) {
                    int i17 = i + i5;
                    int i18 = i2 + i6;
                    i15 = measuredWidth + i17;
                    int i19 = i17;
                    i8 = measuredHeight + i18;
                    i9 = i18;
                    i7 = i19;
                } else if (intValue != 80) {
                    i15 = i + measuredWidth;
                    Log.m105929w("Luggage.WXA.AppBrandCenterInsideRuntimeFrameLayout", "onLayout: unhandled gravity[%d], good luck~", Integer.valueOf(intValue));
                    i7 = i;
                    i8 = i2 + measuredHeight;
                    i9 = i2;
                } else {
                    i15 = i + measuredWidth;
                    i9 = i4 - measuredHeight;
                    i7 = i;
                    i8 = i4;
                }
                childAt.layout(i7, i9, i15, i8);
            }
        }
    }

    public void setWxaLayoutParams(WxaWindowLayoutParams wxaWindowLayoutParams) {
        this.f247524q = wxaWindowLayoutParams;
        this.f247520j = Integer.valueOf(wxaWindowLayoutParams.width);
        this.f247521n = Integer.valueOf(wxaWindowLayoutParams.height);
        this.f247522o = Float.valueOf(wxaWindowLayoutParams.f245452a);
        this.f247523p = Integer.valueOf(wxaWindowLayoutParams.gravity);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            mo117743b(getChildAt(i));
        }
        requestLayout();
    }

    public void addView(View view, int i) {
        super.addView(view, i);
        mo117743b(view);
    }

    public void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
        mo117743b(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        mo117743b(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        mo117743b(view);
    }
}
