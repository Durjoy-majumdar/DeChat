package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.x */
public final class C68724x extends PasswordTransformationMethod {

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.x$a */
    public static final class C68725a implements CharSequence {

        /* renamed from: d */
        public CharSequence f197397d;

        public C68725a(CharSequence charSequence) {
            this.f197397d = charSequence;
        }

        public char charAt(int i) {
            return 9679;
        }

        public int length() {
            return this.f197397d.length();
        }

        public CharSequence subSequence(int i, int i2) {
            return this.f197397d.subSequence(i, i2);
        }
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new C68725a(charSequence);
    }
}
