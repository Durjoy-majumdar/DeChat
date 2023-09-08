package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: com.tencent.mm.ui.ScrollAlwaysTextView */
public class ScrollAlwaysTextView extends TextView {
    public ScrollAlwaysTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public boolean isFocused() {
        return true;
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super.onFocusChanged(z, i, rect);
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

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(z);
        }
    }

    public ScrollAlwaysTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
