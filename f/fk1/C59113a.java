package fk1;

import android.content.Context;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import ph1.C62293i;
import ph1.C62294j;
import ph1.C62297m;
import rx3.C13598b0;
import vh1.C65749a;

/* renamed from: fk1.a */
public final class C59113a implements C62297m {

    /* renamed from: d */
    public final Context f169075d;

    /* renamed from: e */
    public final C59119e f169076e;

    public C59113a(Context context) {
        C87412m.m108594g(context, "context");
        this.f169075d = context;
        this.f169076e = new C59119e(context);
    }

    /* renamed from: a */
    public void mo84316a() {
        C62293i.f177081a.mo87358c();
    }

    /* renamed from: b */
    public void mo84317b(C65749a aVar) {
        C87412m.m108594g(aVar, "switchParams");
    }

    /* renamed from: c */
    public void mo84318c(LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
        C87412m.m108594g(liveVideoView, "renderView");
        C87412m.m108594g(lVar, "onFirstFrameRenderCallback");
        C87412m.m108594g(aVar, "isDetachInvokeFun");
        this.f169076e.mo84318c(liveVideoView, lVar, aVar);
    }

    /* renamed from: d */
    public void mo84319d(C62294j jVar) {
        C87412m.m108594g(jVar, "switchParams");
        this.f169076e.mo84319d(jVar);
    }

    /* renamed from: e */
    public boolean mo84320e() {
        return this.f169076e.f181117r;
    }

    /* renamed from: f */
    public C62294j mo84321f() {
        return (C59114b) this.f169076e.mo88668x();
    }

    /* renamed from: g */
    public void mo84322g() {
        this.f169076e.mo84322g();
    }

    /* renamed from: h */
    public void mo84323h(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        this.f169076e.mo84323h(aVar);
    }

    /* renamed from: i */
    public void mo84324i(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
    }
}
