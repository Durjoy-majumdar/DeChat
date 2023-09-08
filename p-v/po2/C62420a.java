package po2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import gy3.C87412m;
import java.net.URLEncoder;
import nm0.C11221d;
import org.json.JSONObject;
import te3.C64845y1;

/* renamed from: po2.a */
public final class C62420a {

    /* renamed from: a */
    public static final C62420a f177386a = new C62420a();

    /* renamed from: c */
    public static void m73403c(C62420a aVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        SnsMethodCalculate.markStartTimeMs("kvReport$default", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs(C11221d.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        C87412m.m108594g(str, "channel");
        C87412m.m108594g(str2, "header");
        C87412m.m108594g(str3, "content");
        C87412m.m108594g(str4, "extra1");
        C87412m.m108594g(str5, "extra2");
        C115669n.INSTANCE.mo160131h(28131, str, str2, str3, str4, str5);
        SnsMethodCalculate.markEndTimeMs(C11221d.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        SnsMethodCalculate.markEndTimeMs("kvReport$default", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
    }

    /* renamed from: a */
    public final void mo87471a(String str, C64845y1 y1Var, String str2) {
        SnsMethodCalculate.markStartTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        if (str == null) {
            try {
                SnsMethodCalculate.markEndTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
            } catch (Throwable th) {
                Log.m105920e("AdChannelKvReporter", "checkKvReport exp=" + th);
            }
        } else if (y1Var == null) {
            SnsMethodCalculate.markEndTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        } else if (str2 == null) {
            SnsMethodCalculate.markEndTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        } else {
            String b = mo87472b(y1Var);
            String encode = URLEncoder.encode(b, "UTF-8");
            String encode2 = URLEncoder.encode(str2, "UTF-8");
            int length = str.length() + encode.length() + encode2.length();
            Log.m105924i("AdChannelKvReporter", "channel=" + str + ", header.len=" + b.length() + ", content.len=" + str2.length() + ", encodedHeader.len=" + encode.length() + ", encodedContent.len=" + encode2.length() + ", total=" + length);
            if (length < 7168) {
                m73403c(this, str, encode, encode2, (String) null, (String) null, 24, (Object) null);
                C115669n.INSTANCE.mo175911u(1612, 114);
            } else {
                Log.m105920e("AdChannelKvReporter", "content too long for kv");
                C115669n.INSTANCE.mo175911u(1612, 115);
            }
            SnsMethodCalculate.markEndTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        }
    }

    /* renamed from: b */
    public final String mo87472b(C64845y1 y1Var) {
        SnsMethodCalculate.markStartTimeMs("convertHeaderToJsonStr", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TPDownloadProxyEnum.USER_NETWORK_TYPE, y1Var.f186425e);
        jSONObject.put("os_type", y1Var.f186428h);
        jSONObject.put("oaid", y1Var.f186430j);
        jSONObject.put("imei", y1Var.f186431n);
        jSONObject.put("ua", y1Var.f186434q);
        jSONObject.put("common_device_id", y1Var.f186435r);
        jSONObject.put("waid", y1Var.f186436s);
        jSONObject.put("pkg_name", y1Var.f186437t);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        SnsMethodCalculate.markEndTimeMs("convertHeaderToJsonStr", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        return jSONObject2;
    }
}
