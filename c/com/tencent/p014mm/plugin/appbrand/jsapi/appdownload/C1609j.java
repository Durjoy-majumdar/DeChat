package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.downloader_app.api.DownloadWidgetTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import e51.C45547h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.j */
public class C1609j extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 670;
    public static final String NAME = "getDownloadWidgetTaskInfoForNative";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.j$a */
    public static class C1610a implements C80883e<IPCVoid, IPCString> {
        private C1610a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            LinkedList<DownloadWidgetTaskInfo> Se = ((C45547h) C86312j.m106911c(C45547h.class)).mo70791Se();
            if (Util.isNullOrNil((List) Se)) {
                gVar.mo894a(null);
                return;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<DownloadWidgetTaskInfo> it = Se.iterator();
            while (it.hasNext()) {
                DownloadWidgetTaskInfo next = it.next();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("appId", next.f110282d);
                    jSONObject.put("status", next.f110284f);
                    jSONObject.put("downloadId", next.f110283e);
                    jSONObject.put("progress", next.f110285g);
                    jSONObject.put("progressFloat", (double) next.f110287i);
                    if (next.f110286h) {
                        jSONObject.put("reserveForWifi", 1);
                    }
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
            gVar.mo894a(new IPCString(jSONArray.toString()));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, null, C1610a.class, new C1608i(this, (C81925i2) fVar, i));
    }
}
