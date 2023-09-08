package tj1;

import android.text.InputFilter;
import android.text.Spanned;
import gy3.C87412m;
import z04.C112550d0;
import z04.C66731x;

/* renamed from: tj1.h */
public final class C13952h implements InputFilter {

    /* renamed from: d */
    public static final C13952h f39195d = new C13952h();

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C87412m.m108593f(spanned, "dest");
        boolean z = false;
        if (C112550d0.m153788X(spanned, "0", false, 2, (Object) null)) {
            return "";
        }
        String obj = charSequence.toString();
        String obj2 = spanned.toString();
        StringBuilder sb = new StringBuilder();
        String substring = obj2.substring(0, i3);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        String substring2 = obj.substring(i, i2);
        C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring2);
        String substring3 = obj2.substring(i4, spanned.length());
        C87412m.m108593f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring3);
        Integer e = C66731x.m78731e(sb.toString().toString());
        int intValue = e != null ? e.intValue() : -1;
        if (intValue >= 0 && intValue < 1000) {
            z = true;
        }
        return z ? charSequence : "";
    }
}
