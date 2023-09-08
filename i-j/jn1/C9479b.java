package jn1;

import android.os.SystemClock;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.FileUtils;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hn1.C8614b;
import in1.C9204a;
import it1.C9256k;
import java.util.ArrayList;
import je1.C46527o;
import je1.C9311g2;
import lm1.C10546d;
import mm1.C10934a;
import nn1.C11233b;
import os1.C11759w;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51942x91;

/* renamed from: jn1.b */
public final class C9479b extends C9476a<IResponse<C0740i2>> implements C10546d.C10547a {

    /* renamed from: u */
    public static int f29571u = -1;

    /* renamed from: o */
    public final int f29572o;

    /* renamed from: p */
    public final C51942x91 f29573p;

    /* renamed from: q */
    public final int f29574q;

    /* renamed from: r */
    public C49712hj1 f29575r;

    /* renamed from: s */
    public final C9204a f29576s = new C9204a();

    /* renamed from: t */
    public NearbyLiveFeedLoader.C3278d f29577t;

    /* renamed from: jn1.b$a */
    public static final class C9480a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C9480a f29578d = new C9480a();

        public C9480a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    public C9479b(int i, C51942x91 x912, int i2) {
        C87412m.m108594g(x912, "tabInfo");
        this.f29572o = i;
        this.f29573p = x912;
        this.f29574q = i2;
    }

    /* renamed from: a */
    public void mo3601a(NearbyLiveFeedLoader.C3278d dVar, NearbyLiveFeedLoader.C3277c cVar) {
        C87412m.m108594g(dVar, "rsp");
        C87412m.m108594g(cVar, "request");
        String str = this.f29555d;
        Log.m105924i(str, "onSceneEnd errType:" + dVar.getErrType() + " errCode:" + dVar.getErrCode() + " errMsg:" + dVar.getErrMsg() + " rsp:" + C9311g2.f29093a.mo10063b(dVar.getIncrementList()) + "}pullType: " + cVar.f15560a + " + prefetchMinInterval: " + dVar.f15570b);
        if (cVar.f15560a == 16) {
            this.f29577t = dVar;
            return;
        }
        this.f29561j.mo12482c("onFetchDone");
        this.f29558g = new C9256k(dVar.getErrType(), dVar.getErrCode(), dVar.getErrMsg(), dVar, SystemClock.elapsedRealtime());
        C9204a aVar = this.f29576s;
        int i = cVar.f15563d;
        ArrayList arrayList = (ArrayList) dVar.getIncrementList();
        C89349b lastBuffer = dVar.getLastBuffer();
        aVar.getClass();
        if (arrayList == null) {
            Log.m105924i("PreloadCacheManager", "store memoryCacheFlag:" + i + " return for dataList is null.");
        } else {
            Log.m105924i("PreloadCacheManager", "store memoryCacheFlag:" + i + " dataList:" + arrayList.size() + " lastBuffer:" + lastBuffer);
            C11759w.m11458i3(aVar.f28946a, i, 0, 0, arrayList, (ArrayList) null, lastBuffer, true, 0, 144, (Object) null);
            aVar.f28946a.mo11638g3(i);
        }
        f29571u = dVar.f15570b * 1000;
        int i2 = this.f29574q;
        int i3 = this.f29573p.f144531d + 1005000 + this.f29572o;
        switch (i2) {
            case 10:
                this.f29576s.mo10009a(i3, SystemClock.elapsedRealtime(), 0, 0);
                break;
            case 11:
                this.f29576s.mo10009a(i3, 0, SystemClock.elapsedRealtime(), 0);
                break;
            case 12:
            case 14:
            case 15:
                this.f29576s.mo10009a(i3, 0, 0, SystemClock.elapsedRealtime());
                break;
        }
        mo10162c(this.f29558g, C9480a.f29578d);
    }

    /* renamed from: b */
    public void mo10161b() {
        this.f29561j.mo12482c("fetchInternal");
        int i = this.f29572o;
        C51942x91 x912 = this.f29573p;
        int i2 = x912.f144531d;
        NearbyLiveFeedLoader.C3277c cVar = new NearbyLiveFeedLoader.C3277c(this.f29574q, x912, (C89349b) null, 1005000 + i2 + i, i2 + 1001, i, (String) null, 0, 0, FileUtils.S_IRWXU, (C8480h) null);
        mo10169j(cVar, (NearbyLiveFeedLoader.C3273a) null);
        String str = this.f29555d;
        Log.m105924i(str, "fetchInternal request:" + cVar);
    }

    /* renamed from: e */
    public C9256k<IResponse<C0740i2>> mo10164e() {
        C9256k<IResponse<C0740i2>> e = super.mo10164e();
        if (e != null) {
            new C46527o(2, ((IResponse) e.f29003d).getLastBuffer()).mo9225i();
        }
        return e;
    }

    /* renamed from: h */
    public void mo10167h() {
        boolean z;
        long j;
        Class<FinderCommonFeatureService> cls = FinderCommonFeatureService.class;
        Class cls2 = C11759w.class;
        int i = this.f29573p.f144531d + 1005000 + this.f29572o;
        this.f29576s.getClass();
        C39818r rVar = C39818r.f106831a;
        C11759w.C11760a d3 = ((C11759w) rVar.mo62446e(cls).mo75002a(cls2)).mo11635d3(i);
        boolean z2 = true;
        boolean z3 = !((C11759w) rVar.mo62446e(cls).mo75002a(cls2)).mo11637f3(i);
        Log.m105924i(this.f29555d, "checkIfStartPreload isPreload:" + d3.f34436h + " isValidData:" + z3);
        if (!(!z3 || !d3.f34436h)) {
            Log.m105928w(this.f29555d, "startPreload return for checkIfStartPreload.");
            return;
        }
        if (!C8614b.f27717a.mo9480e() || this.f29574q != 0) {
            z = true;
        } else {
            boolean z4 = !((C11759w) rVar.mo62446e(cls).mo75002a(cls2)).mo11637f3(this.f29573p.f144531d + 1005000 + this.f29572o);
            Log.m105924i(this.f29555d, "isClickEnterPreloadValid  isValidData:" + z4 + " tab_id = " + this.f29573p.f144531d);
            z = z4 ^ true;
        }
        if (!z) {
            Log.m105928w(this.f29555d, "startPreload return for isClickEnterPreloadValid.");
            return;
        }
        int i2 = this.f29574q;
        int i3 = this.f29573p.f144531d + 1005000 + this.f29572o;
        switch (i2) {
            case 10:
                j = this.f29576s.f28946a.mo11636e3(i3).f34439b;
                break;
            case 11:
                j = this.f29576s.f28946a.mo11636e3(i3).f34440c;
                break;
            case 12:
            case 14:
            case 15:
                j = this.f29576s.f28946a.mo11636e3(i3).f34441d;
                break;
            default:
                j = SystemClock.elapsedRealtime();
                break;
        }
        if (i2 != 0) {
            int i4 = f29571u;
            if (i4 == 0) {
                Log.m105924i(this.f29555d, "isValidPreloadInterval return false for server PRELOAD_INTERVAL_MS:" + f29571u);
            } else if (!(i4 == -1 || j == 0)) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                if (elapsedRealtime < ((long) f29571u)) {
                    Log.m105924i(this.f29555d, "isValidPreloadInterval return false for interval:" + elapsedRealtime + " < PRELOAD_INTERVAL_MS:" + f29571u);
                }
            }
            z2 = false;
        }
        if (!z2) {
            Log.m105928w(this.f29555d, "startPreload return for isValidPreloadInterval.");
        } else if (!C10934a.f32583a.mo11132a("startPreload first page", this.f29573p, -1)) {
            Log.m105928w(this.f29555d, "startPreload return for hit nearby city tab.");
        } else {
            super.mo10167h();
        }
    }

    /* renamed from: j */
    public final void mo10169j(NearbyLiveFeedLoader.C3277c cVar, NearbyLiveFeedLoader.C3273a aVar) {
        C11233b.f33100i.mo11311a(cVar.f15563d).f33105d = System.currentTimeMillis();
        C49712hj1 hj12 = this.f29575r;
        if (hj12 != null) {
            new C10546d(hj12).mo10822y1(cVar, this, aVar);
        } else {
            C87412m.m108603p("contextObj");
            throw null;
        }
    }

    /* renamed from: k */
    public final void mo10170k() {
        String str = this.f29555d + "_@" + this.f29573p.f144531d + '-' + this.f29573p.f144532e;
        C87412m.m108594g(str, "<set-?>");
        this.f29555d = str;
    }
}
