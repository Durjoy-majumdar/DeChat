package com.tencent.p014mm.plugin.scanner;

import ce2.C28547d;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.Arrays;
import java.util.List;
import lc3.C10485b;
import qe3.C89625d;

/* renamed from: com.tencent.mm.plugin.scanner.y */
public class C30391y {

    /* renamed from: a */
    public static Boolean f81989a = null;

    /* renamed from: b */
    public static Boolean f81990b = null;

    /* renamed from: c */
    public static int f81991c = 0;

    /* renamed from: d */
    public static boolean f81992d = false;

    static {
        Class cls = C32735h.class;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_img_translate_threshold_for_test, 10);
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_img_translate_threshold_use_config, 0);
        if (Qe2 == 1) {
            f81991c = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_img_translate_threshold_for_config, 10);
        } else {
            f81991c = Qe;
        }
        f81990b = Boolean.valueOf(((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_image_word_detect_pending_detect_enable, 0) == 1);
        int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_img_translate_entry_always_show_disable, 0);
        if (Qe3 == 1) {
        }
        Log.m105925i("MicroMsg.ScannerHelper", "alvinluo initScannerHelper testTranslateConfig: %s, useConfig: %s, translateConfigRatio %d, pendingWordDetect: %b, disableAlwaysShowTranslateMenu: %s, alwaysShowTranlsateMenu: %s", Integer.valueOf(Qe), Integer.valueOf(Qe2), Integer.valueOf(f81991c), f81990b, Integer.valueOf(Qe3), Boolean.valueOf(f81992d));
    }

    /* renamed from: a */
    public static String m39056a(int i) {
        switch (i) {
            case 1:
                return "en";
            case 2:
                return "zh_CN";
            case 3:
                return LocaleUtil.JAPANESE;
            case 4:
                return LocaleUtil.KOREAN;
            case 5:
                return LocaleUtil.RUSSIAN;
            case 6:
                return LocaleUtil.THAI;
            case 7:
                return LocaleUtil.VIETNAMESE;
            default:
                return "bg";
        }
    }

    /* renamed from: b */
    public static int m39057b(List<Float> list) {
        if (list == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!m39056a(i2).equalsIgnoreCase("bg") && !m39056a(i2).equalsIgnoreCase(LocaleUtil.getApplicationLanguage())) {
                i += (int) (list.get(i2).floatValue() * 100.0f);
            }
        }
        return i;
    }

    /* renamed from: c */
    public static boolean m39058c() {
        String[] split;
        Class cls = C10485b.class;
        if (!m39060e()) {
            Log.m105924i("MicroMsg.ScannerHelper", "Word Detect Closed");
            return false;
        }
        int b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableFavPicTranslation", 0);
        String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("PicTranslationSupportUserLanguage");
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(b == 1);
        objArr[1] = c;
        objArr[2] = LocaleUtil.getApplicationLanguage();
        Log.m105925i("MicroMsg.ScannerHelper", "enable %s, support lang %s, current lang %s", objArr);
        return (b == 1 && !Util.isNullOrNil(c) && (split = c.split(";")) != null && Arrays.asList(split).contains(LocaleUtil.getApplicationLanguage())) || C89625d.f257846l;
    }

    /* renamed from: d */
    public static boolean m39059d() {
        Boolean bool;
        if (BuildInfo.DEBUG && (bool = f81989a) != null) {
            return bool.booleanValue();
        }
        C28547d dVar = (C28547d) C86709a0.m107533q(C28547d.class);
        if (!f81990b.booleanValue() || dVar == null || !dVar.mo56052aI()) {
            return false;
        }
        Log.m105924i("MicroMsg.ScannerHelper", "isPendingWordDetect disabled by memory degrade.");
        return true;
    }

    /* renamed from: e */
    public static boolean m39060e() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_lib_word_detect_open, 1) == 1;
    }

    /* renamed from: f */
    public static boolean m39061f(List<Float> list) {
        int i;
        if (list != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (m39056a(i2).equalsIgnoreCase("bg")) {
                    i = (int) (list.get(i2).floatValue() * 100.0f);
                    break;
                } else {
                    i2++;
                }
            }
        }
        i = 0;
        Log.m105925i("MicroMsg.ScannerHelper", "needShowOCRMenu transBgRatio: %s", Integer.valueOf(i));
        return i < 99 && i > 0;
    }

    /* renamed from: g */
    public static boolean m39062g(int i) {
        return i >= f81991c;
    }
}
