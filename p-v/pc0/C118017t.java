package pc0;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import kj2.C117407d;
import pc0.C118018u;
import qe3.C101130q0;

/* renamed from: pc0.t */
public class C118017t implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C101130q0 f352773d;

    /* renamed from: e */
    public final /* synthetic */ C118018u f352774e;

    public C118017t(C118018u uVar, C101130q0 q0Var) {
        this.f352774e = uVar;
        this.f352773d = q0Var;
    }

    public boolean onTimerExpired() {
        this.f352774e.f352791t = true;
        C118018u.C118020b bVar = new C118018u.C118020b(this.f352773d);
        C117407d.INSTANCE.idkeyStat(99, 230, 1, false);
        this.f352774e.onGYNetEnd(-1, 0, 0, "", bVar, (byte[]) null);
        return false;
    }
}
