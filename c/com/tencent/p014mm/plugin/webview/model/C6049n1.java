package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.webview.model.n1 */
public class C6049n1 {
    /* renamed from: a */
    public static WebViewJSSDKVideoItem m5932a(String str) {
        WebViewJSSDKVideoItem webViewJSSDKVideoItem = new WebViewJSSDKVideoItem();
        webViewJSSDKVideoItem.f283024g = str;
        HashMap<String, List<String>> hashMap = C43702g2.f118107a;
        webViewJSSDKVideoItem.f283022e = C6032f2.m5914a(str);
        long nowMilliSecond = Util.nowMilliSecond();
        String str2 = webViewJSSDKVideoItem.f283022e;
        String b = C1297x.m1387b("jsvideofile", nowMilliSecond, str2, str2);
        webViewJSSDKVideoItem.f283026i = b;
        Log.m105919d("MicroMsg.WebViewJSSDKFileItem", "filepath = %s, localid = %s, mediaid = %s", str, webViewJSSDKVideoItem.f283022e, b);
        return webViewJSSDKVideoItem;
    }

    /* renamed from: b */
    public static WebViewJSSDKFileItem m5933b(String str) {
        WebViewJSSDKImageItem webViewJSSDKImageItem = new WebViewJSSDKImageItem();
        webViewJSSDKImageItem.f283024g = str;
        webViewJSSDKImageItem.f283022e = C6032f2.m5914a(str);
        webViewJSSDKImageItem.mo6984f();
        long nowMilliSecond = Util.nowMilliSecond();
        String str2 = webViewJSSDKImageItem.f283022e;
        webViewJSSDKImageItem.f283026i = C1297x.m1387b("jsupimg", nowMilliSecond, str2, str2);
        return webViewJSSDKImageItem;
    }

    /* renamed from: c */
    public static WebViewJSSDKFileItem m5934c(String str, String str2) {
        WebViewJSSDKImageItem webViewJSSDKImageItem = new WebViewJSSDKImageItem();
        webViewJSSDKImageItem.f283024g = str;
        webViewJSSDKImageItem.f283023f = str2;
        webViewJSSDKImageItem.f283022e = C6032f2.m5914a(str);
        webViewJSSDKImageItem.mo6984f();
        long nowMilliSecond = Util.nowMilliSecond();
        String str3 = webViewJSSDKImageItem.f283022e;
        webViewJSSDKImageItem.f283026i = C1297x.m1387b("jsupimg", nowMilliSecond, str3, str3);
        return webViewJSSDKImageItem;
    }
}
