package p172io;

import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: io.c */
public final class C9215c<T extends C7594e> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "getServerTime";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        long c = C31543z5.m39453c();
        HashMap hashMap = new HashMap();
        hashMap.put("serverTime", Long.valueOf(c));
        mo120840p().invoke(mo120846k(hashMap));
    }
}
