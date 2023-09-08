package gl1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import al1.C0079b;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import rx3.C13598b0;

/* renamed from: gl1.b */
public final class C59532b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f170157d;

    /* renamed from: e */
    public final /* synthetic */ C0079b f170158e;

    /* renamed from: f */
    public final /* synthetic */ C59547g f170159f;

    /* renamed from: g */
    public final /* synthetic */ int f170160g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59532b(boolean z, C0079b bVar, C59547g gVar, int i) {
        super(0);
        this.f170157d = z;
        this.f170158e = bVar;
        this.f170159f = gVar;
        this.f170160g = i;
    }

    public Object invoke() {
        C0079b bVar;
        Class cls = C54108o.class;
        if (this.f170157d && (bVar = this.f170158e) != null) {
            FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin = this.f170159f.f170181n;
            if (finderLiveAnchorAfterPlugin != null) {
                finderLiveAnchorAfterPlugin.mo3205f1(bVar);
            }
            ((C54108o) C86312j.m106911c(cls)).getClass();
            C54067f0 f0Var = C54108o.f151869h;
            f0Var.f151443Y.f151831h = (long) this.f170158e.f490b;
            ((C54108o) C86312j.m106911c(cls)).getClass();
            f0Var.f151443Y.f151832i = this.f170158e.f491c;
            ((C54108o) C86312j.m106911c(cls)).getClass();
            f0Var.f151443Y.f151833j = (long) this.f170158e.f492d;
            ((C54108o) C86312j.m106911c(cls)).getClass();
            f0Var.f151443Y.f151830g = (long) this.f170158e.f489a;
        }
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54067f0 f0Var2 = C54108o.f151869h;
        f0Var2.mo74764n();
        ((C54108o) C86312j.m106911c(cls)).getClass();
        f0Var2.f151443Y.f151834k = this.f170160g;
        ((C54108o) C86312j.m106911c(cls)).getClass();
        f0Var2.f151443Y.f151828e = System.currentTimeMillis();
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_OUT, String.valueOf(this.f170160g), (String) null, 4, (Object) null);
        ((C54108o) C86312j.m106911c(cls)).Nx0();
        return C13598b0.f38549a;
    }
}
