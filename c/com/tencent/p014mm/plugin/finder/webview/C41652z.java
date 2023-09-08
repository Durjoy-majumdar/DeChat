package com.tencent.p014mm.plugin.finder.webview;

import android.os.Bundle;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.finder.webview.z */
public class C41652z implements C6686h2.C6687a {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f112091a;

    public C41652z(WebViewLongClickHelper webViewLongClickHelper) {
        this.f112091a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo7610a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.WebViewLongClickHelper", "share image to friend fail, imgPath is null");
            return;
        }
        WebViewLongClickHelper webViewLongClickHelper = this.f112091a;
        if (!webViewLongClickHelper.mo64771h()) {
            try {
                webViewLongClickHelper.mo64769f().getInvoke().mo68153zr(str, webViewLongClickHelper.mo64769f().getController().mo67719g(), (Bundle) null);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "sendImgToFriend fail, ex = " + e.getMessage());
            }
        }
    }
}
