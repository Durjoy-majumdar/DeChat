package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.autogen.events.ExtSimpleRecordEvent;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.t2 */
public class C96667t2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewJSSDKFileItem f283128d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f283129e;

    public C96667t2(MsgHandler msgHandler, WebViewJSSDKFileItem webViewJSSDKFileItem) {
        this.f283129e = msgHandler;
        this.f283128d = webViewJSSDKFileItem;
    }

    public void run() {
        ExtSimpleRecordEvent extSimpleRecordEvent = new ExtSimpleRecordEvent();
        ExtSimpleRecordEvent.C92502a aVar = extSimpleRecordEvent.f264788d;
        aVar.f264790a = 2;
        aVar.f264791b = this.f283128d.f283024g;
        extSimpleRecordEvent.publish();
        this.f283129e.f22694X = null;
    }
}
