package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$l */
public class MsgHandler$$l implements Runnable {
    public MsgHandler$$l(MsgHandler msgHandler) {
    }

    public void run() {
        String topActivityName2 = Util.getTopActivityName2(MMApplicationContext.getContext());
        Log.m105925i("MicroMsg.MsgHandler", "current top activity: %s", topActivityName2);
        if (topActivityName2 != null && topActivityName2.equals("WebViewUI")) {
            Log.m105928w("MicroMsg.MsgHandler", "may be not close success");
            C115669n.INSTANCE.mo175911u(1589, 7);
        }
    }
}
