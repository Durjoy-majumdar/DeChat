package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.ShellExecEvent;

/* renamed from: com.tencent.mm.console.Shell$$n0 */
public class Shell$$n0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        ShellExecEvent shellExecEvent = new ShellExecEvent();
        ShellExecEvent.C28824a aVar = shellExecEvent.f78980d;
        aVar.f78982b = "wechat.shell.FINDER_VIDEO_TEST";
        aVar.f78981a = intent;
        shellExecEvent.publish();
    }
}
