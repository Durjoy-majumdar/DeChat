package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.autogen.events.ExtSimpleRecordEvent;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.u2 */
public class C96668u2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewJSSDKFileItem f283130d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f283131e;

    public C96668u2(MsgHandler msgHandler, WebViewJSSDKFileItem webViewJSSDKFileItem) {
        this.f283131e = msgHandler;
        this.f283130d = webViewJSSDKFileItem;
    }

    public void run() {
        ExtSimpleRecordEvent extSimpleRecordEvent = new ExtSimpleRecordEvent();
        ExtSimpleRecordEvent.C92502a aVar = extSimpleRecordEvent.f264788d;
        aVar.f264790a = 2;
        aVar.f264791b = this.f283130d.f283024g;
        extSimpleRecordEvent.publish();
        this.f283131e.f22694X = null;
    }
}
