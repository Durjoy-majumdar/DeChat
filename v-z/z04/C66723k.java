package z04;

import gy3.C87412m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sx3.C26236u;
import y04.C15925h;
import y04.C66483g;

/* renamed from: z04.k */
public final class C66723k implements Serializable {

    /* renamed from: d */
    public final Pattern f191762d;

    public C66723k(Pattern pattern) {
        C87412m.m108594g(pattern, "nativePattern");
        this.f191762d = pattern;
    }

    /* renamed from: b */
    public static C15925h m78722b(C66723k kVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        kVar.getClass();
        C87412m.m108594g(charSequence, "input");
        if (i < 0 || i > charSequence.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
        }
        C66721i iVar = new C66721i(kVar, charSequence, i);
        C66722j jVar = C66722j.f191761d;
        C87412m.m108594g(jVar, "nextFunction");
        return new C66483g(iVar, jVar);
    }

    /* renamed from: a */
    public final C66716g mo90757a(CharSequence charSequence, int i) {
        C87412m.m108594g(charSequence, "input");
        Matcher matcher = this.f191762d.matcher(charSequence);
        C87412m.m108593f(matcher, "nativePattern.matcher(input)");
        return C53732l.m60231a(matcher, i, charSequence);
    }

    /* renamed from: c */
    public final C66716g mo90758c(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "input");
        Matcher matcher = this.f191762d.matcher(charSequence);
        C87412m.m108593f(matcher, "nativePattern.matcher(input)");
        if (!matcher.matches()) {
            return null;
        }
        return new C66717h(matcher, charSequence);
    }

    /* renamed from: d */
    public final boolean mo90759d(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "input");
        return this.f191762d.matcher(charSequence).matches();
    }

    /* renamed from: e */
    public final List<String> mo90760e(CharSequence charSequence, int i) {
        C87412m.m108594g(charSequence, "input");
        C112550d0.m153782R(i);
        Matcher matcher = this.f191762d.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C26236u.m33719b(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f191762d.toString();
        C87412m.m108593f(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C66723k(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            gy3.C87412m.m108594g(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            gy3.C87412m.m108593f(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z04.C66723k.<init>(java.lang.String):void");
    }
}
