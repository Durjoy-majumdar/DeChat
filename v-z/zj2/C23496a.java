package zj2;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import p289a7.C16433b;
import p289a7.C16435d;
import p294b7.C16739c;
import p295b8.C16760a;
import p295b8.C16765c;
import p295b8.C16774g;
import p300c8.C16871d;
import p300c8.C16875m;
import p300c8.C79957s;
import p370p7.C21941l;
import p370p7.C21962v;
import p396x6.C22995c;
import p396x6.C22996d;
import p396x6.C22997e;
import p396x6.C23016o;
import p396x6.C23017p;
import p396x6.C23023u;
import p396x6.C23027v;
import rx3.C13598b0;
import wj2.C66130c;

/* renamed from: zj2.a */
public final class C23496a extends C66857b {

    /* renamed from: c */
    public C22996d f67392c = new C22996d(MMApplicationContext.getContext(), (C16433b<C16435d>) null, 0);

    /* renamed from: d */
    public final C16765c f67393d = new C16765c(new C16760a.C16761a(new C16875m((Handler) null, (C16871d.C16872a) null)));

    /* renamed from: e */
    public float f67394e = 1.0f;

    /* renamed from: f */
    public C23023u f67395f;

    /* renamed from: zj2.a$a */
    public static final class C23497a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23496a f67396d;

        /* renamed from: e */
        public final /* synthetic */ C66130c f67397e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23497a(C23496a aVar, C66130c cVar) {
            super(0);
            this.f67396d = aVar;
            this.f67397e = cVar;
        }

        public Object invoke() {
            C23496a aVar = this.f67396d;
            aVar.f67395f = new C23023u(aVar.f67392c, aVar.f67393d, new C22995c());
            C23023u uVar = this.f67396d.f67395f;
            if (uVar != null) {
                uVar.mo36328m(this.f67397e.f190069b);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zj2.a$b */
    public static final class C23498b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23496a f67398d;

        /* renamed from: e */
        public final /* synthetic */ float f67399e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23498b(C23496a aVar, float f) {
            super(0);
            this.f67398d = aVar;
            this.f67399e = f;
        }

        public Object invoke() {
            C23023u uVar = this.f67398d.f67395f;
            if (uVar != null) {
                uVar.mo36331p(this.f67399e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zj2.a$c */
    public static final class C23499c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23496a f67400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23499c(C23496a aVar) {
            super(0);
            this.f67400d = aVar;
        }

        public Object invoke() {
            C23023u uVar = this.f67400d.f67395f;
            if (uVar != null) {
                uVar.mo36262a(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zj2.a$d */
    public static final class C23500d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23496a f67401d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23500d(C23496a aVar) {
            super(0);
            this.f67401d = aVar;
        }

        public Object invoke() {
            C23023u uVar = this.f67401d.f67395f;
            if (uVar != null) {
                uVar.mo36262a(true);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zj2.a$f */
    public static final class C23501f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23496a f67402d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23501f(C23496a aVar) {
            super(0);
            this.f67402d = aVar;
        }

        public Object invoke() {
            C23023u uVar = this.f67402d.f67395f;
            if (uVar != null) {
                uVar.stop();
            }
            C23023u uVar2 = this.f67402d.f67395f;
            if (uVar2 != null) {
                uVar2.release();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zj2.a$g */
    public static final class C23502g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f67403d;

        /* renamed from: e */
        public final /* synthetic */ C23496a f67404e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23502g(boolean z, C23496a aVar) {
            super(0);
            this.f67403d = z;
            this.f67404e = aVar;
        }

        public Object invoke() {
            if (this.f67403d) {
                C23496a aVar = this.f67404e;
                C23023u uVar = aVar.f67395f;
                aVar.f67394e = uVar != null ? uVar.f66203m : 1.0f;
                if (uVar != null) {
                    uVar.mo36331p(0.0f);
                }
            } else {
                C23496a aVar2 = this.f67404e;
                C23023u uVar2 = aVar2.f67395f;
                if (uVar2 != null) {
                    uVar2.mo36331p(aVar2.f67394e);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zj2.a$i */
    public static final class C23503i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23496a f67405d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23503i(C23496a aVar) {
            super(0);
            this.f67405d = aVar;
        }

        public Object invoke() {
            C23023u uVar = this.f67405d.f67395f;
            if (uVar != null) {
                uVar.stop();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zj2.a$e */
    public static final class C23504e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23496a f67406d;

        /* renamed from: e */
        public final /* synthetic */ long f67407e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23504e(C23496a aVar, long j) {
            super(0);
            this.f67406d = aVar;
            this.f67407e = j;
        }

        public Object invoke() {
            C21941l lVar = new C21941l(Uri.parse(C86013q1.m106448i(this.f67406d.f192038a.f165948t, false)), new C79957s(), new C16739c(), (Handler) null, (C21941l.C21942a) null);
            C23023u uVar = this.f67406d.f67395f;
            if (uVar != null) {
                uVar.mo36325j(lVar);
            }
            C23023u uVar2 = this.f67406d.f67395f;
            if (uVar2 != null) {
                uVar2.mo36327l(this.f67407e);
            }
            C23496a aVar = this.f67406d;
            C23023u uVar3 = aVar.f67395f;
            if (uVar3 != null) {
                uVar3.mo36329n(aVar.f192038a.f165940l ? 1 : 0);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zj2.a$h */
    public static final class C23505h implements C23017p.C23018a {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Exception, C13598b0> f67408d;

        public C23505h(C32226l<? super Exception, C13598b0> lVar) {
            this.f67408d = lVar;
        }

        public void onLoadingChanged(boolean z) {
        }

        public void onPlaybackParametersChanged(C23016o oVar) {
        }

        public void onPlayerError(C22997e eVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("onExoPlayError, error type:");
            String str = null;
            sb.append(eVar != null ? Integer.valueOf(eVar.f66080d) : null);
            sb.append(", message:");
            if (eVar != null) {
                str = eVar.getLocalizedMessage();
            }
            sb.append(str);
            Log.m105920e("MicroMsg.RingtonePlayer", sb.toString());
            this.f67408d.invoke(eVar);
        }

        public void onPlayerStateChanged(boolean z, int i) {
        }

        public void onPositionDiscontinuity() {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onTimelineChanged(C23027v vVar, Object obj) {
        }

        public void onTracksChanged(C21962v vVar, C16774g gVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23496a(C58010a aVar, C66130c cVar, boolean z) {
        super(aVar, cVar, z);
        C87412m.m108594g(aVar, "mediaInfo");
        C87412m.m108594g(cVar, "soundInfo");
        C61926c.m72661F("MicroMsg.RingtonePlayer", new C23497a(this, cVar));
    }

    /* renamed from: a */
    public void mo36971a(float f, float f2) {
        C61926c.m72661F("MicroMsg.RingtonePlayer", new C23498b(this, f));
    }

    /* renamed from: b */
    public long mo36972b() {
        C23023u uVar = this.f67395f;
        if (uVar != null) {
            return uVar.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo36973c() {
        return this.f192039b.f190069b;
    }

    /* renamed from: d */
    public boolean mo36974d() {
        C23023u uVar = this.f67395f;
        if (uVar != null && uVar.mo36266f() == 3) {
            C23023u uVar2 = this.f67395f;
            if (uVar2 != null && uVar2.mo36263b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo36975e() {
        C61926c.m72661F("MicroMsg.RingtonePlayer", new C23499c(this));
    }

    /* renamed from: f */
    public void mo36976f() {
        C61926c.m72661F("MicroMsg.RingtonePlayer", new C23500d(this));
    }

    /* renamed from: g */
    public void mo36977g(long j) {
        C61926c.m72661F("MicroMsg.RingtonePlayer", new C23504e(this, j));
    }

    /* renamed from: h */
    public void mo36978h() {
        C61926c.m72661F("MicroMsg.RingtonePlayer", new C23501f(this));
    }

    /* renamed from: i */
    public void mo36979i(boolean z) {
        C61926c.m72661F("MicroMsg.RingtonePlayer", new C23502g(z, this));
    }

    /* renamed from: j */
    public void mo36980j(C32226l<? super Exception, C13598b0> lVar) {
        C87412m.m108594g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C23023u uVar = this.f67395f;
        if (uVar != null) {
            uVar.mo36323h(new C23505h(lVar));
        }
    }

    /* renamed from: k */
    public void mo36981k() {
        C61926c.m72661F("MicroMsg.RingtonePlayer", new C23503i(this));
    }
}
