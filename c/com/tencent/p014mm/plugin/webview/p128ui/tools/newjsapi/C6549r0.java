package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import kg3.C76577a;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13855j;
import t83.C48590l;
import wc3.C78541w;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.r0 */
public final class C6549r0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f23733d;

    /* renamed from: e */
    public final /* synthetic */ WebViewUI f23734e;

    /* renamed from: f */
    public final /* synthetic */ C13855j f23735f;

    /* renamed from: g */
    public final /* synthetic */ String f23736g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6549r0(String str, WebViewUI webViewUI, C13855j jVar, String str2) {
        super(1);
        this.f23733d = str;
        this.f23734e = webViewUI;
        this.f23735f = jVar;
        this.f23736g = str2;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap;
        String str = (String) obj;
        C87412m.m108594g(str, "sourUserName");
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "recent forward onClick, sourUserName = " + str);
        C44108o0 o0Var = C44108o0.f119483d;
        String str2 = this.f23733d;
        o0Var.getClass();
        if (!Util.isNullOrNil(str2)) {
            Bitmap bitmapNative = BitmapUtil.getBitmapNative(str2, 140, 140, C76577a.m92156g(MMApplicationContext.getContext()));
            int orientationInDegree = Exif.fromFile(str2).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            bitmap = BitmapUtil.rotate(bitmapNative, (float) orientationInDegree);
        } else {
            bitmap = null;
        }
        WebViewUI webViewUI = this.f23734e;
        ((C78541w) C86312j.m106911c(C78541w.class)).mo108484Gd(webViewUI, str, bitmap, webViewUI.getString(C0966R.string.a2s), 3, new C6543q0(str, this.f23734e, this.f23733d, this.f23736g)).show();
        HashMap hashMap = new HashMap(1);
        hashMap.put("event", "success");
        C13849g gVar = this.f23735f.f39001d;
        C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((C48590l) gVar).mo8701f("onShareEmbedExcerptEvent", hashMap);
        return C13598b0.f38549a;
    }
}
