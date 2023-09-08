package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.finder.view.FinderTagFlowLayout */
public class FinderTagFlowLayout extends ViewGroup {

    /* renamed from: d */
    public List<List<View>> f162129d;

    /* renamed from: e */
    public List<Integer> f162130e;

    /* renamed from: f */
    public List<Integer> f162131f;

    /* renamed from: g */
    public int f162132g;

    /* renamed from: h */
    public List<View> f162133h;

    public FinderTagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f162129d = new ArrayList();
        this.f162130e = new ArrayList();
        this.f162131f = new ArrayList();
        this.f162133h = new ArrayList();
        this.f162132g = -1;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((ArrayList) this.f162129d).clear();
        ((ArrayList) this.f162130e).clear();
        ((ArrayList) this.f162131f).clear();
        this.f162133h.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i6 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (width - getPaddingLeft()) - getPaddingRight()) {
                    ((ArrayList) this.f162130e).add(Integer.valueOf(i5));
                    ((ArrayList) this.f162129d).add(this.f162133h);
                    ((ArrayList) this.f162131f).add(Integer.valueOf(i6));
                    i5 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    this.f162133h = new ArrayList();
                    i6 = 0;
                }
                i6 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i5 = Math.max(i5, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.f162133h.add(childAt);
            }
        }
        ((ArrayList) this.f162130e).add(Integer.valueOf(i5));
        ((ArrayList) this.f162131f).add(Integer.valueOf(i6));
        ((ArrayList) this.f162129d).add(this.f162133h);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = ((ArrayList) this.f162129d).size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f162133h = (List) ((ArrayList) this.f162129d).get(i8);
            int intValue = ((Integer) ((ArrayList) this.f162130e).get(i8)).intValue();
            int intValue2 = ((Integer) ((ArrayList) this.f162131f).get(i8)).intValue();
            int i9 = this.f162132g;
            if (i9 == -1) {
                paddingLeft = getPaddingLeft();
            } else if (i9 == 0) {
                paddingLeft = ((width - intValue2) / 2) + getPaddingLeft();
            } else if (i9 == 1) {
                paddingLeft = (width - (intValue2 + getPaddingLeft())) - getPaddingRight();
                Collections.reverse(this.f162133h);
            }
            for (int i15 = 0; i15 < this.f162133h.size(); i15++) {
                View view = this.f162133h.get(i15);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i16 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i17 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i16, i17, view.getMeasuredWidth() + i16, view.getMeasuredHeight() + i17);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            paddingTop += intValue;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 8) {
                if (i4 == childCount - 1) {
                    i5 = Math.max(i6, i5);
                    i8 += i7;
                }
                int i9 = i;
                int i15 = i2;
                i3 = size2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i3 = size2;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i16 = i6 + measuredWidth;
                if (i16 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i5 = Math.max(i5, i6);
                    i8 += i7;
                } else {
                    measuredHeight = Math.max(i7, measuredHeight);
                    measuredWidth = i16;
                }
                if (i4 == childCount - 1) {
                    i5 = Math.max(measuredWidth, i5);
                    i8 += measuredHeight;
                }
                i7 = measuredHeight;
                i6 = measuredWidth;
            }
            i4++;
            size2 = i3;
        }
        int i17 = size2;
        if (mode != 1073741824) {
            size = getPaddingRight() + i5 + getPaddingLeft();
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i17 : i8 + getPaddingTop() + getPaddingBottom());
    }

    public void setGravity(int i) {
        this.f162132g = i;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public FinderTagFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
