package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.text.NoCopySpan;
import android.text.Spannable;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.o1 */
public final class C104909o1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.o1$a */
    public static class C104910a implements NoCopySpan {

        /* renamed from: d */
        public float f311518d;

        /* renamed from: e */
        public float f311519e;

        /* renamed from: f */
        public boolean f311520f;

        /* renamed from: g */
        public boolean f311521g;

        /* renamed from: h */
        public boolean f311522h;

        public C104910a(float f, float f2, int i, int i2) {
            this.f311518d = f;
            this.f311519e = f2;
        }
    }

    /* renamed from: a */
    public static C104910a[] m140643a(TextView textView) {
        if (textView == null || !(textView.getText() instanceof Spannable)) {
            return null;
        }
        Spannable spannable = (Spannable) textView.getText();
        C104910a[] aVarArr = (C104910a[]) spannable.getSpans(0, spannable.length(), C104910a.class);
        for (C104910a removeSpan : aVarArr) {
            spannable.removeSpan(removeSpan);
        }
        return aVarArr;
    }
}
