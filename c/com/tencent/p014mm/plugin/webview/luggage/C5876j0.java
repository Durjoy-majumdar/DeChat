package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.j0 */
class C5876j0 implements C80916r<IPCBoolean, IPCBoolean> {
    private C5876j0() {
    }

    public Object invoke(Object obj) {
        int i;
        IPCBoolean iPCBoolean = (IPCBoolean) obj;
        IPCBoolean iPCBoolean2 = new IPCBoolean();
        boolean z = true;
        try {
            i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("EnableWebviewScanQRCode"), 1);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.GameWebViewMenuListHelper", "isAllowScanQRCode parseInt failed");
            i = 0;
        }
        if (i != 1) {
            z = false;
        }
        iPCBoolean2.f10312d = z;
        return iPCBoolean2;
    }
}
