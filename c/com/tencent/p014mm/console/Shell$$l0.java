package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$l0 */
public class Shell$$l0 implements Shell$$s1 {

    /* renamed from: a */
    public boolean f79326a = false;

    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (this.f79326a) {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "xlog had moved.", 0).show();
            return;
        }
        Log.m105924i("MicroMsg.Shell", "action: wechat.shell.PULL_XLOG");
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "start to move xlog.", 0).show();
        Log.moveLogsFromCacheDirToLogDir();
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "xlog move success", 0).show();
        this.f79326a = true;
    }
}
