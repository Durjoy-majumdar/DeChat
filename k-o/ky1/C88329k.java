package ky1;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.appbrand.p942v8.C80658e;
import com.tencent.p014mm.appbrand.p942v8.C80662g;
import com.tencent.p014mm.appbrand.p942v8.C80666h;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import js0.C46574u;
import js0.C88016e;
import kg3.C76577a;
import p156gj.C87203t;
import p224ra.C89909e;
import p774zg.C91741q;
import p828wa.C53102g;
import qe3.C89625d;

/* renamed from: ky1.k */
public class C88329k implements C53102g {

    /* renamed from: d */
    public Context f255318d;

    /* renamed from: e */
    public C80669j f255319e;

    /* renamed from: ky1.k$a */
    public class C88330a implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ ValueCallback f255320a;

        public C88330a(C88329k kVar, ValueCallback valueCallback) {
            this.f255320a = valueCallback;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            ValueCallback valueCallback = this.f255320a;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(str);
            }
        }
    }

    public C88329k(Context context) {
        this.f255318d = context;
        boolean z = C80658e.f236022a;
        C80662g gVar = new C80662g((IJSRuntime.Config) null);
        if (gVar.f236030z == null) {
            gVar.f236030z = new C80669j(gVar, gVar.mo112469c(), new C80666h(gVar));
        }
        C80669j jVar = gVar.f236030z;
        this.f255319e = jVar;
        jVar.f236041b.mo112430A(1, new C88328j(this));
        C46813h hVar = new C46813h();
        C80669j jVar2 = this.f255319e;
        Class<JavascriptInterface> cls = JavascriptInterface.class;
        jVar2.getClass();
        if (!TextUtils.isEmpty("WxGameJsCoreNative")) {
            jVar2.f236041b.mo112450v(new C91741q(jVar2, hVar, "WxGameJsCoreNative", cls));
        }
    }

    /* renamed from: B */
    public void mo73582B() {
        this.f255319e.mo112500d(C88016e.m109548e("luggage_mm_adapter.js"), (C80669j.C80675f) null);
        Point b = C75044y4.m89990b(MMApplicationContext.getContext());
        int a = ((b.y - C75044y4.m89989a(MMApplicationContext.getContext())) - C75044y4.m89994f(MMApplicationContext.getContext())) - C75044y4.m89991c(MMApplicationContext.getContext());
        float g = C76577a.m92156g(MMApplicationContext.getContext());
        String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
        String e = C88016e.m109548e("game_jscore_system_info.js");
        Object[] objArr = {Integer.valueOf(C89625d.f257841g)};
        this.f255319e.mo112500d(String.format(e, new Object[]{String.valueOf(b.x), String.valueOf(a), String.valueOf(b.x), String.valueOf(b.y), String.valueOf(g), formatedNetType, Build.BRAND, C87203t.m108275k(), String.format("0x%08X", objArr), "Android-" + Build.VERSION.SDK_INT, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), Boolean.valueOf(C85875k4.m106211z())}), new C88330a(this, (ValueCallback) null));
    }

    public void addJavascriptInterface(Object obj, String str) {
        C80669j jVar = this.f255319e;
        Class<JavascriptInterface> cls = JavascriptInterface.class;
        jVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            jVar.f236041b.mo112450v(new C91741q(jVar, obj, str, cls));
        }
    }

    public void destroy() {
        this.f255319e.mo112499c();
        this.f255318d = null;
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.f255319e.mo112500d(str, new C88330a(this, valueCallback));
    }

    public Context getContext() {
        return this.f255318d;
    }

    public String getUserAgent() {
        return C46574u.m51897a(MMApplicationContext.getContext(), "", (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class)) + " v8";
    }
}
