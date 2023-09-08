package yt3;

import lt3.C21460a;
import ot3.C117897l;
import ot3.C21881e;
import tt3.C22551c;
import xt3.C53447b;
import xt3.C53448e;

/* renamed from: yt3.v */
public class C23363v implements C53447b<C53448e.C53450b> {

    /* renamed from: a */
    public final /* synthetic */ C117897l f67130a;

    /* renamed from: b */
    public final /* synthetic */ C23360u f67131b;

    public C23363v(C23360u uVar, C117897l lVar) {
        this.f67131b = uVar;
        this.f67130a = lVar;
    }

    /* renamed from: a */
    public void mo36822a(Object obj) {
        C23360u uVar = this.f67131b;
        uVar.mo36803h(uVar.f67122c, 0);
        boolean z = ((C53448e.C53450b) obj).f150353a;
        C21881e.m25084c("Soter.TaskPrepareAuthKey", "soter: auth key upload result: %b", Boolean.valueOf(z));
        if (z) {
            this.f67131b.mo36804b(new C22551c(0, this.f67130a));
            return;
        }
        C21460a.m24284r(this.f67131b.f67122c, false);
        C23360u uVar2 = this.f67131b;
        uVar2.mo36804b(new C22551c(1004, String.format("upload auth key: %s failed", new Object[]{uVar2.f67122c})));
    }
}
