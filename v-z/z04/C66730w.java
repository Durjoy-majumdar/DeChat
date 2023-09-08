package z04;

import gy3.C87412m;

/* renamed from: z04.w */
public class C66730w extends C66729v {
    /* renamed from: d */
    public static final Float m78730d(String str) {
        C87412m.m108594g(str, "<this>");
        try {
            if (C16091m.f43243a.mo90759d(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
