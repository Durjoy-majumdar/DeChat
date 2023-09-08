package jn1;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import in1.C9204a;
import it1.C9256k;
import ln1.C21445b;
import ob0.C11385n;
import ob0.C117747y;
import os1.C11759w;
import rx3.C13598b0;
import te3.C49712hj1;
import wm1.C15548j;

/* renamed from: jn1.d */
public final class C9482d extends C9476a<C117747y> implements C11385n {

    /* renamed from: o */
    public C49712hj1 f29580o;

    /* renamed from: p */
    public int f29581p;

    /* renamed from: q */
    public C15548j f29582q;

    /* renamed from: r */
    public String f29583r = "12";

    /* renamed from: s */
    public C9204a f29584s = new C9204a();

    /* renamed from: jn1.d$a */
    public static final class C9483a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9482d f29585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9483a(C9482d dVar) {
            super(0);
            this.f29585d = dVar;
        }

        public Object invoke() {
            C86709a0.m107524d().mo123470p(4210, this.f29585d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public void mo10161b() {
        C49712hj1 hj12 = this.f29580o;
        if (hj12 != null) {
            String str = this.f29555d;
            Log.m105924i(str, "fetchLiveSquareTabs, contextObj:" + hj12);
            this.f29561j.mo12482c("doScene");
            C21445b bVar = C21445b.f60694a;
            Log.m105924i("FinderNearbyLiveLoadingReporter", "tickTabCgiStart");
            C21445b.f60702i = C31543z5.m39453c();
            C15548j jVar = new C15548j(hj12, this.f29581p, (String) null, (String) null, (String) null, (String) null, 60, (C8480h) null);
            this.f29582q = jVar;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            jVar.mo85584j1(context, MMApplicationContext.getContext().getResources().getString(C0966R.string.ett), 500);
            C86709a0.m107524d().mo123455a(4210, this);
            C86709a0.m107524d().mo123460f(this.f29582q);
            return;
        }
        C87412m.m108603p("contextObj");
        throw null;
    }

    /* renamed from: h */
    public void mo10167h() {
        C9204a aVar = this.f29584s;
        String str = this.f29583r;
        aVar.getClass();
        C87412m.m108594g(str, "memoryCacheFlag");
        Log.m105924i("PreloadCacheManager", "getPreloadSquareTabsCache memoryCacheFlag:" + str);
        C11759w wVar = aVar.f28946a;
        wVar.getClass();
        C9256k<T> kVar = wVar.f34426g.get(str);
        boolean z = true;
        if (kVar != null && !mo10163d(kVar)) {
            this.f29558g = kVar;
            mo10162c(kVar, C9481c.f29579d);
            z = false;
        }
        if (!z) {
            Log.m105924i(this.f29555d, "startPreload return for use cache tabs.");
        } else {
            super.mo10167h();
        }
    }

    /* renamed from: i */
    public void mo10168i() {
        C86709a0.m107524d().mo123470p(4210, this);
        super.mo10168i();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        String str2 = this.f29555d;
        Log.m105924i(str2, "onSceneEnd errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scene:" + yVar);
        this.f29561j.mo12482c("onSceneEnd");
        C21445b bVar = C21445b.f60694a;
        Log.m105924i("FinderNearbyLiveLoadingReporter", "tickTabCgiEnd");
        C21445b.f60703j = C31543z5.m39453c() - C21445b.f60702i;
        C9256k kVar = new C9256k(i, i2, str, yVar, SystemClock.elapsedRealtime());
        this.f29558g = kVar;
        C9204a aVar = this.f29584s;
        String str3 = this.f29583r;
        aVar.getClass();
        C87412m.m108594g(str3, "memoryCacheFlag");
        Log.m105924i("PreloadCacheManager", "storePreloadSquareTabsCache memoryCacheFlag:" + str3);
        C11759w wVar = aVar.f28946a;
        wVar.getClass();
        wVar.f34426g.put(str3, kVar);
        mo10162c(this.f29558g, new C9483a(this));
    }
}
