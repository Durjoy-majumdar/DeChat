package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.FlowLayout */
public class FlowLayout extends ViewGroup {

    /* renamed from: d */
    public int f165046d = 0;

    /* renamed from: e */
    public int f165047e = 0;

    /* renamed from: f */
    public LinkedList<Integer> f165048f = new LinkedList<>();

    /* renamed from: g */
    public int f165049g = 0;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo82008a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo82008a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226861g);
        try {
            this.f165046d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f165047e = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.LayoutParams;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.LayoutParams(getContext(), attributeSet);
    }

    public int getLineCount() {
        return this.f165048f.size();
    }

    public int getRealLineCount() {
        return this.f165049g;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f165049g = 1;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (paddingLeft + measuredWidth + getPaddingRight() > i5) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.f165048f.get(i6).intValue() + this.f165047e;
                    i6++;
                    this.f165049g++;
                }
                int intValue = ((this.f165048f.get(i6).intValue() - measuredHeight) / 2) + paddingTop;
                childAt.layout(paddingLeft, intValue, paddingLeft + measuredWidth, measuredHeight + intValue);
                paddingLeft += measuredWidth + this.f165046d;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int paddingTop;
        int paddingBottom;
        if (View.MeasureSpec.getMode(i) == 0) {
            Log.m105920e("MicroMsg.FlowLayout", " getMode(widthMeasureSpec) == MeasureSpec.UNSPECIFIED");
        }
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        this.f165048f.clear();
        int makeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                if (i6 + measuredWidth > size) {
                    i5 += this.f165047e + i4;
                    this.f165048f.add(Integer.valueOf(i4));
                    i4 = 0;
                    i6 = 0;
                }
                i4 = Math.max(i4, childAt.getMeasuredHeight());
                i6 += measuredWidth + this.f165046d;
            }
        }
        this.f165048f.add(Integer.valueOf(i4));
        if (View.MeasureSpec.getMode(i2) == 0) {
            paddingTop = i5 + i4 + getPaddingTop();
            paddingBottom = getPaddingBottom();
        } else {
            if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = i5 + i4) < size2) {
                paddingTop = i3 + getPaddingTop();
                paddingBottom = getPaddingBottom();
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), size2);
        }
        size2 = paddingTop + paddingBottom;
        setMeasuredDimension(View.MeasureSpec.getSize(i), size2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo82008a(context, attributeSet);
    }
}
