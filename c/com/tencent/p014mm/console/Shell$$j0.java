package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.console.Shell$$j0 */
public class Shell$$j0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("value", false);
        C90188n0.f258944l = booleanExtra;
        Log.m105929w("MicroMsg.Shell", "kiro set Test.forceCDNTrans=%b", Boolean.valueOf(booleanExtra));
    }
}
