package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.HashMap;
import t83.C13851h1;
import t83.C48573a0;
import t83.C48590l;
import u73.C52465l0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.e */
public class C43964e implements C52465l0 {

    /* renamed from: a */
    public final /* synthetic */ BaseSearchWebViewUI f119097a;

    public C43964e(BaseSearchWebViewUI baseSearchWebViewUI) {
        this.f119097a = baseSearchWebViewUI;
    }

    /* renamed from: a */
    public void mo68559a(int i, int i2) {
        if (this.f119097a.mo68521L9() != null) {
            C48590l L9 = this.f119097a.mo68521L9();
            if (!L9.f130003h) {
                Log.m105920e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, not ready");
                return;
            }
            Log.m105924i("MicroMsg.JsApiHandler", "onSearchActionSheetClick success, ready");
            HashMap hashMap = new HashMap();
            hashMap.put(FirebaseAnalytics.C113379b.INDEX, Integer.valueOf(i));
            hashMap.put("actionSheetId", Integer.valueOf(i2));
            MMHandlerThread.postToMainThread(new C48573a0(L9, C13851h1.C13852a.m13143c("onSearchActionSheetClick", hashMap, L9.f130011p, L9.f130012q)));
        }
    }
}
