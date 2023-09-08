package kr0;

import ai0.C79553f;
import ai0.C79562l;
import br0.C79774c;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C84073q2;
import com.tencent.p014mm.plugin.appbrand.app.C81207z0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C1612e0;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82078d;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82080e;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29555x;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.page.C83788e0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.plugin.appbrand.report.C84242u;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.vendor.MIUI;
import com.tencent.skyline.SkylineRuntime;
import cr0.C86127t;
import di3.C86312j;
import f40.C86709a0;
import gu0.C87384a;
import gu0.C87386b;
import gy3.C87412m;
import h81.C32735h;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;
import p1044ub.C90629b;
import p1044ub.C90636f;
import p1058wb.C90915h;
import p1058wb.C90928k;
import p170ic.C87689c;
import p172io.flutter.FlutterInjector;
import p172io.flutter.embedding.engine.loader.FlutterLoader;
import p176jc.C87919d;
import p194lc.C88432a;
import p194lc.C88468w;
import p206nj.C11171e;
import p284zb.C16132t;
import p284zb.C91635f;
import p284zb.C91640i;
import p928ac.C79490b;
import p963fc.C86812g;
import qe3.C89625d;
import qr0.C89830a;
import sl0.C36678q;
import sl0.C36679r;
import wq0.C91057a;
import xi3.C78844a;

/* renamed from: kr0.e */
public class C88267e extends C91635f {

    /* renamed from: M */
    public AppBrandRuntimeWC f255128M;

    /* renamed from: N */
    public C88273g1 f255129N;

    /* renamed from: P */
    public boolean f255130P;

    /* renamed from: Q */
    public boolean f255131Q;

    /* renamed from: R */
    public String f255132R;

    /* renamed from: S */
    public C79562l f255133S;

    /* renamed from: T */
    public JSONObject f255134T;

    /* renamed from: U */
    public final C86127t f255135U;

    static {
        C29555x.m38804a();
    }

    public C88267e() {
        this((Class<? extends C91640i<? extends C91635f>>) C88256b.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r6 > 0) goto L_0x0022;
     */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114326B0(java.lang.String r19, long r20, long r22, java.lang.Object r24) {
        /*
            r18 = this;
            r0 = r24
            boolean r1 = r18.isRunning()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0 instanceof com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g
            r2 = 0
            if (r1 == 0) goto L_0x0025
            com.tencent.mm.appbrand.v8.j$g r0 = (com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g) r0
            long r4 = r0.f236058a
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x001e
            long r6 = r0.f236059b
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            r4 = r20
            r6 = r22
        L_0x0022:
            long r2 = r0.flatJSCompileCost
            goto L_0x0029
        L_0x0025:
            r4 = r20
            r6 = r22
        L_0x0029:
            r16 = r2
            com.tencent.mm.plugin.appbrand.report.quality.e r8 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            boolean r15 = r18.mo122650O0()
            r9 = r18
            r10 = r19
            r11 = r4
            r13 = r6
            r8.mo116892k(r9, r10, r11, r13, r15, r16)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r18.getRuntime()
            java.lang.String r8 = r0.f238147j
            uo0.a r9 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWxConfig
            java.lang.String r10 = "wxConfig"
            r11 = r4
            r13 = r6
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r8, r9, r10, r11, r13)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r18.getRuntime()
            java.lang.String r8 = r0.f238147j
            uo0.a r9 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWxConfig_Game
            java.lang.String r10 = "wxConfig"
            r11 = r4
            r13 = r6
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r8, r9, r10, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kr0.C88267e.mo114326B0(java.lang.String, long, long, java.lang.Object):void");
    }

    /* renamed from: C0 */
    public final void mo114328C0(C79774c cVar) {
        if (cVar == null) {
            Log.m105929w("MicroMsg.AppBrandServiceWC", "setWindowAndroid, impl==null, appId:%s", getAppId());
            this.f255135U.mo120546A(C86709a0.m107531m().mo58407a().f124990c);
            this.f240292z = this.f255135U;
        } else if (cVar.compareTo(this.f240292z) != 0) {
            Log.m105925i("MicroMsg.AppBrandServiceWC", "setWindowAndroid changed, old:%s, new:%s, appId:%s, stack:%s", this.f240292z, cVar, getAppId(), android.util.Log.getStackTraceString(new Throwable()));
            this.f240292z = cVar;
        }
    }

    /* renamed from: D0 */
    public final C82381f.C82384c mo122643D0() {
        return new C91057a(getRuntime(), this);
    }

    /* renamed from: E0 */
    public C87384a mo122644E0() {
        return new e$$b(this, this);
    }

    /* renamed from: I0 */
    public void mo122646I0() {
        boolean z;
        boolean z2;
        boolean z3;
        String decodeString;
        Class cls = C32735h.class;
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        this.f241595t = new C88270f(this);
        C87919d dVar = C87919d.f254457a;
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            z = true;
        } else {
            Boolean bool = C89830a.f258241a;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                Boolean valueOf = Boolean.valueOf(((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32738b.clicfg_android_wxa_preload_render_context, false));
                C89830a.f258241a = valueOf;
                C87412m.m108591d(valueOf);
                z = valueOf.booleanValue();
            }
        }
        dVar.getClass();
        C87919d.f254462f = z;
        super.mo122646I0();
        C87386b bVar = mo114347r0().f245481f;
        if (bVar.f253237b == null) {
            bVar = null;
        }
        if (bVar == null) {
            if (C84217q.PreloadBeforeRuntimeInit != this.f262594I) {
                z3 = false;
            } else {
                C16132t tVar = this.f262595J;
                z3 = !(tVar != null && tVar.f43322a);
            }
            if (z3 && (decodeString = MultiProcessMMKV.getMMKV("paramsCache").decodeString("paramsCache", (String) null)) != null && decodeString.startsWith(String.valueOf(mo114272k().mo113371a()))) {
                Log.m105924i("MicroMsg.AppBrandServiceWC", "preload: createWXLibWorker");
                String substring = decodeString.substring(decodeString.indexOf("#@#") + 3);
                Log.m105924i("MicroMsg.AppBrandServiceWC", "preload: params cache:" + substring);
                mo114347r0().createWXLibWorker("WASplashadWorker.js", substring);
            }
        }
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            z2 = true;
        } else {
            Boolean bool2 = C89830a.f258242b;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                Boolean valueOf2 = Boolean.valueOf(((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32738b.clicfg_android_wxa_preload_skyline, false));
                C89830a.f258242b = valueOf2;
                C87412m.m108591d(valueOf2);
                z2 = valueOf2.booleanValue();
            }
        }
        Log.m105925i("MicroMsg.AppBrandServiceWC", "preloadSkyline: %b", Boolean.valueOf(z2));
        if (z2) {
            mo122652Q0();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0205 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x020d A[Catch:{ Exception -> 0x0225 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02d2  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122647J0(org.json.JSONObject r12) {
        /*
            r11 = this;
            java.lang.String r0 = "env"
            java.lang.String r1 = "MicroMsg.AppBrandServiceWC"
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r2 = r2.mo113213o1()
            boolean r2 = r2.f234889w
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "debug"
            r11.mo114881c0(r12, r3, r2)
            java.lang.String r2 = "appLaunchInfo"
            org.json.JSONObject r3 = r12.optJSONObject(r2)
            if (r3 != 0) goto L_0x0025
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r11.mo114881c0(r12, r2, r3)
        L_0x0025:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r4 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103768a(r4)
            if (r4 == 0) goto L_0x0060
            long r5 = r4.mo116871a()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "preloadType"
            r11.mo114881c0(r12, r6, r5)
            boolean r5 = r4.f245850K
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "downloadCode"
            r11.mo114881c0(r3, r6, r5)
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r5 = r4.f245861v
            boolean r5 = r5.mo115530a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "isPkgPatch"
            r11.mo114881c0(r3, r6, r5)
            long r4 = r4.f245846G
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "initProcess"
            r11.mo114881c0(r3, r5, r4)
        L_0x0060:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            java.lang.String r4 = r4.mo113030T()
            java.lang.String r5 = p225rc.C89925n.m112488a(r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x007e
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.a r5 = r5.mo113008F()
            java.lang.String r5 = r5.mo113983b()
        L_0x007e:
            java.lang.String r6 = "path"
            r11.mo114881c0(r3, r6, r5)
            org.json.JSONObject r5 = new org.json.JSONObject
            java.util.Map r4 = p225rc.C89925n.m112489b(r4)
            r5.<init>(r4)
            java.lang.String r4 = "query"
            r11.mo114881c0(r3, r4, r5)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r4.mo113210l1()
            org.json.JSONObject r4 = r4.mo111291c()
            java.lang.String r5 = "referrerInfo"
            r11.mo114881c0(r3, r5, r4)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r4.mo113210l1()
            org.json.JSONObject r4 = r4.mo111301m()
            java.lang.String r5 = "shareInfo"
            r11.mo114881c0(r3, r5, r4)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r4.mo113210l1()
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r4 = r4.f234834c1
            int r4 = r4.f245541q
            r5 = -1
            if (r4 == r5) goto L_0x00c9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "chatType"
            r11.mo114881c0(r3, r5, r4)
        L_0x00c9:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r4.mo113210l1()
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r4 = r4.f234834c1
            int r4 = r4.f245542r
            r5 = 9
            r6 = 0
            r7 = 1
            if (r4 > r5) goto L_0x00dd
            if (r7 > r4) goto L_0x00dd
            r5 = 1
            goto L_0x00de
        L_0x00dd:
            r5 = 0
        L_0x00de:
            if (r5 == 0) goto L_0x00e9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "codeScene"
            r11.mo114881c0(r3, r5, r4)
        L_0x00e9:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r4.mo113210l1()
            java.lang.String r4 = r4.f234836p0
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x00fd
            java.lang.String r5 = "shortLink"
            r11.mo114881c0(r3, r5, r4)
        L_0x00fd:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r4.mo113210l1()
            int r4 = r4.f234819T0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "secFlagForSinglePageMode"
            r11.mo114881c0(r3, r5, r4)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.p014mm.plugin.appbrand.report.model.C84141e.m103709e(r4, r3)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.p014mm.plugin.appbrand.report.model.C84141e.m103705a(r4, r12)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.p014mm.plugin.appbrand.report.model.C84141e.m103707c(r4, r12)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r4 = r4.mo113213o1()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            int r8 = r4.f234861F
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "maxRequestConcurrent"
            r11.mo114881c0(r5, r9, r8)
            int r8 = r4.f234862G
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "maxUploadConcurrent"
            r11.mo114881c0(r5, r9, r8)
            int r8 = r4.f234863H
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "maxDownloadConcurrent"
            r11.mo114881c0(r5, r9, r8)
            int r8 = r4.f234864I
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "maxWebsocketConnect"
            r11.mo114881c0(r5, r9, r8)
            int r8 = r4.f234865J
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "maxWorkerConcurrent"
            r11.mo114881c0(r5, r9, r8)
            org.json.JSONObject r8 = r12.optJSONObject(r0)     // Catch:{ Exception -> 0x01aa }
            if (r8 != 0) goto L_0x016e
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x01aa }
            r8.<init>()     // Catch:{ Exception -> 0x01aa }
            r12.put(r0, r8)     // Catch:{ Exception -> 0x01aa }
        L_0x016e:
            java.lang.String r0 = "USER_DATA_PATH"
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r9 = r11.f255128M     // Catch:{ Exception -> 0x01aa }
            boolean r9 = com.tencent.p014mm.plugin.appbrand.C83608m4.m102642a(r9)     // Catch:{ Exception -> 0x01aa }
            if (r9 == 0) goto L_0x017c
            java.lang.String r9 = "wxfile://singlepage"
            goto L_0x017f
        L_0x017c:
            java.lang.String r9 = "wxfile://usr"
        L_0x017f:
            r8.put(r0, r9)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "OPEN_DATA_PATH"
            java.lang.String r9 = "wxfile://opendata"
            r8.put(r0, r9)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "CLIENT_DATA_PATH"
            java.lang.String r9 = "wxfile://clientdata"
            r8.put(r0, r9)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "HAS_SPLASHSCREEN"
            java.lang.Class<h81.h> r9 = h81.C32735h.class
            di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ Exception -> 0x01aa }
            h81.h r9 = (h81.C32735h) r9     // Catch:{ Exception -> 0x01aa }
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_appbrand_game_splashscreen     // Catch:{ Exception -> 0x01aa }
            boolean r9 = r9.mo58784wf(r10, r6)     // Catch:{ Exception -> 0x01aa }
            if (r9 != r7) goto L_0x01a6
            r9 = 1
            goto L_0x01a7
        L_0x01a6:
            r9 = 0
        L_0x01a7:
            r8.put(r0, r9)     // Catch:{ Exception -> 0x01aa }
        L_0x01aa:
            r11.mo122651P0(r12)
            r11.mo114881c0(r12, r2, r3)
            java.lang.String r0 = "wxAppInfo"
            r11.mo114881c0(r12, r0, r5)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r11.getRuntime()
            boolean r0 = r0.mo113194Y1()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r2 = "isPluginMiniProgram"
            r11.mo114881c0(r12, r2, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            int r0 = r0.f239365g
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b[] r2 = com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82793b.values()
            int r3 = r2.length
            r5 = 0
        L_0x01d5:
            if (r5 >= r3) goto L_0x01e1
            r8 = r2[r5]
            int r9 = r8.f242156d
            if (r9 != r0) goto L_0x01de
            goto L_0x01e3
        L_0x01de:
            int r5 = r5 + 1
            goto L_0x01d5
        L_0x01e1:
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b r8 = com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82793b.RELEASE
        L_0x01e3:
            java.lang.String r0 = r8.name()
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = "envVersion"
            r11.mo114881c0(r12, r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0205 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r11.f255128M     // Catch:{ Exception -> 0x0205 }
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r3.mo113210l1()     // Catch:{ Exception -> 0x0205 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r3 = r3.f234804H     // Catch:{ Exception -> 0x0205 }
            java.lang.String r3 = r3.f239463r     // Catch:{ Exception -> 0x0205 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0205 }
            r0 = r2
        L_0x0205:
            java.lang.String r2 = r4.f234859D     // Catch:{ Exception -> 0x0225 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0225 }
            if (r2 != 0) goto L_0x0230
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0225 }
            r2.<init>()     // Catch:{ Exception -> 0x0225 }
            java.lang.String r3 = "jsonInfo"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0225 }
            java.lang.String r4 = r4.f234859D     // Catch:{ Exception -> 0x0225 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0225 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r3 = "operationInfo"
            r11.mo114881c0(r0, r3, r2)     // Catch:{ Exception -> 0x0225 }
            goto L_0x0230
        L_0x0225:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r6] = r2
            java.lang.String r2 = "postProcessConfig, put operationInfo to appContactInfo fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)
        L_0x0230:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r11.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r2.mo113210l1()
            java.lang.String r2 = r2.f234805I
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 2
            if (r2 != 0) goto L_0x026a
            java.lang.String r2 = "passThroughInfo"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0257 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r11.getRuntime()     // Catch:{ JSONException -> 0x0257 }
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r5.mo113210l1()     // Catch:{ JSONException -> 0x0257 }
            java.lang.String r5 = r5.f234805I     // Catch:{ JSONException -> 0x0257 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0257 }
            r0.put(r2, r4)     // Catch:{ JSONException -> 0x0257 }
            goto L_0x026a
        L_0x0257:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r11.getRuntime()
            java.lang.String r5 = r5.f238147j
            r4[r6] = r5
            r4[r7] = r2
            java.lang.String r2 = "postProcessConfig, put passThroughInfo for appId:%s, get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r4)
        L_0x026a:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r11.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r2.mo113210l1()
            java.lang.String r2 = r2.f234806J
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x02a3
            java.lang.String r2 = "stablePassThroughInfo"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0290 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r11.getRuntime()     // Catch:{ JSONException -> 0x0290 }
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r5.mo113210l1()     // Catch:{ JSONException -> 0x0290 }
            java.lang.String r5 = r5.f234806J     // Catch:{ JSONException -> 0x0290 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0290 }
            r0.put(r2, r4)     // Catch:{ JSONException -> 0x0290 }
            goto L_0x02a3
        L_0x0290:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r11.getRuntime()
            java.lang.String r4 = r4.f238147j
            r3[r6] = r4
            r3[r7] = r2
            java.lang.String r2 = "postProcessConfig, put stablePassThroughInfo for appId:%s, get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)
        L_0x02a3:
            java.lang.String r1 = "appContactInfo"
            r11.mo114881c0(r12, r1, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r11.f255128M
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            r0.getClass()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 0
            java.lang.String r3 = "appId"
            java.lang.String r4 = r0.f239362d     // Catch:{ JSONException -> 0x02d4 }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x02d4 }
            java.lang.String r3 = "nickname"
            java.lang.String r4 = r0.f239363e     // Catch:{ JSONException -> 0x02d4 }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x02d4 }
            java.lang.String r3 = "icon"
            java.lang.String r0 = r0.f239364f     // Catch:{ JSONException -> 0x02d4 }
            r1.put(r3, r0)     // Catch:{ JSONException -> 0x02d4 }
            int r0 = r1.length()
            if (r0 != 0) goto L_0x02d3
            r1 = r2
        L_0x02d3:
            r2 = r1
        L_0x02d4:
            java.lang.String r0 = "accountInfo"
            r11.mo114881c0(r12, r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r1 = "supportAsyncAudio"
            r11.mo114881c0(r12, r1, r0)
            super.mo122647J0(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kr0.C88267e.mo122647J0(org.json.JSONObject):void");
    }

    /* renamed from: L0 */
    public void mo122648L0(C90636f.C90637a aVar, boolean z, long j, long j2, Object obj) {
        String str = aVar.f260398i;
        Log.m105919d("MicroMsg.AppBrandServiceWC", "reportBootstrapScriptEvaluateResult appId[%s] name[%s] succeed[%b]", getAppId(), str, Boolean.valueOf(z));
        try {
            C84242u.f246074a.mo116921a(this, aVar, z, j, j2, obj);
        } catch (NullPointerException e) {
            Log.m105921e("MicroMsg.AppBrandServiceWC", "reportEvaluateResult get npe:%s", e);
        }
        if ("WAService.js".equals(str)) {
            String b = (!isRunning() || !AppBrandPerformanceManager.m103497f(getRuntime())) ? null : mo114272k().mo113372b("WAPerf.js");
            if (!Util.isNullOrNil(b)) {
                C84754j1.m104418b(getJsRuntime(), (URL) null, b, new e$$d(this));
                return;
            }
        }
    }

    /* renamed from: M0 */
    public C83928t1 mo114341l0() {
        return (C83928t1) mo114342m0(C83928t1.class);
    }

    /* renamed from: N0 */
    public AppBrandRuntimeWC getRuntime() {
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) ((C86812g) this.f240282A);
        return appBrandRuntimeWC != null ? appBrandRuntimeWC : this.f255128M;
    }

    /* renamed from: O0 */
    public boolean mo122650O0() {
        return this.f262593H.mo120921r0();
    }

    /* renamed from: P */
    public String mo114845P(String str, String str2, String str3, int i, boolean z, C40482o oVar) {
        C82381f.C82384c cVar = this.f241588j;
        C91057a aVar = cVar instanceof C91057a ? (C91057a) cVar : null;
        boolean z2 = aVar != null && aVar.mo125124h(str, i);
        try {
            return super.mo114845P(str, str2, str3, i, z, oVar);
        } finally {
            if (z2) {
                aVar.mo125123g(str, i);
            }
        }
    }

    /* renamed from: P0 */
    public void mo122651P0(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        mo114881c0(jSONObject2, "isTeenMode", Boolean.valueOf(getRuntime().mo113210l1().f234847y0));
        mo114881c0(jSONObject2, "isCareMode", Boolean.valueOf(getRuntime().mo113210l1().f234845x0));
        mo114881c0(jSONObject2, "isAccessibilityMode", Boolean.valueOf(C78844a.C15689b.f42385a.mo108842h(true)));
        JSONObject jSONObject3 = new JSONObject();
        mo114881c0(jSONObject3, "labelColor_light", "rgba(0,0,0,0.90)");
        mo114881c0(jSONObject3, "labelColor_dark", "rgba(255,255,255,0.80)");
        mo114881c0(jSONObject3, "tertiaryLabelColor_light", "rgba(0,0,0,0.30)");
        mo114881c0(jSONObject3, "secondaryLabelColor_light", "rgba(0,0,0,0.50)");
        mo114881c0(jSONObject3, "tertiaryLabelColor_dark", "rgba(255,255,255,0.30)");
        mo114881c0(jSONObject3, "secondaryLabelColor_dark", "rgba(255,255,255,0.50)");
        mo114881c0(jSONObject2, "commonColor", jSONObject3);
        mo114881c0(jSONObject, "userConfig", jSONObject2);
    }

    /* renamed from: Q0 */
    public void mo122652Q0() {
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (AppServiceSkylineExtensionImpl) mo125517G0(AppServiceSkylineExtensionImpl.class);
        if (appServiceSkylineExtensionImpl != null) {
            int i = C81207z0.f238545a;
            Log.m105924i("MicroMsg.MMSkylineBootGuard", "<clinit>");
            appServiceSkylineExtensionImpl.mo111458h(this, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r1 = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) ((kr0.C88267e) r1.mo124764Z()).mo125517G0(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class);
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo114846R(com.tencent.p014mm.plugin.appbrand.jsapi.C82870p r10, org.json.JSONObject r11, org.json.JSONObject r12, int r13, com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o r14) {
        /*
            r9 = this;
            java.lang.String r0 = "__invoke_webviewId"
            boolean r1 = r11.has(r0)
            if (r1 == 0) goto L_0x005b
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.getRuntime()
            if (r1 == 0) goto L_0x005b
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.getRuntime()
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r1 = r1.mo113212m1()
            if (r1 == 0) goto L_0x005b
            zb.i<? extends zb.f> r1 = r9.f262593H
            boolean r2 = r1 instanceof kr0.C88256b
            if (r2 == 0) goto L_0x005b
            kr0.b r1 = (kr0.C88256b) r1
            com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.mo124764Z()
            r3 = 0
            if (r2 != 0) goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x003c
        L_0x0029:
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r1.mo124764Z()
            kr0.e r1 = (kr0.C88267e) r1
            java.lang.Class<com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl> r2 = com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class
            java.lang.Object r1 = r1.mo125517G0(r2)
            com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl r1 = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) r1
            if (r1 != 0) goto L_0x003a
            goto L_0x0027
        L_0x003a:
            boolean r1 = r1.f235032i
        L_0x003c:
            if (r1 == 0) goto L_0x005b
            int r0 = r11.optInt(r0, r3)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.getRuntime()
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r1 = r1.mo113212m1()
            r2 = 1
            com.tencent.mm.plugin.appbrand.page.d1 r3 = r1.mo116365q(r0, r2)
            if (r3 == 0) goto L_0x005b
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            java.lang.String r10 = r3.mo114846R(r4, r5, r6, r7, r8)
            return r10
        L_0x005b:
            java.lang.String r10 = super.mo114846R(r10, r11, r12, r13, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kr0.C88267e.mo114846R(com.tencent.mm.plugin.appbrand.jsapi.p, org.json.JSONObject, org.json.JSONObject, int, com.tencent.mm.plugin.appbrand.jsruntime.o):java.lang.String");
    }

    /* renamed from: W */
    public void mo114331W(JSONObject jSONObject) {
        super.mo114331W(jSONObject);
        int i = MMEditText.f220378D;
        mo114881c0(jSONObject, "useClipboardWithPermissionNotify", Boolean.valueOf(MIUI.ifMIUI() && C11171e.m11046c(28)));
        JSONObject jSONObject2 = new JSONObject();
        mo114881c0(jSONObject2, "env", "WeChat");
        mo114881c0(jSONObject2, ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(C89625d.f257841g));
        mo114881c0(jSONObject, "host", jSONObject2);
        C91640i<? extends C91635f> iVar = this.f262593H;
        if (iVar instanceof C88256b) {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = ((C88256b) iVar).f255074D;
            mo114881c0(jSONObject, "isSnapshoting", Boolean.FALSE);
            if (wxaPkgV8SnapshotInfo != null) {
                mo114881c0(jSONObject, "snapshotMetaInfo", wxaPkgV8SnapshotInfo.f247277p);
            }
        }
    }

    /* renamed from: X */
    public void mo114332X(JSONObject jSONObject) {
        new C88275h1().mo114862a(jSONObject);
    }

    /* renamed from: c */
    public void mo122653c() {
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (AppServiceSkylineExtensionImpl) mo125517G0(AppServiceSkylineExtensionImpl.class);
        if (appServiceSkylineExtensionImpl != null) {
            int i = C81207z0.f238545a;
            Log.m105924i("MicroMsg.MMSkylineBootGuard", "<clinit>");
            appServiceSkylineExtensionImpl.mo111458h(this, true);
        }
    }

    public C81415h0 getFileSystem() {
        if (isRunning()) {
            return super.getFileSystem();
        }
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        return C79553f.C79554a.f233290a;
    }

    /* renamed from: h0 */
    public C83788e0 mo114337h0() {
        return new e$$c(this);
    }

    /* renamed from: i0 */
    public C84073q2 mo114338i0() {
        return new e$$b(this, this);
    }

    /* renamed from: k0 */
    public final JSONObject mo114340k0() {
        JSONObject jSONObject = this.f255134T;
        if (jSONObject != null) {
            return C87689c.m109088a(jSONObject);
        }
        JSONObject k0 = super.mo114340k0();
        if (getRuntime().mo113008F().f239613s.booleanValue()) {
            this.f255134T = C87689c.m109088a(k0);
        }
        return k0;
    }

    /* renamed from: x0 */
    public void mo114095x0() {
        QualitySessionRuntime c = C84185b.m103770c(getAppId(), true);
        if (c != null) {
            c.f245847H = Util.nowMilliSecond();
        }
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        this.f241595t = new C88270f(this);
        this.f255130P = false;
        super.mo114095x0();
    }

    /* renamed from: z0 */
    public void mo114096z0(AppBrandRuntime appBrandRuntime) {
        FlutterLoader flutterLoader;
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) appBrandRuntime;
        this.f255128M = appBrandRuntimeWC;
        if (mo114272k() == null) {
            mo114269d0(appBrandRuntimeWC.mo113184O1(false));
        }
        mo114842M();
        super.mo114096z0(appBrandRuntime);
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (AppServiceSkylineExtensionImpl) mo125517G0(AppServiceSkylineExtensionImpl.class);
        if (appServiceSkylineExtensionImpl != null) {
            e$$a e__a = new e$$a(this, appServiceSkylineExtensionImpl);
            synchronized (appServiceSkylineExtensionImpl) {
                SkylineRuntime skylineRuntime = appServiceSkylineExtensionImpl.f235027d;
                if (skylineRuntime == null) {
                    appServiceSkylineExtensionImpl.f235025b.add(e__a);
                } else {
                    skylineRuntime.waitForBootstrap(new C88432a(e__a));
                }
            }
        }
        AppBrandRuntimeWC appBrandRuntimeWC2 = this.f255128M;
        if (C88468w.m110319a(appBrandRuntimeWC2, appBrandRuntimeWC2.mo113030T()) && (flutterLoader = FlutterInjector.instance().flutterLoader()) != null && flutterLoader.initialized()) {
            Log.m105924i("MicroMsg.AppBrandServiceWC", "onRuntimeReady requireWARenderContext");
            mo122653c();
        }
    }

    public C88267e(boolean z) {
        this((Class<? extends C91640i<? extends C91635f>>) C88256b.class);
        this.f255131Q = z;
    }

    public C88267e(C90629b bVar) {
        super(bVar);
        boolean z = false;
        this.f255130P = false;
        this.f255131Q = false;
        this.f241593r = (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) ? true : z;
        mo114850V(C90928k.C90938h.class, new C36679r());
        mo114850V(C90915h.class, new C36678q());
        mo114850V(C79490b.C79500i.class, new C1612e0());
        mo114850V(C82078d.C82079a.class, new C82080e());
        this.f255134T = null;
        this.f255135U = new C86127t();
    }

    public C88267e(Class<? extends C91640i<? extends C91635f>> cls) {
        super(cls);
        boolean z = false;
        this.f255130P = false;
        this.f255131Q = false;
        this.f241593r = (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) ? true : z;
        mo114850V(C90928k.C90938h.class, new C36679r());
        mo114850V(C90915h.class, new C36678q());
        mo114850V(C79490b.C79500i.class, new C1612e0());
        mo114850V(C82078d.C82079a.class, new C82080e());
        this.f255134T = null;
        this.f255135U = new C86127t();
    }
}
