package ph1;

import android.content.Context;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import th1.C64933a;
import th1.C64935c;
import vh1.C65749a;

/* renamed from: ph1.c */
public final class C62288c implements C62297m {

    /* renamed from: d */
    public final Context f177063d;

    /* renamed from: e */
    public final C64935c f177064e;

    /* renamed from: f */
    public final C64933a f177065f;

    public C62288c(Context context) {
        C87412m.m108594g(context, "context");
        this.f177063d = context;
        this.f177064e = new C64935c(context);
        this.f177065f = new C64933a(context);
    }

    /* renamed from: a */
    public void mo84316a() {
    }

    /* renamed from: b */
    public void mo84317b(C65749a aVar) {
        C87412m.m108594g(aVar, "switchParams");
        this.f177065f.mo84317b(aVar);
    }

    /* renamed from: c */
    public void mo84318c(LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
        C87412m.m108594g(liveVideoView, "renderView");
        C87412m.m108594g(lVar, "onFirstFrameRenderCallback");
        C87412m.m108594g(aVar, "isDetachInvokeFun");
        this.f177064e.mo84318c(liveVideoView, lVar, aVar);
    }

    /* renamed from: d */
    public void mo84319d(C62294j jVar) {
        C87412m.m108594g(jVar, "switchParams");
        this.f177064e.mo84319d(jVar);
        C64933a aVar = this.f177065f;
        aVar.getClass();
        aVar.f181112p = jVar;
    }

    /* renamed from: e */
    public boolean mo84320e() {
        return this.f177064e.f181117r;
    }

    /* renamed from: f */
    public C62294j mo84321f() {
        return this.f177064e.mo89087A();
    }

    /* renamed from: g */
    public void mo84322g() {
        this.f177064e.mo84322g();
    }

    /* renamed from: h */
    public void mo84323h(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        this.f177064e.mo84323h(aVar);
    }

    /* renamed from: i */
    public void mo84324i(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        C64933a aVar2 = this.f177065f;
        aVar2.getClass();
        aVar2.mo88662u(aVar);
    }
}
