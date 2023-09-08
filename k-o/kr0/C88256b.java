package kr0;

import ai0.C79553f;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.magicar.MagicAR;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJniParams;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81822a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83033t;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83139a;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83146c;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83155d0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83156e;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83173l0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83188y;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83557e;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C1933m;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C1937p;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83581k;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83585r;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.appbrand.utils.C2049t;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84835c0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import dq0.C86390a;
import gy3.C87412m;
import h81.C32735h;
import ii0.C87732a;
import iu0.C33407g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import js0.C88016e;
import kg3.C76577a;
import org.json.JSONException;
import org.json.JSONObject;
import p1010nc.C88916a;
import p1010nc.C88922g;
import p1010nc.C88926i;
import p1017od.C89201o;
import p170ic.C87690d;
import p194lc.C88461r;
import p284zb.C91631b;
import p284zb.C91633d;
import p284zb.C91635f;
import p284zb.C91639h;
import p284zb.d$$n;
import p416qd.C89590b;
import p760ya.C91384c;
import p774zg.C91749x;
import p958eb.C86475f;
import pj0.C89355a;
import qe3.C89625d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import sx3.C64197v;
import u40.C90605b;
import u40.C90609h;
import zt3.C119157j;

/* renamed from: kr0.b */
public class C88256b extends C91633d<C88267e> implements C86475f {

    /* renamed from: A */
    public C91384c f255071A = null;

    /* renamed from: B */
    public MagicAR f255072B = null;

    /* renamed from: C */
    public ICommLibReader f255073C = null;

    /* renamed from: D */
    public WxaPkgV8SnapshotInfo f255074D = null;

    /* renamed from: E */
    public boolean f255075E = false;

    /* renamed from: F */
    public final C87732a.C87737e<String> f255076F = new C87732a.C87737e<>();

    /* renamed from: G */
    public final C88277k1 f255077G = new C88277k1((C81925i2) mo124764Z());

    /* renamed from: z */
    public C86390a f255078z = null;

    static {
        C88461r.f255534a = new b$$e();
    }

    public C88256b(C88267e eVar) {
        super(eVar);
        mo124765a0(C86475f.class, this);
        mo124765a0(C91639h.class, new AppServiceSkylineExtensionImpl(eVar));
    }

    /* renamed from: A0 */
    public void mo120895A0() {
        super.mo120895A0();
        C86390a aVar = this.f255078z;
        if (aVar != null) {
            aVar.mo120816d();
        }
    }

    /* renamed from: B0 */
    public void mo120896B0() {
        super.mo120896B0();
        if (C83155d0.m102046d((C81925i2) mo124764Z())) {
            Log.m105924i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "service initNativeTransLogic");
            C83155d0.m102043a(((C88267e) mo124764Z()).getJsRuntime(), ((C88267e) mo124764Z()).hashCode(), mo125521g0());
            C83155d0.m102044b(((C88267e) mo124764Z()).getJsRuntime(), ((C88267e) mo124764Z()).hashCode(), ((C88267e) mo124764Z()).hashCode(), mo125521g0());
        }
        mo122622c1();
        this.f255077G.mo122657g();
    }

    /* renamed from: C0 */
    public void mo120897C0(JSONObject jSONObject) {
        super.mo120897C0(jSONObject);
        C88267e eVar = (C88267e) mo124764Z();
        Objects.requireNonNull(eVar);
        boolean z = eVar.getRuntime().mo113194Y1() || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED;
        try {
            jSONObject.put("exportBaseMethods", z);
            jSONObject.put("supressOffscreenPatch", true);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "exportBaseMethods e:%s", e);
        }
        Log.m105925i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "exportBaseMethods:%b", Boolean.valueOf(z));
    }

    /* renamed from: D0 */
    public void mo120898D0(AppBrandRuntime appBrandRuntime) {
        super.mo120898D0(appBrandRuntime);
        C91384c cVar = this.f255071A;
        if (cVar != null) {
            cVar.getClass();
            cVar.mo123173b(appBrandRuntime);
        }
        if (mo124764Z() != null && ((C88267e) mo124764Z()).getJsRuntime() != null) {
            mo122622c1();
        }
    }

    /* renamed from: E0 */
    public AppBrandCommonBindingJniParams mo122604E0() {
        AppBrandCommonBindingJniParams E0 = super.mo122604E0();
        if (E0 == null) {
            return null;
        }
        E0.enableInspector = C88284n1.f255194a;
        return E0;
    }

    /* renamed from: G0 */
    public final boolean mo122605G0(int i, String str) {
        return mo124764Z() instanceof C83557e;
    }

    /* renamed from: H0 */
    public final boolean mo122606H0(String str, String str2, int i) {
        if (mo124764Z() instanceof C83557e) {
            return true;
        }
        if (mo124764Z() == null || !((C88267e) mo124764Z()).f255130P || !((HashSet) C79553f.f233289b).contains(str)) {
            return false;
        }
        ((C88267e) mo124764Z()).mo114339j0(str, str2);
        return true;
    }

    /* renamed from: I0 */
    public synchronized boolean mo122607I0() {
        C90609h.f260328a = new b$$f(this);
        C90605b.f260327a = new b$$b();
        return super.mo122607I0();
    }

    /* renamed from: M0 */
    public d$$n mo122608M0() {
        boolean z = this.f262531h;
        Log.m105925i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "fetchLibBootstrap, isUsingIsolateContext: %b, mainContextIsSnapshot: %b", Boolean.valueOf(z), Boolean.valueOf(this.f255075E));
        if (!z || !this.f255075E) {
            return super.mo122608M0();
        }
        mo122624e1(new b$$c(C84835c0.f247296d));
        C84868u0 u0Var = C84868u0.f247366a;
        ICommLibReader iCommLibReader = this.f255073C;
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f255074D;
        Objects.requireNonNull(wxaPkgV8SnapshotInfo);
        u0Var.mo117613j(iCommLibReader, wxaPkgV8SnapshotInfo);
        d$$n d__n = new d$$n();
        d__n.f262570a = "WAServiceMainContextReady.js";
        d__n.f262572c = ";WeixinSnapshot.snapshotContextReady();";
        d__n.f262573d = true;
        return d__n;
    }

    /* renamed from: N0 */
    public String mo122609N0() {
        String str = "" + super.mo122609N0();
        if (this.f255078z != null) {
            str = str + this.f255078z.mo120815a();
        }
        String str2 = str + C88016e.m109548e("wxa_library/puppet_wrapper.js");
        if (!(mo124764Z() instanceof C88271f1)) {
            return str2;
        }
        String str3 = ((C88271f1) mo124764Z()).f255144V;
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str2 + "\n" + str3;
    }

    /* renamed from: O0 */
    public int mo122610O0() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    /* renamed from: R0 */
    public C91631b<C88267e> mo122611R0(C83165i iVar, C83185u uVar) {
        boolean z = iVar instanceof C83188y;
        C88267e eVar = (C88267e) mo124764Z();
        Objects.requireNonNull(eVar);
        return new C88255a(eVar, uVar);
    }

    /* renamed from: S0 */
    public void mo122612S0(boolean z, String str, C80669j.C80676g gVar) {
        if (this.f255075E) {
            mo122624e1(new b$$a(C84835c0.f247296d));
            C84868u0 u0Var = C84868u0.f247366a;
            ICommLibReader iCommLibReader = this.f255073C;
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f255074D;
            Objects.requireNonNull(wxaPkgV8SnapshotInfo);
            u0Var.mo117612i(iCommLibReader, wxaPkgV8SnapshotInfo, z, gVar, (C91635f) mo124764Z());
            C13601g gVar2 = C2049t.f11994a;
            if (((Boolean) ((C36570n) C2049t.f11995b).getValue()).booleanValue()) {
                mo125525t0();
                return;
            }
            return;
        }
        C84868u0.f247366a.mo117611h(this.f255073C, str, z, gVar, (C91635f) mo124764Z());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|5|(2:7|8)(1:9)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122613T0(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r3.mo124764Z()     // Catch:{ all -> 0x0009 }
            kr0.e r0 = (kr0.C88267e) r0     // Catch:{ all -> 0x0009 }
            com.tencent.p014mm.plugin.appbrand.report.C84242u.m103849b(r0, r4, r5)     // Catch:{ all -> 0x0009 }
        L_0x0009:
            fc.g r0 = r3.mo125523j0()     // Catch:{ NullPointerException -> 0x0028 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r0     // Catch:{ NullPointerException -> 0x0028 }
            com.tencent.mm.plugin.appbrand.report.quality.v r0 = r0.f238272H1     // Catch:{ NullPointerException -> 0x0028 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x0028 }
            r1.<init>()     // Catch:{ NullPointerException -> 0x0028 }
            r1.append(r4)     // Catch:{ NullPointerException -> 0x0028 }
            java.lang.String r2 = "\n"
            r1.append(r2)     // Catch:{ NullPointerException -> 0x0028 }
            r1.append(r5)     // Catch:{ NullPointerException -> 0x0028 }
            java.lang.String r1 = r1.toString()     // Catch:{ NullPointerException -> 0x0028 }
            r0.f246040c = r1     // Catch:{ NullPointerException -> 0x0028 }
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            boolean r0 = r3.f255075E
            if (r0 == 0) goto L_0x0036
            com.tencent.mm.plugin.appbrand.v8_snapshot.u0 r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0.f247366a
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r3.f255073C
            java.lang.String r2 = "app:main"
            r0.mo117621r(r1, r2, r4, r5)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kr0.C88256b.mo122613T0(java.lang.String, java.lang.String):void");
    }

    /* renamed from: U */
    public C80301a mo120910U() {
        mo122620b1();
        C91384c cVar = this.f255071A;
        if (cVar == null) {
            return null;
        }
        C80301a aVar = cVar.f262085c;
        C87412m.m108591d(aVar);
        return aVar;
    }

    /* renamed from: U0 */
    public boolean mo122614U0() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_read_comm_lib_by_fd, 1) == 1;
    }

    /* renamed from: W0 */
    public boolean mo122615W0() {
        return mo122625f1("clicfg_android_appbrand_skia_canvas_module_lazy_load");
    }

    /* renamed from: X0 */
    public boolean mo122616X0() {
        return mo122625f1("clicfg_android_appbrand_tcp_module_lazy_load");
    }

    /* renamed from: Y0 */
    public boolean mo122617Y0() {
        return mo122625f1("clicfg_android_appbrand_udp_module_lazy_load");
    }

    /* renamed from: Z0 */
    public boolean mo122618Z0() {
        return mo122625f1("clicfg_android_appbrand_wxaudio_module_lazy_load");
    }

    /* renamed from: a1 */
    public boolean mo122619a1() {
        return mo122625f1("clicfg_android_appbrand_wss_module_lazy_load");
    }

    /* renamed from: b1 */
    public final synchronized void mo122620b1() {
        Log.printInfoStack("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: start create magicbrush", new Object[0]);
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.f255071A == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "setup magicbrush. loaded?[%b]", objArr);
        if (this.f255071A == null) {
            if (mo124764Z() != null) {
                C83165i jsRuntime = ((C88267e) mo124764Z()).getJsRuntime();
                C89590b.m112027a();
                C89590b.m112028b("gamelog_delegate");
                b$$k b__k = new b$$k(this, ((C88267e) mo124764Z()).getContext(), jsRuntime);
                this.f255071A = b__k;
                b__k.mo125350a();
                Log.m105924i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: magicbrush create done");
                if (((C88267e) mo124764Z()).isRunning()) {
                    C91384c cVar = this.f255071A;
                    AppBrandRuntimeWC N0 = ((C88267e) mo124764Z()).getRuntime();
                    cVar.getClass();
                    C87412m.m108594g(N0, "runtime");
                    cVar.mo123173b(N0);
                }
                C89355a aVar = C89355a.f257342a;
                C80301a aVar2 = this.f255071A.f262085c;
                C87412m.m108591d(aVar2);
                aVar.mo123710a(aVar2, ((C88267e) mo124764Z()).getRuntime());
                jsRuntime.addJavascriptInterface(new b$$n(this, (b$$e) null), "MagicBrushViewIdTransfer");
                jsRuntime.evaluateJavascript(C88016e.m109548e("wxa_library/NativeGlobal-WAService.js"), new b$$l(this));
                return;
            }
            Log.m105928w("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: component lost");
        }
    }

    /* renamed from: c0 */
    public void mo122621c0(JSONObject jSONObject) {
        try {
            jSONObject.put(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, C89625d.f257841g);
            C83165i jsRuntime = ((C88267e) mo124764Z()).getJsRuntime();
            jSONObject.put("JSEngineName", jsRuntime instanceof C83146c ? "J2V8-Package" : jsRuntime instanceof C83188y ? "NodeJS" : "unknown");
            C33407g gVar = C33407g.f90517a;
            C81822a.m100417a(jSONObject, "useXWebVideo", Boolean.TRUE);
            C81822a.m100417a(jSONObject, "XWebVideoMinVersion", 300);
            C81822a.m100417a(jSONObject, "supportXWebTouch", Boolean.valueOf(XWebSdk.isCurrentVersionSupportMapExtendPluginForAppbrand()));
            C81822a.m100417a(jSONObject, "useXWebMap", Boolean.valueOf(C33407g.m40055d()));
            C81822a.m100417a(jSONObject, "useXWebTextarea", Boolean.valueOf(((Boolean) ((C36570n) C33407g.f90522f).getValue()).booleanValue()));
            C33407g gVar2 = C33407g.f90517a;
            C81822a.m100417a(jSONObject, "supportXWebTextarea", Boolean.valueOf(gVar2.mo59129c()));
            C81822a.m100417a(jSONObject, "useXWebInput", Boolean.valueOf(((Boolean) ((C36570n) C33407g.f90524h).getValue()).booleanValue()));
            C81822a.m100417a(jSONObject, "supportXWebInput", Boolean.valueOf(gVar2.mo59128b()));
            boolean isCurrentVersionSupportMapExtendPluginForAppbrand = XWebSdk.isCurrentVersionSupportMapExtendPluginForAppbrand();
            Log.m105925i("MicroMsg.AppBrand.SameLayer.XWebABTests", "openXWebSameLayerRendering for Live:%b", Boolean.valueOf(isCurrentVersionSupportMapExtendPluginForAppbrand));
            C81822a.m100417a(jSONObject, "useXWebLive", Boolean.valueOf(isCurrentVersionSupportMapExtendPluginForAppbrand));
            C81822a.m100417a(jSONObject, "abtestXWebCameraEnable", Boolean.valueOf(gVar2.mo59127a()));
            C81822a.m100417a(jSONObject, "useXWebCamera", Boolean.valueOf(((Boolean) ((C36570n) C33407g.f90526j).getValue()).booleanValue()));
            C81822a.m100417a(jSONObject, "useXWebVoipRoom", Boolean.valueOf(C33407g.m40056e()));
            jSONObject.put("useXWebWebGLCanvas", C33407g.m40057f());
            jSONObject.put("useSkiaCanvasRaf", C33407g.m40059h());
            jSONObject.put("useNewXWebCanvasToTFP", C33407g.m40058g());
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", e, "attachCommonConfig error", new Object[0]);
        }
    }

    /* renamed from: c1 */
    public void mo122622c1() {
        C88926i iVar;
        if (mo125523j0() != null && (iVar = ((AppBrandRuntimeWC) mo125523j0()).f238280P1) != null) {
            C81925i2 i2Var = (C81925i2) mo124764Z();
            C87412m.m108594g(i2Var, "service");
            iVar.f256470a = new C88916a(new C88922g(), i2Var.getContext(), i2Var);
            AppBrandRuntime runtime = i2Var.getRuntime();
            C88916a aVar = iVar.f256470a;
            if (aVar != null) {
                runtime.mo113056g(((C88922g) aVar.f256451a).f256467a, new FrameLayout.LayoutParams(-1, -1));
                AppBrandRuntime runtime2 = i2Var.getRuntime();
                C88916a aVar2 = iVar.f256470a;
                if (aVar2 != null) {
                    View view = aVar2.f256456f;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388693;
                    layoutParams.bottomMargin = C76577a.m92151b(i2Var.getContext(), 55);
                    layoutParams.leftMargin = C76577a.m92151b(i2Var.getContext(), 15);
                    layoutParams.rightMargin = C76577a.m92151b(i2Var.getContext(), 15);
                    C13598b0 b0Var = C13598b0.f38549a;
                    runtime2.mo113056g(view, layoutParams);
                    C83165i jsRuntime = ((C88267e) mo124764Z()).getJsRuntime();
                    if (jsRuntime instanceof C83139a) {
                        C83156e eVar = ((C83139a) jsRuntime).f242940h;
                        eVar.f242970d = iVar;
                        synchronized (eVar.f242969c) {
                            for (int i = 0; i < eVar.f242969c.size(); i++) {
                                C80669j u1 = eVar.f242969c.valueAt(i).mo115381u1();
                                u1.f236041b.mo112450v(new C91749x(u1, eVar.f242970d));
                            }
                        }
                        return;
                    }
                    return;
                }
                C87412m.m108603p("consoleView");
                throw null;
            }
            C87412m.m108603p("consoleView");
            throw null;
        }
    }

    /* renamed from: d0 */
    public void mo120918d0() {
        Class cls = C83174m.class;
        super.mo120918d0();
        C91384c cVar = this.f255071A;
        if (cVar != null) {
            if (this.f255072B != null) {
                ((C83174m) cVar.f262084b.mo63321n0(cls)).mo115384z0(new b$$j(this));
            }
            C91384c cVar2 = this.f255071A;
            cVar2.getClass();
            Log.m105924i("MicroMsg.MagicBrush", "destroy");
            ((C83174m) cVar2.f262084b.mo63321n0(cls)).mo115384z0(cVar2.f262087e);
        }
        this.f255077G.mo122658h();
    }

    /* renamed from: d1 */
    public final void mo122623d1(String str) {
        mo122620b1();
        if (Util.isNullOrNil(str)) {
            return;
        }
        if (mo120910U() != null) {
            mo120910U().mo111579q(str);
            return;
        }
        Log.m105921e("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: create magicbrush failed! %s", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        r1 = r1.getRuntime();
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x020b  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i mo120919e0() {
        /*
            r17 = this;
            r7 = r17
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r17.mo124764Z()
            kr0.e r1 = (kr0.C88267e) r1
            java.util.Objects.requireNonNull(r1)
            android.content.Context r1 = r1.getContext()
            if (r1 != 0) goto L_0x001a
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x001a:
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r17.mo124764Z()
            kr0.e r1 = (kr0.C88267e) r1
            java.util.Objects.requireNonNull(r1)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r1.mo114272k()
            java.util.Objects.requireNonNull(r1)
            r7.f255073C = r1
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r17.mo124764Z()
            kr0.e r1 = (kr0.C88267e) r1
            r2 = 0
            if (r1 != 0) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r1.getRuntime()
            if (r1 != 0) goto L_0x003e
        L_0x003c:
            r1 = 0
            goto L_0x0042
        L_0x003e:
            boolean r1 = r1.mo113215r1()
        L_0x0042:
            com.tencent.mm.plugin.appbrand.jsapi.f r3 = r17.mo124764Z()
            boolean r3 = r3 instanceof kr0.C88271f1
            r6 = 1
            if (r3 == 0) goto L_0x0063
            com.tencent.mm.plugin.appbrand.jsapi.f r3 = r17.mo124764Z()
            kr0.f1 r3 = (kr0.C88271f1) r3
            java.lang.String r8 = r3.f255144V
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0061
            java.lang.String r3 = r3.f255145W
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            r3 = 1
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            r9[r2] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            r9[r6] = r10
            java.lang.String r10 = "MicroMsg.AppBrandMiniProgramServiceLogicImpWC"
            java.lang.String r11 = "canUseCommLibSnapshot, isWeAppDevToolsRemoteDebug: %b, isMonkeyTestWithCustomJs: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r9)
            if (r1 != 0) goto L_0x0080
            if (r3 != 0) goto L_0x0080
            r1 = 1
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            r3 = 0
            if (r1 == 0) goto L_0x009d
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r7.f255073C
            com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r9 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84872v0.APP
            java.lang.String r11 = "reader"
            gy3.C87412m.m108594g(r1, r11)
            java.lang.Class<com.tencent.mm.plugin.appbrand.v8_snapshot.u> r11 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84867u.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            com.tencent.mm.plugin.appbrand.v8_snapshot.u r11 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84867u) r11
            if (r11 == 0) goto L_0x009d
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r1 = r11.mo117543KI(r1, r9)
            goto L_0x009e
        L_0x009d:
            r1 = r3
        L_0x009e:
            if (r1 == 0) goto L_0x00b3
            r7.f255074D = r1
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r9 = r7.f255073C
            boolean r9 = r1.mo117553d(r9)
            r7.f255075E = r9
            java.lang.String r9 = r1.f247273i
            int r11 = r1.mo117552c()
            boolean r1 = r1.f247278q
            goto L_0x00b7
        L_0x00b3:
            int r11 = com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX
            r9 = r3
            r1 = 0
        L_0x00b7:
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r2] = r9
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r12[r6] = r13
            java.lang.String r13 = "createCustomJsRuntime, snapshotPath: %s, mainContextSnapshotIndex: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r12)
            di3.d r12 = di3.C86312j.m106911c(r0)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_mmv8_disable_codecache
            boolean r12 = r12.mo58784wf(r13, r2)
            if (r12 != 0) goto L_0x00d9
            java.lang.String r12 = com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0.m38798a()
            goto L_0x00da
        L_0x00d9:
            r12 = r3
        L_0x00da:
            java.lang.Object[] r13 = new java.lang.Object[r6]
            r13[r2] = r12
            java.lang.String r14 = "createCustomJsRuntime, codeCacheDir: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r13)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r10 = r7.f255073C
            java.lang.String r13 = "delayedServiceCodeCache"
            java.lang.String r10 = r10.Yk0(r13)
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            if (r10 == 0) goto L_0x0100
            di3.d r10 = di3.C86312j.m106911c(r0)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_appbrand_common_lib_code_cache_delay
            boolean r10 = r10.mo58784wf(r13, r6)
            if (r10 == 0) goto L_0x0100
            r2 = 1
        L_0x0100:
            com.tencent.mm.plugin.appbrand.jsapi.f r10 = r17.mo124764Z()
            kr0.e r10 = (kr0.C88267e) r10
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r10 = r10.mo114272k()
            java.util.Objects.requireNonNull(r10)
            r10.mo113371a()
            nj0.s r10 = nj0.C88979s.f256571c
            java.lang.Object r10 = r10.mo123353e()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            nj0.p r13 = nj0.C88976p.f256568c
            java.lang.Object r13 = r13.mo123353e()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r13 = r13 ^ r6
            com.tencent.mm.plugin.appbrand.jsapi.f r14 = r17.mo124764Z()
            com.tencent.mm.plugin.appbrand.i2 r14 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r14
            boolean r14 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83155d0.m102046d(r14)
            com.tencent.mm.plugin.appbrand.jsapi.f r16 = r17.mo124764Z()
            r8 = r16
            com.tencent.mm.plugin.appbrand.jsapi.g r8 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82510g) r8
            kr0.b$$g r15 = new kr0.b$$g
            r15.<init>(r7, r9)
            com.tencent.mm.appbrand.v8.IJSRuntime$Config r6 = new com.tencent.mm.appbrand.v8.IJSRuntime$Config
            r6.<init>()
            r6.f235973a = r12
            r6.f235974b = r9
            r6.f235975c = r1
            r6.f235976d = r3
            r6.f235977e = r11
            java.lang.String r1 = "1"
            r6.f235978f = r1
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_android_appbrand_jsbridge_function_direct_evaluate
            r9 = 1
            boolean r0 = r0.mo58784wf(r1, r9)
            r6.f235979g = r0
            r6.f235980h = r14
            r6.f235981i = r10
            r6.f235982j = r13
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r6.f235986n = r0
            r6.f235985m = r2
            r0 = -4
            r6.f235984l = r0
            r6.f235989q = r15
            java.lang.String r0 = "component"
            gy3.C87412m.m108594g(r8, r0)
            com.tencent.mm.plugin.appbrand.jsruntime.y r8 = new com.tencent.mm.plugin.appbrand.jsruntime.y
            r8.<init>(r6)
            java.lang.String r0 = "MicroMsg.AppBrandJsRuntimeFactory"
            r1 = 2
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0, r1)
            r2 = 1024(0x400, float:1.435E-42)
            java.lang.String r6 = "V8MinimalCodeLength"
            int r1 = r1.decodeInt(r6, r2)
            com.tencent.mm.appbrand.v8.IJSRuntime r2 = r8.f242938f
            r2.mo112449u(r1)
            boolean r1 = r8 instanceof com.tencent.p014mm.plugin.appbrand.jsruntime.C83146c
            if (r1 == 0) goto L_0x01ab
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 434(0x1b2, double:2.144E-321)
            r12 = 5
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            java.lang.String r1 = "Using AppBrandJ2V8BasedJsEngine"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x01bd
        L_0x01ab:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 434(0x1b2, double:2.144E-321)
            r12 = 6
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            java.lang.String r1 = "Using AppBrandNodeJSBasedJsEngine"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x01bd:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 434(0x1b2, double:2.144E-321)
            r12 = 0
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            bq0.e r0 = new bq0.e
            r0.<init>()
            r7.f255078z = r0
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r17.mo124764Z()
            com.tencent.mm.plugin.appbrand.i2 r1 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r1
            r0.mo120817e(r1, r8)
            kr0.k1 r0 = r7.f255077G
            r0.mo122656f(r8)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.p> r0 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83179p.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r0 = r8.mo63321n0(r0)
            r9 = r0
            com.tencent.mm.plugin.appbrand.jsruntime.p r9 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83179p) r9
            if (r9 == 0) goto L_0x020b
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r17.mo124764Z()
            kr0.e r0 = (kr0.C88267e) r0
            boolean r2 = r0.mo114335b0()
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r17.mo124764Z()
            kr0.e r0 = (kr0.C88267e) r0
            java.lang.String r3 = r0.getAppId()
            kr0.b$$h r10 = new kr0.b$$h
            r0 = r10
            r1 = r17
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r6)
            r9.mo115374E0(r10)
            goto L_0x022f
        L_0x020b:
            com.tencent.mm.plugin.appbrand.report.quality.e r1 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r17.mo124764Z()
            kr0.e r0 = (kr0.C88267e) r0
            boolean r0 = r0.mo114335b0()
            if (r0 == 0) goto L_0x021d
            com.tencent.mm.plugin.appbrand.task.y r0 = com.tencent.p014mm.plugin.appbrand.task.C84343y.WASERVICE
            r2 = r0
            goto L_0x021e
        L_0x021d:
            r2 = r3
        L_0x021e:
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r17.mo124764Z()
            kr0.e r0 = (kr0.C88267e) r0
            java.lang.String r3 = r0.getAppId()
            com.tencent.mm.plugin.appbrand.report.m r6 = com.tencent.p014mm.plugin.appbrand.report.C84136m.m103674a(r8)
            r1.mo116893l(r2, r3, r4, r6)
        L_0x022f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kr0.C88256b.mo120919e0():com.tencent.mm.plugin.appbrand.jsruntime.i");
    }

    /* renamed from: e1 */
    public final void mo122624e1(b$$m b__m) {
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo;
        C88267e eVar = (C88267e) mo124764Z();
        if (eVar != null) {
            if (!(C84217q.PreloadOnProcessCreated == eVar.f262594I) && (wxaPkgV8SnapshotInfo = this.f255074D) != null) {
                ((C119157j) C119157j.f356862d).mo183885p(new b$$d(b__m, wxaPkgV8SnapshotInfo), "WxaCommLibV8SnapshotClient#flushSnapshotInfo");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo122625f1(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            ii0.a$e<java.lang.String> r0 = r5.f255076F
            monitor-enter(r0)
            ii0.a$e<java.lang.String> r2 = r5.f255076F     // Catch:{ all -> 0x0038 }
            r3 = -1
            int r2 = r2.mo122146a(r6, r3)     // Catch:{ all -> 0x0038 }
            r3 = 1
            if (r2 < 0) goto L_0x001a
            if (r2 != r3) goto L_0x0018
            r1 = 1
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return r1
        L_0x001a:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x0038 }
            if (r2 != 0) goto L_0x0025
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r2 = 0
            goto L_0x0026
        L_0x0025:
            r2 = 1
        L_0x0026:
            oa1.d r4 = oa1.C117731d.m166007c()     // Catch:{ all -> 0x0038 }
            int r2 = r4.mo182443e(r6, r2, r3, r3)     // Catch:{ all -> 0x0038 }
            ii0.a$e<java.lang.String> r4 = r5.f255076F     // Catch:{ all -> 0x0038 }
            r4.mo122147b(r6, r2)     // Catch:{ all -> 0x0038 }
            if (r2 != r3) goto L_0x0036
            r1 = 1
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return r1
        L_0x0038:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kr0.C88256b.mo122625f1(java.lang.String):boolean");
    }

    /* renamed from: k0 */
    public String mo122626k0() {
        return C83173l0.m102077a();
    }

    /* renamed from: l0 */
    public final int mo122627l0() {
        int i;
        if (MMApplicationContext.getToolsProcesstPreference() == null || (i = MMApplicationContext.getToolsProcesstPreference().getInt("appbrand_wasm_opt", -2)) == -2) {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_wasm_opt_state, -2);
            if (Qe == -2) {
                return -2;
            }
            Log.m105925i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "wasm opt set to %d by abtest", Integer.valueOf(Qe));
            return Qe;
        }
        Log.m105925i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "wasm opt set to %d by cmd", Integer.valueOf(i));
        return i;
    }

    /* renamed from: o0 */
    public boolean mo122628o0() {
        return C88284n1.f255194a;
    }

    /* renamed from: p */
    public Map<String, C82870p> mo114097p() {
        if (!(mo124764Z() instanceof C83557e)) {
            return (Map) C87690d.m109090a("AppBrandMiniProgramServiceLogicImpWC.onCreateJsApiPool()", new b$$i(this));
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(C83033t.m101845f());
        C83033t tVar = new C83033t();
        tVar.mo115291h();
        hashMap.putAll(tVar.f242761c);
        for (C82870p pVar : C64197v.m75537f(new C83581k(), new C1933m(), new C1937p(), new C83585r())) {
            hashMap.put(pVar.mo114779e(), pVar);
        }
        return hashMap;
    }

    /* renamed from: p0 */
    public boolean mo122629p0() {
        if (((C88267e) mo124764Z()).f255131Q) {
            return false;
        }
        return super.mo122629p0();
    }

    /* renamed from: s0 */
    public boolean mo120922s0(String str, JSONObject jSONObject) {
        if ("MediaToolKit".equals(str)) {
            mo122623d1((String) null);
            return true;
        } else if ("WeMedia".equals(str)) {
            mo122623d1((String) null);
            return true;
        } else if ("Image".equals(str)) {
            mo122623d1((String) null);
            return true;
        } else if ("OffscreenCanvas".equals(str)) {
            mo122623d1((String) null);
            return true;
        } else if ("CpuProfiler".equals(str)) {
            mo122623d1((String) null);
            return true;
        } else if ("HeapProfiler".equals(str)) {
            mo122623d1((String) null);
            return true;
        } else if ("Profiler".equals(str)) {
            mo122623d1((String) null);
            return true;
        } else if ("ARSession".equals(str)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 24) {
                Log.m105928w("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "api version is " + i + ", can't use ar");
                return true;
            }
            mo122623d1((String) null);
            if (this.f255072B == null) {
                this.f255072B = new MagicAR(MMApplicationContext.getContext());
                C89201o invoke = mo120910U().f235093i.f256970c.invoke();
                this.f255072B.bindTo(invoke.f257030a, invoke.f257031b, invoke.f257032c);
                this.f255072B.setMagicARCallback(new C88261c(this));
                Log.m105924i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "lazy load magic-ar ok");
            }
            return true;
        } else if ("Box2D".equals(str)) {
            mo122623d1("mmbox2d");
            return true;
        } else if (!"Phys3D".equals(str)) {
            return super.mo120922s0(str, jSONObject);
        } else {
            mo122623d1("mmphysx");
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo120923v0() {
        super.mo120923v0();
    }

    /* renamed from: w0 */
    public void mo122630w0(String str) {
        this.f255077G.mo122655e(str);
    }

    /* renamed from: x0 */
    public void mo120924x0() {
        super.mo120924x0();
    }
}
