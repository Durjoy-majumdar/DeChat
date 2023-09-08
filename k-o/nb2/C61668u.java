package nb2;

import bl3.C39818r;
import cm1.C55033u;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import sb2.C63756e;
import sb2.C63807m;

/* renamed from: nb2.u */
public final class C61668u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61647e f175351d;

    /* renamed from: e */
    public final /* synthetic */ C61646d f175352e;

    /* renamed from: f */
    public final /* synthetic */ C63756e f175353f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f175354g;

    /* renamed from: nb2.u$a */
    public static final class C61669a implements CommentDrawerContract.CloseDrawerCallback {

        /* renamed from: a */
        public final /* synthetic */ C61646d f175355a;

        /* renamed from: b */
        public final /* synthetic */ C61647e f175356b;

        /* renamed from: c */
        public final /* synthetic */ C60905o f175357c;

        public C61669a(C61646d dVar, C61647e eVar, C60905o oVar) {
            this.f175355a = dVar;
            this.f175356b = eVar;
            this.f175357c = oVar;
        }

        /* renamed from: a */
        public void mo2377a(int i, List<? extends C55033u> list, boolean z) {
            C87412m.m108594g(list, "data");
            C61646d dVar = this.f175355a;
            dVar.f175298d.f170765m = i;
            this.f175356b.mo86591n(this.f175357c, dVar);
        }
    }

    public C61668u(C61647e eVar, C61646d dVar, C63756e eVar2, C60905o oVar) {
        this.f175351d = eVar;
        this.f175352e = dVar;
        this.f175353f = eVar2;
        this.f175354g = oVar;
    }

    public final void run() {
        C61646d dVar = this.f175352e;
        ((C63807m) C39818r.f106831a.mo62444c(this.f175351d.f175299e).mo75002a(C63807m.class)).mo88603f3(dVar.f175298d, this.f175353f.f180751s, new C61669a(dVar, this.f175351d, this.f175354g));
        this.f175353f.f180750r = false;
    }
}
