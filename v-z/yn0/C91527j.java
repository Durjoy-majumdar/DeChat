package yn0;

import android.content.Context;
import android.os.Looper;
import android.webkit.ValueCallback;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83106b;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import fu3.C116901a;
import fy3.C32224a;
import gt0.C87375o0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kr0.C88267e;
import li0.C88508b;
import mu3.C109639a;
import p224ra.C12964b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;

/* renamed from: yn0.j */
public final class C91527j implements C82381f {

    /* renamed from: d */
    public final C91521g f262347d;

    /* renamed from: e */
    public final AtomicBoolean f262348e = new AtomicBoolean(false);

    /* renamed from: f */
    public final C13601g f262349f = C36568h.m40985a(new C91528a(this));

    /* renamed from: g */
    public final C13601g f262350g = C36568h.m40985a(new C91529b(this));

    /* renamed from: h */
    public final C91520e f262351h;

    /* renamed from: i */
    public final HashMap<String, C82870p> f262352i;

    /* renamed from: yn0.j$a */
    public static final class C91528a extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C91527j f262353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91528a(C91527j jVar) {
            super(0);
            this.f262353d = jVar;
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler(C109639a.m148950a("HTMLVConsoleViewComponentImpl#Async"));
            this.f262353d.f262348e.set(true);
            return mMHandler;
        }
    }

    /* renamed from: yn0.j$b */
    public static final class C91529b extends C87413o implements C32224a<C53546f> {

        /* renamed from: d */
        public final /* synthetic */ C91527j f262354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91529b(C91527j jVar) {
            super(0);
            this.f262354d = jVar;
        }

        public Object invoke() {
            return new C53546f(this.f262354d.f262347d.getWebView());
        }
    }

    public C91527j(C91521g gVar) {
        C87412m.m108594g(gVar, "view");
        this.f262347d = gVar;
        new MMHandler(Looper.getMainLooper());
        this.f262351h = new C91520e(gVar);
        HashMap<String, C82870p> hashMap = new HashMap<>();
        for (C82870p pVar : C26236u.m33719b(new C91518c())) {
            String e = pVar.mo114779e();
            C87412m.m108593f(e, "it.name");
            hashMap.put(e, pVar);
        }
        this.f262352i = hashMap;
        new CopyOnWriteArraySet();
    }

    /* renamed from: a */
    public void mo109647a(int i, String str) {
        C91520e eVar = this.f262351h;
        eVar.getClass();
        C91520e.m114829a(eVar, "typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.invokeCallbackHandler(" + i + ", " + Util.nullAs(str, "{}") + ')', (ValueCallback) null, 2, (Object) null);
    }

    /* renamed from: b */
    public boolean mo109648b(String str, C40482o oVar) {
        return true;
    }

    /* renamed from: d */
    public void mo109650d(String str, String str2) {
        mo109652f(str, str2, 0);
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
        mo109652f(str, str2, 0);
    }

    /* renamed from: f */
    public void mo109652f(String str, String str2, int i) {
        C91520e eVar = this.f262351h;
        eVar.getClass();
        if (str != null) {
            String str3 = "typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler('" + str + "', " + Util.nullAs(str2, "{}") + ')';
            Log.m105918d("MicroMsg.AppBrand.HTMLVConsoleJsBridge", "dispatch with script:" + str3);
            C91520e.m114829a(eVar, str3, (ValueCallback) null, 2, (Object) null);
        }
    }

    public String getAppId() {
        return this.f262347d.getAppId();
    }

    public C88508b getAppState() {
        return this.f262347d.getRt().f238113K.mo122980c();
    }

    public C116901a getAsyncHandler() {
        return (MMHandler) ((C36570n) this.f262349f).getValue();
    }

    public int getComponentId() {
        return hashCode();
    }

    public Context getContext() {
        return this.f262347d.getAndroidContext();
    }

    public C87375o0 getDialogContainer() {
        return this.f262347d.getRt().f238156u;
    }

    public C81415h0 getFileSystem() {
        return null;
    }

    public C82381f.C82384c getInterceptor() {
        return null;
    }

    public C83165i getJsRuntime() {
        return (C83165i) ((C36570n) this.f262350g).getValue();
    }

    public /* synthetic */ C0125s getLifecycleOwner() {
        return null;
    }

    /* renamed from: h */
    public <T extends C82835n> T mo109666h(Class<T> cls) {
        C87412m.m108594g(cls, "clazz");
        return this.f262347d.getRt().mo113032U(cls);
    }

    public boolean isRunning() {
        return !this.f262347d.getRt().mo113064k0();
    }

    /* renamed from: l */
    public <T extends C12964b> T mo109668l(Class<T> cls) {
        return (C12964b) this.f262347d.getRt().mo113027R0(cls);
    }

    /* renamed from: n */
    public void mo109669n(C82919r2 r2Var, int[] iArr) {
        if (r2Var != null) {
            if (r2Var instanceof C83106b) {
                C88267e eVar = (C88267e) this.f262347d.getRt().f238150p;
                if (eVar != null) {
                    C83106b bVar = (C83106b) r2Var;
                    bVar.mo115195q(eVar, this.f262347d.getHtmlId());
                    bVar.mo115158h();
                    return;
                }
                return;
            }
            mo109676w(r2Var);
        }
    }

    /* renamed from: o */
    public void mo109670o(Runnable runnable, long j) {
        if (runnable != null) {
            this.f262347d.getRt().mo113025Q0(runnable, j);
        }
    }

    /* renamed from: p */
    public <T extends C1727m> T mo109671p(Class<T> cls) {
        C88267e eVar;
        if (cls == null || (eVar = (C88267e) this.f262347d.getRt().f238150p) == null) {
            return null;
        }
        return eVar.mo109671p(cls);
    }

    /* renamed from: s */
    public boolean mo109672s(C82835n nVar) {
        return false;
    }

    /* renamed from: t */
    public void mo109673t(Runnable runnable) {
        this.f262347d.getRt().mo113024P0(runnable);
    }

    /* renamed from: v */
    public /* synthetic */ C82870p mo109675v(String str) {
        return null;
    }

    /* renamed from: w */
    public void mo109676w(C82919r2 r2Var) {
        if (r2Var != null) {
            mo109652f(r2Var.mo114779e(), r2Var.mo115160j(), 0);
        }
    }
}
