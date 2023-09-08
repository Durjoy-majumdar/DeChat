package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.appbrand.widget.C85011n;

/* renamed from: com.tencent.mm.ui.widget.EllipsizeLayout */
public class EllipsizeLayout extends LinearLayout {

    /* renamed from: d */
    public final boolean f250421d;

    public EllipsizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f250421d = context.obtainStyledAttributes(attributeSet, C85011n.f247736a).getBoolean(0, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r6 = r17
            int r0 = r17.getOrientation()
            if (r0 != 0) goto L_0x00de
            int r0 = android.view.View.MeasureSpec.getMode(r18)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x00de
            r0 = 0
            int r7 = r17.getChildCount()
            int r1 = android.view.View.MeasureSpec.getSize(r18)
            int r2 = r17.getPaddingLeft()
            int r3 = r17.getPaddingRight()
            int r2 = r2 + r3
            int r8 = r1 - r2
            int r1 = android.view.View.MeasureSpec.getSize(r18)
            r9 = 0
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x0030:
            r13 = 1
            if (r11 >= r7) goto L_0x009f
            if (r1 != 0) goto L_0x009f
            android.view.View r14 = r6.getChildAt(r11)
            if (r14 == 0) goto L_0x009c
            int r2 = r14.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x009c
            boolean r2 = r14 instanceof android.widget.TextView
            if (r2 == 0) goto L_0x006c
            r2 = r14
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.text.TextUtils$TruncateAt r3 = r2.getEllipsize()
            if (r3 == 0) goto L_0x006c
            if (r0 != 0) goto L_0x0068
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.setMaxWidth(r0)
            boolean r0 = r6.f250421d
            if (r0 == 0) goto L_0x0064
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.leftMargin = r9
        L_0x0064:
            r16 = r1
            r15 = r2
            goto L_0x006f
        L_0x0068:
            r15 = r0
            r16 = 1
            goto L_0x006f
        L_0x006c:
            r15 = r0
            r16 = r1
        L_0x006f:
            r3 = 0
            r5 = 0
            r0 = r17
            r1 = r14
            r2 = r10
            r4 = r19
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            if (r0 == 0) goto L_0x009a
            float r1 = r0.weight
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r13 = 0
        L_0x008b:
            r1 = r16 | r13
            int r2 = r14.getMeasuredWidth()
            int r3 = r0.leftMargin
            int r2 = r2 + r3
            int r0 = r0.rightMargin
            int r2 = r2 + r0
            int r12 = r12 + r2
            r0 = r15
            goto L_0x009c
        L_0x009a:
            r0 = r15
            r1 = 1
        L_0x009c:
            int r11 = r11 + 1
            goto L_0x0030
        L_0x009f:
            if (r0 == 0) goto L_0x00de
            if (r12 != 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r13 = 0
        L_0x00a5:
            r1 = r1 | r13
            int r2 = r0.getMeasuredWidth()
            int r3 = r12 - r8
            int r2 = r2 - r3
            if (r1 != 0) goto L_0x00b9
            if (r12 <= r8) goto L_0x00b9
            if (r2 >= 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r9 = r2
        L_0x00b5:
            r0.setMaxWidth(r9)
            r2 = r9
        L_0x00b9:
            boolean r1 = r6.f250421d
            if (r1 == 0) goto L_0x00de
            int r1 = r0.getMeasuredWidth()
            if (r1 <= 0) goto L_0x00de
            if (r12 <= r8) goto L_0x00cb
            int r1 = r0.getMeasuredWidth()
            int r12 = r12 - r1
            goto L_0x00d2
        L_0x00cb:
            int r1 = r0.getMeasuredWidth()
            int r8 = r8 - r1
            int r12 = r8 / 2
        L_0x00d2:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r1.leftMargin = r12
            int r2 = r2 - r12
            r0.setMaxWidth(r2)
        L_0x00de:
            super.onMeasure(r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.EllipsizeLayout.onMeasure(int, int):void");
    }
}
