package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.UnsupportedEncodingException;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.r1 */
public final class C6594r1 {

    /* renamed from: a */
    public static final C6594r1 f23843a = new C6594r1();

    /* renamed from: b */
    public static int f23844b;

    /* renamed from: a */
    public final void mo7521a(Intent intent, String str, boolean z) {
        Bundle bundle;
        String str2;
        Intent intent2 = intent;
        String str3 = str;
        C87412m.m108594g(str3, "url");
        if (intent2 != null && (bundle = (Bundle) intent2.getParcelableExtra("ad_report_bundle")) != null && bundle.getBoolean("ad_need_report", false)) {
            Log.m105924i("MicroMsg.WebViewThirdAdReporter", "adReportArgs is not null and isADReport is true, ad h5");
            String string = bundle.getString("ad_report_ux_info");
            int i = bundle.getInt("ad_report_scene", 0);
            int i2 = bundle.getInt("ad_report_source", 0);
            String string2 = TextUtils.isEmpty(bundle.getString("ad_report_sns_id")) ? bundle.getString("ad_report_sns_id") : "";
            try {
                str2 = C117627q.m165909b(str3, "UTF-8");
                C87412m.m108593f(str2, "encode(url, \"UTF-8\")");
            } catch (UnsupportedEncodingException unused) {
                Log.m105921e("MicroMsg.WebViewThirdAdReporter", "url encode error url = %s", str3);
                str2 = "";
            }
            long currentTimeMillis = System.currentTimeMillis();
            C115669n.INSTANCE.mo160131h(16972, string2, Integer.valueOf(i), string, Integer.valueOf(i2), "", str2, Integer.valueOf(z ? 1 : 0), Integer.valueOf(f23844b), Long.valueOf(currentTimeMillis));
            Log.m105925i("MicroMsg.WebViewThirdAdReporter", "%s,%s,%s,%s,%s,%s,%s,%s,%s", string2, Integer.valueOf(i), string, Integer.valueOf(i2), "", str2, Integer.valueOf(z), Integer.valueOf(f23844b), Long.valueOf(currentTimeMillis));
        }
    }
}
