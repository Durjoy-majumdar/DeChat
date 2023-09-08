package com.tencent.p014mm.plugin.appbrand.widget.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.utils.C84777q1;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandDialogContentView */
public class AppBrandDialogContentView extends FrameLayout {

    /* renamed from: d */
    public final int[] f197342d = {0, 0};

    /* renamed from: e */
    public MotionEvent f197343e = null;

    public AppBrandDialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r0 != 6) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001f
            int r0 = r3.getAction()
            if (r0 == 0) goto L_0x0019
            r1 = 1
            if (r0 == r1) goto L_0x0015
            r1 = 3
            if (r0 == r1) goto L_0x0015
            r1 = 5
            if (r0 == r1) goto L_0x0019
            r1 = 6
            if (r0 == r1) goto L_0x0015
            goto L_0x001f
        L_0x0015:
            r0 = 0
            r2.f197343e = r0
            goto L_0x001f
        L_0x0019:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3)
            r2.f197343e = r0
        L_0x001f:
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.dialog.AppBrandDialogContentView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public MotionEvent getLastPointerDownTouchEvent() {
        return this.f197343e;
    }

    public void onMeasure(int i, int i2) {
        Context context = getContext();
        if (C84777q1.m104442b(context) || context.getResources().getConfiguration().orientation == 2) {
            this.f197342d[0] = View.MeasureSpec.getSize(i);
            this.f197342d[1] = View.MeasureSpec.getSize(i2);
            Context context2 = getContext();
            int[] iArr = this.f197342d;
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            C87412m.m108594g(context2, "context");
            C87412m.m108594g(iArr, "dialogMeasuredWidthHeight");
            C87412m.m108594g(displayMetrics, "dm");
            if (C84777q1.m104442b(context2) || context2.getResources().getConfiguration().orientation == 2) {
                int i3 = iArr[0];
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(C0966R.dimen.f4146u2);
                int max = Math.max(dimensionPixelSize, context2.getResources().getDisplayMetrics().widthPixels / 2);
                if (i3 < dimensionPixelSize) {
                    i3 = dimensionPixelSize;
                } else if (i3 > max) {
                    i3 = max;
                }
                iArr[0] = i3;
            }
            int[] iArr2 = this.f197342d;
            setMeasuredDimension(iArr2[0], iArr2[1]);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f197342d[0], View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(this.f197342d[1], View.MeasureSpec.getMode(i2)));
            return;
        }
        super.onMeasure(i, i2);
    }

    public AppBrandDialogContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
