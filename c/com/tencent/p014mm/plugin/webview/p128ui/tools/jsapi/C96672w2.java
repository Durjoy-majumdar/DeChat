package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.autogen.events.ExtPlayerEvent;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w2 */
public class C96672w2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewJSSDKFileItem f283137d;

    public C96672w2(MsgHandler msgHandler, WebViewJSSDKFileItem webViewJSSDKFileItem) {
        this.f283137d = webViewJSSDKFileItem;
    }

    public void run() {
        ExtPlayerEvent extPlayerEvent = new ExtPlayerEvent();
        ExtPlayerEvent.C92500a aVar = extPlayerEvent.f264779d;
        aVar.f264781a = 2;
        aVar.f264782b = this.f283137d.f283027j;
        extPlayerEvent.publish();
    }
}
