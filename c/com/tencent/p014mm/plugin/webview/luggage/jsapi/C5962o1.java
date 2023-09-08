package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6012a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13747c0;
import p237sp.C13754y;
import p237sp.C48456t;
import p237sp.C48457w;
import p680ru.C77570i;
import p749xh.C53352w2;
import p828wa.C53096b;
import p828wa.C53138x;
import y41.C53493b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o1 */
public class C5962o1 extends C43620m2<C53138x> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o1$a */
    public class C5963a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f22197d;

        /* renamed from: e */
        public final /* synthetic */ long f22198e;

        /* renamed from: f */
        public final /* synthetic */ C43620m2.C5947b f22199f;

        public C5963a(JSONObject jSONObject, long j, C43620m2.C5947b bVar) {
            this.f22197d = jSONObject;
            this.f22198e = j;
            this.f22199f = bVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C5962o1.this.mo6954f(this.f22197d, this.f22198e, this.f22199f);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o1$b */
    public class C5964b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f22201d;

        public C5964b(C5962o1 o1Var, C43620m2.C5947b bVar) {
            this.f22201d = bVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f22201d.mo6945a("fail_network_not_wifi", (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return JsApiResumeDownloadTask.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Context context2 = context;
        C43620m2.C5947b bVar2 = bVar;
        Class cls = C48456t.class;
        Log.m105924i("MicroMsg.JsApiResumeDownloadTask", "invokeInMM");
        if (C6012a.m5887a()) {
            Log.m105924i("MicroMsg.JsApiResumeDownloadTask", "resumeDownloadTask isTeenMode and ignore");
            C6012a.m5888b(context);
            bVar2.mo6945a("cancel", (JSONObject) null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            long optLong = jSONObject.optLong("download_id");
            if (optLong <= 0) {
                Log.m105920e("MicroMsg.JsApiResumeDownloadTask", "fail, invalid downloadId = " + optLong);
                bVar2.mo6945a("invalid_downloadid", (JSONObject) null);
                return;
            }
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
            int optInt2 = jSONObject.optInt("uiarea");
            int optInt3 = jSONObject.optInt("notice_id");
            int optInt4 = jSONObject.optInt(TPDownloadProxyEnum.USER_SSID);
            boolean z = true;
            int optInt5 = jSONObject.optInt("download_type", 1);
            if (jSONObject.optInt("ignoreNetwork", 0) != 1) {
                z = false;
            }
            C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(optLong);
            nh.field_scene = optInt;
            nh.field_uiarea = optInt2;
            nh.field_noticeId = optInt3;
            nh.field_ssid = optInt4;
            nh.field_downloadType = optInt5;
            ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
            C53493b bVar3 = new C53493b();
            bVar3.mo74165a(nh);
            bVar3.f150424j = 0;
            ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(10, bVar3);
            boolean optBoolean = jSONObject.optBoolean("use_downloader_widget", false);
            boolean optBoolean2 = jSONObject.optBoolean("download_in_wifi", false);
            if (optBoolean) {
                ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13112em(context, optLong, optBoolean2, z, new C5969p1(this, bVar2));
                ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "LuggageGameWebViewUI_resumeDownloadTask", hashCode());
            } else if (NetStatusUtil.isWifi(context)) {
                mo6954f(jSONObject, optLong, bVar2);
            } else {
                C76879j.m92710D(context, context2.getString(C0966R.string.lfa), context2.getString(C0966R.string.lfb), context2.getString(C0966R.string.lf6), context2.getString(C0966R.string.f7926wf), false, new C5963a(jSONObject, optLong, bVar), new C5964b(this, bVar2), C0966R.color.akw);
            }
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.JsApiResumeDownloadTask", "paras data error: " + e.getMessage());
            bVar2.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53138x>.a aVar) {
    }

    /* renamed from: f */
    public final void mo6954f(JSONObject jSONObject, long j, C43620m2.C5947b bVar) {
        Class cls = C48456t.class;
        C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j);
        if (nh != null && nh.field_fromDownloadApp) {
            nh.field_fromDownloadApp = false;
            nh.field_showNotification = true;
            ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
        }
        if (((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63972t(j)) {
            bVar.mo6945a((String) null, (JSONObject) null);
        } else {
            bVar.mo6945a("fail", (JSONObject) null);
        }
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "LuggageGameWebViewUI_resumeDownloadTask", hashCode());
    }
}
