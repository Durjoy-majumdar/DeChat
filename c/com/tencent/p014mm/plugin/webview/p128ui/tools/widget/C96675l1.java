package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j93.C98925b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.l1 */
final class C96675l1 implements C80883e<IPCInteger, IPCVoid> {
    private C96675l1() {
    }

    public void invoke(Object obj, C1256g gVar) {
        int i = ((IPCInteger) obj).f10313d;
        Log.m105925i("MicroMsg.WebViewBagService", "ipc invoke:%d", Integer.valueOf(i));
        Class cls = C98925b.class;
        if (i != 1) {
            if (i == 2) {
                if (C86312j.m106911c(cls) != null) {
                    ((C98925b) C86312j.m106911c(cls)).P00();
                } else {
                    Log.m105920e("MicroMsg.WebViewBagService", "doOp ServiceManager.getService(IWebViewBagService.class) null");
                }
            }
        } else if (C86312j.m106911c(cls) != null) {
            ((C98925b) C86312j.m106911c(cls)).mo138263ff();
        } else {
            Log.m105920e("MicroMsg.WebViewBagService", "doOp ServiceManager.getService(IWebViewBagService.class) null");
        }
    }
}
