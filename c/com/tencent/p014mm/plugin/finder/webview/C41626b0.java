package com.tencent.p014mm.plugin.finder.webview;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.finder.webview.b0 */
public class C41626b0 implements C6686h2.C6687a {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f112066a;

    public C41626b0(WebViewLongClickHelper webViewLongClickHelper) {
        this.f112066a = webViewLongClickHelper;
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
            if (Util.isNullOrNil(this.f112066a.f112007i)) {
                WebViewLongClickHelper webViewLongClickHelper = this.f112066a;
                webViewLongClickHelper.f112007i = webViewLongClickHelper.mo64769f().getCurrentURL();
            }
            if (!Util.isNullOrNil(this.f112066a.f112007i)) {
                if (this.f112066a.f112007i.startsWith("http://mp.weixin.qq.com/s?") || this.f112066a.f112007i.startsWith("https://mp.weixin.qq.com/s?") || this.f112066a.f112007i.startsWith("http://mp.weixin.qq.com/s/") || this.f112066a.f112007i.startsWith("https://mp.weixin.qq.com/s/")) {
                    bundle.putInt("KWebSearchSendDataImagePath_from_source", 11);
                    this.f112066a.mo64769f().getInvoke().mo68145pG(53, bundle, this.f112066a.mo64769f().getController().mo67719g());
                }
            }
            bundle.putInt("KWebSearchSendDataImagePath_from_source", 14);
            this.f112066a.mo64769f().getInvoke().mo68145pG(53, bundle, this.f112066a.mo64769f().getController().mo67719g());
        } catch (RemoteException e) {
            Log.m105929w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic RemoteException:%s", e.getLocalizedMessage());
        }
    }
}
