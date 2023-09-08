package f40;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C31887k0;
import p261wl.C38174i;

/* renamed from: f40.l0 */
public class C31892l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C38174i f84964d;

    public C31892l0(C31887k0 k0Var, C38174i iVar) {
        this.f84964d = iVar;
    }

    public void run() {
        C31887k0.C31891d dVar = (C31887k0.C31891d) this.f84964d.get();
        if (dVar == null) {
            Log.m105921e("MicroMsg.StorageManager", "Fail to get impl class of extendable itf: %s", C31887k0.C31891d.class.getName());
            return;
        }
        Log.m105925i("MicroMsg.StorageManager", "Invoke extension: %s", dVar.getClass().getName());
        dVar.it0();
    }
}
