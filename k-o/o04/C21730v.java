package o04;

import gy3.C87412m;
import n04.C25144j1;
import wy3.C26469k;
import yz3.C23393c;

/* renamed from: o04.v */
public final class C21730v {
    /* renamed from: a */
    public static final String m24713a(C25144j1 j1Var) {
        StringBuilder sb = new StringBuilder();
        m24714b("type: " + j1Var, sb);
        m24714b("hashCode: " + j1Var.hashCode(), sb);
        m24714b("javaClass: " + j1Var.getClass().getCanonicalName(), sb);
        for (C26469k o = j1Var.mo37094o(); o != null; o = o.mo51892b()) {
            m24714b("fqName: " + C23393c.f67152a.mo36858o(o), sb);
            m24714b("javaClass: " + o.getClass().getCanonicalName(), sb);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* renamed from: b */
    public static final StringBuilder m24714b(String str, StringBuilder sb) {
        C87412m.m108594g(str, "<this>");
        sb.append(str);
        sb.append(10);
        return sb;
    }
}
