package dy1;

import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ji3.C9457a;
import org.json.JSONArray;
import org.json.JSONObject;
import p237sp.C13754y;

/* renamed from: dy1.o */
public class C7561o extends C4770c {

    /* renamed from: dy1.o$a */
    public class C7562a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f25829d;

        public C7562a(JSONObject jSONObject) {
            this.f25829d = jSONObject;
        }

        public void run() {
            String str;
            Class cls = C13754y.class;
            JSONArray optJSONArray = this.f25829d.optJSONArray("appIdArray");
            long j = 0;
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                long optLong = this.f25829d.optLong("download_id", -1);
                String optString = this.f25829d.optString("appid");
                if (optLong > 0) {
                    FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63966n(optLong);
                    if (n == null) {
                        n = new FileDownloadTaskInfo();
                    }
                    n.f12199i = optString;
                    C7561o.m7685q(C7561o.this, n);
                } else if (!Util.isNullOrNil(optString)) {
                    FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(optString);
                    if (o == null) {
                        o = new FileDownloadTaskInfo();
                    }
                    o.f12199i = optString;
                    C7561o.m7685q(C7561o.this, o);
                } else {
                    C7561o.this.f19815f.mo5689a("fail");
                }
            } else {
                C7561o oVar = C7561o.this;
                oVar.getClass();
                JSONObject jSONObject = new JSONObject();
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    linkedList.add(optJSONArray.optString(i));
                }
                LinkedList<FileDownloadTaskInfo> d = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63958d(linkedList);
                String str2 = "LiteAppJsApiQueryDownloadTask";
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
                                }
                            } else if (C86013q1.m106450k(next.f12197g)) {
                                str = "download_succ";
                            }
                            str = "default";
                        } else {
                            str = "download_pause";
                        }
                        String str3 = str2;
                        try {
                            jSONObject2.put("download_id", next.f12194d);
                            jSONObject2.put("state", str);
                            if (next.f12205r) {
                                jSONObject2.put("reserve_for_wifi", 1);
                            }
                            long j2 = next.f12201n;
                            if (j2 != j) {
                                long j3 = next.f12200j;
                                jSONObject2.put("progress", (100 * j3) / j2);
                                jSONObject2.put("progress_float", (double) ((((float) j3) * 100.0f) / ((float) j2)));
                            }
                            jSONObject.put(next.f12199i, jSONObject2);
                            linkedList.remove(next.f12199i);
                            str2 = str3;
                        } catch (Exception e) {
                            String str4 = str3;
                            Log.m105920e(str4, e.getMessage());
                            str2 = str4;
                        }
                        j = 0;
                    }
                    oVar.mo8667r(jSONObject, linkedList);
                    new JSONObject();
                    oVar.f19815f.mo5692d(jSONObject, false);
                    return;
                }
                Log.m105920e(str2, "taskInfos is null");
                oVar.mo8667r(jSONObject, linkedList);
                oVar.f19815f.mo5692d(jSONObject, false);
            }
        }
    }

    /* renamed from: q */
    public static void m7685q(C7561o oVar, FileDownloadTaskInfo fileDownloadTaskInfo) {
        String str;
        oVar.getClass();
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
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(fileDownloadTaskInfo.f12199i, jSONObject);
            oVar.f19815f.mo5692d(jSONObject2, false);
        } catch (Exception e) {
            Log.m105920e("LiteAppJsApiQueryDownloadTask", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        C9457a.m9137a(new C7562a(jSONObject));
    }

    /* renamed from: r */
    public final void mo8667r(JSONObject jSONObject, LinkedList<String> linkedList) {
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
                    Log.m105920e("LiteAppJsApiQueryDownloadTask", e.getMessage());
                }
            }
        }
    }
}
