package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.wallet_core.model.r0 */
public class C75136r0 {

    /* renamed from: a */
    public static long f221075a;

    /* renamed from: a */
    public static boolean m90119a(int i, int i2) {
        return i == 385 && (i2 == 0 || i2 == 1 || i2 == 16);
    }

    /* renamed from: b */
    public static boolean m90120b(int i, int i2) {
        return i == 398 || (i == 385 && (i2 == 74 || i2 == 75)) || i == 1544 || i == 1582 || i == 498 || i == 397 || i == 1575 || i == 1639 || i == 556 || i == 422;
    }

    /* renamed from: c */
    public static void m90121c(String str, String str2, String str3, int i, String str4) {
        if (str3 != null && str3.length() > 0) {
            String str5 = null;
            try {
                if (Character.isDigit(str3.charAt(0))) {
                    for (int i2 = 0; i2 < str3.length(); i2++) {
                        char charAt = str3.charAt(i2);
                        if (!Character.isDigit(charAt) && !".".equalsIgnoreCase(String.valueOf(charAt))) {
                            str5 = str3.substring(i2).trim();
                            str3 = str3.substring(0, i2 - 1).trim();
                        }
                    }
                } else {
                    for (int i3 = 0; i3 < str3.length(); i3++) {
                        char charAt2 = str3.charAt(i3);
                        if (Character.isDigit(charAt2) || ".".equalsIgnoreCase(String.valueOf(charAt2))) {
                            str5 = str3.substring(0, i3 - 1).trim();
                            str3 = str3.substring(i3).trim();
                        }
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WalletReportUtil", "", e);
            }
            C115669n.INSTANCE.mo160131h(10756, str, str2, str3, str5, Integer.valueOf(i), str4);
        }
    }

    /* renamed from: d */
    public static void m90122d(int i, int i2) {
        C115669n.INSTANCE.mo160131h(12097, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis()));
    }
}
