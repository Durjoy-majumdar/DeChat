package qj1;

import bl3.C39818r;
import ht1.C60200t1;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import up1.C27696y;

/* renamed from: qj1.ua */
public final class C12699ua implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f36387d;

    /* renamed from: e */
    public final /* synthetic */ String f36388e;

    public C12699ua(C12389fa faVar, String str) {
        this.f36387d = faVar;
        this.f36388e = str;
    }

    public final void run() {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        this.f36387d.f35685V.setVisibility(0);
        ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(this.f36388e, C27696y.RAW_IMAGE), this.f36387d.f35684U, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.ALPHA_BG));
    }
}
