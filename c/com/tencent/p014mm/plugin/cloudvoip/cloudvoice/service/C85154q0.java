package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import p156gj.C107835h0;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.q0 */
public class C85154q0 implements Runnable {
    public C85154q0(C105181w wVar) {
    }

    public void run() {
        Bundle bundle = (Bundle) C80907o.m98783f(C105181w.f312335c1, null, C105181w.C85159g.class);
        if (bundle != null) {
            String string = bundle.getString("device_info", "");
            Log.m105927v("MicroMsg.OpenVoice.OpenVoiceService", "hy: updatad device info %s", string);
            C107835h0.m146105b(string);
            return;
        }
        Log.m105920e("MicroMsg.OpenVoice.OpenVoiceService", "hy: can not get device info from mm");
    }
}
