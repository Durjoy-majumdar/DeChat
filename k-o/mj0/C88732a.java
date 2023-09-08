package mj0;

import ai0.C79553f;
import android.graphics.Rect;
import android.util.Base64;
import bq0.C79766e;
import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJniParams;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.libwxaudio.WxAudioNative;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83146c;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83173l0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83179p;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83188y;
import com.tencent.p014mm.plugin.appbrand.report.C84104b;
import com.tencent.p014mm.plugin.appbrand.report.C84107c;
import com.tencent.p014mm.plugin.appbrand.report.C84108d;
import com.tencent.p014mm.plugin.appbrand.report.C84136m;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84228v;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84237z;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.plugin.appbrand.utils.C2049t;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84835c0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import ea2.C86468a;
import h81.C32735h;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import js0.C88020k;
import kr0.C88267e;
import kr0.C88277k1;
import kr0.C88284n1;
import nj0.C88982v;
import org.json.JSONException;
import org.json.JSONObject;
import p1006mb.C88720a;
import p170ic.C87690d;
import p284zb.C91635f;
import p760ya.C91383b;
import p927ab.C79479d;
import p928ac.C79490b;
import p958eb.C86470a;
import p958eb.C86479j;
import p958eb.a$$i;
import pj0.C89363h;
import qe3.C89625d;
import rx3.C13601g;
import rx3.C36570n;
import u40.C90605b;
import u40.C90609h;
import zt3.C119157j;

/* renamed from: mj0.a */
public class C88732a extends C86470a<C88267e> implements C88733c {

    /* renamed from: A */
    public C79766e f256104A = null;

    /* renamed from: B */
    public C84108d f256105B = new C84108d();

    /* renamed from: C */
    public C79479d f256106C;

    /* renamed from: D */
    public ICommLibReader f256107D = null;

    /* renamed from: E */
    public WxaPkgV8SnapshotInfo f256108E = null;

    /* renamed from: F */
    public boolean f256109F = false;

    /* renamed from: G */
    public boolean f256110G = false;

    /* renamed from: H */
    public long f256111H = -1;

    /* renamed from: z */
    public final C88277k1 f256112z = new C88277k1((C81925i2) mo124764Z());

    public C88732a(C88267e eVar) {
        super(eVar);
    }

    /* renamed from: A0 */
    public void mo120895A0() {
        super.mo120895A0();
        C79766e eVar = this.f256104A;
        if (eVar != null) {
            eVar.mo120816d();
        }
        C79479d dVar = this.f256106C;
        if (dVar != null) {
            dVar.f233034c.removeDecodeEventListener(dVar);
            Log.m105925i("MicroMsg.MBImageDecodeRegistry", "MBImageDecodeRegistry unregister appid:%s,game:%b", dVar.f233035d, Boolean.valueOf(dVar.f233032a));
        }
    }

    /* renamed from: B */
    public C84108d mo123163B() {
        return this.f256105B;
    }

    /* renamed from: B0 */
    public void mo120896B0() {
        super.mo120896B0();
        this.f256112z.mo122657g();
        if (!this.f256110G) {
            this.f256110G = true;
            C84185b.f245912a.mo116893l(((C88267e) mo124764Z()).mo114335b0() ? C84343y.WAGAME : null, ((C88267e) mo124764Z()).getAppId(), this.f256111H, C84136m.MMV8);
        }
    }

    /* renamed from: C0 */
    public void mo120897C0(JSONObject jSONObject) {
        super.mo120897C0(jSONObject);
        ((C88267e) mo124764Z()).mo114881c0(jSONObject, "statusBarHeight", Integer.valueOf(C88720a.m110688a((C91635f) mo124764Z())));
        HashMap hashMap = new HashMap(6);
        int[] a = C84752i2.m104413a((C82554k) mo124764Z());
        int i = a[0];
        int i2 = a[1];
        Rect safeAreaInsets = ((C88267e) mo124764Z()).f240292z.getSafeAreaInsets();
        if (safeAreaInsets != null) {
            int f = C88020k.m109555f(safeAreaInsets.left);
            int f2 = C88020k.m109555f(safeAreaInsets.top);
            int f3 = C88020k.m109555f(Math.min(safeAreaInsets.right, i));
            int f4 = C88020k.m109555f(Math.min(safeAreaInsets.bottom, i2));
            hashMap.put("left", Integer.valueOf(f));
            hashMap.put("top", Integer.valueOf(f2));
            hashMap.put("right", Integer.valueOf(f3));
            hashMap.put("bottom", Integer.valueOf(f4));
            hashMap.put("width", Integer.valueOf(f3 - f));
            hashMap.put("height", Integer.valueOf(f4 - f2));
            ((C88267e) mo124764Z()).mo114881c0(jSONObject, "safeArea", hashMap);
        }
    }

    /* renamed from: D0 */
    public void mo120898D0(AppBrandRuntime appBrandRuntime) {
        super.mo120898D0(appBrandRuntime);
        Log.m105924i("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: wc post runtime ready");
        C84108d dVar = this.f256105B;
        dVar.f245575g.post(new C84104b(dVar, appBrandRuntime, new a$$i(this)));
        mo125519F0(new a$$j(this));
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

    /* renamed from: H0 */
    public final boolean mo122606H0(String str, String str2, int i) {
        if (mo124764Z() == null || !((C88267e) mo124764Z()).f255130P || !((HashSet) C79553f.f233289b).contains(str)) {
            return false;
        }
        ((C88267e) mo124764Z()).mo114339j0(str, str2);
        return true;
    }

    /* renamed from: I0 */
    public synchronized boolean mo122607I0() {
        C90609h.f260328a = new a$$e(this);
        C90605b.f260327a = new a$$c();
        return super.mo122607I0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r1 = r1.getRuntime();
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013a  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i mo120899J0(java.lang.String r9, byte[] r10) {
        /*
            r8 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r8.mo124764Z()
            kr0.e r1 = (kr0.C88267e) r1
            java.util.Objects.requireNonNull(r1)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r1.mo114272k()
            java.util.Objects.requireNonNull(r1)
            r8.f256107D = r1
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r8.mo124764Z()
            kr0.e r1 = (kr0.C88267e) r1
            r2 = 0
            if (r1 != 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r1.getRuntime()
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            r1 = 0
            goto L_0x002a
        L_0x0026:
            boolean r1 = r1.mo113215r1()
        L_0x002a:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r4[r2] = r5
            java.lang.String r5 = "MicroMsg.AppBrandGameServiceLogicImpWC"
            java.lang.String r6 = "canUseCommLibSnapshot, isWeAppDevToolsRemoteDebug: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            r1 = r1 ^ r3
            r4 = 0
            if (r1 == 0) goto L_0x0057
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r8.f256107D
            com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r6 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84872v0.GAME
            java.lang.String r7 = "reader"
            gy3.C87412m.m108594g(r1, r7)
            java.lang.Class<com.tencent.mm.plugin.appbrand.v8_snapshot.u> r7 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84867u.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            com.tencent.mm.plugin.appbrand.v8_snapshot.u r7 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84867u) r7
            if (r7 == 0) goto L_0x0057
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r1 = r7.mo117543KI(r1, r6)
            goto L_0x0058
        L_0x0057:
            r1 = r4
        L_0x0058:
            if (r1 == 0) goto L_0x006d
            r8.f256108E = r1
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r4 = r8.f256107D
            boolean r4 = r1.mo117553d(r4)
            r8.f256109F = r4
            java.lang.String r4 = r1.f247273i
            int r6 = r1.mo117552c()
            boolean r1 = r1.f247278q
            goto L_0x0070
        L_0x006d:
            int r6 = com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX
            r1 = 0
        L_0x0070:
            com.tencent.mm.appbrand.v8.IJSRuntime$Config r7 = new com.tencent.mm.appbrand.v8.IJSRuntime$Config
            r7.<init>()
            r7.f235973a = r9
            r7.f235974b = r4
            r7.f235975c = r1
            r7.f235976d = r10
            r7.f235977e = r6
            nj0.i r9 = nj0.C88969i.f256559c
            java.lang.Object r9 = r9.mo123353e()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r2] = r9
            java.lang.String r1 = "hy: use native buffer type: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r10)
            r7.f235978f = r9
            di3.d r9 = di3.C86312j.m106911c(r0)
            h81.h r9 = (h81.C32735h) r9
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_android_appbrand_jsbridge_function_direct_evaluate
            boolean r9 = r9.mo58784wf(r10, r3)
            r7.f235979g = r9
            nj0.s r9 = nj0.C88979s.f256571c
            java.lang.Object r9 = r9.mo123353e()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r7.f235981i = r9
            nj0.p r9 = nj0.C88976p.f256568c
            java.lang.Object r9 = r9.mo123353e()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r9 = r9 ^ r3
            r7.f235982j = r9
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            com.tencent.mm.plugin.appbrand.jsapi.f r10 = r8.mo124764Z()
            com.tencent.mm.plugin.appbrand.jsapi.g r10 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82510g) r10
            r9.<init>(r10)
            r7.f235986n = r9
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r9 = r8.f256107D
            java.lang.String r10 = "delayedServiceCodeCache"
            java.lang.String r9 = r9.Yk0(r10)
            boolean r9 = java.lang.Boolean.parseBoolean(r9)
            if (r9 == 0) goto L_0x00e8
            di3.d r9 = di3.C86312j.m106911c(r0)
            h81.h r9 = (h81.C32735h) r9
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_appbrand_common_lib_code_cache_delay
            boolean r9 = r9.mo58784wf(r10, r3)
            if (r9 == 0) goto L_0x00e8
            r9 = 1
            goto L_0x00e9
        L_0x00e8:
            r9 = 0
        L_0x00e9:
            r7.f235985m = r9
            boolean r9 = r8.f256109F
            r9 = r9 ^ r3
            r7.f235988p = r9
            mj0.a$$g r9 = new mj0.a$$g
            r9.<init>(r8, r4)
            r7.f235989q = r9
            boolean r9 = r8.mo123165c1()
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r10[r2] = r0
            java.lang.String r0 = r7.toString()
            r10[r3] = r0
            java.lang.String r0 = "hy: should use node: %b, config is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r10)
            if (r9 == 0) goto L_0x0117
            com.tencent.mm.plugin.appbrand.jsruntime.y r9 = new com.tencent.mm.plugin.appbrand.jsruntime.y
            r9.<init>(r7)
            goto L_0x011c
        L_0x0117:
            com.tencent.mm.plugin.appbrand.jsruntime.b r9 = new com.tencent.mm.plugin.appbrand.jsruntime.b
            r9.<init>(r7)
        L_0x011c:
            boolean r10 = r9 instanceof com.tencent.p014mm.plugin.appbrand.jsruntime.C83188y
            if (r10 == 0) goto L_0x0130
            bq0.e r10 = new bq0.e
            r10.<init>()
            r8.f256104A = r10
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r8.mo124764Z()
            com.tencent.mm.plugin.appbrand.i2 r0 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r0
            r10.mo120817e(r0, r9)
        L_0x0130:
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.q> r10 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r10 = r9.mo63321n0(r10)
            com.tencent.mm.plugin.appbrand.jsruntime.q r10 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q) r10
            if (r10 == 0) goto L_0x0162
            java.lang.String r0 = "tracejstask"
            nj0.k r0 = nj0.C88971k.m111126i(r0)
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dl: Trace Task Name in JSThread: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            r10.mo115411g(r0)
        L_0x0162:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mj0.C88732a.mo120899J0(java.lang.String, byte[]):com.tencent.mm.plugin.appbrand.jsruntime.i");
    }

    /* renamed from: L0 */
    public C91383b mo120901L0(boolean z, boolean z2, int i, boolean z3) {
        return new a$$l(this, ((C88267e) mo124764Z()).getContext(), ((C88267e) mo124764Z()).getJsRuntime(), z, z2, i, z3);
    }

    /* renamed from: N0 */
    public a$$i mo120903N0() {
        Log.m105925i("MicroMsg.AppBrandGameServiceLogicImpWC", "fetchLibBootstrap, mainContextIsSnapshot: %b", Boolean.valueOf(this.f256109F));
        if (!this.f256109F) {
            return super.mo120903N0();
        }
        mo123164b1(new a$$a(C84835c0.f247296d));
        C84868u0 u0Var = C84868u0.f247366a;
        ICommLibReader iCommLibReader = this.f256107D;
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f256108E;
        Objects.requireNonNull(wxaPkgV8SnapshotInfo);
        u0Var.mo117613j(iCommLibReader, wxaPkgV8SnapshotInfo);
        a$$i a__i = new a$$i();
        a__i.f251294a = "WAGameReady.js";
        a__i.f251295b = ";WeixinSnapshot.snapshotContextReady();";
        return a__i;
    }

    /* renamed from: O0 */
    public int mo120904O0() {
        int i;
        if (MMApplicationContext.getToolsProcesstPreference() != null && (i = MMApplicationContext.getToolsProcesstPreference().getInt("appbrandgame_cmd_pool_type", -1)) != -1) {
            return i;
        }
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            return 1;
        }
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_game_cmd_pool_type, 1);
    }

    /* renamed from: P0 */
    public String mo120905P0() {
        if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_mmv8_disable_codecache, false)) {
            return C29552h0.m38798a();
        }
        return null;
    }

    /* renamed from: Q0 */
    public String mo120906Q0() {
        String Q0 = super.mo120906Q0();
        if (this.f256104A == null) {
            return Q0;
        }
        return Q0 + this.f256104A.mo120815a();
    }

    /* renamed from: R0 */
    public C86479j mo120907R0(C91635f fVar, C83185u uVar) {
        return new C88735g((C88267e) fVar, uVar);
    }

    /* renamed from: S0 */
    public int mo120908S0() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    /* renamed from: T0 */
    public void mo120909T0(boolean z, String str, C80669j.C80676g gVar) {
        if (this.f256109F) {
            mo123164b1(new a$$b(C84835c0.f247296d));
            C84868u0 u0Var = C84868u0.f247366a;
            ICommLibReader iCommLibReader = this.f256107D;
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f256108E;
            Objects.requireNonNull(wxaPkgV8SnapshotInfo);
            u0Var.mo117612i(iCommLibReader, wxaPkgV8SnapshotInfo, z, gVar, (C91635f) mo124764Z());
            C13601g gVar2 = C2049t.f11994a;
            if (((Boolean) ((C36570n) C2049t.f11995b).getValue()).booleanValue()) {
                mo125525t0();
                return;
            }
            return;
        }
        C84868u0.f247366a.mo117611h(this.f256107D, str, z, gVar, (C91635f) mo124764Z());
    }

    /* renamed from: U0 */
    public void mo120911U0(String str, String str2) {
        try {
            C84228v vVar = ((AppBrandRuntimeWC) mo125523j0()).f238272H1;
            vVar.f246040c = str + "\n" + str2;
        } catch (NullPointerException unused) {
        }
        if (this.f256109F) {
            C84868u0.f247366a.mo117621r(this.f256107D, "game:main", str, str2);
        }
    }

    /* renamed from: V0 */
    public void mo120912V0(int i) {
        QualitySessionRuntime c = C84185b.m103770c(((C88267e) mo124764Z()).getAppId(), true);
        if (c != null) {
            c.f245841B.f246066a = C84237z.C84238a.values()[i];
        }
    }

    /* renamed from: W0 */
    public void mo120913W0() {
        new C89363h().mo109479b();
    }

    /* renamed from: Y0 */
    public boolean mo120915Y0() {
        Boolean bool;
        int i;
        Class cls = C32735h.class;
        if (MMApplicationContext.getToolsProcesstPreference() != null && (i = MMApplicationContext.getToolsProcesstPreference().getInt("appbrandgame_use_commandbuffer", -1)) != -1) {
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(i != 0);
            Log.m105925i("MicroMsg.AppBrandGameServiceLogicImpWC", "command buffer enabled %b by cmd", objArr);
            return i != 0;
        } else if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_appbrand_game_disable_commandbuffer, false)) {
            Log.m105924i("MicroMsg.AppBrandGameServiceLogicImpWC", "command buffer enabled false by abtest");
            return false;
        } else {
            if (!(mo124764Z() == null || ((C88267e) mo124764Z()).getRuntime() == null)) {
                C81634a F = ((C88267e) mo124764Z()).getRuntime().mo113008F();
                if (!(((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_magicbrush_cmdbuffer_ignore_appconfig, 1) != 0 || F == null || (bool = F.f239612r) == null)) {
                    Log.m105925i("MicroMsg.AppBrandGameServiceLogicImpWC", "command buffer enabled %b by app.config", bool);
                    return F.f239612r.booleanValue();
                }
            }
            return true;
        }
    }

    /* renamed from: Z0 */
    public boolean mo120916Z0() {
        return !((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_appbrand_game_disable_gfx, false);
    }

    /* renamed from: a1 */
    public boolean mo120917a1() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_appbrand_game_revert_cpu_optimizer_test, false);
    }

    /* renamed from: b1 */
    public final void mo123164b1(a$$k a__k) {
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo;
        C88267e eVar = (C88267e) mo124764Z();
        if (eVar != null) {
            if (!(C84217q.PreloadOnProcessCreated == eVar.f262594I) && (wxaPkgV8SnapshotInfo = this.f256108E) != null) {
                ((C119157j) C119157j.f356862d).mo183885p(new a$$d(a__k, wxaPkgV8SnapshotInfo), "WxaCommLibV8SnapshotClient#flushSnapshotInfo");
            }
        }
    }

    /* renamed from: c0 */
    public void mo122621c0(JSONObject jSONObject) {
        try {
            jSONObject.put(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, C89625d.f257841g);
            C83165i jsRuntime = ((C88267e) mo124764Z()).getJsRuntime();
            jSONObject.put("JSEngineName", jsRuntime instanceof C83146c ? "J2V8-Package" : jsRuntime instanceof C83188y ? "NodeJS" : "unknown");
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandGameServiceLogicImpWC", e, "attachCommonConfig error", new Object[0]);
        }
    }

    /* renamed from: c1 */
    public final boolean mo123165c1() {
        boolean booleanValue = ((Boolean) C88982v.f256574c.mo123353e()).booleanValue();
        Log.m105925i("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: isUseNodeFromConfig: %b", Boolean.valueOf(booleanValue));
        return booleanValue;
    }

    /* renamed from: d0 */
    public void mo120918d0() {
        super.mo120918d0();
        C84108d dVar = this.f256105B;
        dVar.f245575g.post(new C84107c(dVar));
        this.f256112z.mo122658h();
    }

    /* renamed from: e0 */
    public C83165i mo120919e0() {
        this.f256111H = System.currentTimeMillis();
        C83165i e0 = super.mo120919e0();
        this.f256112z.mo122656f(e0);
        C83179p pVar = (C83179p) e0.mo63321n0(C83179p.class);
        if (pVar != null) {
            this.f256110G = true;
            pVar.mo115374E0(new a$$f(this, ((C88267e) mo124764Z()).mo114335b0(), ((C88267e) mo124764Z()).getAppId()));
        }
        return e0;
    }

    /* renamed from: i0 */
    public String mo123166i0(String str) {
        if (!mo123167q0()) {
            return "";
        }
        AppBrandRuntimeWC N0 = ((C88267e) mo124764Z()).getRuntime();
        if (!N0.mo113215r1()) {
            return "";
        }
        String l = C81247g3.m99556l(N0, str + ".map");
        if (Util.isNullOrNil(l)) {
            return "";
        }
        try {
            return String.format("\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,%s", new Object[]{new String(Base64.encode(l.getBytes(), 2), "utf-8")});
        } catch (UnsupportedEncodingException e) {
            Log.m105921e("MicroMsg.RemoteDebugUtil", "execGameExternalScript Base64.encode %s", e.getMessage());
            return "";
        }
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
            Log.m105925i("MicroMsg.AppBrandGameServiceLogicImpWC", "wasm opt set to %d by abtest", Integer.valueOf(Qe));
            return Qe;
        }
        Log.m105925i("MicroMsg.AppBrandGameServiceLogicImpWC", "wasm opt set to %d by cmd", Integer.valueOf(i));
        return i;
    }

    /* renamed from: o0 */
    public boolean mo122628o0() {
        return C88284n1.f255194a;
    }

    /* renamed from: p */
    public final Map<String, C82870p> mo114097p() {
        return (Map) C87690d.m109090a("AppBrandGameServiceLogicImpWC.onCreateJsApiPool()", new a$$h(this));
    }

    /* renamed from: p0 */
    public boolean mo122629p0() {
        if (this.f256109F) {
            return false;
        }
        return super.mo122629p0();
    }

    /* renamed from: q0 */
    public boolean mo123167q0() {
        return ((C88267e) mo124764Z()).getRuntime() != null && ((C88267e) mo124764Z()).getRuntime().mo113215r1();
    }

    /* renamed from: w0 */
    public void mo122630w0(String str) {
        this.f256112z.mo122655e(str);
    }

    /* renamed from: z */
    public void mo123168z(C86468a aVar) {
        Log.m105925i("MicroMsg.AppBrandGameServiceLogicImpWC", "setWxAudioOutputListener %s", aVar);
        if (aVar != null) {
            C79490b bVar = this.f251275w;
            bVar.f233055f = aVar;
            if (!bVar.f233052c) {
                Log.m105920e("Luggage.WxAudioNativeInstallHelper", "listenLifeCycle now is not support webaudio");
            } else if (!bVar.f233053d) {
                Log.m105920e("Luggage.WxAudioNativeInstallHelper", "listenLifeCycle so load fail ");
            } else {
                WxAudioNative wxAudioNative = bVar.f233050a;
                if (wxAudioNative != null) {
                    wxAudioNative.registerAudioPcmCallback(bVar.f233058i);
                }
                bVar.f233054e = false;
            }
        } else {
            this.f251275w.mo109492e();
        }
    }

    /* renamed from: z0 */
    public void mo120926z0() {
        super.mo120926z0();
        Log.m105924i("MicroMsg.AppBrandGameServiceLogicImpWC", "virl: runtime resume");
    }
}
