package vl2;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import lc3.C10485b;
import nz0.C76982e;

/* renamed from: vl2.c0 */
public class C37751c0 {

    /* renamed from: a */
    public static Boolean f99995a;

    /* renamed from: b */
    public static Boolean f99996b;

    /* renamed from: vl2.c0$a */
    public static class C37752a {

        /* renamed from: a */
        public String f99997a;

        /* renamed from: b */
        public int f99998b;

        /* renamed from: c */
        public String f99999c;
    }

    /* renamed from: a */
    public static boolean m41521a(int i) {
        return i == 1 || i == 8 || i == 4;
    }

    /* renamed from: b */
    public static boolean m41522b() {
        String[] split;
        Class cls = C10485b.class;
        int b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableNewOCRTranslation", 0);
        String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("PicTranslationSupportUserLanguage");
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(b == 1);
        objArr[1] = c;
        objArr[2] = LocaleUtil.getApplicationLanguage();
        Log.m105925i("MicroMsg.ScannerUtil", "enable %s, support lang %s, current lang %s", objArr);
        return b == 1 && !Util.isNullOrNil(c) && (split = c.split(";")) != null && Arrays.asList(split).contains(LocaleUtil.getApplicationLanguage());
    }

    /* renamed from: c */
    public static boolean m41523c(ArrayList<C37752a> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105920e("MicroMsg.ScannerUtil", "list == null || list.size() == 0");
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C37752a aVar = arrayList.get(i);
            if (aVar != null) {
                int i2 = aVar.f99998b;
                C76982e eVar = (C76982e) C86312j.m106911c(C76982e.class);
                if (eVar != null ? eVar.mo59837AA(i2) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m41524d() {
        Log.m105925i("MicroMsg.ScannerUtil", "alvinluo showScanGoodsTab %b", f99995a);
        if (f99995a == null) {
            m41526f();
        }
        return f99995a.booleanValue();
    }

    /* renamed from: e */
    public static void m41525e() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_scan_code_multi_code_enable, 0);
        f99996b = Boolean.valueOf(Qe != 0 || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED);
        Log.m105925i("MicroMsg.ScannerUtil", "alvinluo updateEnableMultiCode clicfg_scan_code_multi_code_enable config: %d, enable: %b", Integer.valueOf(Qe), f99996b);
    }

    /* renamed from: f */
    public static void m41526f() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_disable_scan_goods_tab, 0);
        f99995a = Boolean.valueOf(Qe != 1);
        Log.m105925i("MicroMsg.ScannerUtil", "alvinluo updateShowScanGoodsTabSwitch clicfg_disable_scan_goods_tab config: %d, show: %b", Integer.valueOf(Qe), f99995a);
    }
}
