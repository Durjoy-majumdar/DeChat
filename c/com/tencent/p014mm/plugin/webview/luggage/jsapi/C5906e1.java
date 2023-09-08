package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13747c0;
import p237sp.C48456t;
import p749xh.C53352w2;
import p828wa.C53096b;
import p828wa.C53138x;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.e1 */
public class C5906e1 extends C43620m2<C53138x> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.e1$a */
    public class C5907a implements C13747c0.C13748a {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f22136a;

        public C5907a(C5906e1 e1Var, C43620m2.C5947b bVar) {
            this.f22136a = bVar;
        }

        /* renamed from: a */
        public void mo287a(String str, JSONObject jSONObject) {
            this.f22136a.mo6945a(str, jSONObject);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return JsApiPauseDownloadTask.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Class cls = C48456t.class;
        try {
            JSONObject jSONObject = new JSONObject(str);
            long optLong = jSONObject.optLong("download_id");
            if (optLong <= 0) {
                Log.m105920e("MicroMsg.JsApiPauseDownloadTask", "fail, invalid downloadId = " + optLong);
                bVar.mo6945a("invalid_downloadid", (JSONObject) null);
                return;
            }
            C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(optLong);
            if (nh == null) {
                bVar.mo6945a((String) null, (JSONObject) null);
                return;
            }
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
            int optInt2 = jSONObject.optInt("uiarea");
            int optInt3 = jSONObject.optInt("notice_id");
            int optInt4 = jSONObject.optInt(TPDownloadProxyEnum.USER_SSID);
            boolean z = true;
            if (jSONObject.optInt("ignoreNetwork", 0) != 1) {
                z = false;
            }
            nh.field_scene = optInt;
            nh.field_uiarea = optInt2;
            nh.field_noticeId = optInt3;
            nh.field_ssid = optInt4;
            nh.field_downloadInWifi = false;
            ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
            ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13113hB(context, optLong, z, new C5907a(this, bVar));
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.JsApiPauseDownloadTask", "paras data error: " + e.getMessage());
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53138x>.a aVar) {
    }
}
