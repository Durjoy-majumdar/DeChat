package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import nd3.C47223a;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13749o;
import p237sp.C13754y;
import p237sp.C48456t;
import p749xh.C53352w2;
import p828wa.C53096b;
import p828wa.C53138x;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.n0 */
public class C5950n0 extends C43620m2<C53138x> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.n0$a */
    public class C5951a implements C47223a {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f22183a;

        public C5951a(C5950n0 n0Var, C43620m2.C5947b bVar) {
            this.f22183a = bVar;
        }

        /* renamed from: a */
        public void mo6947a(boolean z) {
            if (z) {
                this.f22183a.mo6945a((String) null, (JSONObject) null);
            } else {
                this.f22183a.mo6945a("fail", (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return JsApiInstallDownloadTask.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Class cls = C48456t.class;
        Log.m105924i("MicroMsg.JsApiInstallDownloadTask", "invokeInOwn");
        try {
            JSONObject jSONObject = new JSONObject(str);
            long optLong = jSONObject.optLong("download_id");
            if (optLong <= 0) {
                Log.m105924i("MicroMsg.JsApiInstallDownloadTask", "data is null");
                bVar.mo6945a("fail_invalid_data", (JSONObject) null);
                return;
            }
            FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63966n(optLong);
            int i = n.f12196f;
            if (i == -1) {
                Log.m105920e("MicroMsg.JsApiInstallDownloadTask", "installDownloadTask fail, apilevel not supported");
                bVar.mo6945a("fail", (JSONObject) null);
            } else if (i != 3) {
                Log.m105920e("MicroMsg.JsApiInstallDownloadTask", "installDownloadTask fail, invalid status = " + n.f12196f);
                bVar.mo6945a("fail", (JSONObject) null);
            } else {
                C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(optLong);
                if (nh != null) {
                    int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    int optInt2 = jSONObject.optInt("uiarea");
                    int optInt3 = jSONObject.optInt("notice_id");
                    int optInt4 = jSONObject.optInt(TPDownloadProxyEnum.USER_SSID);
                    nh.field_scene = optInt;
                    nh.field_uiarea = optInt2;
                    nh.field_noticeId = optInt3;
                    nh.field_ssid = optInt4;
                    ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
                }
                ((C13749o) C86312j.m106911c(C13749o.class)).gt0(n.f12194d, false, new C5951a(this, bVar));
            }
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.JsApiInstallDownloadTask", "paras data error: " + e.getMessage());
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53138x>.a aVar) {
    }
}
