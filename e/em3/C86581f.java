package em3;

import com.tencent.p014mm.sdk.platformtools.Log;
import dm3.C86351b;
import e42.C7596h;
import e42.C86432k;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: em3.f */
public final class C86581f extends C86432k<C86351b> {
    /* renamed from: e */
    public String mo16e() {
        return "getMsgMeta";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: o */
    public C7596h mo62167o(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        T t = this.f251227a;
        C87412m.m108591d(t);
        C86351b bVar = (C86351b) t;
        Log.m105924i("getMsgMeta", "[mb] get msg meta data = " + hVar);
        long optLong = hVar.optLong("msgId", -1);
        C86585j a = C86585j.m107402a(optLong, hVar.optString("ID"), "", hVar.optBoolean("needFrame", true), true, bVar.f251055a, bVar.f251056b);
        if (a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("meta", a.mo121027c(true));
            return mo120846k(hashMap);
        }
        return mo120842g(1, "create msg meta " + optLong + " failed");
    }
}
