package p486d2;

import android.os.LocaleList;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: d2.c */
public final class C106973c implements C31049g {
    /* renamed from: a */
    public List<C31048f> mo57948a() {
        LocaleList localeList = LocaleList.getDefault();
        C87412m.m108593f(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            Locale locale = localeList.get(i);
            C87412m.m108593f(locale, "localeList[i]");
            arrayList.add(new C106971a(locale));
        }
        return arrayList;
    }

    /* renamed from: b */
    public C31048f mo57949b(String str) {
        C87412m.m108594g(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C87412m.m108593f(forLanguageTag, "forLanguageTag(languageTag)");
        return new C106971a(forLanguageTag);
    }
}
