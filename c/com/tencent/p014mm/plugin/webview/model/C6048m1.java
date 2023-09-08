package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.webview.model.m1 */
public class C6048m1 implements C6052p {

    /* renamed from: b */
    public static C6048m1 f22342b = new C6048m1();

    /* renamed from: a */
    public HashMap<String, WebViewJSSDKFileItem> f22343a = new HashMap<>();

    public C6048m1() {
        String str = C86709a0.m107535s().f251806d + "jsapi_temp/";
        if (!C86013q1.m106450k(str) && !C86013q1.m106461v(str)) {
            Log.m105920e("MicroMsg.WebViewJSSDKFileItemManager", "checkJSSDKFileTempDirectory mkdirs failed");
        }
    }

    /* renamed from: a */
    public void mo7009a(WebViewJSSDKFileItem webViewJSSDKFileItem) {
        if (webViewJSSDKFileItem == null || Util.isNullOrNil(webViewJSSDKFileItem.f283022e)) {
            Log.m105920e("MicroMsg.WebViewJSSDKFileItemManager", "item is null or local id is null, ignore this add");
            return;
        }
        Log.m105925i("MicroMsg.WebViewJSSDKFileItemManager", "add jssdk file item, local id : %s, file path : %s", webViewJSSDKFileItem.f283022e, webViewJSSDKFileItem.f283024g);
        this.f22343a.put(webViewJSSDKFileItem.f283022e, webViewJSSDKFileItem);
    }

    /* renamed from: b */
    public WebViewJSSDKFileItem mo7010b(String str) {
        if (!Util.isNullOrNil(str)) {
            return this.f22343a.get(str);
        }
        Log.m105920e("MicroMsg.WebViewJSSDKFileItemManager", "get by local id error, local id is null or nil");
        return null;
    }
}
