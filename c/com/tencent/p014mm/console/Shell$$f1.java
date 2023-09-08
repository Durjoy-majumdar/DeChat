package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.console.Shell$$f1 */
public class Shell$$f1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        int intExtra = intent.getIntExtra("value", 0);
        boolean z = C90188n0.f258933a;
        Log.m105929w("MicroMsg.Shell", "dkdnstd set Test.netDnsSimulateFault=%s", Integer.toBinaryString(intExtra));
    }
}
