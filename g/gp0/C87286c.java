package gp0;

import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.C55548a;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.UnsupportedEncodingException;
import p206nj.C117627q;
import sp0.C90326y;

/* renamed from: gp0.c */
public class C87286c implements C90326y {
    /* renamed from: b */
    public void mo121694b(String str) {
    }

    /* renamed from: c */
    public void mo121695c(String str, String str2, String str3, String str4, long j, long j2, int i, int i2, int i3, String str5, String str6) {
        String str7;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str5;
        String str12 = str6;
        AppBrandSysConfigWC e = C81682d.m100225e(str);
        if (e != null) {
            String str13 = str4;
            try {
                str7 = C117627q.m165909b(str13, "utf-8");
            } catch (UnsupportedEncodingException unused) {
                Log.m105928w("MicroMsg.AppBrand.Report.kv_14510", "kv_14510 report UnsupportedEncodingException");
                str7 = str13;
            }
            int i4 = e.f261072r.pkgVersion;
            int i5 = e.f261072r.f238585d + 1;
            String b = C84116i0.m103659b(MMApplicationContext.getContext());
            int e2 = C84240s.m103839e(str);
            C55548a.f158170a.mo77078b(14510, str8, Integer.valueOf(i4), Integer.valueOf(i5), b, str9, str7, str10, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str11, str12, Integer.valueOf(e2));
            if (Log.getLogLevel() <= 1) {
                Log.m105918d("MicroMsg.AppBrand.Report.kv_14510", "report kv_14510{" + "appId='" + str8 + '\'' + ", appVersion=" + i4 + ", appState=" + i5 + ", appType=" + e2 + ", networkType='" + b + '\'' + ", functionName='" + str9 + '\'' + ", url='" + str7 + '\'' + ", method='" + str10 + '\'' + ", sentsize=" + j + ", receivedsize=" + j2 + ", statusCode=" + i + ", result=" + i2 + ", costtime=" + i3 + ", dstPath=" + str11 + ", contentType=" + str12 + '}');
                return;
            }
            return;
        }
        Log.m105929w("MicroMsg.AppBrand.Report.kv_14510", "kv_14510 report config is null. %s", str8);
    }
}
