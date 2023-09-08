package com.tencent.p014mm.plugin.appbrand;

import android.app.Activity;
import android.content.Context;
import android.webkit.ValueCallback;
import br0.C79774c;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.C83239l2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82522h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82530h7;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83146c;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83176n;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.plugin.appbrand.page.C83779d0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83788e0;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83939u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cr0.C86127t;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p225rc.C48016e;
import p225rc.C89925n;

/* renamed from: com.tencent.mm.plugin.appbrand.i2 */
public class C81925i2 extends C81879g {

    /* renamed from: A */
    public volatile AppBrandRuntime f240282A;

    /* renamed from: B */
    public final Object f240283B = new byte[0];

    /* renamed from: C */
    public volatile C84073q2 f240284C;

    /* renamed from: D */
    public final Object f240285D;

    /* renamed from: E */
    public volatile LinkedList<C82522h0> f240286E;

    /* renamed from: F */
    public final LinkedList<C81930e> f240287F;

    /* renamed from: G */
    public C81929d f240288G;

    /* renamed from: w */
    public volatile boolean f240289w = false;

    /* renamed from: x */
    public volatile boolean f240290x = false;

    /* renamed from: y */
    public volatile boolean f240291y = false;

    /* renamed from: z */
    public C79774c f240292z = new C86127t();

    /* renamed from: com.tencent.mm.plugin.appbrand.i2$a */
    public class C81926a implements C83176n.C83177a {

        /* renamed from: a */
        public final /* synthetic */ String f240293a;

        public C81926a(String str) {
            this.f240293a = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.i2$b */
    public class C81927b implements C80669j.C80675f {

        /* renamed from: a */
        public final /* synthetic */ String f240295a;

        public C81927b(String str) {
            this.f240295a = str;
        }

        /* renamed from: a */
        public void mo112506a(String str, C80669j.C80676g gVar) {
            Log.m105925i("MicroMsg.AppBrandService", "injectConfig end by AddonV8, cost=%dms, hash=%d", Long.valueOf(gVar.f236059b - gVar.f236058a), Integer.valueOf(C81925i2.this.hashCode()));
            C81925i2 i2Var = C81925i2.this;
            C81929d dVar = new C81929d((C81926a) null);
            i2Var.f240288G = dVar;
            dVar.f240300a = this.f240295a;
            dVar.f240301b = gVar.f236058a;
            dVar.f240302c = gVar.f236059b;
            dVar.f240303d = gVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.i2$c */
    public class C81928c implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ long f240297a;

        /* renamed from: b */
        public final /* synthetic */ String f240298b;

        public C81928c(long j, String str) {
            this.f240297a = j;
            this.f240298b = str;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            long nowMilliSecond = Util.nowMilliSecond();
            Log.m105925i("MicroMsg.AppBrandService", "injectConfig end by evaluateJavascript, cost=%dms, hash=%d", Long.valueOf(nowMilliSecond - this.f240297a), Integer.valueOf(C81925i2.this.hashCode()));
            C81925i2 i2Var = C81925i2.this;
            C81929d dVar = new C81929d((C81926a) null);
            i2Var.f240288G = dVar;
            dVar.f240300a = this.f240298b;
            dVar.f240301b = this.f240297a;
            dVar.f240302c = nowMilliSecond;
            dVar.f240303d = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.i2$d */
    public static class C81929d {

        /* renamed from: a */
        public String f240300a;

        /* renamed from: b */
        public long f240301b;

        /* renamed from: c */
        public long f240302c;

        /* renamed from: d */
        public Object f240303d;

        public C81929d(C81926a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.i2$e */
    public interface C81930e {
        /* renamed from: a */
        void mo113226a(C84073q2 q2Var);
    }

    public C81925i2() {
        byte[] bArr = new byte[0];
        this.f240285D = bArr;
        this.f240287F = new LinkedList<>();
        synchronized (bArr) {
            this.f240286E = new LinkedList<>();
        }
    }

    /* renamed from: A0 */
    public void mo114325A0(boolean z) {
        if (!isRunning()) {
            Log.m105929w("MicroMsg.AppBrandService", "onRuntimeResume but not running, appId %s, willRelaunch %b", getAppId(), Boolean.valueOf(z));
            return;
        }
        C83788e0 h0 = mo114337h0();
        AppBrandRuntime appBrandRuntime = this.f240282A;
        h0.getClass();
        HashMap hashMap = new HashMap();
        JSONObject c = appBrandRuntime.mo113036W().mo111291c();
        if (c != null) {
            hashMap.put("referrerInfo", c);
        }
        hashMap.put("relaunch", Boolean.valueOf(z));
        hashMap.put("reLaunch", Boolean.valueOf(z));
        String T = z ? appBrandRuntime.mo113030T() : appBrandRuntime.mo113042Z().getCurrentUrl();
        hashMap.put("rawPath", T);
        hashMap.put("path", C89925n.m112488a(T));
        hashMap.put(SearchIntents.EXTRA_QUERY, C89925n.m112489b(T));
        Log.m105925i("MicroMsg.AppBrandOnAppEnterForegroundEvent", "path: %s, query: %s, relaunch: %s, url: %s", hashMap.get("path"), hashMap.get(SearchIntents.EXTRA_QUERY), hashMap.get("relaunch"), T);
        C48016e.m53378d(hashMap);
        JSONObject jSONObject = new JSONObject(hashMap);
        h0.mo116256s(appBrandRuntime, z, jSONObject);
        h0.f242407f = jSONObject.toString();
        h0.mo115194p(appBrandRuntime.mo113047b0());
        h0.mo115158h();
    }

    /* renamed from: B0 */
    public void mo114326B0(String str, long j, long j2, Object obj) {
    }

    /* renamed from: C */
    public String mo114327C() {
        return "AppBrandService";
    }

    /* renamed from: C0 */
    public void mo114328C0(C79774c cVar) {
        this.f240292z = cVar;
    }

    /* renamed from: F */
    public void mo114329F() {
        this.f240290x = false;
        this.f240289w = true;
        this.f240282A = null;
        super.mo114329F();
        synchronized (this.f240283B) {
            if (this.f240284C != null) {
                C84073q2 q2Var = this.f240284C;
                q2Var.f245485j.set(true);
                q2Var.f245478c.mo112516f();
                q2Var.f245476a = null;
                q2Var.f245482g.clear();
                this.f240284C = null;
            }
        }
    }

    /* renamed from: H */
    public Map<String, C82870p> mo114330H() {
        return null;
    }

    /* renamed from: J */
    public C83165i mo114092J() {
        return new C83146c((String) null, (byte[]) null);
    }

    /* renamed from: W */
    public void mo114331W(JSONObject jSONObject) {
        super.mo114331W(jSONObject);
        if (getJsRuntime() != null) {
            mo114881c0(jSONObject, "nativeBufferEnabled", Boolean.valueOf(getJsRuntime().mo63321n0(C83170k.class) != null));
        }
    }

    /* renamed from: X */
    public void mo114332X(JSONObject jSONObject) {
        new C82530h7().mo114862a(jSONObject);
    }

    /* renamed from: Y */
    public JSONObject mo114333Y() {
        return super.mo114333Y();
    }

    /* renamed from: a0 */
    public final boolean mo114334a0() {
        return this.f240291y;
    }

    /* renamed from: b0 */
    public final boolean mo114335b0() {
        return getRuntime() == null && !this.f240289w;
    }

    /* renamed from: e */
    public final void mo109651e(String str, String str2, int[] iArr) {
        if (isRunning()) {
            C83849m0 Z = this.f240282A.mo113042Z();
            Z.getClass();
            Z.mo116338c0(new C83939u0(Z, str, str2, iArr));
        }
    }

    /* renamed from: f */
    public void mo109652f(String str, String str2, int i) {
        if (this.f240286E != null) {
            synchronized (this.f240285D) {
                if (this.f240286E != null) {
                    this.f240286E.add(new C82522h0(str, str2, i));
                    return;
                }
            }
        }
        super.mo109652f(str, str2, i);
    }

    /* renamed from: f0 */
    public C79774c mo114271f0() {
        return this.f240292z;
    }

    /* renamed from: g0 */
    public final void mo114336g0() {
        LinkedList linkedList;
        synchronized (this.f240285D) {
            linkedList = this.f240286E != null ? new LinkedList(this.f240286E) : null;
            this.f240286E = null;
        }
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C82522h0 h0Var = (C82522h0) it.next();
                super.mo109652f(h0Var.f241615a, h0Var.f241616b, h0Var.f241617c);
            }
        }
    }

    public final int getComponentId() {
        return hashCode();
    }

    public AppBrandRuntime getRuntime() {
        return this.f240282A;
    }

    /* renamed from: h0 */
    public C83788e0 mo114337h0() {
        return new C83788e0();
    }

    /* renamed from: i0 */
    public C84073q2 mo114338i0() {
        return new C84073q2(this);
    }

    public boolean isRunning() {
        return this.f240290x && !this.f240289w && super.isRunning();
    }

    @Deprecated
    /* renamed from: j0 */
    public final void mo114339j0(String str, String str2) {
        super.mo109652f(str, str2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r1 = r2.f239594B;
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo114340k0() {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r7.mo114331W(r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r7.f240282A
            wi0.l r1 = r1.mo113051d0()
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r7.f240282A
            com.tencent.mm.plugin.appbrand.config.a r2 = r2.mo113008F()
            if (r1 == 0) goto L_0x00a4
            if (r2 != 0) goto L_0x001a
            goto L_0x00a4
        L_0x001a:
            boolean r1 = r2.mo113986e()
            if (r1 == 0) goto L_0x002d
            org.json.JSONObject r1 = r2.f239594B
            if (r1 == 0) goto L_0x002d
            int r1 = r1.length()
            if (r1 == 0) goto L_0x002d
            org.json.JSONObject r1 = r2.f239594B
            goto L_0x002f
        L_0x002d:
            org.json.JSONObject r1 = r2.f239593A
        L_0x002f:
            java.util.Iterator r2 = r1.keys()
        L_0x0033:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "MicroMsg.AppBrandService"
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r1.opt(r3)
            r0.putOpt(r3, r5)     // Catch:{ Exception -> 0x0049 }
            goto L_0x0033
        L_0x0049:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)
            goto L_0x0033
        L_0x0052:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "env"
            r7.mo114881c0(r0, r2, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "zIndex"
            r7.mo114881c0(r1, r3, r2)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r5 = "viewId"
            r7.mo114881c0(r1, r5, r3)
            java.lang.String r3 = "menuButtonInfo"
            r7.mo114881c0(r0, r3, r1)
            java.lang.String r1 = "getNetworkType"
            com.tencent.mm.plugin.appbrand.jsapi.p r1 = r7.mo109675v(r1)     // Catch:{ Exception -> 0x0091 }
            tm0.k r1 = (tm0.C90538k) r1     // Catch:{ Exception -> 0x0091 }
            tm0.k$e r1 = r1.mo124676y(r7)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r1 = r1.f260172d     // Catch:{ Exception -> 0x0091 }
            java.lang.String r3 = "networkType"
            r7.mo114881c0(r0, r3, r1)     // Catch:{ Exception -> 0x0091 }
            goto L_0x00a3
        L_0x0091:
            r1 = move-exception
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 0
            java.lang.String r6 = r7.getAppId()
            r3[r5] = r6
            r3[r2] = r1
            java.lang.String r1 = "generateWxConfig(%s) set networkType get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r3)
        L_0x00a3:
            return r0
        L_0x00a4:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81925i2.mo114340k0():org.json.JSONObject");
    }

    /* renamed from: l0 */
    public C83780d1 mo114341l0() {
        return mo114342m0(C83780d1.class);
    }

    /* renamed from: m0 */
    public <T extends C83780d1> T mo114342m0(Class<T> cls) {
        if (this.f240282A == null || this.f240282A.mo113042Z() == null) {
            return null;
        }
        if (this.f240282A.mo113042Z() == null) {
            Log.m105929w("MicroMsg.AppBrandService", "getCurrentPageView NULL PageContainer, appId=%s", getAppId());
            if (this.f240282A.mo113039X0()) {
                return null;
            }
            throw new IllegalStateException("getCurrentPageView NULL PageContainer");
        }
        C83820i0 currentPage = this.f240282A.mo113042Z().getCurrentPage();
        if (currentPage == null) {
            Log.m105929w("MicroMsg.AppBrandService", "getCurrentPageView NULL Page, appId=%s", getAppId());
            return null;
        }
        T currentPageView = currentPage.getCurrentPageView();
        if (cls.isInstance(currentPageView)) {
            return currentPageView;
        }
        return null;
    }

    /* renamed from: n0 */
    public String mo114343n0() {
        return "";
    }

    /* renamed from: o0 */
    public final Activity mo114344o0() {
        Class<Activity> cls = Activity.class;
        Context context = mo114341l0() == null ? getContext() : mo114341l0().getContext();
        if (cls.isInstance(context)) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: p0 */
    public String mo114345p0(String str) {
        return "";
    }

    /* renamed from: q0 */
    public String mo114346q0() {
        return "";
    }

    /* renamed from: r0 */
    public final C84073q2 mo114347r0() {
        C84073q2 q2Var;
        if (!mo114352w0()) {
            return null;
        }
        synchronized (this.f240283B) {
            q2Var = this.f240284C;
        }
        return q2Var;
    }

    /* renamed from: s0 */
    public final void mo114348s0() {
        mo114842M();
        mo114841L();
        mo114350u0();
        this.f240290x = true;
        this.f241590o.addAll(this.f240282A.f238104B);
        mo114095x0();
    }

    /* renamed from: t0 */
    public void mo114349t0() {
        Class cls = C83187w.class;
        Class cls2 = C83176n.class;
        JSONObject k0 = mo114340k0();
        Log.m105925i("MicroMsg.AppBrandService", "injectConfig(%s): %s", getAppId(), k0.toString());
        String str = this.f240282A.mo113008F().f239599G;
        Log.m105925i("MicroMsg.AppBrandService", "injectConfig start, hash=%d", Integer.valueOf(hashCode()));
        if (getJsRuntime().mo63321n0(cls2) != null) {
            String jSONObject = k0.toString();
            ((C83176n) getJsRuntime().mo63321n0(cls2)).mo115418m1("__native_custom_event__wxConfig_inject", jSONObject, 0, "", new C81926a(jSONObject));
            return;
        }
        long nowMilliSecond = Util.nowMilliSecond();
        String jSONObject2 = k0.toString();
        String format = String.format(Locale.ENGLISH, ";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);var __wxIndexPage = \"%s\";", new Object[]{jSONObject2, str});
        if (getJsRuntime().mo63321n0(cls) != null) {
            ((C83187w) getJsRuntime().mo63321n0(cls)).mo115397R((URL) null, (String) null, (String) null, 0, format, new C81927b(jSONObject2));
        } else {
            getJsRuntime().evaluateJavascript(format, new C81928c(nowMilliSecond, jSONObject2));
        }
    }

    /* renamed from: u0 */
    public final void mo114350u0() {
        if (mo114352w0()) {
            synchronized (this.f240283B) {
                if (this.f240284C == null) {
                    this.f240284C = mo114338i0();
                }
                synchronized (this.f240287F) {
                    LinkedList linkedList = new LinkedList(this.f240287F);
                    this.f240287F.clear();
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((C81930e) it.next()).mo113226a(this.f240284C);
                    }
                }
            }
        }
    }

    /* renamed from: v0 */
    public boolean mo114351v0() {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo114352w0() {
        return true;
    }

    /* renamed from: x0 */
    public void mo114095x0() {
        mo114349t0();
        mo114336g0();
    }

    /* renamed from: y0 */
    public void mo114353y0() {
        if (!isRunning()) {
            Log.m105929w("MicroMsg.AppBrandService", "onRuntimePause but not running appId %s", getAppId());
            return;
        }
        new C83779d0().mo116145s(this.f240282A);
    }

    /* renamed from: z0 */
    public void mo114096z0(AppBrandRuntime appBrandRuntime) {
        this.f240282A = appBrandRuntime;
        mo114328C0(appBrandRuntime.mo113054f0());
        if (mo114352w0()) {
            mo114350u0();
            if (!mo114351v0()) {
                C84073q2 r0 = mo114347r0();
                r0.f245484i.set(true);
                r0.f245480e = r0.f245476a.getAppId();
                Log.m105924i("MicroMsg.AppBrandWorkerContainer", "onRuntimeReady");
                r0.f245478c.mo112518h();
                r0.mo116733h();
            }
        }
        C83239l2 l2Var = C83239l2.C83241b.f243111a;
        l2Var.getClass();
        int hashCode = hashCode();
        Log.m105925i("MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr", "notify service:%d", Integer.valueOf(hashCode));
        synchronized (l2Var) {
            List list = l2Var.f243109a.get(hashCode);
            if (list == null) {
                Log.m105924i("MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr", "notify listenerList empty");
                l2Var.f243110b.put(hashCode, 1);
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                ((C83239l2.C83242c) list.get(i)).mo115476a();
            }
        }
    }
}
