package pg1;

import cj1.C54847z3;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61937h;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C50767p11;
import te3.C50931q91;
import te3.C51075r91;

/* renamed from: pg1.a */
public final class C11934a extends C54847z3.C54849b<C51075r91> {

    /* renamed from: b */
    public final /* synthetic */ C11935b f34865b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11934a(C11935b bVar, Class<C51075r91> cls) {
        super(cls);
        this.f34865b = bVar;
    }

    /* renamed from: a */
    public void mo9116a(C47465a aVar) {
        C51075r91 r912 = (C51075r91) aVar;
        C87412m.m108594g(r912, "result");
        String str = this.f34865b.f34866f;
        Log.m105924i(str, "recevie oneclick msg = " + C61937h.m72709h(r912) + ", curSeq = " + this.f34865b.f34867g);
        this.f34865b.f34869i = r912.f140774g;
        FinderLiveService.f159376d.getClass();
        C54847z3 z3Var = FinderLiveService.f159383n;
        C50931q91 q912 = new C50931q91();
        q912.f140197d = this.f34865b.f34869i;
        C13598b0 b0Var = C13598b0.f38549a;
        z3Var.mo75802h(17, q912);
        Long l = this.f34865b.f34867g;
        if (l == null || l.longValue() - r912.f140771d > 0) {
            C50767p11 p112 = r912.f140772e;
            String str2 = r912.f140773f;
            C11935b bVar = this.f34865b;
            if (p112 != null && str2 != null) {
                bVar.f34868h.postValue(r912);
            }
        }
    }
}
