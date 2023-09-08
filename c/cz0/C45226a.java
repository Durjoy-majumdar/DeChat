package cz0;

import android.text.InputFilter;
import android.text.Spanned;
import z04.C112550d0;

/* renamed from: cz0.a */
public final class C45226a implements InputFilter {

    /* renamed from: d */
    public final /* synthetic */ CharSequence f122562d;

    public C45226a(CharSequence charSequence) {
        this.f122562d = charSequence;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        CharSequence charSequence2 = this.f122562d;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (!C112550d0.m153802v(charSequence2, charSequence.charAt(i5), false, 2, (Object) null)) {
                return "";
            }
        }
        return charSequence;
    }
}
