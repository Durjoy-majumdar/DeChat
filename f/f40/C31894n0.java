package f40;

import bp3.C79760s;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C31896o0;
import p261wl.C38174i;

/* renamed from: f40.n0 */
public class C31894n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C38174i f84967d;

    /* renamed from: e */
    public final /* synthetic */ int f84968e;

    public C31894n0(C31896o0 o0Var, C38174i iVar, int i) {
        this.f84967d = iVar;
        this.f84968e = i;
    }

    public void run() {
        C31896o0.C31897a aVar = (C31896o0.C31897a) this.f84967d.get();
        if (aVar == null) {
            Log.m105921e("MicroMsg.UpgradeManager", "Fail to get impl class of extendable itf: %s", C31896o0.C31897a.class.getName());
            return;
        }
        Log.m105925i("MicroMsg.UpgradeManager", "Invoke extension: %s", aVar.getClass().getName());
        try {
            C79760s.m96908a("cb-on-upgraded-for: " + aVar.getClass().getSimpleName());
            aVar.mo58416aJ(this.f84968e);
        } finally {
            C79760s.m96909b();
        }
    }
}
