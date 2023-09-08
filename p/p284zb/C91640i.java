package p284zb;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJniParams;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.libmmwebrtc.MMWebRTCBinding;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83172l;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.plugin.appbrand.utils.C29678o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Map;
import java.util.Objects;
import op0.C89262h;
import org.json.JSONObject;
import p1044ub.C90626a;
import p284zb.C91635f;
import p963fc.C86812g;

/* renamed from: zb.i */
public abstract class C91640i<Service extends C91635f> extends C90626a.C90627a<Service> implements C89262h {

    /* renamed from: f */
    public final C91627a f262600f;

    /* renamed from: g */
    public MMWebRTCBinding f262601g;

    public C91640i(Service service) {
        super(service);
        if (mo125524n0()) {
            this.f262600f = new C91627a(new C91643j(this, (C82510g) mo124764Z()));
        } else {
            this.f262600f = null;
        }
    }

    /* renamed from: b0 */
    public static C83181q m115126b0(C91640i iVar) {
        C83165i jsRuntime = ((C91635f) iVar.mo124764Z()).getJsRuntime();
        if (jsRuntime != null) {
            return (C83181q) jsRuntime.mo63321n0(C83181q.class);
        }
        Log.m105920e("Luggage.BaseAppBrandServiceLogic", "hy: js runtime not installed");
        return null;
    }

    /* renamed from: A0 */
    public void mo120895A0() {
        mo125526u0(new i$$c());
    }

    /* renamed from: B0 */
    public void mo120896B0() {
        Log.m105924i("Luggage.BaseAppBrandServiceLogic", "hy: base service js runtime post created");
        if (mo125524n0()) {
            C91627a aVar = this.f262600f;
            Objects.requireNonNull(aVar);
            aVar.f262484a.notifyCreate(mo122604E0());
            mo125519F0(new i$$g(this));
        }
        mo125526u0(new i$$b(this));
    }

    /* renamed from: C0 */
    public void mo120897C0(JSONObject jSONObject) {
    }

    /* renamed from: D0 */
    public void mo120898D0(AppBrandRuntime appBrandRuntime) {
        if (mo125524n0()) {
            mo125519F0(new i$$h(this, appBrandRuntime));
            appBrandRuntime.f238113K.mo122978a(new i$$i(this));
        }
        mo125526u0(new i$$e(this, appBrandRuntime));
    }

    /* renamed from: E0 */
    public AppBrandCommonBindingJniParams mo122604E0() {
        if (((C83187w) mo125520f0(C83187w.class)) == null) {
            Log.m105920e("Luggage.BaseAppBrandServiceLogic", "add on v8 not ready!");
            return null;
        }
        AppBrandCommonBindingJniParams appBrandCommonBindingJniParams = new AppBrandCommonBindingJniParams();
        String k0 = mo122626k0();
        appBrandCommonBindingJniParams.wasmCachePath = k0;
        if (!TextUtils.isEmpty(k0)) {
            appBrandCommonBindingJniParams.wasmCachePath = C86013q1.m106448i(appBrandCommonBindingJniParams.wasmCachePath, true);
        }
        appBrandCommonBindingJniParams.wasmOptState = mo122627l0();
        return appBrandCommonBindingJniParams;
    }

    /* renamed from: F0 */
    public void mo125519F0(Runnable runnable) {
        C83181q qVar = (C83181q) mo125520f0(C83181q.class);
        if (qVar == null) {
            Log.m105928w("Luggage.BaseAppBrandServiceLogic", "hy: no js thread addon. may be remote debug env");
            return;
        }
        C86812g H0 = mo124764Z() != null ? ((C91635f) mo124764Z()).getRuntime() : null;
        if (H0 != null) {
            runnable = C29678o1.m38854a(H0, runnable);
        }
        qVar.post(runnable);
    }

    /* renamed from: G0 */
    public boolean mo122605G0(int i, String str) {
        return false;
    }

    /* renamed from: H0 */
    public boolean mo122606H0(String str, String str2, int i) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        return true;
     */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo122607I0() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r1 = "hy: test trigger binding webrtc"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0088 }
            com.tencent.mm.libmmwebrtc.MMWebRTCBinding r0 = r9.f262601g     // Catch:{ all -> 0x0088 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            monitor-exit(r9)
            return r1
        L_0x000f:
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r9.mo124764Z()     // Catch:{ all -> 0x0088 }
            zb.f r0 = (p284zb.C91635f) r0     // Catch:{ all -> 0x0088 }
            com.tencent.mm.plugin.appbrand.jsruntime.i r0 = r0.getJsRuntime()     // Catch:{ all -> 0x0088 }
            r2 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r1 = "hy: js runtime lost"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0088 }
            monitor-exit(r9)
            return r2
        L_0x0025:
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.w> r3 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r0 = r0.mo63321n0(r3)     // Catch:{ all -> 0x0088 }
            com.tencent.mm.plugin.appbrand.jsruntime.w r0 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w) r0     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r1 = "hy: v8 addon lost"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0088 }
            monitor-exit(r9)
            return r2
        L_0x0038:
            com.tencent.mm.libmmwebrtc.MMWebRTCBinding r2 = new com.tencent.mm.libmmwebrtc.MMWebRTCBinding     // Catch:{ all -> 0x0088 }
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0088 }
            r2.<init>(r3)     // Catch:{ all -> 0x0088 }
            r9.f262601g = r2     // Catch:{ all -> 0x0088 }
            zb.i$$f r3 = new zb.i$$f     // Catch:{ all -> 0x0088 }
            r3.<init>(r9)     // Catch:{ all -> 0x0088 }
            u40.C37340f.f98736a = r3     // Catch:{ all -> 0x0088 }
            long r3 = r0.mo115417m()     // Catch:{ all -> 0x0088 }
            long r5 = r0.mo115393J0()     // Catch:{ all -> 0x0088 }
            long r7 = r0.mo115414j()     // Catch:{ all -> 0x0088 }
            r2.create(r3, r5, r7)     // Catch:{ all -> 0x0088 }
            com.tencent.mm.libmmwebrtc.MMWebRTCBinding r0 = r9.f262601g     // Catch:{ all -> 0x0088 }
            r0.enterForeground()     // Catch:{ all -> 0x0088 }
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r9.mo124764Z()     // Catch:{ all -> 0x0088 }
            zb.f r0 = (p284zb.C91635f) r0     // Catch:{ all -> 0x0088 }
            fc.g r0 = r0.getRuntime()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x007f
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r9.mo124764Z()     // Catch:{ all -> 0x0088 }
            zb.f r0 = (p284zb.C91635f) r0     // Catch:{ all -> 0x0088 }
            fc.g r0 = r0.getRuntime()     // Catch:{ all -> 0x0088 }
            li0.c r0 = r0.f238113K     // Catch:{ all -> 0x0088 }
            zb.i$$d r2 = new zb.i$$d     // Catch:{ all -> 0x0088 }
            r2.<init>(r9)     // Catch:{ all -> 0x0088 }
            r0.mo122978a(r2)     // Catch:{ all -> 0x0088 }
            goto L_0x0086
        L_0x007f:
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r2 = "hy: runtime not created!! will not trigger runtime lifecycle listening"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ all -> 0x0088 }
        L_0x0086:
            monitor-exit(r9)
            return r1
        L_0x0088:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p284zb.C91640i.mo122607I0():boolean");
    }

    /* renamed from: c0 */
    public void mo122621c0(JSONObject jSONObject) {
    }

    /* renamed from: d0 */
    public void mo120918d0() {
        if (mo124764Z() == null || ((C91635f) mo124764Z()).getJsRuntime() == null) {
            Log.m105920e("Luggage.BaseAppBrandServiceLogic", "hy: js runtime released when destroy");
            return;
        }
        mo125526u0(new i$$a());
        C83174m mVar = (C83174m) mo125520f0(C83174m.class);
        if (mVar == null) {
            Log.m105928w("Luggage.BaseAppBrandServiceLogic", "hy: no AppBrandJsRuntimeAddonDestroyListener");
        } else {
            mVar.mo115379f1(new i$$j(this), true);
        }
    }

    /* renamed from: e0 */
    public C83165i mo120919e0() {
        return null;
    }

    /* renamed from: f0 */
    public final <T extends C40481j> T mo125520f0(Class<T> cls) {
        if (mo124764Z() != null && ((C91635f) mo124764Z()).getJsRuntime() != null) {
            return ((C91635f) mo124764Z()).getJsRuntime().mo63321n0(cls);
        }
        Log.m105928w("Luggage.BaseAppBrandServiceLogic", "hy: js runtime not ready");
        return null;
    }

    /* renamed from: g0 */
    public String mo125521g0() {
        return ((C91635f) mo124764Z()).getAppId();
    }

    /* renamed from: h0 */
    public C91627a mo125522h0() {
        if (!mo125524n0()) {
            return null;
        }
        C91627a aVar = this.f262600f;
        Objects.requireNonNull(aVar);
        return aVar;
    }

    /* renamed from: i0 */
    public String mo123166i0(String str) {
        return null;
    }

    /* renamed from: j0 */
    public C86812g mo125523j0() {
        if (mo124764Z() == null) {
            return null;
        }
        return ((C91635f) mo124764Z()).getRuntime();
    }

    /* renamed from: k0 */
    public String mo122626k0() {
        return "";
    }

    /* renamed from: l0 */
    public int mo122627l0() {
        return -2;
    }

    /* renamed from: m0 */
    public void mo120920m0() {
    }

    /* renamed from: n0 */
    public boolean mo125524n0() {
        return true;
    }

    /* renamed from: o0 */
    public boolean mo122628o0() {
        return false;
    }

    /* renamed from: p */
    public Map<String, C82870p> mo114097p() {
        return null;
    }

    /* renamed from: p0 */
    public boolean mo122629p0() {
        C83172l lVar = (C83172l) mo125520f0(C83172l.class);
        return !(C80669j.f236039k != null) && (lVar == null || lVar.mo115406b1());
    }

    /* renamed from: q0 */
    public boolean mo123167q0() {
        return false;
    }

    /* renamed from: r0 */
    public abstract boolean mo120921r0();

    /* renamed from: s0 */
    public boolean mo120922s0(String str, JSONObject jSONObject) {
        if ("WebRTC".equals(str)) {
            return mo122607I0();
        }
        return false;
    }

    /* renamed from: t */
    public <T> T mo116072t(Class<T> cls) {
        return ICommLibReader.class.equals(cls) ? cls.cast(((C91635f) mo124764Z()).mo114272k()) : cls.isInstance(this) ? cls.cast(this) : super.mo116072t(cls);
    }

    /* renamed from: t0 */
    public final void mo125525t0() {
        C83165i jsRuntime;
        C83187w wVar;
        C91635f fVar = (C91635f) mo124764Z();
        if (fVar != null && (jsRuntime = fVar.getJsRuntime()) != null && (wVar = (C83187w) jsRuntime.mo63321n0(C83187w.class)) != null) {
            wVar.mo115424r();
        }
    }

    /* renamed from: u0 */
    public void mo125526u0(ValueCallback<C91639h> valueCallback) {
        for (Object next : mo124763Y()) {
            if (next instanceof C91639h) {
                valueCallback.onReceiveValue((C91639h) next);
            }
        }
    }

    /* renamed from: v0 */
    public abstract void mo120923v0();

    /* renamed from: w0 */
    public void mo122630w0(String str) {
    }

    /* renamed from: x0 */
    public abstract void mo120924x0();

    /* renamed from: y0 */
    public void mo120925y0() {
        if (mo125524n0()) {
            mo125519F0(new i$$k(this));
        }
    }

    /* renamed from: z0 */
    public void mo120926z0() {
        if (mo125524n0()) {
            mo125519F0(new i$$l(this));
        }
    }
}
