package com.tencent.p014mm.plugin.downloader.model;

import com.tencent.p014mm.plugin.downloader.event.DownloadEventBus;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13754y;
import p237sp.C90271s;

/* renamed from: com.tencent.mm.plugin.downloader.model.g0 */
public class C2204g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90271s.C13750a f12230d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f12231e;

    public C2204g0(C90271s.C13750a aVar, JSONObject jSONObject) {
        this.f12230d = aVar;
        this.f12231e = jSONObject;
    }

    public void run() {
        String str;
        Class cls = C13754y.class;
        C2196b0 b0Var = new C2196b0();
        C90271s.C13750a aVar = this.f12230d;
        if (C2196b0.f12207a == null) {
            C2195a0 a0Var = new C2195a0(b0Var, aVar);
            C2196b0.f12207a = a0Var;
            ((CopyOnWriteArraySet) DownloadEventBus.f110053f).add(a0Var);
        }
        JSONArray optJSONArray = this.f12231e.optJSONArray("appIdArray");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            long optLong = this.f12231e.optLong("downloadId", -1);
            String optString = this.f12231e.optString("appId");
            if (optLong > 0) {
                FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63966n(optLong);
                if (n == null) {
                    n = new FileDownloadTaskInfo();
                }
                C2205h0.m2039b(n, this.f12230d);
            } else if (!Util.isNullOrNil(optString)) {
                FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(optString);
                if (o == null) {
                    o = new FileDownloadTaskInfo();
                }
                C2205h0.m2039b(o, this.f12230d);
            } else {
                this.f12230d.mo13120b(809, "query downloadTask fail");
            }
        } else {
            C90271s.C13750a aVar2 = this.f12230d;
            JSONObject jSONObject = new JSONObject();
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                linkedList.add(optJSONArray.optString(i));
            }
            LinkedList<FileDownloadTaskInfo> d = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63958d(linkedList);
            if (d.size() > 0) {
                Iterator<FileDownloadTaskInfo> it = d.iterator();
                while (it.hasNext()) {
                    FileDownloadTaskInfo next = it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    int i2 = next.f12196f;
                    if (i2 == -1) {
                        str = "api_not_support";
                    } else if (i2 == 1) {
                        str = "downloading";
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                str = "download_fail";
                            } else if (i2 == 5) {
                                str = "download_removed";
                            }
                        } else if (C86013q1.m106450k(next.f12197g)) {
                            str = "download_succ";
                        }
                        str = "default";
                    } else {
                        str = "download_pause";
                    }
                    try {
                        jSONObject2.put("downloadId", next.f12194d);
                        jSONObject2.put("state", str);
                        if (next.f12205r) {
                            jSONObject2.put("reserve_for_wifi", 1);
                        }
                        long j = next.f12201n;
                        if (j != 0) {
                            long j2 = next.f12200j;
                            jSONObject2.put("progress", (100 * j2) / j);
                            jSONObject2.put("progress_float", (double) ((((float) j2) * 100.0f) / ((float) j)));
                        }
                        jSONObject.put(next.f12199i, jSONObject2);
                        linkedList.remove(next.f12199i);
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.MBJsApiGameDownloadManager", e.getMessage());
                    }
                }
                C2205h0.m2040c(jSONObject, linkedList);
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("result", jSONObject.toString());
                } catch (JSONException unused) {
                }
                aVar2.mo13119d(jSONObject3);
                return;
            }
            Log.m105920e("MicroMsg.MBJsApiGameDownloadManager", "taskInfos is null");
            C2205h0.m2040c(jSONObject, linkedList);
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("result", jSONObject.toString());
            } catch (JSONException unused2) {
            }
            aVar2.mo13119d(jSONObject4);
        }
    }
}
