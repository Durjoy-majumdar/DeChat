package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.matrix.resource.C80530h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import p757xv.C38850q;
import p761yd.C91441c;
import p982if.C87719c;
import p982if.C87725f;
import p987jf.C87954a;

/* renamed from: com.tencent.mm.console.Shell$$w0 */
public class Shell$$w0 implements Shell$$t1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        C87954a aVar;
        Class cls = C38850q.class;
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            C80530h hVar = (C80530h) C91441c.m114730d().mo125377a(C80530h.class);
            if (hVar != null && (aVar = hVar.f235549i) != null) {
                C87719c cVar = aVar.f254533n;
                if (cVar instanceof C87725f) {
                    ((C87725f) cVar).f254012g = true;
                    ((C38850q) C86312j.m106911c(cls)).a70(intent);
                    ((C38850q) C86312j.m106911c(cls)).mi0(intent);
                    return;
                }
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
