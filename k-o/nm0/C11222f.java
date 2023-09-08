package nm0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

/* renamed from: nm0.f */
public class C11222f extends C82268c {
    private static final int CTRL_INDEX = 45;
    private static final String NAME = "reportAction";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i3 = i;
        String optString = jSONObject2.optString("key");
        String optString2 = jSONObject2.optString("value");
        Log.m105925i("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey =  %s, actionValue =  %s", optString, optString2);
        if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2)) {
            Log.m105920e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue is null");
            fVar2.mo109647a(i3, mo115109j("fail"));
        } else if (optString.length() <= 0 || optString.length() > 32 || optString2.length() <= 0 || optString2.length() > 1024) {
            Log.m105920e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue size is bad");
            fVar2.mo109647a(i3, mo115109j("fail"));
        } else {
            String appId = fVar.getAppId();
            if (TextUtils.isEmpty(appId)) {
                Log.m105920e("MicroMsg.JsApiReportAction", "doReportActionInfo, appId is empty");
                fVar2.mo109647a(i3, mo115109j("fail"));
                return;
            }
            Log.m105925i("MicroMsg.JsApiReportAction", "doReportActionInfo, appId %s", appId);
            if (NetStatusUtil.isConnected(fVar.getContext())) {
                i2 = NetStatusUtil.isWifi(fVar.getContext()) ? 1 : NetStatusUtil.is5G(fVar.getContext()) ? 5 : NetStatusUtil.is4G(fVar.getContext()) ? 4 : NetStatusUtil.is3G(fVar.getContext()) ? 3 : NetStatusUtil.is2G(fVar.getContext()) ? 2 : 0;
                Log.m105925i("MicroMsg.JsApiReportAction", "doReportActionInfo, get networkType %d", Integer.valueOf(i2));
            } else {
                i2 = 0;
            }
            long nowSecond = Util.nowSecond();
            Log.m105919d("MicroMsg.JsApiReportAction", "report(%s), clickTimestamp : %d, appID %s, networkType %d, userAgent %s, url : %s, sessionID : %s, actionKey : %s, actionValue : %s", Long.valueOf(nowSecond), 13579, appId, Integer.valueOf(i2), "", "", "", optString, optString2);
            try {
                str2 = URLEncoder.encode(Util.nullAsNil(""), "UTF-8");
                try {
                    str = URLEncoder.encode("", "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    str3 = "";
                    str = str3;
                    Log.printErrStackTrace("MicroMsg.JsApiReportAction", e, "", new Object[0]);
                    str4 = "";
                    C115669n.INSTANCE.mo160131h(13579, appId, Integer.valueOf(i2), str2, str, "", str3, str4, Long.valueOf(nowSecond), Long.valueOf(nowSecond));
                    fVar2.mo109647a(i3, mo115109j("ok"));
                }
                try {
                    str3 = URLEncoder.encode(optString, "UTF-8");
                    try {
                        str4 = URLEncoder.encode(optString2, "UTF-8");
                    } catch (UnsupportedEncodingException e2) {
                        e = e2;
                        Log.printErrStackTrace("MicroMsg.JsApiReportAction", e, "", new Object[0]);
                        str4 = "";
                        C115669n.INSTANCE.mo160131h(13579, appId, Integer.valueOf(i2), str2, str, "", str3, str4, Long.valueOf(nowSecond), Long.valueOf(nowSecond));
                        fVar2.mo109647a(i3, mo115109j("ok"));
                    }
                } catch (UnsupportedEncodingException e3) {
                    e = e3;
                    str3 = "";
                    Log.printErrStackTrace("MicroMsg.JsApiReportAction", e, "", new Object[0]);
                    str4 = "";
                    C115669n.INSTANCE.mo160131h(13579, appId, Integer.valueOf(i2), str2, str, "", str3, str4, Long.valueOf(nowSecond), Long.valueOf(nowSecond));
                    fVar2.mo109647a(i3, mo115109j("ok"));
                }
            } catch (UnsupportedEncodingException e4) {
                e = e4;
                str3 = "";
                str2 = str3;
                str = str2;
                Log.printErrStackTrace("MicroMsg.JsApiReportAction", e, "", new Object[0]);
                str4 = "";
                C115669n.INSTANCE.mo160131h(13579, appId, Integer.valueOf(i2), str2, str, "", str3, str4, Long.valueOf(nowSecond), Long.valueOf(nowSecond));
                fVar2.mo109647a(i3, mo115109j("ok"));
            }
            C115669n.INSTANCE.mo160131h(13579, appId, Integer.valueOf(i2), str2, str, "", str3, str4, Long.valueOf(nowSecond), Long.valueOf(nowSecond));
            fVar2.mo109647a(i3, mo115109j("ok"));
        }
    }
}
