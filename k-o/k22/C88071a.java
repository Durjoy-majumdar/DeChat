package k22;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.C0125s;
import b34.C79664a;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fu3.C116901a;
import gt0.C87375o0;
import gy3.C87412m;
import li0.C88508b;
import p193la.C10480b;
import p224ra.C12964b;
import rx3.C48096k;

/* renamed from: k22.a */
public final class C88071a implements C82381f {

    /* renamed from: d */
    public MMHandler f254724d = new MMHandler(Looper.getMainLooper());

    /* renamed from: e */
    public C46634c f254725e = new C46634c();

    /* renamed from: f */
    public C88072b f254726f = new C88072b();

    /* renamed from: a */
    public void mo109647a(int i, String str) {
        Log.m105925i("WxaLiteApp.LiteAppAppBrandComponent", "callback callbackId:%s dst:%s", Integer.valueOf(i), str);
        C88075g a = C88075g.m109660a();
        if (a.f254731b.containsKey(Integer.valueOf(i))) {
            C10480b bVar = a.f254731b.get(Integer.valueOf(i));
            LiteAppCenter.jsApiCallback(bVar.f31714b, bVar.f31715c, bVar.f31716d, (long) i, str, false, true);
            a.f254731b.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public boolean mo109648b(String str, C40482o oVar) {
        Log.m105925i("WxaLiteApp.LiteAppAppBrandComponent", "checkIsActivatedForEval %s", str);
        return true;
    }

    /* renamed from: d */
    public void mo109650d(String str, String str2) {
        Log.m105925i("WxaLiteApp.LiteAppAppBrandComponent", "dispatch event:%s data:%s", str, str2);
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
        Log.m105925i("WxaLiteApp.LiteAppAppBrandComponent", "publish event:%s data:%s dst:%d", str, str2, iArr);
    }

    /* renamed from: f */
    public void mo109652f(String str, String str2, int i) {
        Log.m105925i("WxaLiteApp.LiteAppAppBrandComponent", "dispatch event:%s data:%s src:%d", str, str2, Integer.valueOf(i));
    }

    public String getAppId() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "getAppId");
        return "AppId";
    }

    public C88508b getAppState() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "getAppState");
        return C88508b.FOREGROUND;
    }

    public C116901a getAsyncHandler() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "getAsyncHandler");
        return this.f254724d;
    }

    public int getComponentId() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "getComponentId");
        return 0;
    }

    public Context getContext() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "getContext");
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        return context;
    }

    public C87375o0 getDialogContainer() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "getDialogContainer");
        return null;
    }

    public C81415h0 getFileSystem() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "getFileSystem");
        return null;
    }

    public C82381f.C82384c getInterceptor() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "getInterceptor");
        return null;
    }

    public C83165i getJsRuntime() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "getJsRuntime");
        return this.f254725e;
    }

    public /* synthetic */ C0125s getLifecycleOwner() {
        return null;
    }

    /* renamed from: h */
    public <T extends C82835n> T mo109666h(Class<T> cls) {
        C87412m.m108594g(cls, "clazz");
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean isRunning() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "isRunning");
        return true;
    }

    /* renamed from: l */
    public <T extends C12964b> T mo109668l(Class<T> cls) {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "customize");
        return null;
    }

    /* renamed from: n */
    public void mo109669n(C82919r2 r2Var, int[] iArr) {
        Object[] objArr = new Object[2];
        objArr[0] = r2Var != null ? r2Var.mo114779e() : null;
        objArr[1] = String.valueOf(iArr);
        Log.m105925i("WxaLiteApp.LiteAppAppBrandComponent", "publish event:%s dst:%s", objArr);
    }

    /* renamed from: o */
    public void mo109670o(Runnable runnable, long j) {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "scheduleToUiThreadDelayed");
    }

    /* renamed from: p */
    public <T extends C1727m> T mo109671p(Class<T> cls) {
        Object[] objArr = new Object[1];
        objArr[0] = cls != null ? cls.getName() : null;
        Log.m105925i("WxaLiteApp.LiteAppAppBrandComponent", "getConfig clazz name:%s", objArr);
        T t = this.f254726f;
        if (t != null) {
            return t;
        }
        try {
            T t2 = (C1727m) new C79664a(cls, cls).mo109790c().f233575b;
            if (t2 != null) {
                try {
                    Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "attachConfig");
                } catch (Exception unused) {
                    t = t2;
                }
            }
            return t2;
        } catch (Exception unused2) {
            C87412m.m108591d(cls);
            Log.m105921e("WxaLiteApp.LiteAppAppBrandComponent", "Make sure %s has default constructor", cls.getName());
            return t;
        }
    }

    /* renamed from: s */
    public boolean mo109672s(C82835n nVar) {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "attachEnvContext");
        return true;
    }

    /* renamed from: t */
    public void mo109673t(Runnable runnable) {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandComponent", "scheduleToUiThread");
    }

    /* renamed from: v */
    public /* synthetic */ C82870p mo109675v(String str) {
        return null;
    }

    /* renamed from: w */
    public void mo109676w(C82919r2 r2Var) {
        Object[] objArr = new Object[1];
        objArr[0] = r2Var != null ? r2Var.mo114779e() : null;
        Log.m105925i("WxaLiteApp.LiteAppAppBrandComponent", "dispatch event:%s", objArr);
    }
}
