package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$h */
public class MsgHandler$$h implements MsgHandler$$o0 {

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$h$a */
    public class C6189a implements Runnable {
        public C6189a(MsgHandler$$h msgHandler$$h) {
        }

        public void run() {
            Runnable pollFirst = MsgHandler.f22669g1.pollFirst();
            if (pollFirst != null) {
                pollFirst.run();
                return;
            }
            Log.m105924i("MicroMsg.MsgHandler", "authJsApiQueue processed!");
            MsgHandler.f22670h1 = false;
        }
    }

    /* renamed from: a */
    public void mo7246a() {
        ((C119157j) C119157j.f356862d).mo183876g(new C6189a(this), "MicroMsg.MsgHandler.THREAD_TAG_AUTH_JSAPI");
    }
}
