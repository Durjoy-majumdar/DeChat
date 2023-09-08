package dy1;

import com.tencent.p014mm.plugin.downloader_app.api.DownloadWidgetTaskInfo;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45547h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dy1.f */
public class C7547f extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        LinkedList<DownloadWidgetTaskInfo> Se = ((C45547h) C86312j.m106911c(C45547h.class)).mo70791Se();
        if (Util.isNullOrNil((List) Se)) {
            this.f19815f.mo5690b();
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<DownloadWidgetTaskInfo> it = Se.iterator();
        while (it.hasNext()) {
            DownloadWidgetTaskInfo next = it.next();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("appid", next.f110282d);
                jSONObject3.put("status", next.f110284f);
                jSONObject3.put("download_id", next.f110283e);
                jSONObject3.put("progress", next.f110285g);
                jSONObject3.put("progress_float", (double) next.f110287i);
                if (next.f110286h) {
                    jSONObject3.put("reserve_for_wifi", 1);
                }
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject3);
        }
        try {
            jSONObject2.put("result", jSONArray.toString());
        } catch (JSONException unused2) {
        }
        this.f19815f.mo5692d(jSONObject2, false);
    }
}
