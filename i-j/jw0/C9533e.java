package jw0;

import a70.C112760b;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.util.FrequentLimiter;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: jw0.e */
public final class C9533e {

    /* renamed from: a */
    public static final C9533e f29713a = new C9533e();

    /* renamed from: b */
    public static final C13601g f29714b = C36568h.m40985a(C9537d.f29729d);

    /* renamed from: c */
    public static final C13601g f29715c = C36568h.m40985a(C9535b.f29727d);

    /* renamed from: d */
    public static final C13601g f29716d = C36568h.m40985a(C9534a.f29726d);

    /* renamed from: e */
    public static boolean f29717e;

    /* renamed from: f */
    public static boolean f29718f;

    /* renamed from: g */
    public static final C13601g f29719g = C36568h.m40985a(C9539f.f29731d);

    /* renamed from: h */
    public static final C13601g f29720h = C36568h.m40985a(C9536c.f29728d);

    /* renamed from: i */
    public static final C13601g f29721i = C36568h.m40985a(C9541h.f29733d);

    /* renamed from: j */
    public static final HashMap<String, Boolean> f29722j = new HashMap<>();

    /* renamed from: k */
    public static boolean f29723k = true;

    /* renamed from: l */
    public static final C13601g f29724l = C36568h.m40985a(C9538e.f29730d);

    /* renamed from: m */
    public static boolean f29725m;

    /* renamed from: jw0.e$a */
    public static final class C9534a extends C87413o implements C32224a<MMKVSlotManager> {

        /* renamed from: d */
        public static final C9534a f29726d = new C9534a();

        public C9534a() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__biz_ad_crash_protect_mmkv_key__");
            C87412m.m108593f(mmkv, "getMMKV(\"__biz_ad_crash_protect_mmkv_key__\")");
            return new MMKVSlotManager(mmkv, 604800);
        }
    }

    /* renamed from: jw0.e$b */
    public static final class C9535b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C9535b f29727d = new C9535b();

        public C9535b() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("BizViewItemCrash");
        }
    }

    /* renamed from: jw0.e$c */
    public static final class C9536c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C9536c f29728d = new C9536c();

        public C9536c() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger());
        }
    }

    /* renamed from: jw0.e$d */
    public static final class C9537d extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C9537d f29729d = new C9537d();

        public C9537d() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: jw0.e$e */
    public static final class C9538e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C9538e f29730d = new C9538e();

        public C9538e() {
            super(0);
        }

        public Object invoke() {
            String str = C112760b.m154195C() + "preloadVideo_debug/videoPrefetcher.js";
            Log.m105918d("MicroMsg.TestBiz", "mpManifestPath = " + str);
            return str;
        }
    }

    /* renamed from: jw0.e$f */
    public static final class C9539f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C9539f f29731d = new C9539f();

        public C9539f() {
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
            if (r1 != false) goto L_0x0052;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r6 = this;
                jw0.e r0 = jw0.C9533e.f29713a
                rx3.g r1 = jw0.C9533e.f29720h
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0052
                rx3.g r1 = jw0.C9533e.f29714b
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r1
                java.lang.String r4 = "BizTimeLineTestMode"
                int r1 = r1.decodeInt(r4, r2)
                if (r1 == r3) goto L_0x0052
                java.lang.Class<h81.h> r1 = h81.C32735h.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                h81.h r1 = (h81.C32735h) r1
                h81.h$c r4 = h81.C32735h.C32737c.clicfg_open_biz_time_line_test
                int r1 = r1.mo58779Qe(r4, r2)
                if (r1 != r3) goto L_0x0038
                r1 = 1
                goto L_0x0039
            L_0x0038:
                r1 = 0
            L_0x0039:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "test biz open "
                r4.append(r5)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                java.lang.String r4 = "MicroMsg.TestBiz"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                if (r1 == 0) goto L_0x0053
            L_0x0052:
                r2 = 1
            L_0x0053:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jw0.C9533e.C9539f.invoke():java.lang.Object");
        }
    }

    /* renamed from: jw0.e$g */
    public static final class C9540g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f29732d;

        public C9540g(String str) {
            this.f29732d = str;
        }

        public final void run() {
            HashMap<String, Boolean> hashMap = C9533e.f29722j;
            if (hashMap.containsKey(this.f29732d)) {
                Log.m105924i("MicroMsg.TestBiz", "postProcessShowView reset crash times viewId=" + this.f29732d);
                hashMap.remove(this.f29732d);
                ((MultiProcessMMKV) ((MMKVSlotManager) ((C36570n) C9533e.f29716d).getValue()).getSlotForWrite()).encode(C9533e.f29713a.mo10209b(this.f29732d), 0);
            }
        }
    }

    /* renamed from: jw0.e$h */
    public static final class C9541h extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C9541h f29733d = new C9541h();

        public C9541h() {
            super(0);
        }

        public Object invoke() {
            C9533e eVar = C9533e.f29713a;
            return Boolean.valueOf(((MultiProcessMMKV) ((C36570n) C9533e.f29714b).getValue()).decodeBool("testAdCrashEnv", false));
        }
    }

    /* renamed from: a */
    public final boolean mo10208a(int i, long j, String str, long j2) {
        int i2 = i;
        long j3 = j;
        String str2 = str;
        C87412m.m108594g(str2, "preloadLastTimeKey");
        Log.m105918d("MicroMsg.TestBiz", "do canPreloadNow defaultInterval=" + j3 + ", crashTimes=" + i2);
        if (i2 > 0) {
            if (f29723k) {
                C117407d.INSTANCE.mo182089r(1454, j2, 1);
                f29723k = false;
            }
            Log.m105920e("MicroMsg.TestBiz", "canPreloadNow hasCrashFlag last time crashTimes=" + i2 + ", defaultInterval=" + j3);
            long j4 = i2 != 1 ? i2 != 2 ? FrequentLimiter.WEEK_MILLS : 86400000 : 10800000;
            if (!BuildInfo.DEBUG) {
                j3 = j4;
            }
        }
        long j5 = mo10210c().getLong(str2, 0);
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(currentTimeMillis - j5);
        if (abs < j3) {
            Log.m105918d("MicroMsg.TestBiz", "canPreloadNow delta(" + abs + ") < interval(" + j3 + ')');
            return false;
        }
        mo10210c().encode(str2, currentTimeMillis);
        return true;
    }

    /* renamed from: b */
    public final String mo10209b(String str) {
        C87412m.m108594g(str, "<this>");
        return "ViewItemCrashTimes_" + str;
    }

    /* renamed from: c */
    public final MultiProcessMMKV mo10210c() {
        return (MultiProcessMMKV) ((C36570n) f29715c).getValue();
    }

    /* renamed from: d */
    public final boolean mo10211d() {
        return ((Boolean) ((C36570n) f29719g).getValue()).booleanValue();
    }

    /* renamed from: e */
    public final void mo10212e(String str) {
        C87412m.m108594g(str, "viewId");
        C119179t tVar = C119157j.f356862d;
        C9540g gVar = new C9540g(str);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(gVar, 2000, false);
    }

    /* renamed from: f */
    public final boolean mo10213f(String str, View view) {
        C87412m.m108594g(str, "viewId");
        HashMap<String, Boolean> hashMap = f29722j;
        if (hashMap.containsKey(str)) {
            Boolean bool = hashMap.get(str);
            if (bool == null) {
                bool = Boolean.TRUE;
            }
            boolean booleanValue = bool.booleanValue();
            Log.m105924i("MicroMsg.TestBiz", "PreProcessShowView " + str + " already processed, result " + booleanValue);
            return booleanValue;
        }
        C13601g gVar = f29716d;
        int decodeInt$default = MMKVSlotManager.decodeInt$default((MMKVSlotManager) ((C36570n) gVar).getValue(), mo10209b(str), 0, 2, (Object) null);
        Log.m105924i("MicroMsg.TestBiz", "PreProcessShowView crash times " + decodeInt$default + " viewId=" + str);
        if (decodeInt$default >= 2) {
            Log.m105920e("MicroMsg.TestBiz", "PreProcessShowView " + str + " crash too much times, can not show now!!");
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/biz/util/TestBiz", "preProcessShowView", "(Ljava/lang/String;Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/biz/util/TestBiz", "preProcessShowView", "(Ljava/lang/String;Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            hashMap.put(str, Boolean.FALSE);
            return false;
        }
        hashMap.put(str, Boolean.TRUE);
        ((MultiProcessMMKV) ((MMKVSlotManager) ((C36570n) gVar).getValue()).getSlotForWrite()).encode(mo10209b(str), decodeInt$default + 1);
        if (((Boolean) ((C36570n) f29720h).getValue()).booleanValue()) {
            ((Boolean) ((C36570n) f29721i).getValue()).booleanValue();
        }
        return true;
    }
}
