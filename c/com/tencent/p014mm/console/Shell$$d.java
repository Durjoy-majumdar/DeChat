package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.HotPatchApplyEvent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.console.Shell$$d */
public class Shell$$d implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        HotPatchApplyEvent hotPatchApplyEvent = new HotPatchApplyEvent();
        hotPatchApplyEvent.f78833d.f78838e = intent.getExtras().getString("path", "/data/local/tmp/test.apk");
        Log.m105929w("MicroMsg.Shell", "hotpatch test [%s]", hotPatchApplyEvent.f78833d.f78838e);
        hotPatchApplyEvent.publish();
    }
}
