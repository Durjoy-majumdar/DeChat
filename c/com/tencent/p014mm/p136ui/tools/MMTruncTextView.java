package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: com.tencent.mm.ui.tools.MMTruncTextView */
public class MMTruncTextView extends TextView {

    /* renamed from: d */
    public boolean f220032d = false;

    /* renamed from: e */
    public boolean f220033e = false;

    public MMTruncTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f220032d) {
            CharSequence text = getText();
            if (text instanceof Spanned) {
                this.f220033e = true;
                setText(TextUtils.ellipsize(text, getPaint(), (float) ((getWidth() - getCompoundPaddingRight()) - getCompoundPaddingLeft()), TextUtils.TruncateAt.END));
                this.f220033e = false;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable unused) {
        }
    }

    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (Throwable unused) {
            return true;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.f220032d = !this.f220033e;
    }

    public MMTruncTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
