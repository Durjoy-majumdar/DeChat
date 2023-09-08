package com.tencent.p014mm.p136ui.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.C74942w4;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView */
public class MMAutoAdjustTextView extends TextView {

    /* renamed from: d */
    public float f220751d;

    /* renamed from: e */
    public float f220752e;

    public MMAutoAdjustTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232406e);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        mo104601b();
    }

    /* renamed from: a */
    public final void mo104600a(String str, int i) {
        if (i > 0) {
            measure(0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            int measuredWidth = getMeasuredWidth();
            while (((float) measuredWidth) > ((float) i)) {
                float d = this.f220751d - C74942w4.m89787d(getContext());
                this.f220751d = d;
                setTextSize(0, d * this.f220752e);
                measure(0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth = getMeasuredWidth();
            }
        }
    }

    /* renamed from: b */
    public final void mo104601b() {
        this.f220751d = getTextSize();
        this.f220752e = C74942w4.m89788e(getContext());
        new Paint().set(getPaint());
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            mo104600a(getText().toString(), i);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo104600a(charSequence.toString(), getWidth());
    }

    public MMAutoAdjustTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232406e);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        mo104601b();
    }
}
