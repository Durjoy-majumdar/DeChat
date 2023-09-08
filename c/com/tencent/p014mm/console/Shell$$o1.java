package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.console.Shell$$o1 */
public class Shell$$o1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        String stringExtra = intent.getStringExtra("errmsg");
        C90188n0.f258953u = stringExtra;
        Log.m105929w("MicroMsg.Shell", "tiger set tigerIDCErrMsg =%s", stringExtra);
    }
}
