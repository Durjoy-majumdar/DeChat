package yz3;

import gy3.C87412m;
import java.util.HashSet;
import java.util.List;
import vz3.C22830f;

/* renamed from: yz3.s */
public final class C119026s {
    /* renamed from: a */
    public static final String m167774a(C22830f fVar) {
        boolean z;
        C87412m.m108594g(fVar, "<this>");
        String b = fVar.mo35995b();
        C87412m.m108593f(b, "asString()");
        boolean z2 = true;
        if (!((HashSet) C119025n.f356487a).contains(b)) {
            int i = 0;
            while (true) {
                if (i >= b.length()) {
                    z = false;
                    break;
                }
                char charAt = b.charAt(i);
                if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            StringBuilder sb = new StringBuilder();
            String b2 = fVar.mo35995b();
            C87412m.m108593f(b2, "asString()");
            sb.append('`' + b2);
            sb.append('`');
            return sb.toString();
        }
        String b3 = fVar.mo35995b();
        C87412m.m108593f(b3, "asString()");
        return b3;
    }

    /* renamed from: b */
    public static final String m167775b(List<C22830f> list) {
        C87412m.m108594g(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (C22830f next : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m167774a(next));
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
