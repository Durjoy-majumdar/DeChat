package dy1;

import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import nd3.C47223a;
import org.json.JSONObject;
import p237sp.C13749o;
import p237sp.C13754y;
import p237sp.C48456t;
import p749xh.C53352w2;

/* renamed from: dy1.i */
public class C7550i extends C4770c {

    /* renamed from: dy1.i$a */
    public class C7551a implements C47223a {
        public C7551a() {
        }

        /* renamed from: a */
        public void mo6947a(boolean z) {
            if (z) {
                C7550i.this.f19815f.mo5690b();
            } else {
                C7550i.this.f19815f.mo5689a("fail");
            }
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Class cls = C48456t.class;
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            Log.m105924i("LiteAppJsApiInstallDownloadTask", "data is null");
            this.f19815f.mo5689a("fail_invalid_data");
            return;
        }
        FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63966n(optLong);
        int i = n.f12196f;
        if (i == -1) {
            Log.m105920e("LiteAppJsApiInstallDownloadTask", "installDownloadTask fail, apilevel not supported");
            this.f19815f.mo5689a("fail");
        } else if (i != 3) {
            Log.m105920e("LiteAppJsApiInstallDownloadTask", "installDownloadTask fail, invalid status = " + n.f12196f);
            this.f19815f.mo5689a("fail");
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
            ((C13749o) C86312j.m106911c(C13749o.class)).gt0(n.f12194d, false, new C7551a());
        }
    }
}
