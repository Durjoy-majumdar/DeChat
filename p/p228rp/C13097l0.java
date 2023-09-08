package p228rp;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.downloader.event.DownloadEventBus;
import com.tencent.p014mm.plugin.downloader.model.C2196b0;
import com.tencent.p014mm.plugin.downloader.model.C2197c0;
import com.tencent.p014mm.plugin.downloader.model.C2199d0;
import com.tencent.p014mm.plugin.downloader.model.C2201e0;
import com.tencent.p014mm.plugin.downloader.model.C2202f0;
import com.tencent.p014mm.plugin.downloader.model.C2204g0;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArraySet;
import ji3.C9457a;
import js0.C88024r;
import org.json.JSONObject;
import p237sp.C13747c0;
import p237sp.C13754y;
import p237sp.C36768q;
import p237sp.C48456t;
import p237sp.C48457w;
import p237sp.C90271s;
import p749xh.C53352w2;
import y41.C53493b;

@C86522b
/* renamed from: rp.l0 */
public class C13097l0 extends C86301e implements C90271s {
    /* renamed from: D7 */
    public void mo12598D7(Context context, long j, JSONObject jSONObject, C90271s.C13751b bVar) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        Context context2 = context;
        Class cls = C48456t.class;
        if (j <= 0) {
            Log.m105920e("MicroMsg.MBJsApiGameDownloadManager", "fail, invalid downloadId = " + j);
            bVar.mo13120b(808, "invalid_downloadid");
            return;
        }
        C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j);
        if (nh == null) {
            bVar.mo13120b(805, "get DownloadInfo fail");
            return;
        }
        int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject.optInt("uiarea");
        int optInt3 = jSONObject.optInt("noticeId");
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
        ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13113hB(context2, j, z, new C2201e0(bVar));
    }

    public void Dk0() {
        Log.m105918d("MicroMsg.MBJsApiGameDownloadManager", "removeDownloadTaskListener");
        C36768q.C36769a aVar = C2196b0.f12207a;
        if (aVar != null) {
            ((CopyOnWriteArraySet) DownloadEventBus.f110053f).remove(aVar);
        } else {
            DownloadEventBus downloadEventBus = DownloadEventBus.f110051d;
        }
        C2196b0.f12207a = null;
    }

    /* renamed from: Hg */
    public void mo12600Hg(Context context, JSONObject jSONObject, C90271s.C13750a aVar) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        if (Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, false)))) {
            Log.m105924i("MicroMsg.MBJsApiGameDownloadManager", "addDownloadTaskStraight isTeenMode and ignore");
            aVar.mo13120b(810, "fail:This content is not accessible in Teen Mode");
        } else if (Util.isNullOrNil(jSONObject.optString("taskUrl"))) {
            Log.m105920e("MicroMsg.MBJsApiGameDownloadManager", "url is null");
            aVar.mo13120b(700, "url is null");
        } else {
            String optString = jSONObject.optString("appId");
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
            int optInt2 = jSONObject.optInt("downloadType", 1);
            int optInt3 = jSONObject.optInt(TPDownloadProxyEnum.USER_SSID);
            ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(9, new C53493b(optString, optInt, jSONObject.optString("extInfo"), jSONObject.optInt("uiarea"), optInt3, jSONObject.optInt("noticeId"), optInt2));
            C88024r.m109572b(new C2197c0(context, C40979a.m44407a(jSONObject), aVar));
        }
    }

    /* renamed from: OW */
    public void mo12601OW(Context context, long j, JSONObject jSONObject, C90271s.C13750a aVar) {
        long j2 = j;
        JSONObject jSONObject2 = jSONObject;
        C90271s.C13750a aVar2 = aVar;
        Context context2 = context == null ? MMApplicationContext.getContext() : context;
        Class cls = C48456t.class;
        if (j2 <= 0) {
            Log.m105920e("MicroMsg.MBJsApiGameDownloadManager", "fail, invalid downloadId = " + j2);
            aVar2.mo13120b(808, "invalid_downloadid");
            return;
        }
        int optInt = jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject2.optInt("uiarea");
        int optInt3 = jSONObject2.optInt("noticeId");
        int optInt4 = jSONObject2.optInt(TPDownloadProxyEnum.USER_SSID);
        boolean z = true;
        int optInt5 = jSONObject2.optInt("downloadType", 1);
        if (jSONObject2.optInt("ignoreNetwork", 0) != 1) {
            z = false;
        }
        C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j2);
        if (nh == null) {
            aVar2.mo13120b(805, "get DownloadInfo fail");
            return;
        }
        nh.field_scene = optInt;
        nh.field_uiarea = optInt2;
        nh.field_noticeId = optInt3;
        nh.field_ssid = optInt4;
        nh.field_downloadType = optInt5;
        ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
        C53493b bVar = new C53493b();
        bVar.mo74165a(nh);
        bVar.f150424j = 0;
        ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(10, bVar);
        C88024r.m109572b(new C2199d0(context2, j, jSONObject2.optBoolean("downloadInWifi", false), z, aVar));
    }

    /* renamed from: Yn */
    public void mo12602Yn(Context context, JSONObject jSONObject, C90271s.C13751b bVar) {
        JSONObject jSONObject2 = jSONObject;
        Context context2 = context == null ? MMApplicationContext.getContext() : context;
        String optString = jSONObject2.optString("appId");
        String optString2 = jSONObject2.optString("schemeUrl");
        String optString3 = jSONObject2.optString("parameter");
        String optString4 = jSONObject2.optString("packageName");
        String optString5 = jSONObject2.optString("signature");
        String optString6 = jSONObject2.optString("extInfo");
        String optString7 = jSONObject2.optString("sourceInfo");
        String optString8 = jSONObject2.optString("bizInfo");
        int optInt = jSONObject2.optInt("showType");
        Log.m105925i("MicroMsg.MBJsApiGameDownloadManager", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString6, optString3, optString4, optString5);
        if (!Util.isNullOrNil(optString) || !Util.isNullOrNil(optString2) || !Util.isNullOrNil(optString4)) {
            C90271s.C13751b bVar2 = bVar;
            String optString9 = jSONObject2.optString("preVerifyAppId");
            String optString10 = jSONObject2.optString("currentUrl");
            Bundle bundle = new Bundle();
            try {
                bundle.putString("current_page_url", URLEncoder.encode(optString10, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            bundle.putString("current_page_appid", optString9);
            bundle.putString("current_page_biz_info", optString8);
            bundle.putString("current_page_source_info", optString7);
            C9457a.m9137a(new C2202f0(bVar, optString2, context2, optInt, bundle, optString4, optString5, optString3, optString6, optString));
            return;
        }
        Log.m105920e("MicroMsg.MBJsApiGameDownloadManager", "appid and scheme is null or nil");
        bVar.mo13120b(809, "appid and scheme is null or nil");
    }

    /* renamed from: lv */
    public void mo12603lv(JSONObject jSONObject, C90271s.C13750a aVar) {
        C9457a.m9137a(new C2204g0(aVar, jSONObject));
    }

    /* renamed from: op */
    public void mo12604op(Context context, long j, JSONObject jSONObject, C90271s.C13751b bVar) {
        if (context == null) {
            MMApplicationContext.getContext();
        }
        if (j <= 0) {
            Log.m105920e("MicroMsg.MBJsApiGameDownloadManager", "fail, invalid downloadId = " + j);
            bVar.mo13120b(808, "invalid_downloadid");
        } else if (((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(j) > 0) {
            bVar.mo13120b(0, "cancel DownloadTask success");
        } else {
            bVar.mo13120b(809, "cancel DownloadTask fail");
        }
    }
}
