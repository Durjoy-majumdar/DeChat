package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.t */
public final class C82481t extends C82268c {
    private static final int CTRL_INDEX = 115;
    private static final String NAME = "getSavedFileList";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.t$a */
    public class C82482a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241546d;

        /* renamed from: e */
        public final /* synthetic */ int f241547e;

        public C82482a(C82381f fVar, int i) {
            this.f241546d = fVar;
            this.f241547e = i;
        }

        public void run() {
            if (this.f241546d.isRunning()) {
                List<? extends C81415h0.C81416a> savedFileList = this.f241546d.getFileSystem().getSavedFileList();
                JSONArray jSONArray = new JSONArray();
                if (savedFileList != null && savedFileList.size() > 0) {
                    for (C81415h0.C81416a aVar : savedFileList) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, aVar.mo113671a());
                            jSONObject.put("size", aVar.mo113672b());
                            jSONObject.put("createTime", TimeUnit.MILLISECONDS.toSeconds(aVar.lastModified()));
                            jSONArray.put(jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                }
                HashMap hashMap = new HashMap(1);
                hashMap.put("fileList", jSONArray);
                this.f241546d.mo109647a(this.f241547e, C82481t.this.mo115112m("ok", hashMap));
            }
        }
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82421e.f241505h.execute(new C82482a(fVar, i));
    }
}
