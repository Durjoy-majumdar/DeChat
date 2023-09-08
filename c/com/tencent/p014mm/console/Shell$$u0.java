package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import java.util.HashMap;
import pc0.C77064b0;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.console.Shell$$u0 */
public class Shell$$u0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        C90188n0.f258950r = Util.safeParseInt(intent.getStringExtra("key"));
        C90188n0.f258951s = Util.safeParseInt(intent.getStringExtra(TPReportParams.JSON_KEY_VAL));
        C90188n0.f258952t = intent.getStringExtra("str");
        Log.m105929w("MicroMsg.Shell", "dkshell set [%d %d] [%s]", Integer.valueOf(C90188n0.f258950r), Integer.valueOf(C90188n0.f258951s), C90188n0.f258952t);
        int i = C90188n0.f258950r;
        if (10009 == i) {
            boolean z = C90188n0.f258933a;
            HashMap<String, Shell$$s1> hashMap = Shell.f79321b;
        } else if (10014 == i && MMApplicationContext.isMMProcess()) {
            C77064b0.yn0().mo182762f(7, 1, "");
        } else if (10015 == C90188n0.f258950r) {
            MMApplicationContext.isPushProcess();
        }
    }
}
