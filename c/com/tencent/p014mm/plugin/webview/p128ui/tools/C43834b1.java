package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Bundle;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.b1 */
public class C43834b1 implements C6686h2.C6687a {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f118706a;

    public C43834b1(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118706a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo7610a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic share image to friend fail, imgPath is null");
            return;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putString("web_search_data_ui_image_path", str);
            if (Util.isNullOrNil(this.f118706a.f118400i)) {
                WebViewLongClickHelper webViewLongClickHelper = this.f118706a;
                webViewLongClickHelper.f118400i = WebViewLongClickHelper.m47784a(webViewLongClickHelper);
            }
            if (!Util.isNullOrNil(this.f118706a.f118400i)) {
                if (this.f118706a.f118400i.startsWith("http://mp.weixin.qq.com/s?") || this.f118706a.f118400i.startsWith("https://mp.weixin.qq.com/s?") || this.f118706a.f118400i.startsWith("http://mp.weixin.qq.com/s/") || this.f118706a.f118400i.startsWith("https://mp.weixin.qq.com/s/")) {
                    bundle.putInt("KWebSearchSendDataImagePath_from_source", 11);
                    this.f118706a.f118406o.getController().f117601y.mo68145pG(53, bundle, this.f118706a.f118406o.getController().mo67719g());
                }
            }
            bundle.putInt("KWebSearchSendDataImagePath_from_source", 14);
            this.f118706a.f118406o.getController().f117601y.mo68145pG(53, bundle, this.f118706a.f118406o.getController().mo67719g());
        } catch (Exception e) {
            Log.m105929w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic RemoteException:%s", e.getLocalizedMessage());
        }
    }
}
