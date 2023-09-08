package g04;

import gy3.C87412m;
import java.util.HashSet;
import java.util.Set;
import sx3.C64175a0;
import vz3.C22830f;

/* renamed from: g04.k */
public final class C107692k {
    /* renamed from: a */
    public static final Set<C22830f> m145868a(Iterable<? extends C20770i> iterable) {
        C87412m.m108594g(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (C20770i f : iterable) {
            Set<C22830f> f2 = f.mo32461f();
            if (f2 == null) {
                return null;
            }
            C64175a0.m75508p(hashSet, f2);
        }
        return hashSet;
    }
}
