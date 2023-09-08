package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: d */
    public TextView f309472d;

    /* renamed from: e */
    public Button f309473e;

    /* renamed from: f */
    public int f309474f;

    /* renamed from: g */
    public int f309475g;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107764a.f322519s);
        this.f309474f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f309475g = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean mo146873a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f309472d.getPaddingTop() == i2 && this.f309472d.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f309472d;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107209c.m145198g(textView)) {
            C107207u.C107209c.m145202k(textView, C107207u.C107209c.m145197f(textView), i2, C107207u.C107209c.m145196e(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f309473e;
    }

    public TextView getMessageView() {
        return this.f309472d;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f309472d = (TextView) findViewById(C0966R.C0970id.f359229jo3);
        this.f309473e = (Button) findViewById(C0966R.C0970id.f359228jo2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (mo146873a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (mo146873a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f309474f
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f309474f
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131166235(0x7f07041b, float:1.794671E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131166234(0x7f07041a, float:1.7946708E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f309472d
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003e
            r2 = 1
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            if (r2 == 0) goto L_0x0058
            int r5 = r7.f309475g
            if (r5 <= 0) goto L_0x0058
            android.widget.Button r5 = r7.f309473e
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f309475g
            if (r5 <= r6) goto L_0x0058
            int r1 = r0 - r1
            boolean r0 = r7.mo146873a(r4, r0, r1)
            if (r0 == 0) goto L_0x0063
            goto L_0x0062
        L_0x0058:
            if (r2 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            boolean r0 = r7.mo146873a(r3, r0, r0)
            if (r0 == 0) goto L_0x0063
        L_0x0062:
            r3 = 1
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            super.onMeasure(r8, r9)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
