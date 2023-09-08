package gr1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import di3.C7335d;
import di3.C86312j;
import ei2.C31606c;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import p707tz.C65000f;
import rx3.C13598b0;
import sp3.C110807k;
import te3.C64689rq2;
import te3.C64899zy;
import wp3.C111824b;

/* renamed from: gr1.c */
public final class C59653c implements C59664m2 {

    /* renamed from: a */
    public final VideoCompositionPlayView f170470a;

    /* renamed from: b */
    public final C31606c f170471b;

    /* renamed from: c */
    public final EffectManager f170472c;

    /* renamed from: d */
    public long f170473d;

    /* renamed from: gr1.c$a */
    public static final class C59654a implements C111824b {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f170474d;

        /* renamed from: e */
        public final /* synthetic */ C59653c f170475e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f170476f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Long, C13598b0> f170477g;

        public C59654a(C32224a<C13598b0> aVar, C59653c cVar, C32224a<C13598b0> aVar2, C32226l<? super Long, C13598b0> lVar) {
            this.f170474d = aVar;
            this.f170475e = cVar;
            this.f170476f = aVar2;
            this.f170477g = lVar;
        }

        /* renamed from: b */
        public void mo79528b(long j) {
        }

        /* renamed from: h */
        public void mo79529h() {
        }

        /* renamed from: i */
        public void mo79530i() {
        }

        /* renamed from: n */
        public void mo84658n() {
            this.f170477g.invoke(0L);
        }

        /* renamed from: o */
        public void mo79531o() {
        }

        /* renamed from: r */
        public void mo79532r() {
            this.f170475e.f170470a.pause();
            this.f170476f.invoke();
        }

        /* renamed from: u */
        public void mo79533u() {
            this.f170474d.invoke();
        }
    }

    public C59653c(Context context, C64689rq2 rq22) {
        Class cls = C65000f.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(rq22, "media");
        EffectManager effectManager = new EffectManager();
        this.f170472c = effectManager;
        VideoCompositionPlayView videoCompositionPlayView = new VideoCompositionPlayView(context);
        this.f170470a = videoCompositionPlayView;
        C64899zy zyVar = rq22.f185235B;
        C64899zy zyVar2 = zyVar == null ? new C64899zy() : zyVar;
        zyVar2.f186903h = "";
        zyVar2.f186902g = false;
        C31606c gp = ((C65000f) C86312j.m106911c(cls)).mo89191gp(zyVar2);
        this.f170471b = gp;
        gp.start();
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IFinderVlogFinderService::class.java)");
        C110807k bo02 = ((C65000f) c).bo0(zyVar2, effectManager, gp, (Rect) null, 0);
        videoCompositionPlayView.mo79510k(bo02);
        this.f170473d = bo02.mo162388k();
    }

    /* renamed from: a */
    public void mo84652a(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32226l<? super Long, C13598b0> lVar) {
        C87412m.m108594g(aVar, "onReady");
        C87412m.m108594g(aVar2, "onDestroy");
        C87412m.m108594g(lVar, "onSeekFrame");
        this.f170470a.setPlayerCallback(new C59654a(aVar2, this, aVar, lVar));
    }

    public void destroy() {
        this.f170471b.destroy();
        this.f170472c.mo154931k();
        this.f170470a.mo154756f();
    }

    public Bitmap getBitmap() {
        return this.f170470a.getBitmap();
    }

    public long getCurrentPositionMs() {
        return this.f170470a.getPosition();
    }

    public View getView() {
        return this.f170470a;
    }

    public void seekTo(long j) {
        this.f170470a.mo154762i(j + this.f170473d);
    }
}
