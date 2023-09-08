package dy1;

import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import org.json.JSONObject;
import p237sp.C13754y;
import p237sp.C48456t;
import p749xh.C53352w2;

/* renamed from: dy1.n */
public class C7560n extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Class cls = C48456t.class;
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            Log.m105920e("LiteAppJsApiPauseDownloadTask", "fail, invalid downloadId = " + optLong);
            this.f19815f.mo5689a("invalid_downloadid");
            return;
        }
        C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(optLong);
        if (nh == null) {
            this.f19815f.mo5690b();
            return;
        }
        int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject.optInt("uiarea");
        int optInt3 = jSONObject.optInt("notice_id");
        int optInt4 = jSONObject.optInt(TPDownloadProxyEnum.USER_SSID);
        nh.field_scene = optInt;
        nh.field_uiarea = optInt2;
        nh.field_noticeId = optInt3;
        nh.field_ssid = optInt4;
        nh.field_downloadInWifi = false;
        ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
        if (((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63965m(optLong)) {
            this.f19815f.mo5690b();
        } else {
            this.f19815f.mo5689a("fail");
        }
    }
}
