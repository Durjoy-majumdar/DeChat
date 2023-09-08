package p451b2;

import android.graphics.Typeface;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import gy3.C87412m;

/* renamed from: b2.y */
public final class C104028y implements C104026w {
    /* renamed from: a */
    public Typeface mo145624a(C104022q qVar, int i) {
        C87412m.m108594g(qVar, "fontWeight");
        return mo145627c((String) null, qVar, i);
    }

    /* renamed from: b */
    public Typeface mo145625b(C104023r rVar, C104022q qVar, int i) {
        C87412m.m108594g(rVar, "name");
        C87412m.m108594g(qVar, "fontWeight");
        String str = rVar.f307658e;
        C87412m.m108594g(str, "name");
        int i2 = qVar.f307657d / 100;
        boolean z = false;
        if (i2 >= 0 && i2 < 2) {
            str = str + "-thin";
        } else {
            if (2 <= i2 && i2 < 4) {
                str = str + "-light";
            } else if (i2 != 4) {
                if (i2 == 5) {
                    str = str + "-medium";
                } else {
                    if (!(6 <= i2 && i2 < 8)) {
                        if (8 <= i2 && i2 < 11) {
                            str = str + "-black";
                        }
                    }
                }
            }
        }
        Typeface typeface = null;
        if (!(str.length() == 0)) {
            Typeface c = mo145627c(str, qVar, i);
            if (!C87412m.m108589b(c, Typeface.create(Typeface.DEFAULT, C104009d.m138746a(qVar, i))) && !C87412m.m108589b(c, mo145627c((String) null, qVar, i))) {
                z = true;
            }
            if (z) {
                typeface = c;
            }
        }
        return typeface == null ? mo145627c(rVar.f307658e, qVar, i) : typeface;
    }

    /* renamed from: c */
    public final Typeface mo145627c(String str, C104022q qVar, int i) {
        boolean z = true;
        if (i == 0) {
            C104022q qVar2 = C104022q.f307650e;
            if (C87412m.m108589b(qVar, C104022q.f307654i)) {
                if (str == null || str.length() == 0) {
                    Typeface typeface = Typeface.DEFAULT;
                    C87412m.m108593f(typeface, NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN);
                    return typeface;
                }
            }
        }
        int a = C104009d.m138746a(qVar, i);
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (z) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(a);
            C87412m.m108593f(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, a);
        C87412m.m108593f(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }
}
