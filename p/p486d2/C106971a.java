package p486d2;

import gy3.C87412m;
import java.util.Locale;

/* renamed from: d2.a */
public final class C106971a implements C31048f {

    /* renamed from: a */
    public final Locale f320204a;

    public C106971a(Locale locale) {
        C87412m.m108594g(locale, "javaLocale");
        this.f320204a = locale;
    }

    /* renamed from: a */
    public String mo57947a() {
        String languageTag = this.f320204a.toLanguageTag();
        C87412m.m108593f(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
