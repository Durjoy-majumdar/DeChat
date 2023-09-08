package er1;

import android.text.TextUtils;
import gy3.C87412m;

/* renamed from: er1.p0 */
public final class C58764p0 {

    /* renamed from: a */
    public static final C58764p0 f168246a = new C58764p0();

    /* renamed from: a */
    public final String mo83800a(String str) {
        return mo83801b(str, 0, 4);
    }

    /* renamed from: b */
    public final String mo83801b(String str, int i, int i2) {
        if (str == null || TextUtils.isEmpty(str)) {
            return "";
        }
        String substring = str.substring(i, Math.min(i2 + i, str.length()));
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
