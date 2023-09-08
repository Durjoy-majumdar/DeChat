package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.util.Base64;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import by0.C16825a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18466p;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import fx0.C45825h;
import fy3.C32224a;
import gy0.C87409a;
import gy0.C87410b;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import iy3.C60641c;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js0.C88020k;
import jw0.C9533e;
import k20.C9556a;
import kg3.C76577a;
import kj2.C117407d;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONObject;
import pe3.C47465a;
import q73.C89538a;
import q73.C89547f;
import q73.C89567w;
import q73.C89576x;
import r73.C47930c;
import rb0.C48009v0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s73.C13626a;
import s73.C48255c;
import t83.C48586h;
import te3.C22503jo3;
import te3.C49593gp3;
import te3.C50400mh;
import te3.C50541nh;
import te3.hg4;
import te3.ig4;
import te3.re4;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine */
public final class BizTLRecCardJsEngine extends C89547f {

    /* renamed from: Q0 */
    public static C114668z.C104589a f247959Q0;

    /* renamed from: R0 */
    public static BizTLRecCardJsEngine f247960R0;

    /* renamed from: Y */
    public static final Companion f247961Y = new Companion((C8480h) null);

    /* renamed from: Z */
    public static final List<String> f247962Z = C112550d0.m153785U("openUrlWithExtraWebview;openADCanvas;profile;openWeApp;launchMiniProgram", new String[]{";"}, false, 0, 6, (Object) null);

    /* renamed from: p0 */
    public static final C13601g<List<String>> f247963p0 = C36568h.m40985a(C29744b.f80750d);

    /* renamed from: x0 */
    public static final C13601g<Boolean> f247964x0 = C36568h.m40985a(C29743a.f80749d);

    /* renamed from: y0 */
    public static Companion.MMTrimMemoryEventListener f247965y0;

    /* renamed from: N */
    public C19623o0 f247966N;

    /* renamed from: P */
    public final MMKVSlotManager f247967P;

    /* renamed from: Q */
    public final C48586h f247968Q = new C13626a(WebViewStubService.class, "wxCanvas", "wxf337cbaa27790d8e", JsapiPermissionWrapper.f121047h).mo13024a();

    /* renamed from: R */
    public final String f247969R = "wxf337cbaa27790d8e";

    /* renamed from: S */
    public final HashMap<String, Long> f247970S = new HashMap<>();

    /* renamed from: T */
    public final HashMap<String, String> f247971T = new HashMap<>();

    /* renamed from: U */
    public WeakReference<Context> f247972U = new WeakReference<>(MMApplicationContext.getContext());

    /* renamed from: V */
    public String f247973V = "";

    /* renamed from: W */
    public GestureDetector f247974W;

    /* renamed from: X */
    public C85105i2 f247975X;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$a */
    public static final class C29743a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C29743a f80749d = new C29743a();

        public C29743a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_jscore_recycle_on_back_ground, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$b */
    public static final class C29744b extends C87413o implements C32224a<List<? extends String>> {

        /* renamed from: d */
        public static final C29744b f80750d = new C29744b();

        public C29744b() {
            super(0);
        }

        public Object invoke() {
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_open_web_canvas_cgi_list, "/cgi-bin/micromsg-bin/often_read_bar_report;/cgi-bin/mmbiz-bin/report/bizcommreport;/cgi-bin/mmbiz-bin/timeline/bizfeedback;/cgi-bin/mmbiz-bin/timeline/recyclecardreport;/cgi-bin/mmbiz-bin/recommend/timelinecard;/cgi-bin/mmbiz-bin/timeline/recommendfeedsfeedback;/cgi-bin/micromsg-bin/reportshow");
            Companion companion = BizTLRecCardJsEngine.f247961Y;
            Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "cgiAllowList " + Y60);
            C87412m.m108593f(Y60, LocaleUtil.ITALIAN);
            return C112550d0.m153785U(Y60, new String[]{";"}, false, 0, 6, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$c */
    public static final class C40684c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BizTLRecCardJsEngine f109297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40684c(BizTLRecCardJsEngine bizTLRecCardJsEngine) {
            super(0);
            this.f109297d = bizTLRecCardJsEngine;
        }

        public Object invoke() {
            if (((Boolean) ((C36570n) C19627t.f55608w).getValue()).booleanValue() && !C19636w0.f55627d) {
                BizTLRecCardJsEngine bizTLRecCardJsEngine = this.f109297d;
                synchronized (bizTLRecCardJsEngine) {
                    for (Map.Entry next : bizTLRecCardJsEngine.f257697D.entrySet()) {
                        bizTLRecCardJsEngine.mo123865W1((String) next.getKey(), ((Number) next.getValue()).intValue());
                    }
                    bizTLRecCardJsEngine.f257697D.clear();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$Companion */
    public static final class Companion {

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$Companion$MMTrimMemoryEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MMTrimMemoryEvent;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$Companion$MMTrimMemoryEventListener */
        public static final class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {
            public MMTrimMemoryEventListener() {
                super(C40008f.f107254d);
            }

            public boolean callback(IEvent iEvent) {
                C87412m.m108594g((MMTrimMemoryEvent) iEvent, "event");
                Companion companion = BizTLRecCardJsEngine.f247961Y;
                Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "MMTrimMemoryEvent callback isInTimeLine=" + C19636w0.f55627d);
                ((C119157j) C119157j.f356862d).mo183895z(C29745d1.f80751d);
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$Companion$a */
        public static final class C40683a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ BizTLRecCardJsEngine f109296d;

            public C40683a(BizTLRecCardJsEngine bizTLRecCardJsEngine) {
                this.f109296d = bizTLRecCardJsEngine;
            }

            /* JADX WARNING: type inference failed for: r0v4, types: [com.tencent.mm.plugin.appbrand.appcache.l0] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r3 = this;
                    com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine r0 = r3.f109296d
                    com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$Companion r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine.f247961Y
                    com.tencent.mm.plugin.appbrand.appcache.l0 r0 = r0.mo123864R1()
                    boolean r1 = r0 instanceof java.io.Closeable
                    r2 = 0
                    if (r1 == 0) goto L_0x0010
                    java.io.Closeable r0 = (java.io.Closeable) r0
                    goto L_0x0011
                L_0x0010:
                    r0 = r2
                L_0x0011:
                    com.tencent.mapsdk.rastercore.tools.C40004IO.safeClose(r0)
                    com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine r0 = r3.f109296d
                    com.tencent.mm.plugin.appbrand.appcache.l0 r0 = r0.mo72996G1()
                    boolean r1 = r0 instanceof java.io.Closeable
                    if (r1 == 0) goto L_0x0021
                    r2 = r0
                    java.io.Closeable r2 = (java.io.Closeable) r2
                L_0x0021:
                    com.tencent.mapsdk.rastercore.tools.C40004IO.safeClose(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine.Companion.C40683a.run():void");
            }
        }

        public Companion(C8480h hVar) {
        }

        /* renamed from: a */
        public final synchronized BizTLRecCardJsEngine mo118094a() {
            BizTLRecCardJsEngine bizTLRecCardJsEngine;
            try {
                if (BizTLRecCardJsEngine.f247960R0 == null) {
                    BizTLRecCardJsEngine.f247960R0 = new BizTLRecCardJsEngine();
                }
                if (BizTLRecCardJsEngine.f247965y0 == null) {
                    C48255c.C36632b bVar = C48255c.f129277x;
                    if (((Boolean) ((C36570n) C48255c.f129278y).getValue()).booleanValue()) {
                        MMTrimMemoryEventListener mMTrimMemoryEventListener = new MMTrimMemoryEventListener();
                        mMTrimMemoryEventListener.alive();
                        BizTLRecCardJsEngine.f247965y0 = mMTrimMemoryEventListener;
                    }
                }
                if (BizTLRecCardJsEngine.f247959Q0 == null && ((Boolean) ((C36570n) BizTLRecCardJsEngine.f247964x0).getValue()).booleanValue()) {
                    C85101e1 e1Var = new C85101e1();
                    e1Var.alive();
                    BizTLRecCardJsEngine.f247959Q0 = e1Var;
                }
                bizTLRecCardJsEngine = BizTLRecCardJsEngine.f247960R0;
                C87412m.m108591d(bizTLRecCardJsEngine);
            } catch (Throwable th) {
                throw th;
            }
            return bizTLRecCardJsEngine;
        }

        /* renamed from: b */
        public final synchronized void mo118095b() {
            Companion companion = BizTLRecCardJsEngine.f247961Y;
            Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "releaseEngine");
            MagicSclBrandReporter magicSclBrandReporter = MagicSclBrandReporter.f237836a;
            Log.m105924i("MicroMsg.MagicSclReporter", "clearCardExposeKeys");
            MagicSclBrandReporter.f237838c.clear();
            try {
                BizTLRecCardJsEngine bizTLRecCardJsEngine = BizTLRecCardJsEngine.f247960R0;
                if (bizTLRecCardJsEngine != null) {
                    C117407d.INSTANCE.mo182089r(1454, 134, 1);
                    bizTLRecCardJsEngine.mo118085N1();
                    bizTLRecCardJsEngine.destroy();
                    C85105i2 i2Var = bizTLRecCardJsEngine.f247975X;
                    if (i2Var != null) {
                        Log.m105924i(i2Var.f257756F, "forceRelease");
                        ((C83174m) i2Var.mo63321n0(C83174m.class)).mo115384z0(new C89576x(i2Var));
                        i2Var.destroy();
                    }
                    bizTLRecCardJsEngine.f247975X = null;
                    ((C119157j) C119157j.f356862d).mo183878i(new C40683a(bizTLRecCardJsEngine), 3000);
                }
            } catch (Exception e) {
                Companion companion2 = BizTLRecCardJsEngine.f247961Y;
                Log.m105920e("MicroMsg.BizTLRecCardJsEngine", "releaseEngine ex " + e.getMessage());
            }
            BizTLRecCardJsEngine.f247960R0 = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$d */
    public static final class C85099d implements C87410b {

        /* renamed from: d */
        public final /* synthetic */ BizTLRecCardJsEngine f247976d;

        /* renamed from: e */
        public final /* synthetic */ String f247977e;

        /* renamed from: f */
        public final /* synthetic */ String f247978f;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$d$d */
        public static final class C18205d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ BizTLRecCardJsEngine f50323d;

            /* renamed from: e */
            public final /* synthetic */ String f50324e;

            /* renamed from: f */
            public final /* synthetic */ int f50325f;

            /* renamed from: g */
            public final /* synthetic */ long f50326g;

            public C18205d(BizTLRecCardJsEngine bizTLRecCardJsEngine, String str, int i, long j) {
                this.f50323d = bizTLRecCardJsEngine;
                this.f50324e = str;
                this.f50325f = i;
                this.f50326g = j;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.tencent.mm.storage.o0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
            /* JADX WARNING: type inference failed for: r4v0 */
            /* JADX WARNING: type inference failed for: r4v1 */
            /* JADX WARNING: type inference failed for: r4v4 */
            /* JADX WARNING: type inference failed for: r4v9 */
            /* JADX WARNING: type inference failed for: r4v10 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r10 = this;
                    com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine r0 = r10.f50323d
                    java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f247971T
                    java.lang.String r1 = r10.f50324e
                    boolean r0 = r0.containsValue(r1)
                    r1 = 1000(0x3e8, double:4.94E-321)
                    r3 = 0
                    r4 = 0
                    if (r0 == 0) goto L_0x0097
                    com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine r0 = r10.f50323d
                    java.lang.ref.WeakReference<android.content.Context> r0 = r0.f247972U
                    java.lang.Object r0 = r0.get()
                    boolean r5 = r0 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI
                    if (r5 == 0) goto L_0x001f
                    com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI) r0
                    goto L_0x0020
                L_0x001f:
                    r0 = r4
                L_0x0020:
                    if (r0 == 0) goto L_0x0096
                    java.lang.String r5 = r10.f50324e
                    int r6 = r10.f50325f
                    com.tencent.mm.plugin.brandservice.ui.timeline.z2 r7 = r0.f50246s
                    if (r7 == 0) goto L_0x0096
                    java.lang.String r8 = "id"
                    gy3.C87412m.m108594g(r5, r8)
                    java.util.List<com.tencent.mm.storage.o0> r7 = r7.f51440h
                    java.util.Iterator r7 = r7.iterator()
                L_0x0035:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L_0x0082
                    java.lang.Object r8 = r7.next()
                    com.tencent.mm.storage.o0 r8 = (com.tencent.p014mm.storage.C19623o0) r8
                    java.lang.String r9 = r8.mo25768r2()
                    boolean r9 = gy3.C87412m.m108589b(r9, r5)
                    if (r9 == 0) goto L_0x0035
                    qx0.a$a r5 = qx0.C22136a.C22137a.CLICK_REC_FEED
                    qx0.C22136a.f62624g = r8
                    int r7 = qx0.C22136a.f62622e
                    qx0.C22136a.f62623f = r7
                    java.lang.String r7 = ""
                    qx0.C22136a.f62625h = r7
                    qx0.C22136a.f62626i = r5
                    r5 = -1
                    if (r6 <= r5) goto L_0x007b
                    te3.lo3 r5 = r8.f55539x1
                    java.util.LinkedList<te3.wo3> r5 = r5.f64172e
                    int r5 = r5.size()
                    if (r5 <= r6) goto L_0x007b
                    te3.lo3 r5 = r8.f55539x1
                    java.util.LinkedList<te3.wo3> r5 = r5.f64172e
                    java.lang.Object r5 = r5.get(r6)
                    te3.wo3 r5 = (te3.C22533wo3) r5
                    if (r5 == 0) goto L_0x0078
                    te3.bj2 r5 = r5.f64690e
                    if (r5 == 0) goto L_0x0078
                    java.lang.String r4 = r5.f63729f
                L_0x0078:
                    qx0.C22136a.f62625h = r4
                    goto L_0x0081
                L_0x007b:
                    te3.lo3 r4 = r8.f55539x1
                    java.lang.String r4 = r4.f64178n
                    qx0.C22136a.f62625h = r4
                L_0x0081:
                    r4 = r8
                L_0x0082:
                    if (r4 == 0) goto L_0x0096
                    com.tencent.mm.plugin.brandservice.ui.timeline.m3 r0 = r0.f50249v
                    int r3 = java.lang.Math.max(r3, r6)
                    r0.getClass()
                    long r5 = java.lang.System.currentTimeMillis()
                    long r5 = r5 / r1
                    int r1 = (int) r5
                    r0.mo22975b(r4, r3, r1)
                L_0x0096:
                    return
                L_0x0097:
                    com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
                    long r5 = r10.f50326g
                    com.tencent.mm.storage.o0 r0 = r0.mo25806kD(r5)
                    if (r0 == 0) goto L_0x011d
                    com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine r5 = r10.f50323d
                    boolean r6 = r0.mo25758F2()
                    if (r6 == 0) goto L_0x011d
                    java.lang.ref.WeakReference<android.content.Context> r5 = r5.f247972U
                    java.lang.Object r5 = r5.get()
                    boolean r6 = r5 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI
                    if (r6 == 0) goto L_0x00b8
                    com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r5 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI) r5
                    goto L_0x00b9
                L_0x00b8:
                    r5 = r4
                L_0x00b9:
                    if (r5 == 0) goto L_0x00c9
                    com.tencent.mm.plugin.brandservice.ui.timeline.m3 r5 = r5.f50249v
                    r5.getClass()
                    long r6 = java.lang.System.currentTimeMillis()
                    long r6 = r6 / r1
                    int r1 = (int) r6
                    r5.mo22975b(r0, r3, r1)
                L_0x00c9:
                    te3.re4 r0 = r0.mo25774x2()
                    if (r0 == 0) goto L_0x011d
                    int r1 = r0.f64521j
                    r2 = 1001(0x3e9, float:1.403E-42)
                    if (r1 != r2) goto L_0x011d
                    te3.jo3 r1 = r0.f64525q
                    if (r1 == 0) goto L_0x011d
                    com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r2 = 21064(0x5248, float:2.9517E-41)
                    r5 = 7
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    long r6 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.now()
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    r5[r3] = r6
                    r3 = 1
                    te3.jo3 r6 = r0.f64525q
                    java.lang.String r6 = r6.f64075j
                    r5[r3] = r6
                    long r6 = r0.f64519h
                    java.lang.Long r3 = java.lang.Long.valueOf(r6)
                    r6 = 2
                    r5[r6] = r3
                    r3 = 3
                    r7 = 5
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                    r5[r3] = r8
                    r3 = 4
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r5[r3] = r6
                    int r3 = r0.f64521j
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r5[r7] = r3
                    r3 = 6
                    te3.hb0 r0 = r0.f64523o
                    if (r0 == 0) goto L_0x0118
                    java.lang.String r4 = r0.f63909n
                L_0x0118:
                    r5[r3] = r4
                    r1.mo160131h(r2, r5)
                L_0x011d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine.C85099d.C18205d.run():void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$d$a */
        public static final class C40685a implements l0$$e {

            /* renamed from: d */
            public final /* synthetic */ BizTLRecCardJsEngine f109298d;

            /* renamed from: e */
            public final /* synthetic */ String f109299e;

            public C40685a(BizTLRecCardJsEngine bizTLRecCardJsEngine, String str) {
                this.f109298d = bizTLRecCardJsEngine;
                this.f109299e = str;
            }

            /* renamed from: a */
            public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
                if (i == 0 && i2 == 0) {
                    C47465a aVar = cVar.f127056b.f127083a;
                    ig4 ig4 = aVar instanceof ig4 ? (ig4) aVar : null;
                    if (ig4 == null) {
                        Companion companion = BizTLRecCardJsEngine.f247961Y;
                        Log.m105920e("MicroMsg.BizTLRecCardJsEngine", "adRequest resp is null");
                        return 0;
                    }
                    Companion companion2 = BizTLRecCardJsEngine.f247961Y;
                    Log.m105918d("MicroMsg.BizTLRecCardJsEngine", "adRequest resp data: " + ig4.f135333g);
                    BizTLRecCardJsEngine bizTLRecCardJsEngine = this.f109298d;
                    String str2 = this.f109299e;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("err_msg", "ok");
                    String str3 = ig4.f135333g;
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("data", str3);
                    C13598b0 b0Var = C13598b0.f38549a;
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                    C47930c.C47931a.m53253a(bizTLRecCardJsEngine, str2, jSONObject2, (ValueCallback) null, 4, (Object) null);
                    return 0;
                }
                Companion companion3 = BizTLRecCardJsEngine.f247961Y;
                Log.m105920e("MicroMsg.BizTLRecCardJsEngine", "adRequest callback errType=" + i + ", errCode=" + i2);
                BizTLRecCardJsEngine bizTLRecCardJsEngine2 = this.f109298d;
                String str4 = this.f109299e;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("err_code", i2);
                jSONObject3.put("err_msg", "fail");
                C13598b0 b0Var2 = C13598b0.f38549a;
                String jSONObject4 = jSONObject3.toString();
                C87412m.m108593f(jSONObject4, "JSONObject().apply {\n   …             }.toString()");
                C47930c.C47931a.m53253a(bizTLRecCardJsEngine2, str4, jSONObject4, (ValueCallback) null, 4, (Object) null);
                return 0;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$d$b */
        public static final class C40686b implements l0$$e {

            /* renamed from: d */
            public final /* synthetic */ BizTLRecCardJsEngine f109300d;

            /* renamed from: e */
            public final /* synthetic */ String f109301e;

            public C40686b(BizTLRecCardJsEngine bizTLRecCardJsEngine, String str) {
                this.f109300d = bizTLRecCardJsEngine;
                this.f109301e = str;
            }

            /* renamed from: a */
            public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
                int i3 = i2;
                if (i == 0 && i3 == 0) {
                    C47465a aVar = cVar.f127056b.f127083a;
                    C50541nh nhVar = aVar instanceof C50541nh ? (C50541nh) aVar : null;
                    if (nhVar != null) {
                        BizTLRecCardJsEngine bizTLRecCardJsEngine = this.f109300d;
                        String str2 = this.f109301e;
                        Companion companion = BizTLRecCardJsEngine.f247961Y;
                        Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "canvasRequest resp_json=" + nhVar.f138601g);
                        String str3 = nhVar.f138601g;
                        C87412m.m108593f(str3, "resp.Data");
                        C47930c.C47931a.m53253a(bizTLRecCardJsEngine, str2, str3, (ValueCallback) null, 4, (Object) null);
                    }
                    return 0;
                }
                BizTLRecCardJsEngine bizTLRecCardJsEngine2 = this.f109300d;
                String str4 = this.f109301e;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("err_code", i3);
                jSONObject.put("err_msg", "fail");
                C13598b0 b0Var = C13598b0.f38549a;
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                C47930c.C47931a.m53253a(bizTLRecCardJsEngine2, str4, jSONObject2, (ValueCallback) null, 4, (Object) null);
                return 0;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardJsEngine$d$c */
        public static final class C85100c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BizTLRecCardJsEngine f247979d;

            /* renamed from: e */
            public final /* synthetic */ String f247980e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85100c(BizTLRecCardJsEngine bizTLRecCardJsEngine, String str) {
                super(0);
                this.f247979d = bizTLRecCardJsEngine;
                this.f247980e = str;
            }

            public Object invoke() {
                Context context = this.f247979d.f247972U.get();
                BizTimeLineUI bizTimeLineUI = context instanceof BizTimeLineUI ? (BizTimeLineUI) context : null;
                if (bizTimeLineUI != null) {
                    String str = this.f247980e;
                    C18508z2 z2Var = bizTimeLineUI.f50246s;
                    if (z2Var != null) {
                        C87412m.m108594g(str, "id");
                        Iterator<T> it = z2Var.f51440h.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C19623o0 o0Var = (C19623o0) it.next();
                            if (C87412m.m108589b(o0Var.mo25768r2(), str)) {
                                z2Var.mo23142g(o0Var);
                                break;
                            }
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C85099d(BizTLRecCardJsEngine bizTLRecCardJsEngine, String str, String str2) {
            this.f247976d = bizTLRecCardJsEngine;
            this.f247977e = str;
            this.f247978f = str2;
        }

        /* renamed from: O0 */
        public void mo118096O0(String str) {
            String str2;
            C22503jo3 jo32;
            C87412m.m108594g(str, "fieldId");
            Companion companion = BizTLRecCardJsEngine.f247961Y;
            Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "deleteCanvasCard " + str);
            if (!C9533e.f29713a.mo10211d() || !((MultiProcessMMKV) ((C36570n) C9533e.f29714b).getValue()).decodeBool("forbidDeleteCanvasFromJS", false)) {
                String str3 = this.f247977e;
                if (this.f247976d.f247971T.containsValue(str)) {
                    C61926c.m72668M(new C85100c(this.f247976d, str));
                } else {
                    long safeParseLong = Util.safeParseLong(str);
                    if (safeParseLong != 0) {
                        C19623o0 kD = C48009v0.Jx0().mo25806kD(safeParseLong);
                        if (kD == null) {
                            Log.m105928w("MicroMsg.BizTLRecCardJsEngine", "deleteCanvasCard msg not exist.");
                            return;
                        } else if (kD.mo25753A2() || kD.mo25758F2()) {
                            Long l = this.f247976d.f247970S.get(this.f247977e);
                            if (!Util.isEqual(str, l != null ? String.valueOf(l) : null)) {
                                if (kD.mo25758F2()) {
                                    re4 x2 = kD.mo25774x2();
                                    String str4 = (x2 == null || (jo32 = x2.f64525q) == null) ? null : jo32.f64075j;
                                    if (str4 == null) {
                                        Log.m105928w("MicroMsg.BizTLRecCardJsEngine", "deleteCanvasCard cardId is null.");
                                        return;
                                    }
                                    str2 = C19627t.f55586a.mo25819A(str4);
                                } else if (kD.mo25753A2()) {
                                    C19627t tVar = C19627t.f55586a;
                                    String y2 = kD.mo25775y2();
                                    C87412m.m108593f(y2, "info.traceId");
                                    str2 = tVar.mo25827a(y2);
                                } else {
                                    return;
                                }
                                Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "deleteCanvasCard delete other card targetCanvasId=" + str2);
                                str3 = str2;
                            }
                            C48009v0.Jx0().mo25785Lo(safeParseLong);
                        } else {
                            Log.m105928w("MicroMsg.BizTLRecCardJsEngine", "deleteCanvasCard not ad or recCard.");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C85105i2 b2 = this.f247976d.mo118087S1();
                b2.mo60865I0("destroy", "{target:'" + str3 + "'}", (ValueCallback<String>) null);
                BizTLRecCardJsEngine bizTLRecCardJsEngine = this.f247976d;
                bizTLRecCardJsEngine.mo60865I0("destroy", "{target:'" + str3 + "'}", (ValueCallback<String>) null);
                return;
            }
            Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "forbidDeleteCanvasFromJS " + str);
        }

        /* renamed from: P */
        public void mo118097P(Number number, String str, String str2) {
            C87412m.m108594g(number, "businessId");
            C87412m.m108594g(str, "reqJson");
            C87412m.m108594g(str2, "callback");
            Companion companion = BizTLRecCardJsEngine.f247961Y;
            Log.m105919d("MicroMsg.BizTLRecCardJsEngine", "canvasRequest %s", str);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C50400mh();
            bVar.f127067b = new C50541nh();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/bizrecommendtimelinecard";
            bVar.f127069d = 1085;
            C47350c a = bVar.mo72403a();
            C47465a aVar = a.f127055a.f127080a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizRecommendTimeLineCardReq");
            C50400mh mhVar = (C50400mh) aVar;
            mhVar.f138025e = number.intValue();
            mhVar.f138027g = str;
            mhVar.f138024d = System.currentTimeMillis();
            C89144l0.m111429e(a, new C40686b(this.f247976d, str2), false);
        }

        /* renamed from: W0 */
        public void mo118098W0(String str, String str2, String str3) {
            C87412m.m108594g(str, StateEvent.Name.MESSAGE);
            C87412m.m108594g(str2, "subType");
            C87412m.m108594g(str3, "callback");
            Companion companion = BizTLRecCardJsEngine.f247961Y;
            Log.m105919d("MicroMsg.BizTLRecCardJsEngine", "adRequest %s", str);
            C47350c.C47352b bVar = new C47350c.C47352b();
            hg4 hg4 = new hg4();
            hg4.f183480e = 3;
            hg4.f183482g = str;
            hg4.f183483h = str2;
            hg4.f183479d = System.currentTimeMillis();
            bVar.f127066a = hg4;
            bVar.f127067b = new ig4();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/recommend/timelinecard";
            bVar.f127069d = 2781;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C89144l0.m111429e(bVar.mo72403a(), new C40685a(this.f247976d, str3), false);
        }

        public String getData() {
            return this.f247978f;
        }

        /* renamed from: l */
        public Object mo118100l(String str) {
            C87412m.m108594g(str, "key");
            int i = 0;
            switch (str.hashCode()) {
                case -229691438:
                    if (!str.equals("videoChannelData")) {
                        return null;
                    }
                    return C45825h.f123727a.mo71293d();
                case -192219127:
                    if (!str.equals("recFeedId")) {
                        return null;
                    }
                    int i2 = this.f247976d.f247971T.get(this.f247977e);
                    if (i2 == null) {
                        i2 = 0;
                    }
                    String valueOf = String.valueOf(i2);
                    String str2 = this.f247977e;
                    Companion companion = BizTLRecCardJsEngine.f247961Y;
                    Log.m105918d("MicroMsg.BizTLRecCardJsEngine", "getInfo canvasId=" + str2 + ", recFeedId=" + valueOf);
                    return valueOf;
                case -81550052:
                    if (!str.equals("feedBackRecycleCardList")) {
                        return null;
                    }
                    C49593gp3 gp32 = new C49593gp3();
                    gp32.f134190d = C18355t.m18923b((C19623o0) null);
                    byte[] encode = Base64.encode(gp32.toByteArray(), 2);
                    C87412m.m108593f(encode, "encode(recycleCardList.t…eArray(), Base64.NO_WRAP)");
                    Charset charset = StandardCharsets.UTF_8;
                    C87412m.m108593f(charset, "UTF_8");
                    return new String(encode, charset);
                case 104191100:
                    if (!str.equals("msgId")) {
                        return null;
                    }
                    Long l = this.f247976d.f247970S.get(this.f247977e);
                    if (l == null) {
                        l = 0L;
                    }
                    String valueOf2 = String.valueOf(l.longValue());
                    String str3 = this.f247977e;
                    Companion companion2 = BizTLRecCardJsEngine.f247961Y;
                    Log.m105918d("MicroMsg.BizTLRecCardJsEngine", "getInfo canvasId=" + str3 + ", msgIds=" + valueOf2);
                    return valueOf2;
                case 607796817:
                    if (!str.equals("sessionId")) {
                        return null;
                    }
                    C45696d dVar = (C45696d) C86709a0.m107533q(C45696d.class);
                    if (dVar != null) {
                        i = dVar.Ie0();
                    }
                    return Integer.valueOf(i);
                case 1043830850:
                    if (!str.equals("videoChannelIconSize")) {
                        return null;
                    }
                    Context context = MMApplicationContext.getContext();
                    int i3 = C18466p.f51246a;
                    return Float.valueOf(((float) ((int) (((float) C76577a.m92155f(context, C0966R.dimen.f4162uo)) * C18466p.m19105d(context)))) / C88020k.m109556g());
                case 1546932043:
                    if (!str.equals("videoChannelItemWidth")) {
                        return null;
                    }
                    Integer valueOf3 = Integer.valueOf(C60641c.m70921b(((float) C18466p.m19102a(MMApplicationContext.getContext())) / C88020k.m109556g()));
                    String str4 = this.f247977e;
                    int intValue = valueOf3.intValue();
                    Companion companion3 = BizTLRecCardJsEngine.f247961Y;
                    Log.m105918d("MicroMsg.BizTLRecCardJsEngine", "getInfo canvasId=" + str4 + ", videoChannelItemWidth=" + intValue);
                    return valueOf3;
                default:
                    return null;
            }
        }

        /* renamed from: v0 */
        public void mo118101v0(String str, int i) {
            C87412m.m108594g(str, "fieldId");
            long j = Util.getLong(str, 0);
            Companion companion = BizTLRecCardJsEngine.f247961Y;
            Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "onItemClick fieldId=" + str + ", msgId=" + j + ", pos=" + i);
            ((C119157j) C119157j.f356862d).mo183875f(new C18205d(this.f247976d, str, i, j));
        }
    }

    public BizTLRecCardJsEngine() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__WebJsEngineLocalData__");
        C87412m.m108593f(mmkv, "getMMKV(\"__WebJsEngineLocalData__\")");
        this.f247967P = new MMKVSlotManager(mmkv, 15552000);
    }

    /* renamed from: B0 */
    public C48586h mo63606B0() {
        return this.f247968Q;
    }

    /* renamed from: D1 */
    public String mo72993D1() {
        return "BizLogicJsEngine";
    }

    /* renamed from: N1 */
    public void mo118085N1() {
        super.mo118085N1();
        C61926c.m72666K(BuildInfo.DEBUG ? 3000 : 30000, new C40684c(this));
    }

    /* renamed from: Q1 */
    public String mo118086Q1() {
        return this.f247969R;
    }

    /* renamed from: T1 */
    public boolean mo118088T1() {
        return this.f247975X != null;
    }

    /* renamed from: U1 */
    public void mo118089U1() {
        super.mo118089U1();
    }

    /* renamed from: V1 */
    public void mo118090V1(Context context, String str, String str2, C83165i iVar) {
        C87412m.m108594g(context, "ct");
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(str2, "data");
        C87412m.m108594g(iVar, "jsRuntime");
        super.mo118090V1(context, str, str2, iVar);
        new C87409a(new C85099d(this, str, str2)).mo72687a(iVar);
    }

    /* renamed from: Z1 */
    public void mo118091Z1(String str, MotionEvent motionEvent) {
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(motionEvent, "touch");
        super.mo118091Z1(str, motionEvent);
        GestureDetector gestureDetector = this.f247974W;
        if (gestureDetector != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine", "touch", "(Ljava/lang/String;Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector2, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine", "touch", "(Ljava/lang/String;Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        this.f247973V = str;
    }

    /* renamed from: a2 */
    public final void mo118092a2(String str) {
        C87412m.m108594g(str, "canvasId");
        Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "exitHotZone #" + str);
        C89567w.m111980P1(mo118087S1(), "exitHotZone", str, (ValueCallback) null, 4, (Object) null);
        C89538a Q1 = mo118087S1().mo123884Q1(str);
        if (Q1 != null) {
            Q1.f257669p = false;
        }
    }

    /* renamed from: b2 */
    public C85105i2 mo118087S1() {
        C85105i2 i2Var = this.f247975X;
        if (i2Var != null) {
            C87412m.m108591d(i2Var);
            return i2Var;
        }
        this.f257700G.f258846l = System.currentTimeMillis();
        C85105i2 i2Var2 = new C85105i2(this, mo123864R1(), mo72996G1(), this.f257700G);
        this.f247975X = i2Var2;
        return i2Var2;
    }

    /* renamed from: d0 */
    public boolean mo63607d0(int i, String str) {
        C87412m.m108594g(str, "cgiUrl");
        if (((List) ((C36570n) f247963p0).getValue()).contains(str)) {
            return true;
        }
        Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "do cgi cmdId=" + i + ", cgiUrl=" + str + " not allowed!!");
        return false;
    }

    public String getLocalData(String str) {
        C87412m.m108594g(str, "key");
        try {
            String decodeString = this.f247967P.decodeString(str, "");
            Log.m105918d("MicroMsg.BizTLRecCardJsEngine", "getLocalData:" + str + ", " + decodeString);
            return decodeString;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizTLRecCardJsEngine", e, "getLocalData:" + str, new Object[0]);
            return null;
        }
    }

    /* renamed from: p0 */
    public void mo63610p0(String str, String str2) {
        C19623o0 o0Var;
        C87412m.m108594g(str, "func");
        C87412m.m108594g(str2, StateEvent.Name.MESSAGE);
        if (f247962Z.contains(str) && (o0Var = this.f247966N) != null) {
            C16825a.f45444a.mo17864b(o0Var, "");
        }
    }

    public void setLocalData(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "data");
        try {
            ((MultiProcessMMKV) this.f247967P.getSlotForWrite()).encode(str, str2);
            Log.m105918d("MicroMsg.BizTLRecCardJsEngine", "setLocalData:" + str + ", " + str2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizTLRecCardJsEngine", e, "setLocalData:" + str + ", " + str2, new Object[0]);
        }
    }
}
