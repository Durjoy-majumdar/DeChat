package by0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.plugin.bizui.widget.StoryListView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18366u2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18386y1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cy0.C20372d;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p167hz.C8835h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;

/* renamed from: by0.a */
public final class C16825a {

    /* renamed from: a */
    public static final C16825a f45444a = new C16825a();

    /* renamed from: b */
    public static final C13601g f45445b = C36568h.m40985a(C0392b.f996d);

    /* renamed from: c */
    public static final C13601g f45446c;

    /* renamed from: d */
    public static int f45447d;

    /* renamed from: e */
    public static int[] f45448e;

    /* renamed from: f */
    public static int[] f45449f;

    /* renamed from: g */
    public static HashMap<Long, WeakReference<C18366u2>> f45450g = new HashMap<>();

    /* renamed from: h */
    public static long f45451h = -1;

    /* renamed from: i */
    public static boolean f45452i;

    /* renamed from: j */
    public static boolean f45453j = true;

    /* renamed from: k */
    public static Runnable f45454k;

    /* renamed from: l */
    public static int f45455l;

    /* renamed from: by0.a$b */
    public static final class C0392b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C0392b f996d = new C0392b();

        public C0392b() {
            super(0);
        }

        public Object invoke() {
            Boolean bool;
            boolean z = false;
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || WeChatEnvironment.isCoolassistEnv()) {
                MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
                bool = singleMMKV != null ? Boolean.valueOf(singleMMKV.decodeBool("biz_tl_video_auto_play", false)) : null;
            } else {
                bool = Boolean.FALSE;
            }
            if ((bool != null ? bool.booleanValue() : false) || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_timeline_video_preview_new, 0) == 1) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.MPVideoPreviewMgr", "clicfg_open_timeline_video_preview_new=" + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: by0.a$c */
    public static final class C0393c extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C0393c f997d = new C0393c();

        public C0393c() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("MPVideoPreviewConfig");
        }
    }

    /* renamed from: by0.a$a */
    public enum C16826a {
        SCROLL,
        IDLE,
        INIT
    }

    static {
        C13601g a = C36568h.m40985a(C0393c.f997d);
        f45446c = a;
        f45447d = ((MultiProcessMMKV) ((C36570n) a).getValue()).getInt("auto_play_trigger_threshold_in_ms", 1000);
    }

    /* renamed from: g */
    public static void m16471g(C16825a aVar, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        aVar.getClass();
        Log.m105924i("MicroMsg.MPVideoPreviewMgr", "stopPreviewAd except = " + j);
        for (Map.Entry next : f45450g.entrySet()) {
            if (((Number) next.getKey()).longValue() != j) {
                if (((WeakReference) next.getValue()).get() instanceof C18386y1) {
                    Object obj2 = ((WeakReference) next.getValue()).get();
                    C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardNativeFinder");
                    C18386y1 y1Var = (C18386y1) obj2;
                }
                if (z || !(((WeakReference) next.getValue()).get() instanceof C18386y1)) {
                    C18366u2 u2Var = (C18366u2) ((WeakReference) next.getValue()).get();
                    if (u2Var != null) {
                        u2Var.mo22834f(3);
                    }
                } else {
                    C18366u2 u2Var2 = (C18366u2) ((WeakReference) next.getValue()).get();
                    if (u2Var2 != null) {
                        u2Var2.mo22834f(2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17863a(C16826a aVar, StoryListView storyListView, C18508z2 z2Var) {
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C87412m.m108594g(storyListView, "list");
        C87412m.m108594g(z2Var, "adapter");
        if (mo17865c() && f45452i) {
            Log.m105924i("MicroMsg.MPVideoPreviewMgr", "checkPosition reason = " + aVar);
            if (NetStatusUtil.isWifi(MMApplicationContext.getContext()) || ((C8835h) C86312j.m106911c(C8835h.class)).mo9678GQ()) {
                C0000n0 b = C53930o0.m60555b();
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(b, C58901s.f168555a, (C53934p0) null, new C16827b(storyListView, z2Var, (C15601d<? super C16827b>) null), 2, (Object) null);
                return;
            }
            Log.m105924i("MicroMsg.MPVideoPreviewMgr", "checkPosition not wifi");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r9 = r9.f55530o1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17864b(com.tencent.p014mm.storage.C19623o0 r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "extra"
            gy3.C87412m.m108594g(r10, r0)
            boolean r10 = r8.mo17865c()
            if (r10 != 0) goto L_0x0011
            return
        L_0x0011:
            int r10 = r9.field_type
            r0 = 620757041(0x25000031, float:1.1102295E-16)
            r1 = 0
            if (r10 != r0) goto L_0x0025
            te3.re4 r9 = r9.f55530o1
            if (r9 == 0) goto L_0x0025
            r10 = 104(0x68, float:1.46E-43)
            int r9 = r9.f64521j
            if (r10 != r9) goto L_0x0025
            r9 = 1
            goto L_0x0026
        L_0x0025:
            r9 = 0
        L_0x0026:
            if (r9 == 0) goto L_0x0033
            r3 = 0
            r5 = 1
            r6 = 1
            r7 = 0
            r2 = r8
            m16471g(r2, r3, r5, r6, r7)
            f45453j = r1
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: by0.C16825a.mo17864b(com.tencent.mm.storage.o0, java.lang.String):void");
    }

    /* renamed from: c */
    public final boolean mo17865c() {
        return ((Boolean) ((C36570n) f45445b).getValue()).booleanValue();
    }

    /* renamed from: d */
    public final long mo17866d(String str) {
        C87412m.m108594g(str, "id");
        Map<Long, Integer> map = C20372d.f57086a;
        Long l = (Long) ((LinkedHashMap) C20372d.f57087b).get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo17867e(String str) {
        C87412m.m108594g(str, "finder_object_id");
        Map<Long, Integer> map = C20372d.f57086a;
        Integer num = (Integer) ((LinkedHashMap) C20372d.f57088c).get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo17868f(C19623o0 o0Var, C18366u2 u2Var) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(u2Var, "cardTmpl");
        if (mo17865c()) {
            f45450g.put(Long.valueOf(o0Var.field_msgId), new WeakReference(u2Var));
        }
    }

    /* renamed from: h */
    public final void mo17869h(String str) {
        WeakReference weakReference;
        C18366u2 u2Var;
        WeakReference weakReference2;
        C18366u2 u2Var2;
        if (mo17865c() && !Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.MPVideoPreviewMgr", "triggerEvent, event = " + str);
            if (C87412m.m108589b(str, "ONPAUSE")) {
                long j = f45451h;
                if (!(j == -1 || (weakReference2 = f45450g.get(Long.valueOf(j))) == null || (u2Var2 = (C18366u2) weakReference2.get()) == null)) {
                    u2Var2.mo22834f(2);
                }
                f45452i = false;
            } else if (C87412m.m108589b(str, "ONRESUME")) {
                if (f45453j) {
                    long j2 = f45451h;
                    if (!(j2 == -1 || (weakReference = f45450g.get(Long.valueOf(j2))) == null || (u2Var = (C18366u2) weakReference.get()) == null)) {
                        u2Var.mo22834f(1);
                    }
                }
                f45453j = true;
                f45452i = true;
            }
        }
    }
}
