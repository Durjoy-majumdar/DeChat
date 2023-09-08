package ph1;

import android.content.Context;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import uh1.C65355a;
import uh1.C65362c;
import vh1.C65749a;

/* renamed from: ph1.f */
public final class C62291f implements C62297m {

    /* renamed from: d */
    public final Context f177073d;

    /* renamed from: e */
    public final C65362c f177074e;

    /* renamed from: f */
    public final C65355a f177075f;

    public C62291f(Context context) {
        C87412m.m108594g(context, "context");
        this.f177073d = context;
        this.f177074e = new C65362c(context);
        this.f177075f = new C65355a(context);
    }

    /* renamed from: a */
    public void mo84316a() {
        this.f177075f.getClass();
        C62293i.f177081a.mo87358c();
    }

    /* renamed from: b */
    public void mo84317b(C65749a aVar) {
        C87412m.m108594g(aVar, "switchParams");
        this.f177075f.mo84317b(aVar);
    }

    /* renamed from: c */
    public void mo84318c(LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
        C87412m.m108594g(liveVideoView, "renderView");
        C87412m.m108594g(lVar, "onFirstFrameRenderCallback");
        C87412m.m108594g(aVar, "isDetachInvokeFun");
        this.f177074e.mo84318c(liveVideoView, lVar, aVar);
    }

    /* renamed from: d */
    public void mo84319d(C62294j jVar) {
        C87412m.m108594g(jVar, "switchParams");
        this.f177074e.mo84319d(jVar);
        C65355a aVar = this.f177075f;
        aVar.getClass();
        aVar.f181112p = jVar;
    }

    /* renamed from: e */
    public boolean mo84320e() {
        return this.f177074e.f181117r;
    }

    /* renamed from: g */
    public void mo84322g() {
        this.f177074e.mo84322g();
    }

    /* renamed from: h */
    public void mo84323h(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        C65362c cVar = this.f177074e;
        cVar.getClass();
        cVar.mo88662u(aVar);
    }

    /* renamed from: i */
    public void mo84324i(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        C65355a aVar2 = this.f177075f;
        aVar2.getClass();
        aVar2.mo88662u(aVar);
    }

    /* renamed from: j */
    public C62292g mo84321f() {
        return this.f177074e.mo89463y();
    }
}
