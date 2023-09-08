package q73;

import a70.C112760b;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.webkit.ValueCallback;
import c30.C104289g;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MBViewManager;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.sight.base.C85458f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentSkipListSet;
import kr0.C34019v0;
import p1017od.C89166m;
import p1017od.C89167n;
import p1017od.C89201o;
import p1033sd.C90171a;
import p1059wd.C90954a;
import p206nj.C88957l;
import p416qd.C89590b;
import p445au.C79632b;
import r73.C47934j;
import r73.C89894f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s73.C48255c;
import s73.C48273f;
import s73.C90150b;
import sx3.C110818d0;

/* renamed from: q73.w */
public class C89567w extends C48255c {

    /* renamed from: B */
    public final C89547f f257752B;

    /* renamed from: C */
    public final C40427l0 f257753C;

    /* renamed from: D */
    public final C40427l0 f257754D;

    /* renamed from: E */
    public final C90150b f257755E;

    /* renamed from: F */
    public final String f257756F = "MicroMsg.WebCanvasRenderJsEngine";

    /* renamed from: G */
    public final C48273f f257757G = new C48273f(1477);

    /* renamed from: H */
    public final C13601g f257758H = C36568h.m40985a(new C89575g(this));

    /* renamed from: I */
    public final int f257759I = 2048;

    /* renamed from: J */
    public final int f257760J = 2048;

    /* renamed from: K */
    public final C80301a f257761K;

    /* renamed from: L */
    public boolean f257762L;

    /* renamed from: M */
    public boolean f257763M;

    /* renamed from: N */
    public final ConcurrentSkipListSet<String> f257764N;

    /* renamed from: q73.w$a */
    public static final class C89568a implements C89590b.C89592b {
        /* renamed from: a */
        public String mo123712a(String str) {
            C87412m.m108591d(str);
            String g = C88957l.m111071g(str);
            C87412m.m108593f(g, "find(libName!!)");
            return g;
        }

        public void loadLibrary(String str) {
            C87412m.m108591d(str);
            C88957l.m111078n(str);
        }
    }

    /* renamed from: q73.w$b */
    public static final class C89569b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89567w f257765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89569b(C89567w wVar) {
            super(1);
            this.f257765d = wVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C90150b bVar = this.f257765d.f257755E;
            bVar.mo124401d(bVar.f258846l);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q73.w$c */
    public static final class C89570c extends C87413o implements C32224a<C89201o> {

        /* renamed from: d */
        public final /* synthetic */ C89567w f257766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89570c(C89567w wVar) {
            super(0);
            this.f257766d = wVar;
        }

        public Object invoke() {
            return new C89201o(this.f257766d.mo115417m(), this.f257766d.mo115393J0(), this.f257766d.mo115414j());
        }
    }

    /* renamed from: q73.w$d */
    public static final class C89571d implements C90171a {

        /* renamed from: a */
        public final /* synthetic */ C89567w f257767a;

        public C89571d(C89567w wVar) {
            this.f257767a = wVar;
        }

        /* renamed from: a */
        public void mo123770a() {
            this.f257767a.f242938f.mo112435a();
        }

        /* renamed from: d */
        public boolean mo123771d() {
            return this.f257767a.f242938f.mo112436d();
        }

        /* renamed from: e */
        public String mo123772e() {
            return this.f257767a.mo115410e();
        }

        /* renamed from: p */
        public void mo123773p(Runnable runnable, boolean z) {
            C87412m.m108594g(runnable, "p0");
            this.f257767a.mo115419p(runnable, z);
        }

        /* renamed from: q */
        public boolean mo123774q() {
            return this.f257767a.f242938f.mo112441i();
        }
    }

    /* renamed from: q73.w$e */
    public static final class C89572e extends C87413o implements C32226l<C89167n.C89171b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89567w f257768d;

        /* renamed from: e */
        public final /* synthetic */ C80301a f257769e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89572e(C89567w wVar, C80301a aVar) {
            super(1);
            this.f257768d = wVar;
            this.f257769e = aVar;
        }

        /* JADX WARNING: type inference failed for: r6v4, types: [com.tencent.magicbrush.handler.glfont.IMBFontHandler] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                od.n$b r6 = (p1017od.C89167n.C89171b) r6
                java.lang.String r0 = "$this$imageHandler"
                gy3.C87412m.m108594g(r6, r0)
                r0 = 1
                r6.f256996a = r0
                java.lang.Class<au.b> r1 = p445au.C79632b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                au.b r1 = (p445au.C79632b) r1
                r6.d r1 = r1.kp0()
                r6.f256998c = r1
                r1 = 0
                r6.f256999d = r1
                ud.a r2 = new ud.a
                r2.<init>()
                q73.w r3 = r5.f257768d
                int r4 = r3.f257759I
                int r3 = r3.f257760J
                r2.f256771a = r4
                r2.f256772b = r3
                com.github.henryye.nativeiv.BaseImageDecodeService r3 = r6.f257000e
                if (r3 == 0) goto L_0x0031
                r3.setBitmapDecodeSlave(r2)
            L_0x0031:
                q73.w r2 = r5.f257768d
                java.lang.String r2 = r2.f257756F
                java.lang.String r3 = "hy: start prepare image handler"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
                com.github.henryye.nativeiv.BaseImageDecodeService r2 = r6.f257000e
                if (r2 == 0) goto L_0x0047
                q73.e r3 = new q73.e
                r3.<init>()
                r4 = 0
                r2.addImageStreamFetcher(r3, r4)
            L_0x0047:
                com.github.henryye.nativeiv.BaseImageDecodeService r6 = r6.f257000e
                if (r6 == 0) goto L_0x0055
                q73.y r2 = new q73.y
                q73.w r3 = r5.f257768d
                r2.<init>(r3)
                r6.addImageStreamFetcher(r2, r0)
            L_0x0055:
                com.tencent.magicbrush.a r6 = r5.f257769e
                com.tencent.magicbrush.handler.glfont.IMBFontHandler r6 = r6.f235056e
                boolean r0 = r6 instanceof p419td.C26307i
                if (r0 == 0) goto L_0x0060
                r1 = r6
                td.i r1 = (p419td.C26307i) r1
            L_0x0060:
                if (r1 == 0) goto L_0x006e
                td.c r6 = r73.C89894f.f258350g
                r1.f73289f = r6
                td.g r0 = r1.f73286c
                if (r0 == 0) goto L_0x006e
                td.h r0 = r0.f73267a
                r0.f73280f = r6
            L_0x006e:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q73.C89567w.C89572e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: q73.w$f */
    public static final class C89573f implements MBViewManager.C80314a {

        /* renamed from: a */
        public final /* synthetic */ C80301a f257770a;

        /* renamed from: b */
        public final /* synthetic */ C89567w f257771b;

        /* renamed from: q73.w$f$a */
        public static final class C89574a extends C87413o implements C32226l<MagicBrushView, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ LinkedList<Integer> f257772d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89574a(LinkedList<Integer> linkedList) {
                super(1);
                this.f257772d = linkedList;
            }

            public Object invoke(Object obj) {
                MagicBrushView magicBrushView = (MagicBrushView) obj;
                C87412m.m108594g(magicBrushView, LocaleUtil.ITALIAN);
                this.f257772d.add(Integer.valueOf(magicBrushView.getVirtualElementId()));
                return C13598b0.f38549a;
            }
        }

        public C89573f(C80301a aVar, C89567w wVar) {
            this.f257770a = aVar;
            this.f257771b = wVar;
        }

        /* renamed from: a */
        public void mo111627a(MagicBrushView magicBrushView) {
            C87412m.m108594g(magicBrushView, "v");
            String str = this.f257771b.f257756F;
            Log.m105918d(str, "magicBrush onViewRemove " + magicBrushView.getVirtualElementId() + " remains:" + mo123887c());
        }

        /* renamed from: b */
        public void mo111628b(MagicBrushView magicBrushView) {
            C87412m.m108594g(magicBrushView, "v");
            String str = this.f257771b.f257756F;
            Log.m105918d(str, "magicBrush onViewAdd " + magicBrushView.getVirtualElementId() + " remains:" + mo123887c());
        }

        /* renamed from: c */
        public final String mo123887c() {
            LinkedList linkedList = new LinkedList();
            this.f257770a.f235096l.forEach(new C89574a(linkedList));
            return C110818d0.m150921S(linkedList, ",", "[", "]", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
        }
    }

    /* renamed from: q73.w$g */
    public static final class C89575g extends C87413o implements C32224a<C104289g> {

        /* renamed from: d */
        public final /* synthetic */ C89567w f257773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89575g(C89567w wVar) {
            super(0);
            this.f257773d = wVar;
        }

        public Object invoke() {
            return ((C104289g) ((C36570n) this.f257773d.f129281r).getValue()).getJSONObject(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER);
        }
    }

    public C89567w(C89547f fVar, C40427l0 l0Var, C40427l0 l0Var2, C90150b bVar) {
        C87412m.m108594g(fVar, "canvasJsEngine");
        C87412m.m108594g(l0Var, "bizPkg");
        C87412m.m108594g(l0Var2, "wxaPkg");
        C87412m.m108594g(bVar, "performanceReporter");
        this.f257752B = fVar;
        this.f257753C = l0Var;
        this.f257754D = l0Var2;
        this.f257755E = bVar;
        C89590b.m112029c(new C89568a());
        C85458f.m105455a();
        ((C79632b) C86312j.m106911c(C79632b.class)).mo109772Md();
        C47934j jVar = new C47934j(this);
        C40480g z = mo115383z();
        C87412m.m108593f(z, "mainJsContext");
        jVar.mo72687a(z);
        bVar.mo124400c(bVar.f258846l);
        mo73003x1(new C89569b(this));
        bVar.mo124399b(bVar.f258846l);
        C89166m mVar = new C89166m();
        bVar.f258843i = System.currentTimeMillis();
        mVar.f256968a = MMApplicationContext.getContext();
        mVar.mo123519g(C89894f.f258347d.mo124203c());
        mVar.f256970c = new C89570c(this);
        mVar.f256969b = new C89571d(this);
        mVar.mo123517e(C90954a.C90956b.NativeLocker);
        String C = C112760b.m154195C();
        C87412m.m108593f(C, "DATAROOT_SDCARD_PATH()");
        mVar.mo123521i(C);
        boolean z2 = false;
        mVar.mo123522j(false);
        float jj02 = ((C34019v0) C86312j.m106911c(C34019v0.class)).jj0(mVar.f256968a);
        double d = (double) jj02;
        if (0.0d <= d && d <= 1.0d) {
            mVar.f256984q.mo125228b(mVar, C89167n.f256956L[10], Float.valueOf(jj02));
        }
        C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
        mVar.mo123520h(hVar != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_canvas_command_buffer_v2, 0) == 1);
        C80301a k = mVar.mo123512k();
        C87412m.m108591d(k);
        C89167n nVar = k.f235093i;
        C89572e eVar = new C89572e(this, k);
        nVar.getClass();
        eVar.invoke(nVar.f256976i);
        if (BuildInfo.DEBUG) {
            k.f235096l.addListener(new C89573f(k, this));
        }
        bVar.mo124402e(0, 1);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - bVar.f258843i;
        bVar.mo124402e(1, j);
        long j2 = currentTimeMillis - bVar.f258846l;
        bVar.mo124402e(3, j2);
        Log.m105924i("MicroMsg.WebCanvasPerformanceReporter", "performance: [magicBrush]:timeCost=" + j + ", " + j2 + LocaleUtil.MALAY);
        bVar.f258844j = j;
        if (50 <= j && j < 101) {
            bVar.mo124402e(5, 1);
        } else {
            if (101 <= j && j < 301) {
                bVar.mo124402e(6, 1);
            } else {
                if (301 <= j && j < 501) {
                    z2 = true;
                }
                if (z2) {
                    bVar.mo124402e(7, 1);
                } else if (j > 500) {
                    bVar.mo124402e(8, 1);
                }
            }
        }
        this.f257761K = k;
        this.f257764N = new ConcurrentSkipListSet<>();
    }

    /* renamed from: P1 */
    public static /* synthetic */ void m111980P1(C89567w wVar, String str, String str2, ValueCallback valueCallback, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                valueCallback = null;
            }
            wVar.mo123883O1(str, str2, valueCallback);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emit");
    }

    /* renamed from: S1 */
    public static /* synthetic */ C89538a m111981S1(C89567w wVar, Context context, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            return wVar.mo123885R1(context, str, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCanvasContext");
    }

    /* renamed from: T1 */
    public static void m111982T1(C89567w wVar, String str, ValueCallback valueCallback, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "*";
            }
            if ((i & 2) != 0) {
                valueCallback = null;
            }
            wVar.getClass();
            C87412m.m108594g(str, "canvasId");
            wVar.mo123883O1("pause", str, valueCallback);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseRaf");
    }

    /* renamed from: C1 */
    public C48255c.C36631a mo72992C1(String str) {
        C87412m.m108594g(str, "type");
        return new C48255c.C36631a("wxfedb0854e2b1820d", mo72995F1().optJSONObject("client").optLong("idKey", 0));
    }

    /* renamed from: E1 */
    public C48273f mo72994E1() {
        return this.f257757G;
    }

    /* renamed from: F1 */
    public C104289g mo72995F1() {
        Object value = this.f257758H.getValue();
        C87412m.m108593f(value, "<get-vmConfig>(...)");
        return (C104289g) value;
    }

    /* renamed from: G1 */
    public C40427l0 mo72996G1() {
        return this.f257754D;
    }

    /* renamed from: K1 */
    public void mo73000K1(String str, String str2) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        C87412m.m108594g(str2, "targetOrigin");
        this.f257752B.mo72998I1(str, str2);
    }

    /* renamed from: N1 */
    public C89538a mo118108N1(String str, MutableContextWrapper mutableContextWrapper, boolean z, boolean z2) {
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(mutableContextWrapper, "contextWrapper");
        C89538a aVar = new C89538a(str, z, new WeakReference(this.f257752B), z2);
        this.f257752B.f257699F.put(str, aVar);
        return aVar;
    }

    /* renamed from: O1 */
    public final void mo123883O1(String str, String str2, ValueCallback<String> valueCallback) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "canvasId");
        mo60865I0(str, "{target:'" + str2 + "'}", valueCallback);
    }

    /* renamed from: Q1 */
    public final C89538a mo123884Q1(String str) {
        C89538a aVar;
        C87412m.m108594g(str, "canvasId");
        synchronized (this) {
            aVar = this.f257752B.f257699F.get(str);
        }
        return aVar;
    }

    /* renamed from: R1 */
    public final C89538a mo123885R1(Context context, String str, boolean z, boolean z2) {
        C89538a aVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "canvasId");
        synchronized (this) {
            aVar = this.f257752B.f257699F.get(str);
            if (aVar == null) {
                aVar = mo118108N1(str, new MutableContextWrapper(context), z, z2);
            }
        }
        C87412m.m108593f(aVar, "synchronized(this) {\n   …nged, updateHeight)\n    }");
        return aVar;
    }

    /* renamed from: U1 */
    public final void mo123886U1(long j, String str, ValueCallback<String> valueCallback) {
        C87412m.m108594g(str, "canvasId");
        String str2 = this.f257756F;
        Log.m105924i(str2, "repaint #" + str);
        mo60865I0("repaint", "{ target: '" + str + "', start: " + j + " }", valueCallback);
    }

    /* renamed from: y1 */
    public void mo73004y1(C40480g gVar, String str, String str2, C32226l<? super String, C13598b0> lVar, C48255c.C36631a aVar) {
        C87412m.m108594g(gVar, "context");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "type");
        C40480g z = mo115383z();
        if (z != null) {
            z.mo63256J(gVar, "NativeGlobal");
        }
        super.mo73004y1(gVar, str, str2, lVar, aVar);
    }
}
