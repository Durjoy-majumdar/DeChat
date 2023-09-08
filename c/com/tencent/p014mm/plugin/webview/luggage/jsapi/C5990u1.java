package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.u1 */
public class C5990u1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "setCloseWindowConfirmDialogInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiSetCloseWindowConfirmDialogInfo", "invoke");
        Boolean valueOf = Boolean.valueOf(aVar.f148190b.f129368c.optBoolean(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH));
        String optString = aVar.f148190b.f129368c.optString("title_cn");
        String optString2 = aVar.f148190b.f129368c.optString("title_eng");
        String optString3 = aVar.f148190b.f129368c.optString("ok_cn");
        String optString4 = aVar.f148190b.f129368c.optString("ok_eng");
        String optString5 = aVar.f148190b.f129368c.optString("cancel_cn");
        String optString6 = aVar.f148190b.f129368c.optString("cancel_eng");
        C43661n0 n0Var = ((C43658n) aVar.f148189a).f117951u;
        if (n0Var != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("close_window_confirm_dialog_switch", valueOf.booleanValue());
            bundle.putString("close_window_confirm_dialog_title_cn", optString);
            bundle.putString("close_window_confirm_dialog_title_eng", optString2);
            bundle.putString("close_window_confirm_dialog_ok_cn", optString3);
            bundle.putString("close_window_confirm_dialog_ok_eng", optString4);
            bundle.putString("close_window_confirm_dialog_cancel_cn", optString5);
            bundle.putString("close_window_confirm_dialog_cancel_eng", optString6);
            n0Var.setCloseWindowConfirmInfo(bundle);
            aVar.mo73776a();
        }
    }
}
