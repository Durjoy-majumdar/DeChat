package f40;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C31887k0;
import p261wl.C38174i;

/* renamed from: f40.m0 */
public class C31893m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C38174i f84965d;

    /* renamed from: e */
    public final /* synthetic */ String f84966e;

    public C31893m0(C31887k0 k0Var, C38174i iVar, String str) {
        this.f84965d = iVar;
        this.f84966e = str;
    }

    public void run() {
        C31887k0.C31891d dVar = (C31887k0.C31891d) this.f84965d.get();
        if (dVar == null) {
            Log.m105921e("MicroMsg.StorageManager", "Fail to get impl class of extendable itf: %s", C31887k0.C31891d.class.getName());
            return;
        }
        Log.m105925i("MicroMsg.StorageManager", "Invoke extension: %s", dVar.getClass().getName());
        dVar.mo58411Pq(this.f84966e);
    }
}
