package he1;

import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gr1.C59673q2;
import gy3.C87412m;
import gy3.C87413o;
import he1.C59854m;
import mr1.C61575s;
import mr1.C61576t;
import o40.C61926c;
import p006bk.C54479b;
import p871zj.C66843h;
import qt1.C12931a;
import rx3.C13598b0;
import te3.C64689rq2;
import xl1.C66368a;
import xl1.C66372b;

/* renamed from: he1.q */
public final class C59861q implements C59869v {

    /* renamed from: a */
    public final /* synthetic */ MegaVideoBulletView f170923a;

    /* renamed from: he1.q$a */
    public static final class C59862a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MegaVideoBulletView f170924d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59862a(MegaVideoBulletView megaVideoBulletView) {
            super(0);
            this.f170924d = megaVideoBulletView;
        }

        public Object invoke() {
            if (this.f170924d.getFeed().mo76077q0(this.f170924d.getBulletManager().f170913p)) {
                C59854m bulletManager = this.f170924d.getBulletManager();
                if (bulletManager.mo84817d()) {
                    Log.m105924i("FinderBulletManager", "pause: id = " + C61926c.m72691p(bulletManager.mo84816c().getItemId()));
                    if (bulletManager.mo84815b().mo90846e()) {
                        bulletManager.mo84815b().mo90848g(false);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: he1.q$b */
    public static final class C59863b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MegaVideoBulletView f170925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59863b(MegaVideoBulletView megaVideoBulletView) {
            super(0);
            this.f170925d = megaVideoBulletView;
        }

        public Object invoke() {
            if (this.f170925d.getFeed().mo76077q0(this.f170925d.getBulletManager().f170913p)) {
                C59854m bulletManager = this.f170925d.getBulletManager();
                if (bulletManager.mo84817d()) {
                    Log.m105924i("FinderBulletManager", "resume: id = " + C61926c.m72691p(bulletManager.mo84816c().getItemId()));
                    if (!bulletManager.mo84815b().mo90846e()) {
                        bulletManager.mo84815b().mo90850i();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: he1.q$c */
    public static final class C59864c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MegaVideoBulletView f170926d;

        /* renamed from: e */
        public final /* synthetic */ int f170927e;

        /* renamed from: f */
        public final /* synthetic */ int f170928f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59864c(MegaVideoBulletView megaVideoBulletView, int i, int i2) {
            super(0);
            this.f170926d = megaVideoBulletView;
            this.f170927e = i;
            this.f170928f = i2;
        }

        public Object invoke() {
            if (this.f170926d.getFeed().mo76077q0(this.f170926d.getBulletManager().f170913p)) {
                C59854m bulletManager = this.f170926d.getBulletManager();
                long j = ((long) this.f170927e) * 1000;
                long j2 = ((long) this.f170928f) * 1000;
                if (bulletManager.mo84817d()) {
                    Log.m105926v("FinderBulletManager", "setProgress: currentTime = " + bulletManager.f170907g + ", times = " + j + ", id = " + C61926c.m72691p(bulletManager.mo84816c().getItemId()));
                    if (bulletManager.f170907g == -1 && bulletManager.mo84816c().mo76077q0(bulletManager.f170913p)) {
                        bulletManager.mo84815b().mo90852k(j);
                    }
                    bulletManager.f170907g = j;
                    C66368a aVar = bulletManager.f170908h;
                    if (aVar != null) {
                        C61926c.m72666K(0, new C66372b(aVar, j2, j));
                    } else {
                        C87412m.m108603p("bulletLoader");
                        throw null;
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: he1.q$d */
    public static final class C59865d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MegaVideoBulletView f170929d;

        /* renamed from: e */
        public final /* synthetic */ float f170930e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59865d(MegaVideoBulletView megaVideoBulletView, float f) {
            super(0);
            this.f170929d = megaVideoBulletView;
            this.f170930e = f;
        }

        public Object invoke() {
            if (this.f170929d.getFeed().mo76077q0(this.f170929d.getBulletManager().f170913p)) {
                C59854m bulletManager = this.f170929d.getBulletManager();
                float f = this.f170930e;
                boolean z = this.f170929d.getContext().getResources().getConfiguration().orientation == 2;
                bulletManager.f170912o = f;
                int a = C59854m.C32869b.m39837a(C59854m.f170903r, !z, f);
                C54479b.m61196c().f152754a = a;
                Log.m105924i("FinderBulletManager", "changeSpeed: duration=" + a + ", ratio=" + f + ", isLandscape=" + z);
                bulletManager.mo84815b().mo90847f();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: he1.q$e */
    public static final class C59866e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MegaVideoBulletView f170931d;

        /* renamed from: e */
        public final /* synthetic */ int f170932e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59866e(MegaVideoBulletView megaVideoBulletView, int i) {
            super(0);
            this.f170931d = megaVideoBulletView;
            this.f170932e = i;
        }

        public Object invoke() {
            if (this.f170931d.getFeed().mo76077q0(this.f170931d.getBulletManager().f170913p)) {
                C59854m bulletManager = this.f170931d.getBulletManager();
                int i = this.f170932e;
                long j = ((long) i) * 1000;
                if (!bulletManager.mo84817d()) {
                    Log.m105924i("FinderBulletManager", "no attach seek seek: timeStamp = " + i);
                    bulletManager.f170907g = j;
                } else {
                    Log.m105924i("FinderBulletManager", "seek: timeStamp = " + i + ", isAttached=" + bulletManager.f170909i + ", id = " + C61926c.m72691p(bulletManager.mo84816c().getItemId()));
                    bulletManager.mo84815b().mo90851j(j);
                    if (j < bulletManager.f170907g) {
                        bulletManager.f170907g = j;
                        C66843h hVar = bulletManager.mo84815b().f192019d.f191990h;
                        if (hVar != null) {
                            hVar.mo90839b();
                        }
                        bulletManager.mo84814a(bulletManager.mo84816c().f154483h, "seek");
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C59861q(MegaVideoBulletView megaVideoBulletView) {
        this.f170923a = megaVideoBulletView;
    }

    /* renamed from: a */
    public void mo84824a(int i) {
        C61926c.m72668M(new C59866e(this.f170923a, i));
    }

    /* renamed from: b */
    public void mo78295b(float f) {
        C61926c.m72668M(new C59865d(this.f170923a, f));
    }

    /* renamed from: c */
    public void mo78294c(C64689rq2 rq22, int i, int i2) {
        C61926c.m72668M(new C59864c(this.f170923a, i, i2));
    }

    /* renamed from: d */
    public void mo78296d(C64689rq2 rq22, long j, long j2) {
    }

    /* renamed from: e */
    public void mo77475e(C64689rq2 rq22) {
        C61926c.m72668M(new C59863b(this.f170923a));
    }

    /* renamed from: f */
    public void mo78297f(C64689rq2 rq22, long j, C12931a aVar) {
    }

    /* renamed from: g */
    public void mo78298g(C64689rq2 rq22, C59673q2 q2Var, int i) {
    }

    /* renamed from: h */
    public void mo78299h(C64689rq2 rq22) {
        MegaVideoBulletView megaVideoBulletView = this.f170923a;
        megaVideoBulletView.getClass();
        C61926c.m72668M(new C8514s(megaVideoBulletView));
    }

    /* renamed from: i */
    public void mo78300i(C64689rq2 rq22, C61576t tVar) {
    }

    /* renamed from: j */
    public void mo78301j(C64689rq2 rq22, C61575s sVar) {
        C61926c.m72668M(new C59862a(this.f170923a));
    }

    /* renamed from: k */
    public void mo78302k(C64689rq2 rq22) {
    }

    /* renamed from: l */
    public void mo78303l(C64689rq2 rq22, C59673q2 q2Var, int i) {
    }

    /* renamed from: m */
    public void mo78304m(C64689rq2 rq22, long j) {
    }

    /* renamed from: n */
    public void mo78305n(C64689rq2 rq22, C59673q2 q2Var, int i) {
    }

    /* renamed from: o */
    public void mo78306o(C59673q2 q2Var, C61575s sVar) {
    }
}
