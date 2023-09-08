package dy1;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GameDownloadReport4WebViewEvent;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
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
import p910lj.C76701a;
import y41.C53493b;
import zt3.C119157j;

/* renamed from: dy1.a */
public class C7536a extends C4770c {

    /* renamed from: dy1.a$a */
    public class C7537a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f25797d;

        public C7537a(C7536a aVar, Context context) {
            this.f25797d = context;
        }

        public void run() {
            Context context = this.f25797d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8t), 0).show();
        }
    }

    /* renamed from: dy1.a$b */
    public class C7538b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f25798d;

        public C7538b(C7536a aVar, Context context) {
            this.f25798d = context;
        }

        public void run() {
            Context context = this.f25798d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8x), 0).show();
        }
    }

    /* renamed from: dy1.a$c */
    public class C7539c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f25799d;

        public C7539c(C7536a aVar, Context context) {
            this.f25799d = context;
        }

        public void run() {
            Context context = this.f25799d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8u), 0).show();
        }
    }

    /* renamed from: dy1.a$d */
    public class C7540d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f25800d;

        /* renamed from: e */
        public final /* synthetic */ String f25801e;

        /* renamed from: f */
        public final /* synthetic */ String f25802f;

        /* renamed from: g */
        public final /* synthetic */ JSONObject f25803g;

        public C7540d(String str, String str2, String str3, JSONObject jSONObject) {
            this.f25800d = str;
            this.f25801e = str2;
            this.f25802f = str3;
            this.f25803g = jSONObject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14217, this.f25800d, 5, this.f25801e, this.f25802f, 3);
            C7536a.this.mo8659q(this.f25803g);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: dy1.a$e */
    public class C7541e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f25805d;

        /* renamed from: e */
        public final /* synthetic */ String f25806e;

        /* renamed from: f */
        public final /* synthetic */ String f25807f;

        public C7541e(String str, String str2, String str3) {
            this.f25805d = str;
            this.f25806e = str2;
            this.f25807f = str3;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(14217, this.f25805d, 6, this.f25806e, this.f25807f, 3);
            dialogInterface.dismiss();
            C7536a.this.f19815f.mo5689a("network_not_wifi");
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        Class cls = C13753x.class;
        String optString = jSONObject2.optString("task_url");
        long optLong = jSONObject2.optLong("task_size");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("LiteAppJsApiAddDownloadTaskStraight", "url is null");
            this.f19815f.mo5689a("uri is null");
            return;
        }
        String optString2 = jSONObject2.optString("appid");
        int optInt = jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject2.optInt("download_type", 1);
        int optInt3 = jSONObject2.optInt(TPDownloadProxyEnum.USER_SSID);
        String str2 = optString;
        C53493b bVar = r8;
        String str3 = optString2;
        C53493b bVar2 = new C53493b(str3, optInt, jSONObject2.optString("extInfo"), jSONObject2.optInt("uiarea"), optInt3, jSONObject2.optInt("notice_id"), optInt2);
        ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(9, bVar);
        String optString3 = jSONObject2.optString("currentUrl");
        if (jSONObject2.optBoolean("use_downloader_widget", false)) {
            ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13114ky(MMApplicationContext.getContext(), C40979a.m44408b(jSONObject), new C7542b(this));
            ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "LuggageGameWebViewUI_addDownloadTask", hashCode());
            return;
        }
        Context context = MMApplicationContext.getContext();
        if (!NetStatusUtil.isNetworkConnected(context)) {
            this.f19815f.mo5689a("fail_network_not_connected");
            ((C119157j) C119157j.f356862d).mo183895z(new C7537a(this, context));
            Log.m105924i("LiteAppJsApiAddDownloadTaskStraight", " fail, network not ready");
        } else if (!C88955f.m111058b()) {
            this.f19815f.mo5689a("sdcard_not_ready");
            ((C119157j) C119157j.f356862d).mo183895z(new C7538b(this, context));
            Log.m105924i("LiteAppJsApiAddDownloadTaskStraight", " fail, sdcard not ready");
        } else if (optLong > 0 && !((C13753x) C86312j.m106911c(cls)).Ci0(optLong) && !((C13753x) C86312j.m106911c(cls)).mo13122Um(optLong)) {
            this.f19815f.mo5689a("has_not_enough_space");
            ((C119157j) C119157j.f356862d).mo183895z(new C7539c(this, context));
            Log.m105924i("LiteAppJsApiAddDownloadTaskStraight", "fail, not enough space, require size = " + optLong);
        } else if (NetStatusUtil.isWifi(context)) {
            mo8659q(jSONObject2);
        } else {
            C115669n.INSTANCE.mo160131h(14217, optString2, 4, optString3, str2, 3);
            C76879j.m92710D(context, context.getString(C0966R.string.lfa), context.getString(C0966R.string.lfb), context.getString(C0966R.string.lf6), context.getString(C0966R.string.f7926wf), false, new C7540d(optString2, optString3, str2, jSONObject), new C7541e(optString2, optString3, str2), C0966R.color.akw);
        }
    }

    /* renamed from: q */
    public final void mo8659q(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
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
            this.f19815f.mo5689a("fail");
            return;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("download_id", c);
            this.f19815f.mo5692d(jSONObject3, false);
        } catch (JSONException unused) {
            this.f19815f.mo5689a("exception");
        }
    }
}
