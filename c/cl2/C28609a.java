package cl2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import vl2.C37756o;

/* renamed from: cl2.a */
public final class C28609a {

    /* renamed from: a */
    public static MultiProcessMMKV f78501a = null;

    /* renamed from: b */
    public static boolean f78502b = false;

    /* renamed from: c */
    public static boolean f78503c = true;

    /* renamed from: d */
    public static int f78504d = 4;

    /* renamed from: e */
    public static boolean f78505e = true;

    /* renamed from: f */
    public static int f78506f = 20;

    /* renamed from: g */
    public static boolean f78507g = false;

    /* renamed from: h */
    public static int f78508h = 1;

    /* renamed from: i */
    public static int f78509i = 1;

    /* renamed from: j */
    public static boolean f78510j = true;

    static {
        Class cls = C32735h.class;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_image_ocr_disable, 0);
        if (Qe == 1) {
        }
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_merge_scan_product_skip_frame_count, 4);
        if (Qe2 > 0) {
            f78504d = Qe2;
        }
        int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_merge_upload_image_encode_type, 1);
        if (Qe3 == 1 || Qe3 == 2) {
            f78509i = Qe3;
        }
        int Qe4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_merge_origin_image_encode_type, 1);
        if (Qe3 == 1 || Qe3 == 2) {
            f78508h = Qe4;
        }
        if (f78508h == 2 && f78509i == 1) {
            Log.m105928w("MicroMsg.ScanClientConfigManager", "force set encodeImageType: wxam");
            f78509i = 2;
        }
        int Qe5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_merge_disable_image_detect_by_server, 0);
        int Qe6 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_merge_scan_no_result_frame_count_limit, 20);
        if (Qe5 == 1) {
        }
        if (Qe6 > 0) {
            f78506f = Qe6;
        }
        f78510j = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_merge_enable_skip_framge_by_sensor, 1) == 1;
        m38282b();
        int Qe7 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_product_enable_xnet, 0);
        f78507g = Qe7 == 1;
        Log.m105925i("MicroMsg.ScanClientConfigManager", "updateScanProductConfig config: %s, enable: %s", Integer.valueOf(Qe7), Boolean.valueOf(f78507g));
        Log.m105924i("MicroMsg.ScanClientConfigManager", "ScanClientConfigManager init disableImageOCR config: " + Qe + ", enableImageOCR: " + f78502b + ", configEncodeImageType: " + Qe3 + ", scanProductEncodeImageType: " + f78509i + ", configOriginImageType: " + Qe4 + ", scanProductOriginImageType: " + f78508h + ", skipFrameCount: " + f78504d + ", configDisableServerDetect: " + Qe5 + ", disableImageDetectByServer: " + f78505e + ", configScanNoResultFrame: " + Qe6 + ", scanNoResultFrameCountLimit: " + f78506f + ", enableScanProductSkipFrameBySensor:" + f78510j);
        try {
            boolean a = C86709a0.m107522a();
            Log.m105925i("MicroMsg.ScanClientConfigManager", "initMMKV %s, mmkv: %s", Boolean.valueOf(a), f78501a);
            if (a && f78501a == null) {
                f78501a = MultiProcessMMKV.getMMKV(C75592q0.m90789s() + "_scan_client_config_mmkv");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanClientConfigManager", e, "checkInitMMKV exception", new Object[0]);
        }
    }

    /* renamed from: a */
    public static final boolean m38281a() {
        return C37756o.m41529a() ? MultiProcessMMKV.getSingleMMKV("ScanDebug").getBoolean("useXNet", false) : f78507g;
    }

    /* renamed from: b */
    public static final void m38282b() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.scan_goods_tabmerge_param, 0);
        if (Qe != 0) {
            if (Qe == 1) {
                f78503c = true;
            } else if (Qe == 2) {
                f78503c = false;
            }
            Log.m105924i("MicroMsg.ScanClientConfigManager", "updateEnableScanCodeAndProductCombine update by expt, enable: " + f78503c + ", config: " + Qe);
            return;
        }
        f78503c = true;
        if (C37756o.m41529a() && MultiProcessMMKV.getSingleMMKV("ScanDebug").getBoolean("disableMerge", false)) {
            f78503c = false;
        }
        Log.m105924i("MicroMsg.ScanClientConfigManager", "updateEnableScanCodeAndProductCombine enable: " + f78503c);
    }
}
