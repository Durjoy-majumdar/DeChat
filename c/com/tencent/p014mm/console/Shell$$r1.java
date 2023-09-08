package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.console.Shell$$r1 */
public class Shell$$r1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        int intExtra = intent.getIntExtra("flag", 0);
        C90188n0.f258916J = intExtra;
        Log.m105929w("MicroMsg.Shell", "dkwt shell [%d]", Integer.valueOf(intExtra));
    }
}
