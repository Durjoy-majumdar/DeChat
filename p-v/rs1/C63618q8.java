package rs1;

import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.sdk.platformtools.Log;
import ej0.C58608e;
import ej0.C86525c;
import fy3.C32224a;
import gj0.C87227a;
import gy3.C87413o;
import hj0.C87535e;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: rs1.q8 */
public final class C63618q8 implements C87227a {

    /* renamed from: a */
    public final /* synthetic */ C56711j f180382a;

    /* renamed from: rs1.q8$a */
    public static final class C63619a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56711j f180383d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63619a(C56711j jVar) {
            super(0);
            this.f180383d = jVar;
        }

        public Object invoke() {
            this.f180383d.mo80098l3();
            return C13598b0.f38549a;
        }
    }

    public C63618q8(C56711j jVar) {
        this.f180382a = jVar;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("stop fail ");
        sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : null);
        Log.m105920e("FinderProjectionScreenUIC", sb.toString());
        C61926c.m72668M(new C63619a(this.f180382a));
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        Log.m105924i("FinderProjectionScreenUIC", "stop success");
        C86525c cVar = this.f180382a.f162605w;
        if (cVar != null) {
            cVar.f251386e.f167798a = C58608e.C58609a.Stopped;
        }
        if (cVar != null) {
            cVar.mo121007h();
        }
        C86525c cVar2 = this.f180382a.f162605w;
        if (cVar2 != null) {
            cVar2.mo121008i();
        }
        C56711j jVar = this.f180382a;
        C86525c cVar3 = jVar.f162605w;
        if (cVar3 != null) {
            cVar3.f251389h = null;
        }
        C61926c.m72668M(new C63561k8(cVar3, jVar, true));
        C56711j jVar2 = this.f180382a;
        jVar2.f162605w = null;
        jVar2.f162606x = 0;
    }
}
