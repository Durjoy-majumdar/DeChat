package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GameDownloadReport4WebViewEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6012a;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C88955f;
import p237sp.C13747c0;
import p237sp.C13753x;
import p237sp.C13754y;
import p237sp.C48457w;
import p680ru.C77570i;
import p828wa.C53096b;
import p910lj.C76701a;
import y41.C53493b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.d */
public class C5893d extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.d$a */
    public class C5894a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f22119d;

        public C5894a(C5893d dVar, Context context) {
            this.f22119d = context;
        }

        public void run() {
            Context context = this.f22119d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8t), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.d$b */
    public class C5895b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f22120d;

        public C5895b(C5893d dVar, Context context) {
            this.f22120d = context;
        }

        public void run() {
            Context context = this.f22120d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8x), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.d$c */
    public class C5896c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f22121d;

        public C5896c(C5893d dVar, Context context) {
            this.f22121d = context;
        }

        public void run() {
            Context context = this.f22121d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8u), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.d$d */
    public class C5897d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f22122d;

        /* renamed from: e */
        public final /* synthetic */ String f22123e;

        /* renamed from: f */
        public final /* synthetic */ String f22124f;

        /* renamed from: g */
        public final /* synthetic */ Context f22125g;

        /* renamed from: h */
        public final /* synthetic */ JSONObject f22126h;

        /* renamed from: i */
        public final /* synthetic */ C43620m2.C5947b f22127i;

        public C5897d(String str, String str2, String str3, Context context, JSONObject jSONObject, C43620m2.C5947b bVar) {
            this.f22122d = str;
            this.f22123e = str2;
            this.f22124f = str3;
            this.f22125g = context;
            this.f22126h = jSONObject;
            this.f22127i = bVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14217, this.f22122d, 5, this.f22123e, this.f22124f, 3);
            C5893d.this.mo6925f(this.f22125g, this.f22126h, this.f22127i);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.d$e */
    public class C5898e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f22129d;

        /* renamed from: e */
        public final /* synthetic */ String f22130e;

        /* renamed from: f */
        public final /* synthetic */ String f22131f;

        /* renamed from: g */
        public final /* synthetic */ C43620m2.C5947b f22132g;

        public C5898e(C5893d dVar, String str, String str2, String str3, C43620m2.C5947b bVar) {
            this.f22129d = str;
            this.f22130e = str2;
            this.f22131f = str3;
            this.f22132g = bVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14217, this.f22129d, 6, this.f22130e, this.f22131f, 3);
            dialogInterface.dismiss();
            this.f22132g.mo6945a("network_not_wifi", (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return JsApiAddDownloadTaskStraight.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Context context2 = context;
        C43620m2.C5947b bVar2 = bVar;
        Class cls = C13753x.class;
        Log.m105924i("MicroMsg.JsApiAddDownloadTaskStraight", "invokeInMM");
        if (C6012a.m5887a()) {
            Log.m105924i("MicroMsg.JsApiAddDownloadTaskStraight", "addDownloadTaskStraight isTeenMode and ignore");
            C6012a.m5888b(context);
            bVar2.mo6945a("cancel", (JSONObject) null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("task_url");
            long optLong = jSONObject.optLong("task_size");
            if (Util.isNullOrNil(optString)) {
                Log.m105920e("MicroMsg.JsApiAddDownloadTaskStraight", "url is null");
                bVar2.mo6945a("fail", (JSONObject) null);
                return;
            }
            String optString2 = jSONObject.optString("appid");
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
            int optInt2 = jSONObject.optInt("download_type", 1);
            int optInt3 = jSONObject.optInt(TPDownloadProxyEnum.USER_SSID);
            String str2 = optString2;
            ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(9, new C53493b(str2, optInt, jSONObject.optString("extInfo"), jSONObject.optInt("uiarea"), optInt3, jSONObject.optInt("notice_id"), optInt2));
            String optString3 = jSONObject.optString("currentUrl");
            if (jSONObject.optBoolean("use_downloader_widget", false)) {
                ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13114ky(context2, C40979a.m44408b(jSONObject), new C5902e(this, bVar2));
                ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "LuggageGameWebViewUI_addDownloadTask", hashCode());
            } else if (!NetStatusUtil.isNetworkConnected(context)) {
                bVar2.mo6945a("fail_network_not_connected", (JSONObject) null);
                C6013c.m5894f(new C5894a(this, context2));
                Log.m105924i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, network not ready");
            } else if (!C88955f.m111058b()) {
                bVar2.mo6945a("sdcard_not_ready", (JSONObject) null);
                C6013c.m5894f(new C5895b(this, context2));
                Log.m105924i("MicroMsg.JsApiAddDownloadTaskStraight", " fail, sdcard not ready");
            } else if (optLong > 0 && !((C13753x) C86312j.m106911c(cls)).Ci0(optLong) && !((C13753x) C86312j.m106911c(cls)).mo13122Um(optLong)) {
                bVar2.mo6945a("has_not_enough_space", (JSONObject) null);
                C6013c.m5894f(new C5896c(this, context2));
                Log.m105924i("MicroMsg.JsApiAddDownloadTaskStraight", "fail, not enough space, require size = " + optLong);
            } else if (NetStatusUtil.isWifi(context)) {
                mo6925f(context2, jSONObject, bVar2);
            } else {
                C115669n.INSTANCE.mo160131h(14217, optString2, 4, optString3, optString, 3);
                String str3 = optString2;
                String str4 = optString3;
                String str5 = optString;
                C76879j.m92710D(context, context2.getString(C0966R.string.lfa), context2.getString(C0966R.string.lfb), context2.getString(C0966R.string.lf6), context2.getString(C0966R.string.f7926wf), false, new C5897d(str3, str4, str5, context, jSONObject, bVar), new C5898e(this, str3, str4, str5, bVar), C0966R.color.akw);
            }
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.JsApiAddDownloadTaskStraight", "paras data error: " + e.getMessage());
            bVar2.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }

    /* renamed from: f */
    public final void mo6925f(Context context, JSONObject jSONObject, C43620m2.C5947b bVar) {
        JSONObject jSONObject2 = jSONObject;
        C43620m2.C5947b bVar2 = bVar;
        GameDownloadReport4WebViewEvent gameDownloadReport4WebViewEvent = new GameDownloadReport4WebViewEvent();
        String optString = jSONObject2.optString("task_name");
        String optString2 = jSONObject2.optString("task_url");
        String optString3 = jSONObject2.optString("alternative_url");
        long optLong = jSONObject2.optLong("task_size");
        String optString4 = jSONObject2.optString("file_md5");
        String optString5 = jSONObject2.optString("extInfo");
        String optString6 = jSONObject2.optString("fileType");
        String optString7 = jSONObject2.optString("appid");
        String optString8 = jSONObject2.optString("package_name");
        int optInt = jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject2.optInt("downloader_type", 1);
        Class<C13754y> cls = C13754y.class;
        int optInt3 = jSONObject2.optInt("download_type", 1);
        int optInt4 = jSONObject2.optInt(TPDownloadProxyEnum.USER_SSID);
        int i = optInt2;
        int optInt5 = jSONObject2.optInt("uiarea");
        int optInt6 = jSONObject2.optInt("notice_id");
        GameDownloadReport4WebViewEvent.C1075a aVar = gameDownloadReport4WebViewEvent.f9278d;
        aVar.f9279a = optString2;
        aVar.f9280b = optString4;
        aVar.f9282d = optString5;
        aVar.f9281c = optString7;
        aVar.f9283e = optInt;
        gameDownloadReport4WebViewEvent.publish();
        C40939n nVar = new C40939n((C40939n.C2206a) null);
        nVar.f110176a = optString2;
        nVar.f110177b = optString3;
        nVar.f110178c = optLong;
        nVar.f110179d = optString;
        nVar.f110180e = optString4;
        nVar.f110182g = optString7;
        nVar.f110183h = optString8;
        nVar.f110184i = true;
        nVar.f110181f = Util.getInt(optString6, 1);
        nVar.f110187l = optInt;
        nVar.f110197v = optInt3;
        nVar.f110194s = optInt4;
        nVar.f110196u = optInt5;
        nVar.f110195t = optInt6;
        long c = i == 1 ? ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63957c(nVar) : ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63956b(nVar);
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "LuggageGameWebViewUI_addDownloadTask", hashCode());
        if (c <= 0) {
            bVar.mo6945a("fail", (JSONObject) null);
            return;
        }
        C43620m2.C5947b bVar3 = bVar;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("download_id", c);
            bVar3.mo6945a((String) null, jSONObject3);
        } catch (JSONException unused) {
            bVar3.mo6945a((String) null, (JSONObject) null);
        }
    }
}
