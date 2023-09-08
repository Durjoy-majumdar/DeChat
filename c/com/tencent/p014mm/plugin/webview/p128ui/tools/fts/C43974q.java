package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import org.json.JSONObject;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.q */
public class C43974q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PreLoadWebViewUI f119119d;

    public C43974q(PreLoadWebViewUI preLoadWebViewUI) {
        this.f119119d = preLoadWebViewUI;
    }

    public void run() {
        PreLoadWebViewUI preLoadWebViewUI = this.f119119d;
        if (preLoadWebViewUI.f119058I2) {
            preLoadWebViewUI.mo68473I9();
        }
        PreLoadWebViewUI preLoadWebViewUI2 = this.f119119d;
        C48590l lVar = preLoadWebViewUI2.f118508Z;
        Map<String, Object> O9 = preLoadWebViewUI2.mo68551O9();
        Map<String, Object> M9 = preLoadWebViewUI2.mo68522M9();
        if (M9 != null) {
            O9.putAll(M9);
        }
        Log.m105925i("MicroMsg.WebSearch.PreLoadWebViewUI", "buildOnUiInitParams %s", O9.toString());
        lVar.mo73236e0("onUiInit", O9, (JSONObject) null);
    }
}
