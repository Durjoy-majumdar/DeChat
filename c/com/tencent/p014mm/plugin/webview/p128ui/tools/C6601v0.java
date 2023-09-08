package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import l83.C10469b;
import te3.C50916q50;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.v0 */
public class C6601v0 implements C10469b {

    /* renamed from: a */
    public final /* synthetic */ String f23855a;

    /* renamed from: b */
    public final /* synthetic */ WebViewDownloadUI f23856b;

    public C6601v0(WebViewDownloadUI webViewDownloadUI, String str) {
        this.f23856b = webViewDownloadUI;
        this.f23855a = str;
    }

    /* renamed from: a */
    public void mo6904a(C50916q50 q502) {
        Log.m105925i("MicroMsg.WebViewDownloadUI", "getDownloadAppInfo onSuccess downloadAppId: %s, name: %s", this.f23855a, q502.f140145e);
        WebViewDownloadUI webViewDownloadUI = this.f23856b;
        List<Long> list = WebViewDownloadUI.f22557E;
        webViewDownloadUI.mo7105N7(q502);
    }

    /* renamed from: b */
    public void mo6905b(String str, int i, int i2, String str2) {
        Log.m105921e("MicroMsg.WebViewDownloadUI", "getDownloadAppInfo onFailed appId: %s, errType: %s, errCode: %s, errMsg: %s", this.f23855a, Integer.valueOf(i), Integer.valueOf(i2), str2);
        WebViewDownloadUI webViewDownloadUI = this.f23856b;
        List<Long> list = WebViewDownloadUI.f22557E;
        webViewDownloadUI.mo7104M7("download failed");
    }
}
