package vq1;

import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import gy3.C87412m;
import je1.C9307f1;
import vq1.C65866w;
import vq1.C65869y;

/* renamed from: vq1.h0 */
public final class C14960h0 extends C14961i {

    /* renamed from: c */
    public final C2815r0 f41014c;

    /* renamed from: d */
    public final int f41015d;

    /* renamed from: e */
    public final long f41016e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14960h0(C2815r0 r0Var, int i) {
        super((C65866w.C14969b) null);
        C87412m.m108594g(r0Var, "wordingItem");
        this.f41014c = r0Var;
        this.f41015d = i;
        this.f41016e = r0Var.f14070h;
    }

    /* renamed from: a */
    public void mo14007a(C65869y.C65870a aVar) {
        C87412m.m108594g(aVar, "callback");
        super.mo14007a(aVar);
        new C9307f1(this).mo9225i().mo123420E(new C14959g0(this, aVar));
    }

    /* renamed from: c */
    public String mo14008c() {
        return "id_" + this.f41016e + '_' + this.f41014c;
    }

    public String toString() {
        return "action_" + this.f41016e + '_' + this.f41014c.f131802d + '_' + this.f41018b;
    }
}
