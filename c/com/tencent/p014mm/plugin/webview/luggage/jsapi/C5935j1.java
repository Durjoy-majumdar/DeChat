package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ji3.C9457a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13754y;
import p828wa.C53096b;
import p828wa.C53138x;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.j1 */
public class C5935j1 extends C43620m2<C53138x> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.j1$a */
    public class C5936a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f22170d;

        /* renamed from: e */
        public final /* synthetic */ C43620m2.C5947b f22171e;

        public C5936a(JSONObject jSONObject, C43620m2.C5947b bVar) {
            this.f22170d = jSONObject;
            this.f22171e = bVar;
        }

        public void run() {
            String str;
            Iterator<FileDownloadTaskInfo> it;
            Class cls = C13754y.class;
            JSONArray optJSONArray = this.f22170d.optJSONArray("appIdArray");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                long optLong = this.f22170d.optLong("download_id", -1);
                String optString = this.f22170d.optString("appid");
                if (optLong > 0) {
                    FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63966n(optLong);
                    if (n == null) {
                        n = new FileDownloadTaskInfo();
                    }
                    C5935j1.m5709f(C5935j1.this, n, this.f22171e);
                } else if (!Util.isNullOrNil(optString)) {
                    FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(optString);
                    if (o == null) {
                        o = new FileDownloadTaskInfo();
                    }
                    C5935j1.m5709f(C5935j1.this, o, this.f22171e);
                } else {
                    this.f22171e.mo6945a("fail", (JSONObject) null);
                }
            } else {
                C5935j1 j1Var = C5935j1.this;
                C43620m2.C5947b bVar = this.f22171e;
                j1Var.getClass();
                JSONObject jSONObject = new JSONObject();
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    linkedList.add(optJSONArray.optString(i));
                }
                LinkedList<FileDownloadTaskInfo> d = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63958d(linkedList);
                if (d.size() > 0) {
                    Iterator<FileDownloadTaskInfo> it4 = d.iterator();
                    while (it4.hasNext()) {
                        FileDownloadTaskInfo next = it4.next();
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
                                }
                            } else if (C86013q1.m106450k(next.f12197g)) {
                                str = "download_succ";
                            }
                            str = "default";
                        } else {
                            str = "download_pause";
                        }
                        try {
                            jSONObject2.put("download_id", next.f12194d);
                            jSONObject2.put("state", str);
                            if (next.f12205r) {
                                jSONObject2.put("reserve_for_wifi", 1);
                            }
                            long j = next.f12201n;
                            if (j != 0) {
                                long j2 = next.f12200j;
                                it = it4;
                                try {
                                    jSONObject2.put("progress", (100 * j2) / j);
                                    jSONObject2.put("progress_float", (double) ((((float) j2) * 100.0f) / ((float) j)));
                                } catch (Exception e) {
                                    e = e;
                                    Log.m105920e("MicroMsg.JsApiQueryDownloadTask", e.getMessage());
                                    it4 = it;
                                }
                            } else {
                                it = it4;
                            }
                            jSONObject.put(next.f12199i, jSONObject2);
                            linkedList.remove(next.f12199i);
                        } catch (Exception e2) {
                            e = e2;
                            it = it4;
                            Log.m105920e("MicroMsg.JsApiQueryDownloadTask", e.getMessage());
                            it4 = it;
                        }
                        it4 = it;
                    }
                    j1Var.mo6941g(jSONObject, linkedList);
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("result", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                    bVar.mo6945a("", jSONObject3);
                    return;
                }
                Log.m105920e("MicroMsg.JsApiQueryDownloadTask", "taskInfos is null");
                j1Var.mo6941g(jSONObject, linkedList);
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("result", jSONObject.toString());
                } catch (JSONException unused2) {
                }
                bVar.mo6945a((String) null, jSONObject4);
            }
        }
    }

    /* renamed from: f */
    public static void m5709f(C5935j1 j1Var, FileDownloadTaskInfo fileDownloadTaskInfo, C43620m2.C5947b bVar) {
        String str;
        j1Var.getClass();
        JSONObject jSONObject = new JSONObject();
        int i = fileDownloadTaskInfo.f12196f;
        if (i == -1) {
            str = "api_not_support";
        } else if (i == 1) {
            str = "downloading";
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    str = "download_fail";
                }
            } else if (C86013q1.m106450k(fileDownloadTaskInfo.f12197g)) {
                str = "download_succ";
            }
            str = "default";
        } else {
            str = "download_pause";
        }
        try {
            jSONObject.put("download_id", fileDownloadTaskInfo.f12194d);
            jSONObject.put("state", str);
            if (fileDownloadTaskInfo.f12205r) {
                jSONObject.put("reserve_for_wifi", 1);
            }
            long j = fileDownloadTaskInfo.f12201n;
            if (j != 0) {
                long j2 = fileDownloadTaskInfo.f12200j;
                jSONObject.put("progress", (100 * j2) / j);
                jSONObject.put("progress_float", (double) ((((float) j2) * 100.0f) / ((float) j)));
            }
            bVar.mo6945a((String) null, jSONObject);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiQueryDownloadTask", e.getMessage());
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return JsApiQueryDownloadTask.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiQueryDownloadTask", "invokeInMM");
        try {
            C9457a.m9137a(new C5936a(new JSONObject(str), bVar));
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.JsApiQueryDownloadTask", "paras data error: " + e.getMessage());
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53138x>.a aVar) {
    }

    /* renamed from: g */
    public final void mo6941g(JSONObject jSONObject, LinkedList<String> linkedList) {
        if (!Util.isNullOrNil((List) linkedList)) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("download_id", -1);
                    jSONObject2.put("state", "default");
                    jSONObject.put(next, jSONObject2);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.JsApiQueryDownloadTask", e.getMessage());
                }
            }
        }
    }
}
