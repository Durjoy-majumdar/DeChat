package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.HashMap;
import org.json.JSONArray;
import t83.C13851h1;
import t83.C48585g0;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.i */
public class C43968i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONArray f119103d;

    /* renamed from: e */
    public final /* synthetic */ String f119104e;

    /* renamed from: f */
    public final /* synthetic */ FTSSOSHomeWebViewUI f119105f;

    public C43968i(FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, JSONArray jSONArray, String str) {
        this.f119105f = fTSSOSHomeWebViewUI;
        this.f119103d = jSONArray;
        this.f119104e = str;
    }

    public void run() {
        C48590l lVar = this.f119105f.f118508Z;
        JSONArray jSONArray = this.f119103d;
        String str = this.f119104e;
        if (!lVar.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onGetVertSearchEntriesData fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onGetVertSearchEntriesData success, ready");
        HashMap hashMap = new HashMap();
        hashMap.put("items", jSONArray);
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
        MMHandlerThread.postToMainThread(new C48585g0(lVar, C13851h1.C13852a.m13143c("onGetVertSearchEntriesData", hashMap, lVar.f130011p, lVar.f130012q)));
    }
}
