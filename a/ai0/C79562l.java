package ai0;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81546b;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83195k3;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82549j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83133y6;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84563l4;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fu3.C116901a;
import gt0.C87375o0;
import li0.C88508b;
import p224ra.C12964b;
import rx3.C13604l;
import zt3.C119157j;

/* renamed from: ai0.l */
public class C79562l extends C82549j implements C82520h {

    /* renamed from: q */
    public final C81925i2 f233304q;

    /* renamed from: r */
    public final C81546b f233305r;

    /* renamed from: s */
    public C83873p2 f233306s;

    /* renamed from: t */
    public C79557i f233307t;

    /* renamed from: ai0.l$a */
    public class C79563a implements Runnable {
        public C79563a() {
        }

        public void run() {
            C79562l.this.mo109674u();
        }
    }

    /* renamed from: ai0.l$b */
    public class C79564b implements C83195k3 {

        /* renamed from: a */
        public final /* synthetic */ C82919r2 f233309a;

        public C79564b(C82919r2 r2Var) {
            this.f233309a = r2Var;
        }

        /* renamed from: a */
        public void mo109680a(C40482o oVar, C13604l<Long, Long> lVar, String str) {
            if (oVar != null) {
                this.f233309a.mo115161k(C79562l.this).mo115159i(oVar);
            }
        }
    }

    /* renamed from: ai0.l$c */
    public class C79565c implements C83195k3 {

        /* renamed from: a */
        public final /* synthetic */ String f233311a;

        /* renamed from: b */
        public final /* synthetic */ String f233312b;

        /* renamed from: c */
        public final /* synthetic */ int f233313c;

        public C79565c(C79562l lVar, String str, String str2, int i) {
            this.f233311a = str;
            this.f233312b = str2;
            this.f233313c = i;
        }

        /* renamed from: a */
        public void mo109680a(C40482o oVar, C13604l<Long, Long> lVar, String str) {
            if (oVar != null) {
                C83133y6.m101968a(oVar, this.f233311a, this.f233312b, this.f233313c);
            }
        }
    }

    /* renamed from: ai0.l$d */
    public class C79566d implements C83195k3 {

        /* renamed from: a */
        public final /* synthetic */ C82919r2 f233314a;

        public C79566d(C82919r2 r2Var) {
            this.f233314a = r2Var;
        }

        /* renamed from: a */
        public void mo109680a(C40482o oVar, C13604l<Long, Long> lVar, String str) {
            if (oVar != null) {
                this.f233314a.mo115161k(C79562l.this.f233304q).mo115159i(oVar);
            }
        }
    }

    /* renamed from: ai0.l$e */
    public class C79567e implements C83195k3 {

        /* renamed from: a */
        public final /* synthetic */ String f233316a;

        /* renamed from: b */
        public final /* synthetic */ String f233317b;

        public C79567e(C79562l lVar, String str, String str2) {
            this.f233316a = str;
            this.f233317b = str2;
        }

        /* renamed from: a */
        public void mo109680a(C40482o oVar, C13604l<Long, Long> lVar, String str) {
            if (oVar != null) {
                C83133y6.m101968a(oVar, this.f233316a, this.f233317b, 0);
            }
        }
    }

    public C79562l(C81925i2 i2Var, C81546b bVar) {
        this.f233304q = i2Var;
        this.f233305r = bVar;
    }

    /* renamed from: a */
    public void mo109647a(int i, String str) {
        this.f233304q.mo109647a(i, str);
    }

    /* renamed from: b */
    public boolean mo109648b(String str, C40482o oVar) {
        return true;
    }

    /* renamed from: c */
    public C82520h.C82521a mo109649c(boolean z) {
        if (!z) {
            return getCustomViewContainer();
        }
        if (getRuntime().f238125T0 != null) {
            return getRuntime().f238125T0;
        }
        return null;
    }

    /* renamed from: d */
    public void mo109650d(String str, String str2) {
        mo109652f(str, str2, 0);
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
        this.f233305r.mo113817f(new C79567e(this, str, str2));
    }

    /* renamed from: f */
    public void mo109652f(String str, String str2, int i) {
        this.f233305r.mo113817f(new C79565c(this, str, str2, i));
    }

    public String getAppId() {
        return this.f233304q.getAppId();
    }

    public C88508b getAppState() {
        return null;
    }

    public /* synthetic */ C116901a getAsyncHandler() {
        return null;
    }

    public int getComponentId() {
        return hashCode();
    }

    public View getContentView() {
        C79557i iVar;
        C79557i iVar2 = this.f233307t;
        if (iVar2 != null) {
            return iVar2.getContentContainer();
        }
        if (getRuntime() != null) {
            AppBrandRuntime runtime = getRuntime();
            if (runtime.f238154s instanceof C84563l4) {
                Log.m105919d("MicroMsg.AppBrandRuntime", "getRuntimeAdViewContainer, appId:%s, use AdLoadingSplash RuntimeAdViewContainer", runtime.f238147j);
                iVar = ((C84563l4) runtime.f238154s).getRuntimeAdViewContainer();
            } else if (runtime.f238158w != null) {
                Log.m105919d("MicroMsg.AppBrandRuntime", "getRuntimeAdViewContainer, appId:%s, use secondaryRuntimeAdViewContainer", runtime.f238147j);
                iVar = runtime.f238158w;
            } else {
                iVar = null;
            }
            Object[] objArr = new Object[3];
            objArr[0] = iVar;
            objArr[1] = runtime.f238147j;
            C84560k4 k4Var = runtime.f238154s;
            objArr[2] = k4Var == null ? "null" : k4Var.getClass().getSimpleName();
            Log.m105925i("MicroMsg.AppBrandRuntime", "getRuntimeAdViewContainer:%s, appId:%s, splash:%s", objArr);
            this.f233307t = iVar;
            if (iVar != null) {
                return iVar.getContentContainer();
            }
        }
        return null;
    }

    public Context getContext() {
        return this.f233304q.getContext();
    }

    public C87375o0 getDialogContainer() {
        return null;
    }

    public C81415h0 getFileSystem() {
        return null;
    }

    public C82381f.C82384c getInterceptor() {
        return null;
    }

    public C83165i getJsRuntime() {
        return null;
    }

    public /* synthetic */ C0125s getLifecycleOwner() {
        return null;
    }

    public AppBrandRuntime getRuntime() {
        return this.f233304q.getRuntime();
    }

    /* renamed from: h */
    public <T extends C82835n> T mo109666h(Class<T> cls) {
        return null;
    }

    public boolean isRunning() {
        return getRuntime() != null && !getRuntime().mo113064k0();
    }

    /* renamed from: l */
    public <T extends C12964b> T mo109668l(Class<T> cls) {
        return this.f233304q.mo109668l(cls);
    }

    /* renamed from: n */
    public void mo109669n(C82919r2 r2Var, int[] iArr) {
        this.f233305r.mo113817f(new C79566d(r2Var));
    }

    /* renamed from: o */
    public void mo109670o(Runnable runnable, long j) {
        this.f233304q.mo109670o(runnable, j);
    }

    /* renamed from: p */
    public <T extends C1727m> T mo109671p(Class<T> cls) {
        return null;
    }

    /* renamed from: s */
    public boolean mo109672s(C82835n nVar) {
        return false;
    }

    /* renamed from: t */
    public void mo109673t(Runnable runnable) {
        this.f233304q.mo109673t(runnable);
    }

    /* renamed from: u */
    public void mo109674u() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ((C119157j) C119157j.f356862d).mo183895z(new C79563a());
            return;
        }
        Log.m105924i("MicroMsg.AppBrandServiceAdComponentView[AppBrandSplashAd]", "destroy view containers");
        C83873p2 p2Var = this.f233306s;
        if (p2Var != null) {
            p2Var.mo116431i();
            this.f233306s = null;
        }
        C79557i iVar = this.f233307t;
        if (iVar != null) {
            iVar.removeAllViews();
            this.f233307t = null;
        }
    }

    /* renamed from: v */
    public /* synthetic */ C82870p mo109675v(String str) {
        return null;
    }

    /* renamed from: w */
    public void mo109676w(C82919r2 r2Var) {
        this.f233305r.mo113817f(new C79564b(r2Var));
    }

    /* renamed from: x */
    public boolean mo109677x() {
        return false;
    }

    /* renamed from: z */
    public C83873p2 getCustomViewContainer() {
        C83873p2 p2Var = this.f233306s;
        if (p2Var != null) {
            return p2Var;
        }
        if (!(getContentView() instanceof ViewGroup)) {
            return null;
        }
        C83873p2 p2Var2 = new C83873p2((ViewGroup) getContentView());
        this.f233306s = p2Var2;
        return p2Var2;
    }
}
