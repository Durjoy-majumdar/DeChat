package p152f0;

import gy3.C87412m;

/* renamed from: f0.c1 */
public final class C107303c1 {
    /* renamed from: a */
    public static final int m145447a(CharSequence charSequence, int i) {
        C87412m.m108594g(charSequence, "<this>");
        int length = charSequence.length();
        for (int i2 = i + 1; i2 < length; i2++) {
            if (charSequence.charAt(i2) == 10) {
                return i2;
            }
        }
        return charSequence.length();
    }
}
