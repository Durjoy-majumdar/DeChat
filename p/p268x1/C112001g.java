package p268x1;

import android.text.Spanned;
import gy3.C87412m;

/* renamed from: x1.g */
public final class C112001g {
    /* renamed from: a */
    public static final boolean m152722a(Spanned spanned, Class<?> cls) {
        C87412m.m108594g(spanned, "<this>");
        C87412m.m108594g(cls, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
