package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import j83.C9286a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$i */
public class MsgHandler$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f22793d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f22794e;

    public MsgHandler$$i(MsgHandler msgHandler, Intent intent) {
        this.f22794e = msgHandler;
        this.f22793d = intent;
    }

    public void run() {
        ((C67654r1) C9286a.f29044a).mo93174g(this.f22793d, this.f22794e.f22697d);
    }
}
