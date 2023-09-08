package com.tencent.p014mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import java.util.HashMap;
import java.util.Map;
import p823sg.C90193h;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.q1 */
public class C94938q1 {

    /* renamed from: a */
    public static final Map<String, String> f275149a = new HashMap();

    /* renamed from: a */
    public static String m120514a(C101804kv2 kv22, String str) {
        SnsMethodCalculate.markStartTimeMs("buildCdnSightDownloadFileName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        String str2 = C102236a0.m134725T(kv22) + str;
        SnsMethodCalculate.markEndTimeMs("buildCdnSightDownloadFileName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return str2;
    }

    /* renamed from: b */
    public static String m120515b(String str, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("buildCdnSightDownloadSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        String f = C94867e2.m120287f(str, kv22);
        if (Util.isNullOrNil(f)) {
            StringBuilder sb = new StringBuilder();
            String str2 = kv22.f298689d;
            SnsMethodCalculate.markStartTimeMs("buildCdnSightDownloadDirName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            String e = m120518e(C94866e1.m120262YO(), str2);
            SnsMethodCalculate.markEndTimeMs("buildCdnSightDownloadDirName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            sb.append(e);
            sb.append(m120514a(kv22, ""));
            f = sb.toString();
        }
        SnsMethodCalculate.markEndTimeMs("buildCdnSightDownloadSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return f;
    }

    /* renamed from: c */
    public static String m120516c(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getCdnDownloadSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        String str3 = m120518e(C94866e1.m120262YO(), str).replace("MicroMsg", XWalkPlugin.PRIVATE_CACHE_DIR_NAME) + str + "_tmp" + str2;
        SnsMethodCalculate.markEndTimeMs("getCdnDownloadSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return str3;
    }

    /* renamed from: d */
    public static String m120517d(String str) {
        SnsMethodCalculate.markStartTimeMs("getImageFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        String e = m120518e(C94866e1.m120262YO(), str);
        C86013q1.m106461v(e);
        String str2 = e + str + "image_bg_";
        SnsMethodCalculate.markEndTimeMs("getImageFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return str2;
    }

    /* renamed from: e */
    public static String m120518e(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        if (str == null || str2 == null) {
            SnsMethodCalculate.markEndTimeMs("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            return "";
        }
        boolean equals = Looper.getMainLooper().equals(Looper.myLooper());
        if (equals) {
            Map<String, String> map = f275149a;
            if (((HashMap) map).containsKey(str + str2)) {
                String str3 = (String) ((HashMap) map).get(str + str2);
                if (!Util.isNullOrNil(str3)) {
                    SnsMethodCalculate.markEndTimeMs("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
                    return str3;
                }
            }
        }
        String f = C90193h.m112878f(str2.getBytes());
        StringBuffer stringBuffer = new StringBuffer(str);
        if (f.length() >= 1) {
            stringBuffer.append(f.charAt(0));
            stringBuffer.append("/");
        }
        if (f.length() >= 2) {
            stringBuffer.append(f.charAt(1));
            stringBuffer.append("/");
        }
        if (equals) {
            Map<String, String> map2 = f275149a;
            ((HashMap) map2).put(str + str2, stringBuffer.toString());
        }
        String stringBuffer2 = stringBuffer.toString();
        SnsMethodCalculate.markEndTimeMs("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return stringBuffer2;
    }
}
