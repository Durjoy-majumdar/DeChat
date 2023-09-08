package com.tencent.p014mm.plugin.base.stub;

import android.os.SystemClock;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.base.stub.l */
public class C68755l extends C114668z.C104589a {
    public void onAppBackground(String str) {
        Log.m105918d("MicroMsg.WXBizLogic", "turn onAppBackground");
        C85083h.f247926g = false;
    }

    public void onAppForeground(String str) {
        C85083h.f247926g = true;
        C85083h.f247927h = SystemClock.elapsedRealtime();
        Log.m105918d("MicroMsg.WXBizLogic", "turn onAppForeground");
        if (C85083h.f247921b != null && C86709a0.m107522a()) {
            Log.m105918d("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry onAppForeground");
            C85083h.m104915d();
        }
    }
}
