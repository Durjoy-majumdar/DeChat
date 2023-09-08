package p1085qk;

import com.tencent.p014mm.smiley.C96974x;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Locale;
import sx3.C110818d0;
import uc0.C111153e;
import uc0.C65319f;

/* renamed from: qk.a */
public final class C110441a implements C96974x {

    /* renamed from: a */
    public final C111153e f330277a;

    /* renamed from: b */
    public final C65319f f330278b;

    /* renamed from: c */
    public final int[] f330279c;

    public C110441a(C111153e eVar, int i, C65319f fVar) {
        C87412m.m108594g(eVar, "eggInfo");
        C87412m.m108594g(fVar, "keyword");
        this.f330277a = eVar;
        this.f330278b = fVar;
        String str = fVar.f187992d;
        C87412m.m108593f(str, "keyword.keyWord");
        Locale locale = Locale.getDefault();
        C87412m.m108593f(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int length = lowerCase.length();
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = lowerCase.codePointAt(i2);
            linkedList.add(Integer.valueOf(codePointAt));
            i2 += Character.charCount(codePointAt);
        }
        this.f330279c = C110818d0.m150952x0(linkedList);
    }

    /* renamed from: a */
    public int[] mo135527a() {
        return this.f330279c;
    }
}
