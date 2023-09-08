package dy1;

import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.json.JSONObject;
import p237sp.C13754y;

/* renamed from: dy1.d */
public class C7545d extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            Log.m105920e("LiteAppJsApiCancelDownloadTask", "fail, invalid downloadId = " + optLong);
            this.f19815f.mo5689a("invalid_downloadid");
        } else if (((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(optLong) > 0) {
            this.f19815f.mo5690b();
        } else {
            this.f19815f.mo5689a("fail");
        }
    }
}
