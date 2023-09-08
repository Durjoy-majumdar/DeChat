package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.downloader_app.api.DownloadWidgetTaskInfo;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45547h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.t */
public class C4525t extends C43620m2 {
    /* renamed from: b */
    public String mo5382b() {
        return "getDownloadWidgetTaskInfos";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        LinkedList<DownloadWidgetTaskInfo> Se = ((C45547h) C86312j.m106911c(C45547h.class)).mo70791Se();
        if (Util.isNullOrNil((List) Se)) {
            bVar.mo6945a((String) null, (JSONObject) null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<DownloadWidgetTaskInfo> it = Se.iterator();
        while (it.hasNext()) {
            DownloadWidgetTaskInfo next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("appid", next.f110282d);
                jSONObject2.put("status", next.f110284f);
                jSONObject2.put("download_id", next.f110283e);
                jSONObject2.put("progress", next.f110285g);
                jSONObject2.put("progress_float", (double) next.f110287i);
                if (next.f110286h) {
                    jSONObject2.put("reserve_for_wifi", 1);
                }
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("result", jSONArray.toString());
        } catch (JSONException unused2) {
        }
        bVar.mo6945a((String) null, jSONObject);
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
