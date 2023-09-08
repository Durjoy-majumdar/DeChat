package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: com.tencent.mapsdk.internal.mo */
public final class C104560mo extends TextView {

    /* renamed from: a */
    private int f309953a;

    /* renamed from: b */
    private float f309954b;

    /* renamed from: c */
    private boolean f309955c;

    public C104560mo(Context context) {
        super(context);
        setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        getPaint().setFakeBoldText(true);
    }

    public final void invalidate() {
        if (!this.f309955c) {
            super.invalidate();
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f309954b > 0.0f) {
            this.f309955c = true;
            int currentTextColor = getCurrentTextColor();
            TextPaint paint = getPaint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f309954b);
            setTextColor(this.f309953a);
            super.onDraw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(0.0f);
            setTextColor(currentTextColor);
            super.onDraw(canvas);
            setTextColor(currentTextColor);
            this.f309955c = false;
            return;
        }
        super.onDraw(canvas);
    }

    public final void setStrokeColor(int i) {
        this.f309953a = i;
    }

    public final void setStrokeWidth(float f) {
        this.f309954b = f;
    }
}
