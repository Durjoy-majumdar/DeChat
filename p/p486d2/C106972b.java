package p486d2;

import gy3.C87412m;
import java.util.List;
import java.util.Locale;
import sx3.C26236u;

/* renamed from: d2.b */
public final class C106972b implements C31049g {
    /* renamed from: a */
    public List<C31048f> mo57948a() {
        Locale locale = Locale.getDefault();
        C87412m.m108593f(locale, "getDefault()");
        return C26236u.m33719b(new C106971a(locale));
    }

    /* renamed from: b */
    public C31048f mo57949b(String str) {
        C87412m.m108594g(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C87412m.m108593f(forLanguageTag, "forLanguageTag(languageTag)");
        return new C106971a(forLanguageTag);
    }
}
