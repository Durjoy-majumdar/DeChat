package vq1;

import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import gy3.C87412m;
import je1.C9374s0;
import vq1.C65866w;
import vq1.C65869y;

/* renamed from: vq1.f0 */
public final class C14958f0 extends C14961i {

    /* renamed from: c */
    public final C2815r0 f41009c;

    /* renamed from: d */
    public final boolean f41010d;

    /* renamed from: e */
    public final long f41011e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14958f0(C2815r0 r0Var, boolean z) {
        super((C65866w.C14969b) null);
        C87412m.m108594g(r0Var, "wordingItem");
        this.f41009c = r0Var;
        this.f41010d = z;
        this.f41011e = r0Var.f14070h;
    }

    /* renamed from: a */
    public void mo14007a(C65869y.C65870a aVar) {
        C87412m.m108594g(aVar, "callback");
        super.mo14007a(aVar);
        new C9374s0(this).mo9225i().mo123420E(new C14957e0(this, aVar));
    }

    /* renamed from: c */
    public String mo14008c() {
        return "id_" + this.f41011e + '_' + this.f41009c;
    }

    public String toString() {
        return "action_" + this.f41011e + '_' + this.f41009c.f131802d + '_' + this.f41010d + '_' + this.f41018b;
    }
}
