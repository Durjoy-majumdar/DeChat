package p451b2;

import android.graphics.Typeface;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import gy3.C87412m;

/* renamed from: b2.x */
public final class C104027x implements C104026w {
    /* renamed from: a */
    public Typeface mo145624a(C104022q qVar, int i) {
        C87412m.m108594g(qVar, "fontWeight");
        return mo145626c((String) null, qVar, i);
    }

    /* renamed from: b */
    public Typeface mo145625b(C104023r rVar, C104022q qVar, int i) {
        C87412m.m108594g(rVar, "name");
        C87412m.m108594g(qVar, "fontWeight");
        return mo145626c(rVar.f307658e, qVar, i);
    }

    /* renamed from: c */
    public final Typeface mo145626c(String str, C104022q qVar, int i) {
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
        Typeface create = str == null ? Typeface.DEFAULT : Typeface.create(str, 0);
        int i2 = qVar.f307657d;
        if (i != 1) {
            z = false;
        }
        Typeface create2 = Typeface.create(create, i2, z);
        C87412m.m108593f(create2, "create(\n            fami…ontStyle.Italic\n        )");
        return create2;
    }
}
