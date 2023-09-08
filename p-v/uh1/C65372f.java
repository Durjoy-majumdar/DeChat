package uh1;

import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import up1.C37521f;
import wh1.C66114a;

/* renamed from: uh1.f */
public final class C65372f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C65362c f188156d;

    /* renamed from: e */
    public final /* synthetic */ LiveVideoView f188157e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f188158f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<Boolean> f188159g;

    /* renamed from: uh1.f$a */
    public static final class C65373a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<Boolean> f188160d;

        /* renamed from: e */
        public final /* synthetic */ C65362c f188161e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65373a(C32224a<Boolean> aVar, C65362c cVar) {
            super(0);
            this.f188160d = aVar;
            this.f188161e = cVar;
        }

        public Object invoke() {
            if (this.f188160d.invoke().booleanValue()) {
                this.f188161e.mo84332p();
            }
            return C13598b0.f38549a;
        }
    }

    public C65372f(C65362c cVar, LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
        this.f188156d = cVar;
        this.f188157e = liveVideoView;
        this.f188158f = lVar;
        this.f188159g = aVar;
    }

    public final void run() {
        Log.m105924i(this.f188156d.f181104e, "switchInLiveRoom switch view success. #2");
        C37521f.f99374d.getClass();
        boolean z = false;
        if (C37521f.f99135B6.mo60266n().intValue() == 1) {
            C37521f.f99374d.getClass();
            if (C37521f.f99578z6.mo60266n().intValue() == 1 && !C85875k4.m106157N() && !C85875k4.m106167X()) {
                z = true;
            }
        }
        if (z) {
            C66114a.f190029a.mo90155g(this.f188157e);
        }
        this.f188158f.invoke(Boolean.FALSE);
        if (!this.f188156d.mo89463y().f177078k || !this.f188159g.invoke().booleanValue()) {
            C61926c.m72666K(60, new C65373a(this.f188159g, this.f188156d));
        } else {
            this.f188156d.mo84332p();
        }
        Log.m105924i(this.f188156d.f181104e, "switchInLiveRoom switch view success. #3");
    }
}
