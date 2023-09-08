package f40;

import bp3.C79760s;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C31887k0;
import p261wl.C38174i;

/* renamed from: f40.j0 */
public class C31885j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C38174i f84955d;

    public C31885j0(C31887k0 k0Var, C38174i iVar) {
        this.f84955d = iVar;
    }

    public void run() {
        C31887k0.C31890c cVar = (C31887k0.C31890c) this.f84955d.get();
        if (cVar == null) {
            Log.m105921e("MicroMsg.StorageManager", "Fail to get impl class of extendable itf: %s", C31887k0.C31890c.class.getName());
            return;
        }
        Log.m105925i("MicroMsg.StorageManager", "Invoke extension: %s", cVar.getClass().getName());
        try {
            C79760s.m96908a("create-tables-for: " + cVar.getClass().getSimpleName());
            C86709a0.m107535s().mo121138d(C86709a0.m107535s().f251811i.f262815b, cVar.mo9070Rg(), false);
        } finally {
            C79760s.m96909b();
        }
    }
}
