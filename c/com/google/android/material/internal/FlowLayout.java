package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class FlowLayout extends ViewGroup {

    /* renamed from: d */
    public int f309437d;

    /* renamed from: e */
    public int f309438e;

    /* renamed from: f */
    public boolean f309439f;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getItemSpacing() {
        return this.f309438e;
    }

    public int getLineSpacing() {
        return this.f309437d;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            boolean z2 = true;
            if (C107207u.C107209c.m145195d(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i5 = marginLayoutParams.getMarginStart();
                        i6 = marginLayoutParams.getMarginEnd();
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.f309439f && measuredWidth > i7) {
                        i9 = this.f309437d + paddingTop;
                        i8 = paddingRight;
                    }
                    int i16 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i16;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i5, measuredHeight);
                    } else {
                        childAt.layout(i16, i9, measuredWidth2, measuredHeight);
                    }
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f309438e;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i15 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (paddingLeft + i4 + childAt.getMeasuredWidth() > paddingRight && !this.f309439f) {
                    paddingLeft = getPaddingLeft();
                    i7 = this.f309437d + paddingTop;
                }
                int measuredWidth = paddingLeft + i4 + childAt.getMeasuredWidth();
                paddingTop = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft += i4 + i5 + childAt.getMeasuredWidth() + this.f309438e;
            }
        }
        if (mode != Integer.MIN_VALUE) {
            i3 = 1073741824;
            if (mode != 1073741824) {
                size = i8;
            }
        } else {
            i3 = 1073741824;
            size = Math.min(i8, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingTop, size2);
        } else if (mode2 != i3) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f309438e = i;
    }

    public void setLineSpacing(int i) {
        this.f309437d = i;
    }

    public void setSingleLine(boolean z) {
        this.f309439f = z;
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309439f = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C107764a.f322512l, 0, 0);
        this.f309437d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f309438e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
