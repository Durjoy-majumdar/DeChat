package to0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fu3.C116901a;
import gt0.C87375o0;
import li0.C88508b;
import p224ra.C12964b;

/* renamed from: to0.a */
public class C90561a extends LinearLayout implements C82520h {

    /* renamed from: h */
    public static volatile int f260186h;

    /* renamed from: d */
    public final C83780d1 f260187d;

    /* renamed from: e */
    public LinearLayout f260188e;

    /* renamed from: f */
    public final Runnable f260189f = new C90562a();

    /* renamed from: g */
    public C83873p2 f260190g;

    /* renamed from: to0.a$a */
    public class C90562a implements Runnable {
        public C90562a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.AppBrandKeyBoardComponentView", "clear all views runnable");
            C83873p2 p2Var = C90561a.this.f260190g;
            if (p2Var != null) {
                p2Var.mo116431i();
            }
            LinearLayout linearLayout = C90561a.this.f260188e;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
        }
    }

    public C90561a(Context context, C83780d1 d1Var) {
        super(context);
        this.f260187d = d1Var;
        this.f260188e = this;
    }

    /* renamed from: a */
    public void mo109647a(int i, String str) {
        this.f260187d.mo109647a(i, str);
    }

    /* renamed from: b */
    public boolean mo109648b(String str, C40482o oVar) {
        return this.f260187d.mo109648b(str, oVar);
    }

    /* renamed from: c */
    public C82520h.C82521a mo109649c(boolean z) {
        return z ? getGlobalCustomViewContainer() : getCustomViewContainer();
    }

    /* renamed from: d */
    public void mo109650d(String str, String str2) {
        this.f260187d.mo109652f(str, str2, 0);
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
        Log.m105918d("MicroMsg.AppBrandKeyBoardComponentView", "publish String event, String data, int[] dst");
        this.f260187d.mo109652f(str, str2, 0);
    }

    /* renamed from: f */
    public void mo109652f(String str, String str2, int i) {
        this.f260187d.mo109652f(str, str2, i);
    }

    public String getAppId() {
        return this.f260187d.getAppId();
    }

    public C88508b getAppState() {
        return null;
    }

    public /* bridge */ /* synthetic */ C116901a getAsyncHandler() {
        return null;
    }

    public int getComponentId() {
        return hashCode();
    }

    public View getContentView() {
        return this.f260188e;
    }

    public C87375o0 getDialogContainer() {
        return null;
    }

    public C81415h0 getFileSystem() {
        return null;
    }

    public C82520h.C82521a getGlobalCustomViewContainer() {
        if (getRuntime().f238125T0 != null) {
            return getRuntime().f238125T0;
        }
        return null;
    }

    public C82381f.C82384c getInterceptor() {
        return null;
    }

    public C83165i getJsRuntime() {
        return null;
    }

    public /* bridge */ /* synthetic */ C0125s getLifecycleOwner() {
        return null;
    }

    public FrameLayout getPageArea() {
        return null;
    }

    public int getRootContainerViewId() {
        return f260186h;
    }

    public AppBrandRuntime getRuntime() {
        return this.f260187d.getRuntime();
    }

    /* renamed from: h */
    public <T extends C82835n> T mo109666h(Class<T> cls) {
        return null;
    }

    /* renamed from: i */
    public void mo114863i(C82531i.C82533b bVar) {
    }

    public boolean isRunning() {
        return getRuntime() != null && !getRuntime().mo113064k0();
    }

    /* renamed from: j */
    public void mo114864j(C82531i.C82533b bVar) {
    }

    /* renamed from: l */
    public <T extends C12964b> T mo109668l(Class<T> cls) {
        return this.f260187d.mo109668l(cls);
    }

    /* renamed from: m */
    public void mo114865m(C82531i.C82534c cVar) {
    }

    /* renamed from: n */
    public void mo109669n(C82919r2 r2Var, int[] iArr) {
        Log.m105918d("MicroMsg.AppBrandKeyBoardComponentView", "publish JsApiEvent event, int[] dst");
        r2Var.mo115162l(this.f260187d, getComponentId()).mo115158h();
    }

    /* renamed from: o */
    public void mo109670o(Runnable runnable, long j) {
        this.f260187d.mo109670o(runnable, j);
    }

    /* renamed from: p */
    public <T extends C1727m> T mo109671p(Class<T> cls) {
        return null;
    }

    /* renamed from: q */
    public void mo114866q(C82531i.C82535d dVar) {
    }

    /* renamed from: r */
    public void mo114867r(C82531i.C82534c cVar) {
    }

    /* renamed from: s */
    public boolean mo109672s(C82835n nVar) {
        return false;
    }

    public void setEvalInterceptor(C82381f.C82382a aVar) {
    }

    public void setInterceptor(C82381f.C82384c cVar) {
    }

    public void setRootContainerViewId(int i) {
        f260186h = i;
    }

    /* renamed from: t */
    public void mo109673t(Runnable runnable) {
        this.f260187d.mo109673t(runnable);
    }

    /* renamed from: v */
    public /* synthetic */ C82870p mo109675v(String str) {
        return null;
    }

    /* renamed from: w */
    public void mo109676w(C82919r2 r2Var) {
        this.f260187d.mo109652f(r2Var.mo114779e(), r2Var.mo115160j(), 0);
    }

    /* renamed from: x */
    public boolean mo109677x() {
        return false;
    }

    /* renamed from: y */
    public void mo114868y(C82531i.C82535d dVar) {
    }

    public C83873p2 getCustomViewContainer() {
        if (this.f260190g != null) {
            Log.m105918d("MicroMsg.AppBrandKeyBoardComponentView", "getCustomViewContainer, existed ViewContainer");
            return this.f260190g;
        } else if (!(getContentView() instanceof ViewGroup)) {
            return null;
        } else {
            this.f260190g = new C83873p2((ViewGroup) getContentView());
            Log.m105918d("MicroMsg.AppBrandKeyBoardComponentView", "getCustomViewContainer, create customViewContainer");
            return this.f260190g;
        }
    }
}
