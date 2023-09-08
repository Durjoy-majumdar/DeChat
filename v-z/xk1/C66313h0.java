package xk1;

import com.tencent.p014mm.autogen.events.FinderGamePostEvent;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import er1.C58777u0;

/* renamed from: xk1.h0 */
public final class C66313h0 implements C44580q1 {

    /* renamed from: a */
    public final /* synthetic */ C66355w f190901a;

    public C66313h0(C66355w wVar) {
        this.f190901a = wVar;
    }

    /* renamed from: a */
    public final void mo1579a(boolean z, boolean z2) {
        if (z) {
            this.f190901a.f191020G = true;
            C58777u0 u0Var = C58777u0.f168283a;
            if (C58777u0.f168284b == 18) {
                u0Var.mo83833b(6);
            }
            FinderGamePostEvent finderGamePostEvent = new FinderGamePostEvent();
            finderGamePostEvent.f154773d.f154774a = true;
            finderGamePostEvent.publish();
        }
    }
}
