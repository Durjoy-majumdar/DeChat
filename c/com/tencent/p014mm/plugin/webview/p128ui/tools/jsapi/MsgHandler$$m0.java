package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.ExtSimpleRecordEvent;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p749xh.C66261f3;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$m0 */
public class MsgHandler$$m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewJSSDKFileItem f283115d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f283116e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f283117f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$m0$a */
    public class C96663a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ExtSimpleRecordEvent f283118d;

        public C96663a(ExtSimpleRecordEvent extSimpleRecordEvent) {
            this.f283118d = extSimpleRecordEvent;
        }

        public void run() {
            Log.m105925i("MicroMsg.MsgHandler", "onVoiceRecordEnd, localId(%s).", MsgHandler$$m0.this.f283115d.f283022e);
            try {
                MsgHandler$$m0.this.f283117f.f22694X = null;
                Bundle bundle = new Bundle();
                bundle.putString(C66261f3.COL_LOCALID, MsgHandler$$m0.this.f283115d.f283022e);
                StringBuilder sb = new StringBuilder();
                sb.append("onVoiceRecordEnd:");
                this.f283118d.f264789e.getClass();
                sb.append("ok");
                bundle.putString("recordResult", sb.toString());
                C6107m mVar = MsgHandler$$m0.this.f283117f.f22715x;
                if (mVar != null) {
                    mVar.callback(2008, bundle);
                } else {
                    Log.m105920e("MicroMsg.MsgHandler", "callbacker is null");
                }
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.MsgHandler", "callback stop record failed");
            }
        }
    }

    public MsgHandler$$m0(MsgHandler msgHandler, WebViewJSSDKFileItem webViewJSSDKFileItem, C13851h1 h1Var) {
        this.f283117f = msgHandler;
        this.f283115d = webViewJSSDKFileItem;
        this.f283116e = h1Var;
    }

    public void run() {
        ExtSimpleRecordEvent extSimpleRecordEvent = new ExtSimpleRecordEvent();
        ExtSimpleRecordEvent.C92502a aVar = extSimpleRecordEvent.f264788d;
        aVar.f264790a = 1;
        aVar.f264791b = this.f283115d.f283024g;
        aVar.f264792c = Util.getInt((String) this.f283116e.f38983a.get("duration"), 60);
        extSimpleRecordEvent.f264788d.f264793d = new C96663a(extSimpleRecordEvent);
        extSimpleRecordEvent.publish();
    }
}
