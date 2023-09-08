package com.tencent.p014mm.plugin.finder.widget.record;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;
import dt1.C107068a;
import uc1.C14153w;

/* renamed from: com.tencent.mm.plugin.finder.widget.record.MarqueeTextView */
public class MarqueeTextView extends TextView {

    /* renamed from: d */
    public Scroller f313113d;

    /* renamed from: e */
    public int f313114e;

    /* renamed from: f */
    public int f313115f;

    /* renamed from: g */
    public boolean f313116g;

    /* renamed from: h */
    public boolean f313117h;

    /* renamed from: i */
    public int f313118i;

    /* renamed from: j */
    public int f313119j;

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.f313113d;
        if (scroller == null || !scroller.isFinished() || this.f313116g) {
            return;
        }
        if (this.f313118i == 101) {
            Scroller scroller2 = this.f313113d;
            if (scroller2 != null) {
                this.f313115f = 0;
                this.f313116g = true;
                this.f313117h = true;
                scroller2.startScroll(0, 0, 0, 0, 0);
                invalidate();
                return;
            }
            return;
        }
        this.f313116g = true;
        this.f313115f = getWidth() * -1;
        this.f313117h = false;
        if (this.f313116g) {
            setHorizontallyScrolling(true);
            if (this.f313113d == null) {
                Scroller scroller3 = new Scroller(getContext(), new LinearInterpolator());
                this.f313113d = scroller3;
                setScroller(scroller3);
            }
            TextPaint paint = getPaint();
            Rect rect = new Rect();
            String charSequence = getText().toString();
            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
            int width = rect.width();
            int i = width - this.f313115f;
            int intValue = Double.valueOf((((double) (this.f313114e * i)) * 1.0d) / ((double) width)).intValue();
            if (this.f313117h) {
                new Handler(Looper.getMainLooper()).postDelayed(new C107068a(this, i, intValue), (long) this.f313119j);
                return;
            }
            this.f313113d.startScroll(this.f313115f, 0, i, 0, intValue);
            invalidate();
            this.f313116g = false;
        }
    }

    public int getRndDuration() {
        return this.f313114e;
    }

    public int getScrollFirstDelay() {
        return this.f313119j;
    }

    public int getScrollMode() {
        return this.f313118i;
    }

    public void setRndDuration(int i) {
        this.f313114e = i;
    }

    public void setScrollFirstDelay(int i) {
        this.f313119j = i;
    }

    public void setScrollMode(int i) {
        this.f313118i = i;
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f313115f = 0;
        this.f313116g = true;
        this.f313117h = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14153w.f39588g);
        this.f313114e = obtainStyledAttributes.getInt(1, 10000);
        this.f313118i = obtainStyledAttributes.getInt(2, 100);
        this.f313119j = obtainStyledAttributes.getInt(0, 1000);
        obtainStyledAttributes.recycle();
        setSingleLine();
        setEllipsize((TextUtils.TruncateAt) null);
    }
}
