package zt3;

import android.os.SystemClock;
import gu3.C107916a;
import ku3.C117420e;
import lu3.C117479j;
import lu3.C34379c;

/* renamed from: zt3.k */
public class C119172k implements C107916a<C117479j<Object>, C34379c<Object>> {

    /* renamed from: a */
    public final /* synthetic */ boolean f356890a;

    /* renamed from: b */
    public final /* synthetic */ C119157j f356891b;

    public C119172k(C119157j jVar, boolean z) {
        this.f356891b = jVar;
        this.f356890a = z;
    }

    /* renamed from: a */
    public Object mo63988a(Object obj) {
        C117479j jVar = (C117479j) obj;
        C117420e eVar = this.f356891b.f356866c;
        boolean z = this.f356890a;
        jVar.f351581r = eVar.f351465c;
        SystemClock.uptimeMillis();
        if (!z) {
            return eVar.f351465c.mo182101c(jVar);
        }
        eVar.f351465c.f351466e.f351467d.postAtFrontOfQueue(jVar);
        return jVar;
    }
}
