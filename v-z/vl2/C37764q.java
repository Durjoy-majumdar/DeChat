package vl2;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;

/* renamed from: vl2.q */
public final class C37764q {

    /* renamed from: a */
    public static final C37764q f100029a = new C37764q();

    /* renamed from: b */
    public static MultiProcessMMKV f100030b = null;

    /* renamed from: c */
    public static boolean f100031c = false;

    /* renamed from: d */
    public static boolean f100032d = false;

    /* renamed from: e */
    public static int f100033e = 4;

    /* renamed from: f */
    public static int f100034f = 1;

    /* renamed from: g */
    public static int f100035g = 20;

    /* renamed from: h */
    public static int f100036h = 15;

    /* renamed from: i */
    public static int f100037i = 5000;

    static {
        Class cls = C32735h.class;
        boolean z = false;
        try {
            boolean a = C86709a0.m107522a();
            if (a && f100030b == null) {
                f100030b = MultiProcessMMKV.getMMKV(C75592q0.m90789s() + "_scan_product_skip_frame");
            }
            Log.m105925i("MicroMsg.ScanProductSkipFrameManager", "initMMKV %s, mmkv: %s", Boolean.valueOf(a), f100030b);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanProductSkipFrameManager", e, "checkInitMMKV exception", new Object[0]);
        }
        f100032d = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_merge_enable_adjust_engine_skip_frame_count, 0) == 1 || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger();
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_merge_enable_adjust_server_detect_skip_frame_count, 0) == 1 || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
            z = true;
        }
        f100031c = z;
        C37764q qVar = f100029a;
        Integer b = qVar.mo61329b(C32735h.C32737c.clicfg_scan_merge_engine_detect_max_skip_frame_count, 4);
        if (b != null) {
            f100033e = b.intValue();
        }
        Integer b2 = qVar.mo61329b(C32735h.C32737c.clicfg_scan_merge_engine_detect_min_skip_frame_count, 1);
        if (b2 != null) {
            f100034f = b2.intValue();
        }
        Integer b3 = qVar.mo61329b(C32735h.C32737c.clicfg_scan_merge_server_detect_max_skip_frame_count, 20);
        if (b3 != null) {
            f100035g = b3.intValue();
        }
        Integer b4 = qVar.mo61329b(C32735h.C32737c.clicfg_scan_merge_server_detect_min_skip_frame_count, 15);
        if (b4 != null) {
            f100036h = b4.intValue();
        }
        Integer b5 = qVar.mo61329b(C32735h.C32737c.clicfg_scan_merge_server_detect_timeout_ms, 5000);
        if (b5 != null) {
            f100037i = b5.intValue();
        }
        Log.m105924i("MicroMsg.ScanProductSkipFrameManager", "initSkipFrameManager enableAdjustEngineDetectFrame: " + f100032d + ", enableAdjustServerDetectFrame: " + f100031c + ", engineDetectMaxFrame: " + f100033e + ",engineDetectMinFrame: " + f100034f + ", serverDetectMaxFrame: " + f100035g + ", serverDetectMinFrame: " + f100036h + ", serverDetecTimeout: " + f100037i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r1 = f100030b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m41536a() {
        /*
            int r0 = cl2.C28609a.f78504d
            boolean r1 = f100032d
            if (r1 != 0) goto L_0x0007
            return r0
        L_0x0007:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = f100030b
            if (r1 == 0) goto L_0x0012
            java.lang.String r2 = "scan_product_engine_detect_skip_frame_count"
            int r0 = r1.getInt(r2, r0)
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.C37764q.m41536a():int");
    }

    /* renamed from: b */
    public final Integer mo61329b(C32735h.C32737c cVar, int i) {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(cVar, i);
        if (Qe > 0) {
            return Integer.valueOf(Qe);
        }
        return null;
    }
}
