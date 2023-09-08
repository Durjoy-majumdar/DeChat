package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p1114g8.C107764a;
import p1139o8.C109991k;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: A */
    public boolean f309440A;

    /* renamed from: v */
    public Drawable f309441v;

    /* renamed from: w */
    public final Rect f309442w;

    /* renamed from: x */
    public final Rect f309443x;

    /* renamed from: y */
    public int f309444y;

    /* renamed from: z */
    public boolean f309445z;

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f309441v;
        if (drawable != null) {
            if (this.f309440A) {
                this.f309440A = false;
                Rect rect = this.f309442w;
                Rect rect2 = this.f309443x;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f309445z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f309444y, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f309441v;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f309441v;
        if (drawable != null && drawable.isStateful()) {
            this.f309441v.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f309441v;
    }

    public int getForegroundGravity() {
        return this.f309444y;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f309441v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f309440A = z | this.f309440A;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f309440A = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f309441v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f309441v);
            }
            this.f309441v = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f309444y == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f309444y != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f309444y = i;
            if (i == 119 && this.f309441v != null) {
                this.f309441v.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f309441v;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309442w = new Rect();
        this.f309443x = new Rect();
        this.f309444y = 119;
        this.f309445z = true;
        this.f309440A = false;
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322513m, i, 0, new int[0]);
        this.f309444y = d.getInt(1, this.f309444y);
        Drawable drawable = d.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f309445z = d.getBoolean(2, true);
        d.recycle();
    }
}
