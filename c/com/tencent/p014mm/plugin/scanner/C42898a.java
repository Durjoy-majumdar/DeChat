package com.tencent.p014mm.plugin.scanner;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.tencent.mm.plugin.scanner.a */
public final class C42898a {

    /* renamed from: a */
    public static final C42898a f116163a = new C42898a();

    /* renamed from: b */
    public static long f116164b;

    /* renamed from: a */
    public final String mo67086a(String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                return URLEncoder.encode(str, "utf-8");
            } catch (UnsupportedEncodingException e) {
                Log.m105921e("MicroMsg.AppBrandQRCodeScanReport", "URLEncode fail, throw : %s", e.getMessage());
            }
        }
        return str;
    }

    /* renamed from: b */
    public final void mo67087b(String str, int i, String str2, boolean z, String str3, int i2, String str4, boolean z2, boolean z3, String str5) {
        String str6 = str;
        String str7 = str2;
        String str8 = str4;
        boolean z4 = z3;
        if (!z4) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f116164b < 1000) {
                Log.m105918d("MicroMsg.AppBrandQRCodeScanReport", "report 22688 repeat");
                return;
            }
            f116164b = currentTimeMillis;
        }
        String a = mo67086a(str3);
        String a2 = mo67086a(str5);
        String a3 = mo67086a(str8);
        int i3 = C42914t.m46594o(i2, str4) ? 1 : C42914t.m46591l(i2, str4) ? 2 : C42914t.m46587h(i2, str4) ? 3 : C42914t.m46589j(i2, str4) ? 4 : C42914t.m46593n(i2, str4) ? 5 : C42914t.m46588i(i2, str4) ? 6 : C42914t.m46583d(i2, str4) ? 7 : C42914t.m46586g(i2, str4) ? 8 : 0;
        Log.m105918d("MicroMsg.AppBrandQRCodeScanReport", "report 22688, sessionId=" + str6 + ", scene=" + i + ", appId=" + str7 + " isClick=" + z4 + ", isShowEntry=" + z2 + ", isWebView=" + z + ", reportCodeType=" + i3 + ", codeString=" + str8);
        C115669n.INSTANCE.mo160131h(22688, str6, Integer.valueOf(i), str7, Integer.valueOf(z ? 1 : 0), a, a2, Integer.valueOf(z3 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(i3), a3);
    }
}
