package cj1;

import android.os.Bundle;
import android.os.SystemClock;
import b50.C54410e;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.autogen.events.FeedLiveLifeEvent;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import eb0.C31543z5;
import er1.C58704c5;
import er1.C58713e5;
import er1.C58728f5;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import ok1.C62042e;
import pe3.C89349b;
import qg1.C47826f;
import rx3.C13598b0;
import te3.C50262lh0;
import te3.C50415mk1;
import te3.C52294zq0;
import te3.C64351ey0;
import zc1.C66785b;

/* renamed from: cj1.j1 */
public final class C54775j1 implements C54410e {

    /* renamed from: d */
    public final /* synthetic */ C45795b f153529d;

    /* renamed from: e */
    public final /* synthetic */ C54795n5 f153530e;

    /* renamed from: f */
    public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, Bundle, C13598b0> f153531f;

    /* renamed from: g */
    public final /* synthetic */ C54806r1 f153532g;

    /* renamed from: cj1.j1$b */
    public static final class C28573b extends C87413o implements C32230s<Boolean, Integer, Integer, String, C50262lh0, C13598b0> {

        /* renamed from: d */
        public static final C28573b f78438d = new C28573b();

        public C28573b() {
            super(5);
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            C50262lh0 lh02 = (C50262lh0) obj5;
            C87412m.m108594g((String) obj4, "errMsg");
            Log.m105924i("FinderLiveExternalHelper", "close live result:" + booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.j1$a */
    public static final class C54776a implements C47826f.C47827a {

        /* renamed from: a */
        public final /* synthetic */ C45795b f153533a;

        /* renamed from: b */
        public final /* synthetic */ C54795n5 f153534b;

        /* renamed from: c */
        public final /* synthetic */ C54806r1 f153535c;

        /* renamed from: d */
        public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, Bundle, C13598b0> f153536d;

        /* renamed from: e */
        public final /* synthetic */ int f153537e;

        /* renamed from: cj1.j1$a$a */
        public static final class C54777a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C54795n5 f153538d;

            /* renamed from: e */
            public final /* synthetic */ int f153539e;

            /* renamed from: f */
            public final /* synthetic */ int f153540f;

            /* renamed from: g */
            public final /* synthetic */ String f153541g;

            /* renamed from: i */
            public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, Bundle, C13598b0> f153542i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54777a(C54795n5 n5Var, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, C13598b0> sVar, int i, int i2, String str) {
                super(0);
                this.f153538d = n5Var;
                this.f153542i = sVar;
                this.f153539e = i;
                this.f153540f = i2;
                this.f153541g = str;
            }

            public Object invoke() {
                C54795n5.C54796a.m61723a(this.f153538d, 0, C28571i1.f78435d, 1, (Object) null);
                C58704c5.m68184a(C58704c5.f168044a, C58713e5.f168070B.f168101b, (C89349b) null, false, true, 6, (Object) null);
                this.f153542i.mo237D(Boolean.FALSE, Integer.valueOf(this.f153539e), Integer.valueOf(this.f153540f), this.f153541g, null);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: cj1.j1$a$b */
        public static final class C54778b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C45795b f153543d;

            /* renamed from: e */
            public final /* synthetic */ C54795n5 f153544e;

            /* renamed from: f */
            public final /* synthetic */ C54806r1 f153545f;

            /* renamed from: g */
            public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, Bundle, C13598b0> f153546g;

            /* renamed from: h */
            public final /* synthetic */ int f153547h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54778b(C45795b bVar, C54795n5 n5Var, C54806r1 r1Var, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, C13598b0> sVar, int i) {
                super(0);
                this.f153543d = bVar;
                this.f153544e = n5Var;
                this.f153545f = r1Var;
                this.f153546g = sVar;
                this.f153547h = i;
            }

            public Object invoke() {
                Class cls = C54991o.class;
                Class cls2 = C55001u.class;
                C54843w3 w3Var = C54843w3.f153747a;
                w3Var.mo75792g(this.f153543d);
                String str = null;
                w3Var.mo75793h(this.f153543d, (String) null);
                w3Var.mo75788c(this.f153543d);
                C54795n5 n5Var = this.f153544e;
                if (n5Var != null) {
                    C54795n5.C54796a.m61724b(n5Var, ((C55001u) this.f153543d.mo71262a(cls2)).f154420q.f182392d, ((C55001u) this.f153543d.mo71262a(cls2)).f154416j, ((C55001u) this.f153543d.mo71262a(cls2)).f154423t, 2, (C32227p) null, 16, (Object) null);
                }
                ((C54991o) this.f153543d.mo71262a(cls)).f154325i1 = SystemClock.elapsedRealtimeNanos();
                new FeedLiveLifeEvent().publish();
                C58704c5.C58705a.f168049b = 3;
                C115669n.INSTANCE.mo175912v(1552, 20);
                C58704c5 c5Var = C58704c5.f168044a;
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportExtrenalSuccLive");
                C58728f5 f5Var = C58728f5.f168144a;
                C58728f5.f168146c = C31543z5.m39451a();
                C58728f5.m68216c(f5Var, this.f153543d, 20, 0, "externalSuccLive", (String) null, 16, (Object) null);
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                C45795b bVar = this.f153543d;
                C62042e eVar = C62042e.f176370a;
                finderLiveService.mo77623Z(bVar, eVar.mo87027N0(), C58124b.C58125b.START_LIVE, (Bundle) null, ((C55001u) this.f153543d.mo71262a(cls2)).f154420q.f182392d);
                eVar.mo87106p0().putInt("live_status_flag", 1);
                C64351ey0 ey02 = this.f153545f.f153637b;
                C52294zq0 zq02 = ((C54991o) this.f153543d.mo71262a(cls)).f154328j;
                ey02.f183047f = zq02 != null ? zq02.f146179d : null;
                C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
                this.f153545f.f153637b.f183045d = ((C55001u) this.f153543d.mo71262a(cls2)).f154420q.f182396h;
                this.f153545f.f153637b.f183048g = b != null ? b.getNickname() : null;
                C64351ey0 ey03 = this.f153545f.f153637b;
                if (b != null) {
                    str = b.getAvatarUrl();
                }
                ey03.f183049h = str;
                this.f153546g.mo237D(Boolean.TRUE, Integer.valueOf(this.f153547h), 0, null, null);
                return C13598b0.f38549a;
            }
        }

        public C54776a(C45795b bVar, C54795n5 n5Var, C54806r1 r1Var, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, C13598b0> sVar, int i) {
            this.f153533a = bVar;
            this.f153534b = n5Var;
            this.f153535c = r1Var;
            this.f153536d = sVar;
            this.f153537e = i;
        }

        /* renamed from: a */
        public void mo9151a(int i, long j, C50415mk1 mk12) {
        }

        /* renamed from: b */
        public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
        }

        /* renamed from: c */
        public void mo9153c(int i, long j) {
            Log.m105924i("FinderLiveExternalHelper", "share live success!");
            C61926c.m72668M(new C54778b(this.f153533a, this.f153534b, this.f153535c, this.f153536d, this.f153537e));
        }

        /* renamed from: d */
        public void mo9154d(int i, int i2, String str, int i3) {
            Log.m105924i("FinderLiveExternalHelper", "share live fail!");
            C61926c.m72668M(new C54777a(this.f153534b, this.f153536d, i2, i, str));
        }
    }

    public C54775j1(C45795b bVar, C54795n5 n5Var, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, C13598b0> sVar, C54806r1 r1Var) {
        this.f153529d = bVar;
        this.f153530e = n5Var;
        this.f153531f = sVar;
        this.f153532g = r1Var;
    }

    public void callback(int i, Bundle bundle) {
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        Log.m105924i("FinderLiveExternalHelper", "on enterRoom finish, liveData.business(LiveCommonSlice::class.java).enableAudioMode():" + ((C54991o) this.f153529d.mo71262a(cls2)).mo75960G3() + " audioModeHolderBm:" + ((C54991o) this.f153529d.mo71262a(cls2)).f154254S2);
        if (i > 0) {
            C58728f5 f5Var = C58728f5.f168144a;
            C58728f5.f168148e = C31543z5.m39451a();
            C58704c5 c5Var = C58704c5.f168044a;
            C58713e5.C58715b bVar = C58713e5.f168073a;
            C58704c5.m68184a(c5Var, C58713e5.f168069A.f168101b, (C89349b) null, false, false, 14, (Object) null);
            C54795n5 n5Var = this.f153530e;
            if (n5Var != null) {
                long j = ((C55001u) this.f153529d.mo71262a(cls)).f154420q.f182392d;
                long j2 = ((C55001u) this.f153529d.mo71262a(cls)).f154416j;
                n5Var.mo75706J(j, j2, ((C54991o) this.f153529d.mo71262a(cls2)).f154354q, 1, new C54776a(this.f153529d, this.f153530e, this.f153532g, this.f153531f, i));
                return;
            }
            return;
        }
        C58704c5 c5Var2 = C58704c5.f168044a;
        C58713e5.C58715b bVar2 = C58713e5.f168073a;
        C58704c5.m68184a(c5Var2, C58713e5.f168098z.f168101b, (C89349b) null, false, true, 6, (Object) null);
        Log.m105928w("FinderLiveExternalHelper", "enter room fail");
        C54795n5 n5Var2 = this.f153530e;
        if (n5Var2 != null) {
            C54795n5.C54796a.m61723a(n5Var2, 0, C28573b.f78438d, 1, (Object) null);
        }
        this.f153531f.mo237D(Boolean.FALSE, Integer.valueOf(i), -1, null, null);
    }
}
