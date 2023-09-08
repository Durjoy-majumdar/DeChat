package vq1;

import gy3.C87412m;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vq1.n */
public final class C14966n {

    /* renamed from: a */
    public final Set<String> f41031a;

    public C14966n() {
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet());
        C87412m.m108593f(synchronizedSet, "synchronizedSet(HashSet<String>())");
        this.f41031a = synchronizedSet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f41031a) {
            sb.append(str + ';');
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "content.toString()");
        return sb4;
    }
}
