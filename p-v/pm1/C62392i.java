package pm1;

import android.view.View;
import cm1.C0797z;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import com.tencent.p014mm.sdk.platformtools.Log;
import f50.C58924d;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ph1.C62290e;
import ph1.C62292g;
import ph1.C62293i;
import rx3.C13598b0;

/* renamed from: pm1.i */
public final class C62392i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f177338d;

    /* renamed from: e */
    public final /* synthetic */ C0797z f177339e;

    /* renamed from: f */
    public final /* synthetic */ NearbyLivePreviewView f177340f;

    /* renamed from: g */
    public final /* synthetic */ C62381d f177341g;

    /* renamed from: h */
    public final /* synthetic */ C32224a<C13598b0> f177342h;

    /* renamed from: i */
    public final /* synthetic */ View f177343i;

    /* renamed from: j */
    public final /* synthetic */ C32224a<C13598b0> f177344j;

    /* renamed from: n */
    public final /* synthetic */ C32227p<Integer, Integer, C13598b0> f177345n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62392i(String str, C0797z zVar, NearbyLivePreviewView nearbyLivePreviewView, C62381d dVar, C32224a<C13598b0> aVar, View view, C32224a<C13598b0> aVar2, C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        super(0);
        this.f177338d = str;
        this.f177339e = zVar;
        this.f177340f = nearbyLivePreviewView;
        this.f177341g = dVar;
        this.f177342h = aVar;
        this.f177343i = view;
        this.f177344j = aVar2;
        this.f177345n = pVar;
    }

    public Object invoke() {
        String str = this.f177338d;
        C87412m.m108593f(str, "liveUrl");
        this.f177340f.setMediaSource(new C62378a(str, this.f177339e, true));
        C35558g gVar = new C35558g(this.f177342h, this.f177343i, this.f177340f, this.f177341g, this.f177339e);
        C35557f fVar = new C35557f(this.f177344j, this.f177341g, this.f177339e);
        C35559h hVar = new C35559h(this.f177345n, this.f177341g, this.f177339e);
        C62290e a = C62293i.f177081a.mo87356a(this.f177339e.getItemId());
        this.f177340f.setIsReuse(a.f177071b);
        if (a.f177071b) {
            C62292g gVar2 = a.f177072c;
            C58924d dVar = gVar2 != null ? gVar2.f177095g : null;
            C87412m.m108591d(dVar);
            dVar.setMute(true);
            this.f177340f.mo78394i(a, gVar, fVar, hVar);
        } else {
            this.f177340f.setMute(true);
            this.f177340f.mo78395j(gVar, fVar, hVar);
        }
        String r = this.f177341g.mo87439r();
        Log.m105924i(r, "checkAutoPlayByOutside canReusePlayer:" + a.f177071b + " view:" + this.f177340f);
        return C13598b0.f38549a;
    }
}
