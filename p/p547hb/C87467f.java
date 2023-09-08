package p547hb;

import android.content.res.Configuration;
import br0.C79773b;
import br0.C79774c;
import br0.C79778e;
import bt0.C79808b;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import rq0.C90084c;
import rq0.C90086e;

/* renamed from: hb.f */
public class C87467f implements C90086e, C79778e.C79779a, C90084c {

    /* renamed from: a */
    public final C83780d1 f253444a;

    /* renamed from: b */
    public String f253445b;

    /* renamed from: c */
    public boolean f253446c = false;

    /* renamed from: d */
    public boolean f253447d = false;

    /* renamed from: hb.f$a */
    public class C87468a implements C79778e.C79779a {

        /* renamed from: a */
        public final /* synthetic */ C79778e.C79779a f253448a;

        public C87468a(C79778e.C79779a aVar) {
            this.f253448a = aVar;
        }

        /* renamed from: g */
        public void mo109919g(C79778e.C79780b bVar, boolean z) {
            C87467f.this.mo109919g(bVar, z);
            C79778e.C79779a aVar = this.f253448a;
            if (aVar != null) {
                aVar.mo109919g(bVar, z);
            }
        }
    }

    /* renamed from: hb.f$b */
    public class C87469b extends C79773b {
        public C87469b() {
        }

        /* renamed from: f */
        public void mo109901f() {
            C87467f.this.f253444a.mo116151F0().mo62478f(this);
            C87467f fVar = C87467f.this;
            if (!fVar.f253447d && fVar.f253446c) {
                fVar.mo116463f((C79778e.C79779a) null);
            }
        }
    }

    public C87467f(C83780d1 d1Var, String str) {
        this.f253444a = d1Var;
        this.f253445b = str;
    }

    /* renamed from: a */
    public boolean mo116460a() {
        return false;
    }

    /* renamed from: b */
    public void mo116449b() {
        this.f253446c = false;
    }

    /* renamed from: c */
    public void mo116450c() {
        this.f253446c = true;
        if (this.f253444a.mo116151F0() == null || !this.f253444a.mo116151F0().mo62479g()) {
            mo116463f((C79778e.C79779a) null);
        } else {
            this.f253444a.mo116151F0().mo62473a(new C87469b());
        }
        mo116463f((C79778e.C79779a) null);
    }

    /* renamed from: d */
    public String mo116461d() {
        return this.f253445b;
    }

    /* renamed from: e */
    public void mo116462e(String str) {
        Log.m105925i("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "setRequestedOrientation[%s] appId[%s]", str, this.f253444a.getAppId());
        if (str != null && !str.isEmpty()) {
            this.f253445b = str;
        }
    }

    /* renamed from: f */
    public void mo116463f(C79778e.C79779a aVar) {
        if (this.f253447d) {
            Log.m105929w("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation but destroyed, appId:%s", this.f253444a.getAppId());
            return;
        }
        C79774c cVar = this.f253444a.f244577X;
        if (cVar == null || cVar.getOrientationHandler() == null) {
            if (aVar != null) {
                aVar.mo109919g((C79778e.C79780b) null, false);
            }
        } else if (this.f253444a.getRuntime().mo113071o0()) {
            Log.printInfoStack("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation, game is showing launch ad, ignore changing orientation", new Object[0]);
            if (aVar != null) {
                aVar.mo109919g((C79778e.C79780b) null, false);
            }
        } else {
            C79778e.C79780b b = C79778e.C79780b.m96933b(this.f253445b);
            Log.printInfoStack("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation, appId[%s], orientation[%s]", this.f253444a.getAppId(), b);
            if (b != null) {
                this.f253444a.f244577X.getOrientationHandler().mo109918b(b, new C87468a(aVar));
            }
        }
    }

    /* renamed from: g */
    public void mo109919g(C79778e.C79780b bVar, boolean z) {
        Object[] objArr = new Object[2];
        objArr[0] = bVar == null ? "null" : bVar.name();
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "onOrientationChanged requested[%s], success[%b]", objArr);
    }

    /* renamed from: h */
    public void mo116451h(C79808b bVar) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDestroy() {
        this.f253446c = false;
        this.f253447d = true;
    }
}
