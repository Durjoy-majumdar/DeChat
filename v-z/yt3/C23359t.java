package yt3;

import lt3.C21460a;
import ot3.C117897l;
import ot3.C21881e;
import ot3.C21884f;
import tt3.C22551c;
import xt3.C53447b;
import xt3.C53448e;

/* renamed from: yt3.t */
public class C23359t implements C53447b<C53448e.C53450b> {

    /* renamed from: a */
    public final /* synthetic */ C117897l f67120a;

    /* renamed from: b */
    public final /* synthetic */ C23357s f67121b;

    public C23359t(C23357s sVar, C117897l lVar) {
        this.f67121b = sVar;
        this.f67120a = lVar;
    }

    /* renamed from: a */
    public void mo36822a(Object obj) {
        this.f67121b.mo36803h(C21884f.m25094a().f61885a, 0);
        boolean z = ((C53448e.C53450b) obj).f150353a;
        C21881e.m25084c("Soter.TaskPrepareAppSecureKey", "soter: ask upload result: %b", Boolean.valueOf(z));
        if (z) {
            this.f67121b.mo36804b(new C22551c(0, this.f67120a));
            return;
        }
        C21460a.m24283q();
        this.f67121b.mo36804b(new C22551c(1003, "upload app secure key failed"));
    }
}
