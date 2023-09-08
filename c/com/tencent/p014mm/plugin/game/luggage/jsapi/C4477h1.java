package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.h1 */
public class C4477h1 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "reportGamePageTime";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
        JSONObject jSONObject = aVar.f148190b.f129368c;
        String optString = jSONObject.optString("reportId");
        boolean z = jSONObject.optInt("reportInstantly", 0) == 1;
        boolean z2 = jSONObject.optInt("reportTimeBegin", 0) == 1;
        String optString2 = jSONObject.optString("reportFormatData");
        String optString3 = jSONObject.optString("reportTabsFormatData");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiReportGamePageTime", "reportId is null or nil");
            aVar.mo73778c("invalid_reportId", (JSONObject) null);
        } else if (!Util.isNullOrNil(optString2) || !Util.isNullOrNil(optString3)) {
            Log.m105925i("MicroMsg.JsApiReportGamePageTime", "reportGamePageTime, reportId:%s, reportInstantly:%b, reportTimeBegin:%b, reportFormatData:(%s), reportTabsFormatData(%s)", optString, Boolean.valueOf(z), Boolean.valueOf(z2), optString2, optString3);
            Bundle bundle = new Bundle();
            bundle.putString("game_page_report_id", optString);
            bundle.putBoolean("game_page_report_instantly", z);
            bundle.putBoolean("game_page_report_time_begin", z2);
            bundle.putString("game_page_report_format_data", optString2);
            bundle.putString("game_page_report_tabs_format_data", optString3);
            ((GameWebPage) aVar.f148189a).f112963i1.f119298f.mo68641d(bundle);
            aVar.mo73776a();
        } else {
            Log.m105920e("MicroMsg.JsApiReportGamePageTime", "reportFormatData && reportTabsFormatData is null or nil");
            aVar.mo73778c("invalid_reportFormatData_reportTabsFormatData", (JSONObject) null);
        }
    }
}
