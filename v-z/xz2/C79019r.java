package xz2;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import p261wl.C38166b;
import p261wl.C38174i;
import qy2.C77455o;
import qy2.C77456r;

/* renamed from: xz2.r */
public final class C79019r {

    /* renamed from: a */
    public static final C79019r f232026a = new C79019r();

    /* renamed from: b */
    public static final HashMap<String, C77456r> f232027b = new HashMap<>();

    /* renamed from: a */
    public final C77456r mo108986a(String str) {
        C77456r rVar = f232027b.get(str);
        if (rVar == null && str != null) {
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C77456r.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (iVar.hasKey(str)) {
                    return (C77456r) iVar.get();
                }
            }
        }
        return rVar;
    }

    /* renamed from: b */
    public final C77455o mo108987b(String str) {
        try {
            C77456r a = mo108986a(str);
            if (a != null) {
                return a.l30(str);
            }
            return null;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TextStatus.StatusThirdShareManager", th, "customps err", new Object[0]);
            return null;
        }
    }
}
