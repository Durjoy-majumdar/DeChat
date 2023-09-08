package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.f1 */
public class C43857f1 implements C6686h2.C6687a {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f118774a;

    public C43857f1(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118774a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo7610a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.WebViewLongClickHelper", "share image to friend fail, imgPath is null");
            return;
        }
        WebViewLongClickHelper webViewLongClickHelper = this.f118774a;
        if (!webViewLongClickHelper.mo68199m()) {
            try {
                Bundle bundle = new Bundle();
                Intent intent = webViewLongClickHelper.f118406o.getContext().getIntent();
                bundle.putString("serverMsgID", intent.getStringExtra("serverMsgID"));
                bundle.putString("geta8key_username", intent.getStringExtra("geta8key_username"));
                bundle.putString("KPublisherReqId", String.valueOf(webViewLongClickHelper.f118406o.mo68334a()));
                bundle.putString("sns_local_id", intent.getStringExtra("sns_local_id"));
                webViewLongClickHelper.f118406o.getController().f117601y.mo68153zr(str, webViewLongClickHelper.f118406o.getController().mo67719g(), bundle);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "sendImgToFriend fail, ex = " + e.getMessage());
            }
        }
    }
}
