package p958eb;

import android.webkit.ValueCallback;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.magicbrush.C80301a;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83716o4;
import com.tencent.p014mm.plugin.appbrand.debugger.C81695a0;
import com.tencent.p014mm.plugin.appbrand.debugger.C81738h0;
import com.tencent.p014mm.plugin.appbrand.debugger.C81743t;
import com.tencent.p014mm.plugin.appbrand.debugger.C81745v;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83144b;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83172l;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84574p4;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.plugin.appbrand.utils.C84768n1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import hr0.C87583a;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import js0.C88016e;
import oa1.C117731d;
import org.json.JSONObject;
import p1058wb.C90907c;
import p1058wb.C90909d;
import p1058wb.C90910e;
import p1058wb.C90911f;
import p1058wb.C90912g;
import p1058wb.C90915h;
import p1058wb.C90916i;
import p1058wb.C90922j;
import p1058wb.C90928k;
import p224ra.C89909e;
import p284zb.C91635f;
import p284zb.C91640i;
import p284zb.C91654r;
import p760ya.C91383b;
import p927ab.C79485g;
import p928ac.C79490b;
import p935cb.C79980i;
import p999lb.C88392a;
import t10.C36935a;
import te3.ow4;

/* renamed from: eb.a */
public class C86470a<Service extends C91635f> extends C91640i<Service> implements C86474e {

    /* renamed from: h */
    public volatile boolean f251263h = false;

    /* renamed from: i */
    public boolean f251264i = false;

    /* renamed from: j */
    public C81745v f251265j = null;

    /* renamed from: n */
    public C91654r f251266n;

    /* renamed from: o */
    public boolean f251267o = false;

    /* renamed from: p */
    public C81743t f251268p = null;

    /* renamed from: q */
    public boolean f251269q = false;

    /* renamed from: r */
    public C91383b f251270r = null;

    /* renamed from: s */
    public C90922j f251271s;

    /* renamed from: t */
    public C90916i f251272t;

    /* renamed from: u */
    public C90912g f251273u;

    /* renamed from: v */
    public C90928k f251274v;

    /* renamed from: w */
    public C79490b f251275w;

    /* renamed from: x */
    public C79980i f251276x = null;

    /* renamed from: y */
    public CronetLogic.CronetTaskNetworkStateCallback f251277y = null;

    public C86470a(Service service) {
        super(service);
        mo124765a0(C86474e.class, this);
        mo120913W0();
    }

    /* renamed from: A */
    public C79980i mo120894A() {
        if (this.f251276x == null) {
            synchronized (this) {
                if (this.f251276x == null) {
                    this.f251276x = new C79980i();
                }
            }
        }
        return this.f251276x;
    }

    /* renamed from: A0 */
    public void mo120895A0() {
        super.mo120895A0();
        C91383b bVar = this.f251270r;
        if (bVar != null) {
            Log.m105924i("MicroMsg.MagicBrush", "awaitDestroyDone");
            if (!bVar.f262087e.mo125235a(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) && BuildInfo.DEBUG) {
                throw new IllegalStateException("WAGame destroy timeout");
            }
        }
        C81745v vVar = this.f251265j;
        if (vVar != null) {
            vVar.f239914h.mo114050f();
            C81695a0 a0Var = vVar.f239914h;
            a0Var.getClass();
            Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "onClose");
            Future<?> future = a0Var.f239786j;
            if (future != null) {
                future.cancel(false);
            }
        }
    }

    /* renamed from: B0 */
    public void mo120896B0() {
        super.mo120896B0();
        C90922j jVar = new C90922j();
        this.f251271s = jVar;
        jVar.mo125003a(((C91635f) mo124764Z()).getJsRuntime(), mo124764Z());
        C90916i iVar = new C90916i();
        this.f251272t = iVar;
        iVar.mo124998a(((C91635f) mo124764Z()).getJsRuntime(), mo124764Z());
        C90912g gVar = new C90912g();
        this.f251273u = gVar;
        C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
        C82381f Z = mo124764Z();
        Log.m105924i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding");
        if (jsRuntime == null) {
            Log.m105920e("Luggage.LockStepNativeInstallHelper", "createLockStepBinding jsruntime is null");
        } else {
            gVar.f260908b = String.valueOf(1004);
            C36935a.f97989a.loadLibrary("mmlockstep");
            C83181q qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class);
            if (qVar == null) {
                Log.m105920e("Luggage.LockStepNativeInstallHelper", "createLockStepBinding jsThreadHandler is null");
            } else {
                C90915h hVar = (C90915h) Z.mo109668l(C90915h.class);
                if (hVar != null) {
                    boolean Wv = hVar.mo60802Wv();
                    gVar.f260909c = Wv;
                    Log.m105925i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding xLibUVSwitch:%b ", Boolean.valueOf(Wv));
                }
                qVar.post(new C90910e(gVar, jsRuntime, new C90907c(gVar, new WeakReference(qVar)), new C90909d(gVar)));
            }
        }
        C90928k kVar = new C90928k();
        this.f251274v = kVar;
        kVar.mo125008a(((C91635f) mo124764Z()).getJsRuntime(), mo124764Z(), 1);
        C79490b bVar = new C79490b();
        this.f251275w = bVar;
        bVar.mo109489a(((C91635f) mo124764Z()).getJsRuntime(), mo124764Z());
        if (mo125523j0() != null && mo125523j0().mo113215r1()) {
            Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "add MPRemoteDebugJSContextInterface");
            C83165i jsRuntime2 = ((C91635f) mo124764Z()).getJsRuntime();
            C91654r rVar = new C91654r((C91635f) mo124764Z());
            this.f251266n = rVar;
            jsRuntime2.addJavascriptInterface(rVar, "DebuggerConnection");
            C81745v vVar = this.f251265j;
            if (vVar != null) {
                this.f251266n.f262633a = vVar;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c2  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo120897C0(org.json.JSONObject r14) {
        /*
            r13 = this;
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r13.mo124764Z()
            zb.f r0 = (p284zb.C91635f) r0
            fc.g r0 = r0.getRuntime()
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r0 = r0.mo113051d0()
            java.lang.String r1 = "wxAppInfo"
            org.json.JSONObject r2 = r14.optJSONObject(r1)
            if (r2 != 0) goto L_0x001c
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L_0x001c:
            r3 = 0
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x003f }
            r4.<init>()     // Catch:{ Exception -> 0x003f }
            r5 = 0
        L_0x0023:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r6 = r0.f234876S0     // Catch:{ Exception -> 0x003f }
            java.lang.String[] r6 = r6.f239283F     // Catch:{ Exception -> 0x003f }
            int r7 = r6.length     // Catch:{ Exception -> 0x003f }
            if (r5 >= r7) goto L_0x0032
            r6 = r6[r5]     // Catch:{ Exception -> 0x003f }
            r4.put(r6)     // Catch:{ Exception -> 0x003f }
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0032:
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r13.mo124764Z()     // Catch:{ Exception -> 0x003f }
            zb.f r0 = (p284zb.C91635f) r0     // Catch:{ Exception -> 0x003f }
            java.lang.String r5 = "subContextImgDomain"
            r0.mo114881c0(r2, r5, r4)     // Catch:{ Exception -> 0x003f }
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r13.mo124764Z()
            zb.f r0 = (p284zb.C91635f) r0
            r0.mo114881c0(r14, r1, r2)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.tencent.magicbrush.a r2 = r13.mo120910U()
            od.n r2 = r2.f235093i
            int r2 = r2.mo123515c()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            com.tencent.magicbrush.a r2 = r13.mo120910U()
            od.n r2 = r2.f235093i
            int r2 = r2.mo123514b()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "Luggage.AppBrandGameServiceLogicImp"
            java.lang.String r5 = "dm.widthPixels %d, dm.heightPixels %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r13.mo124764Z()
            zb.f r1 = (p284zb.C91635f) r1
            fc.g r1 = r1.getRuntime()
            br0.c r5 = r1.mo113054f0()
            boolean r5 = r5 instanceof cr0.C86127t
            if (r5 == 0) goto L_0x00bf
            int[] r0 = new int[r0]
            r0 = {0, 1} // fill-array
            br0.c r5 = r1.mo113054f0()
            cr0.t r5 = (cr0.C86127t) r5
            android.content.Context r5 = r5.f250648d
            java.lang.Class<android.view.WindowManager> r6 = android.view.WindowManager.class
            java.lang.Object r5 = p385u2.C111105a.m151502d(r5, r6)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getRotation()
            boolean r0 = u24.C90595a.m113497a(r0, r5)
            com.tencent.mm.plugin.appbrand.config.a r1 = r1.mo113008F()
            com.tencent.mm.plugin.appbrand.config.a$b r1 = r1.f239611q
            java.lang.String r1 = r1.f239621a
            br0.e$b r1 = br0.C79778e.C79780b.m96933b(r1)
            br0.e$b r5 = br0.C79778e.C79780b.PORTRAIT
            if (r1 != r5) goto L_0x00b9
            r1 = 1
            goto L_0x00ba
        L_0x00b9:
            r1 = 0
        L_0x00ba:
            if (r0 != r1) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r0 = 0
            goto L_0x00c0
        L_0x00bf:
            r0 = 1
        L_0x00c0:
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "hy: orientation judge failed! maybe because onConfigurationChange judgement and surface degree judgement not match"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            java.lang.Class<hr0.a> r0 = hr0.C87583a.class
            ra.d r0 = p224ra.C89909e.m112439d(r0, r4)
            r5 = r0
            hr0.a r5 = (hr0.C87583a) r5
            r6 = 808(0x328, double:3.99E-321)
            r8 = 4
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            java.lang.Class<hr0.b> r0 = hr0.C87584b.class
            ra.d r0 = p224ra.C89909e.m112439d(r0, r4)
            hr0.b r0 = (hr0.C87584b) r0
            r1 = 18284(0x476c, float:2.5621E-41)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r0.mo121691h(r1, r2)
        L_0x00ef:
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r13.mo124764Z()
            zb.f r0 = (p284zb.C91635f) r0
            com.tencent.magicbrush.a r1 = r13.mo120910U()
            od.n r1 = r1.f235093i
            int r1 = r1.mo123515c()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "screenWidth"
            r0.mo114881c0(r14, r2, r1)
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r13.mo124764Z()
            zb.f r0 = (p284zb.C91635f) r0
            com.tencent.magicbrush.a r1 = r13.mo120910U()
            od.n r1 = r1.f235093i
            int r1 = r1.mo123514b()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "screenHeight"
            r0.mo114881c0(r14, r2, r1)
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r13.mo124764Z()
            zb.f r0 = (p284zb.C91635f) r0
            com.tencent.magicbrush.a r1 = r13.mo120910U()
            od.n r1 = r1.f235093i
            float r1 = r1.mo123516d()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "devicePixelRatio"
            r0.mo114881c0(r14, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p958eb.C86470a.mo120897C0(org.json.JSONObject):void");
    }

    /* renamed from: D0 */
    public void mo120898D0(AppBrandRuntime appBrandRuntime) {
        super.mo120898D0(appBrandRuntime);
        mo120900K0();
        C91383b bVar = this.f251270r;
        if (bVar != null) {
            bVar.getClass();
            C87412m.m108594g(appBrandRuntime, "runtime");
            bVar.mo123173b(appBrandRuntime);
        }
        C90928k kVar = this.f251274v;
        if (kVar != null) {
            kVar.mo125010c(((C91635f) mo124764Z()).getJsRuntime(), (C82554k) mo124764Z());
        }
        C90912g gVar = this.f251273u;
        if (gVar != null) {
            C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
            C82381f Z = mo124764Z();
            gVar.getClass();
            Log.m105924i("Luggage.LockStepNativeInstallHelper", "initConfigLockStep");
            if (jsRuntime == null) {
                Log.m105920e("Luggage.LockStepNativeInstallHelper", "initConfigLockStep jsruntime is null");
            } else {
                C83181q qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class);
                if (qVar == null) {
                    Log.m105920e("Luggage.LockStepNativeInstallHelper", "initConfigLockStep jsThreadHandler is null");
                } else {
                    qVar.post(new C90911f(gVar, Z));
                }
            }
        }
        mo120914X0();
        appBrandRuntime.mo113014I0(C84574p4.class, new C88392a(appBrandRuntime));
        mo120910U().f235096l.addSurfaceListenerForAllViews(new a$$d(this));
        this.f251275w.mo109491c(mo124764Z());
        a$$e a__e = new a$$e(this);
        this.f251277y = a__e;
        CronetLogic.addCronetTaskNetworkStateCallback(a__e);
        CronetLogic.setGoodNetNotifyInterval(C117731d.m166007c().mo182443e("clicfg_android_cronet_weak_net_notify_interval", 5000, true, true));
    }

    /* renamed from: I */
    public void mo114091I(String str) {
        Log.m105919d("Luggage.AppBrandGameServiceLogicImp", "RemoteDebugInfo %s", str);
        ow4 ow4 = new ow4();
        ow4.f184718e = ((C91635f) mo124764Z()).mo114341l0().getComponentId();
        ow4.f184717d = str;
        this.f251265j.f239914h.mo114052h(C81738h0.m100298d(ow4, this.f251268p, "domEvent"));
    }

    /* renamed from: J0 */
    public C83165i mo120899J0(String str, byte[] bArr) {
        IJSRuntime.Config config = new IJSRuntime.Config(str, bArr);
        config.f235979g = true;
        config.f235978f = "1";
        config.f235981i = true;
        config.f235986n = new WeakReference<>((C82510g) mo124764Z());
        return new C83144b(config);
    }

    /* renamed from: K0 */
    public final void mo120900K0() {
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f251270r != null);
        Log.m105925i("Luggage.AppBrandGameServiceLogicImp", "setup magicbrush. loaded?[%b]", objArr);
        if (this.f251270r != null) {
            Boolean valueOf = Boolean.valueOf(mo120915Y0());
            boolean booleanValue = valueOf.booleanValue();
            boolean z = this.f251267o;
            if (booleanValue != z) {
                Log.m105925i("Luggage.AppBrandGameServiceLogicImp", "update useCommandBuffer before %b now %b", Boolean.valueOf(z), valueOf);
                C80301a aVar = this.f251270r.f262085c;
                C87412m.m108591d(aVar);
                boolean booleanValue2 = valueOf.booleanValue();
                aVar.f235053b.use_command_buffer = booleanValue2;
                aVar.nativeUpdateParams(aVar.f235052a, booleanValue2);
                this.f251267o = valueOf.booleanValue();
                return;
            }
            return;
        }
        ((C91635f) mo124764Z()).mo114842M();
        this.f251267o = mo120915Y0();
        this.f251269q = mo120916Z0();
        C91383b L0 = mo120901L0(this.f251267o, this.f251269q, mo120904O0(), mo120917a1());
        this.f251270r = L0;
        L0.mo125350a();
        a$$j a__j = new a$$j(this, (a$$b) null);
        C80301a aVar2 = this.f251270r.f262085c;
        C87412m.m108591d(aVar2);
        aVar2.f235095k.mo125229a(a__j);
        C80301a aVar3 = this.f251270r.f262085c;
        C87412m.m108591d(aVar3);
        aVar3.f235094j.mo125229a(a__j);
        C80301a aVar4 = this.f251270r.f262085c;
        C87412m.m108591d(aVar4);
        aVar4.f235096l.addListener(new a$$g(this));
    }

    /* renamed from: L0 */
    public C91383b mo120901L0(boolean z, boolean z2, int i, boolean z3) {
        return new a$$f(this, ((C91635f) mo124764Z()).getContext(), ((C91635f) mo124764Z()).getJsRuntime(), z, z2, i, z3);
    }

    /* renamed from: M0 */
    public final void mo120902M0() {
        C84768n1.C84773e eVar = C84768n1.C84773e.LIB;
        if (!this.f251264i) {
            this.f251264i = true;
            Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "Inject WAGame to MainContext");
            C84754j1.m104418b(((C91635f) mo124764Z()).getJsRuntime(), (URL) null, mo120906Q0(), new C86472c(this));
            a$$i N0 = mo120903N0();
            C83716o4.m102757b((C81879g) mo124764Z(), ((C91635f) mo124764Z()).getJsRuntime());
            ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(778, 13, 1, false);
            long currentTimeMillis = System.currentTimeMillis();
            boolean b0 = ((C91635f) mo124764Z()).mo114335b0();
            String str = N0.f251295b;
            a$$c a__c = new a$$c(this, N0.f251294a, N0.f251295b, currentTimeMillis, str == null ? 0 : str.length(), b0);
            if (((C91635f) mo124764Z()).getRuntime() == null || !((C91635f) mo124764Z()).getRuntime().mo113215r1()) {
                C84768n1.m104431g((C81925i2) mo124764Z(), ((C91635f) mo124764Z()).getJsRuntime(), N0.f251294a, N0.f251296c, N0.f251297d, mo120908S0(), N0.f251295b, eVar, a__c);
                return;
            }
            N0.f251295b = ";(function(global) { var protectedConsole = global.console; Object.defineProperty(global, 'console', { get() { return protectedConsole; }, set() { } }); })(this);" + N0.f251295b;
            C84768n1.m104432h((C81925i2) mo124764Z(), ((C91635f) mo124764Z()).getJsRuntime(), N0.f251294a, N0.f251295b, eVar, a__c);
        }
    }

    /* renamed from: N0 */
    public a$$i mo120903N0() {
        a$$i a__i = new a$$i();
        a__i.f251294a = "WAGame.js";
        a__i.f251295b = ((C91635f) mo124764Z()).mo114272k().mo113372b("WAGame.js");
        a__i.f251296c = "WAGame.js";
        a__i.f251297d = "v" + ((C91635f) mo124764Z()).mo114272k().mo113371a();
        return a__i;
    }

    /* renamed from: O0 */
    public int mo120904O0() {
        return 1;
    }

    /* renamed from: P0 */
    public String mo120905P0() {
        return null;
    }

    /* renamed from: Q */
    public String mo114093Q() {
        JSONObject k0 = ((C91635f) mo124764Z()).mo114340k0();
        return String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", new Object[]{k0.toString(), ((C91635f) mo124764Z()).getRuntime().mo113008F().f239599G});
    }

    /* renamed from: Q0 */
    public String mo120906Q0() {
        return C88016e.m109548e("wxa_library/android.js") + C88016e.m109548e("wxa_library/shared_buffer.js") + C88016e.m109548e("wxa_library/lazy_load.js") + C88016e.m109548e("wxa_library/puppet_wrapper.js") + C88016e.m109548e("wxa_library/NativeGlobal-WAGame.js");
    }

    /* renamed from: R0 */
    public C86479j mo120907R0(Service service, C83185u uVar) {
        return new C86479j(service, uVar);
    }

    /* renamed from: S0 */
    public int mo120908S0() {
        return 0;
    }

    /* renamed from: T0 */
    public void mo120909T0(boolean z, String str, C80669j.C80676g gVar) {
    }

    /* renamed from: U */
    public C80301a mo120910U() {
        C80301a aVar = this.f251270r.f262085c;
        C87412m.m108591d(aVar);
        return aVar;
    }

    /* renamed from: U0 */
    public void mo120911U0(String str, String str2) {
    }

    /* renamed from: V0 */
    public void mo120912V0(int i) {
    }

    /* renamed from: W0 */
    public void mo120913W0() {
        new C79485g().mo109479b();
    }

    /* renamed from: X0 */
    public final void mo120914X0() {
        C83181q qVar;
        try {
            C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
            if (jsRuntime != null && (qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class)) != null) {
                qVar.mo115428t(-8);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.AppBrandGameServiceLogicImp", th, "[CAPTURED CRASH]", new Object[0]);
        }
    }

    /* renamed from: Y0 */
    public boolean mo120915Y0() {
        Boolean bool;
        if (((C91635f) mo124764Z()).getRuntime() == null || (bool = ((C91635f) mo124764Z()).getRuntime().mo113008F().f239612r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: Z0 */
    public boolean mo120916Z0() {
        return true;
    }

    /* renamed from: a1 */
    public boolean mo120917a1() {
        return false;
    }

    /* renamed from: d0 */
    public void mo120918d0() {
        Class cls = C83174m.class;
        super.mo120918d0();
        C91383b bVar = this.f251270r;
        if (bVar != null) {
            Log.m105924i("MicroMsg.MagicBrush", "destroy");
            ((C83174m) bVar.f262084b.mo63321n0(cls)).mo115384z0(bVar.f262087e);
        }
        C90922j jVar = this.f251271s;
        if (jVar != null) {
            jVar.mo125004b(((C91635f) mo124764Z()).getJsRuntime());
        }
        C90916i iVar = this.f251272t;
        if (iVar != null) {
            iVar.mo124999b(((C91635f) mo124764Z()).getJsRuntime());
        }
        C90912g gVar = this.f251273u;
        if (gVar != null) {
            C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
            Log.m105924i("Luggage.LockStepNativeInstallHelper", "destroyLockStepBinding");
            if (jsRuntime == null) {
                Log.m105920e("Luggage.LockStepNativeInstallHelper", "destroyLockStepBinding jsruntime is null");
            } else {
                ((C83174m) jsRuntime.mo63321n0(cls)).mo115384z0(gVar.f260910d);
            }
        }
        C90928k kVar = this.f251274v;
        if (kVar != null) {
            kVar.mo125009b(((C91635f) mo124764Z()).getJsRuntime());
        }
        C79490b bVar2 = this.f251275w;
        if (bVar2 != null) {
            bVar2.mo109490b(((C91635f) mo124764Z()).getJsRuntime());
        }
        CronetLogic.CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback = this.f251277y;
        if (cronetTaskNetworkStateCallback != null) {
            CronetLogic.removeCronetTaskNetworkStateCallback(cronetTaskNetworkStateCallback);
        }
        if (mo125523j0() != null && mo125523j0().mo113203h1()) {
            C83165i jsRuntime2 = ((C91635f) mo124764Z()).getJsRuntime();
            C83181q qVar = (C83181q) jsRuntime2.mo63321n0(C83181q.class);
            C81879g gVar2 = (C81879g) mo124764Z();
            List<? extends C40480g> C = ((C83185u) jsRuntime2.mo63321n0(C83185u.class)).mo115373C(true);
            Log.m105925i("Luggage.AppBrandGameServiceLogicImp", "post report coverage task for appId:%s, contexts.size:%d", mo125521g0(), Integer.valueOf(C.size()));
            CountDownLatch countDownLatch = new CountDownLatch(C.size());
            for (C40480g gVar3 : C) {
                gVar3.evaluateJavascript("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new a$$a(gVar2, gVar3, countDownLatch));
            }
            try {
                countDownLatch.await(3, TimeUnit.SECONDS);
            } catch (Exception e) {
                Log.m105921e("Luggage.AppBrandGameServiceLogicImp", "post report coverage task for appId:%s latch await failed:%s", mo125521g0(), e);
            } finally {
                Log.m105925i("Luggage.AppBrandGameServiceLogicImp", "post report coverage task for appId:%s latch await end", mo125521g0());
            }
        }
    }

    /* renamed from: e0 */
    public C83165i mo120919e0() {
        Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "createJsRuntime");
        long currentTimeMillis = System.currentTimeMillis();
        C83165i J0 = mo120899J0(mo120905P0(), (byte[]) null);
        C86479j R0 = mo120907R0((C91635f) mo124764Z(), (C83185u) J0.mo63321n0(C83185u.class));
        J0.setJsExceptionHandler(new a$$b(this));
        R0.getClass();
        J0.addJavascriptInterface(R0, "WeixinJSContext");
        C84754j1.m104418b(J0, (URL) null, "(function(global) {\n    let loadJsFilesWithOptions = global.WeixinJSContext.loadJsFilesWithOptions\n    global.WeixinJSContext.loadJsFiles = function(contextId, paths, options) {\n        if (!options) {\n            options = '{}'\n        } else if (typeof options !== 'string') {\n            options = JSON.stringify(options)\n        }\n        loadJsFilesWithOptions(contextId, paths, options)\n    }\n})(this);", new C86477h(R0));
        C84754j1.m104418b(J0, (URL) null, String.format(";(function(){let interface = %s;let alloc = interface.alloc;let allocNativeGlobal = interface.allocNativeGlobal;interface.alloc = function(injectNativeGlobal) {if(injectNativeGlobal){return allocNativeGlobal();}else{return alloc();}}})();", new Object[]{"WeixinJSContext"}), new C86478i(R0));
        R0.mo120936v();
        Log.m105925i("Luggage.AppBrandGameServiceLogicImp", "[damonlei] createJsRuntime cost [%d]ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return J0;
    }

    /* renamed from: g */
    public final boolean mo114094g(String str) {
        Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "hy: do nothing in game service when called from modularizing helper");
        return false;
    }

    /* renamed from: m0 */
    public void mo120920m0() {
        if (((C91635f) mo124764Z()).getRuntime() != null && ((C91635f) mo124764Z()).getRuntime().mo113215r1()) {
            MMHandlerThread.postToMainThread(new C86473d(this));
            C83172l lVar = (C83172l) ((C91635f) mo124764Z()).getJsRuntime().mo63321n0(C83172l.class);
            if (lVar != null) {
                lVar.mo115426s1("xdebug");
            }
            if (((C91635f) mo124764Z()).f240291y) {
                C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
                ((C91635f) mo124764Z()).getClass();
                C84768n1.m104429e(jsRuntime, "https://usr/");
            }
        }
    }

    /* renamed from: r0 */
    public boolean mo120921r0() {
        return true;
    }

    /* renamed from: s0 */
    public boolean mo120922s0(String str, JSONObject jSONObject) {
        if ("Image".equals(str) || "OffscreenCanvas".equals(str) || "MediaToolKit".equals(str) || "WeMedia".equals(str) || "CpuProfiler".equals(str) || "HeapProfiler".equals(str) || "Profiler".equals(str)) {
            return true;
        }
        if ("Box2D".equals(str)) {
            mo120910U().mo111579q("mmbox2d");
            return true;
        } else if (!"Phys3D".equals(str)) {
            return super.mo120922s0(str, jSONObject);
        } else {
            mo120910U().mo111579q("mmphysx");
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo120923v0() {
        Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppServiceWC.init");
        this.f251263h = true;
        Log.m105925i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppServiceWC.initImpl mServiceReady = [%b], isRunning[%b]", Boolean.valueOf(this.f251263h), Boolean.valueOf(((C91635f) mo124764Z()).isRunning()));
        if (this.f251263h && ((C91635f) mo124764Z()).isRunning()) {
            try {
                Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppServiceWC.initImpl start");
                if (!this.f251264i) {
                    ((C91635f) mo124764Z()).getJsRuntime().evaluateJavascript(C88016e.m109548e("wxa_library/android.js"), (ValueCallback<String>) null);
                }
                ((C91635f) mo124764Z()).mo114349t0();
                mo120902M0();
                ((C91635f) mo124764Z()).mo109673t(new C86471b(this));
            } catch (NullPointerException e) {
                if (((C91635f) mo124764Z()).isRunning()) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: x0 */
    public void mo120924x0() {
        Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "start preload");
        mo120900K0();
        ((C91635f) mo124764Z()).mo114841L();
        mo120902M0();
        Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppService preloaded.");
    }

    /* renamed from: y0 */
    public void mo120925y0() {
        super.mo120925y0();
        try {
            C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
            if (jsRuntime != null) {
                C83181q qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class);
                if (qVar != null) {
                    qVar.mo115428t(10);
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.AppBrandGameServiceLogicImp", th, "[CAPTURED CRASH]", new Object[0]);
        }
    }

    /* renamed from: z0 */
    public void mo120926z0() {
        Log.m105924i("Luggage.AppBrandGameServiceLogicImp", "onRuntimeResume");
        super.mo120926z0();
        mo120914X0();
        C81745v vVar = this.f251265j;
        if (vVar != null) {
            vVar.f239916j.bringToFront();
        }
    }
}
