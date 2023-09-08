package g70;

import gy3.C87412m;
import java.util.HashSet;

/* renamed from: g70.k */
public final class C8240k {
    /* renamed from: a */
    public static final String m8315a(HashSet<Integer> hashSet) {
        C87412m.m108594g(hashSet, "<this>");
        StringBuilder sb = new StringBuilder("[");
        for (Number intValue : hashSet) {
            int intValue2 = intValue.intValue();
            sb.append(intValue2 + ", ");
        }
        sb.append("]");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }
}
