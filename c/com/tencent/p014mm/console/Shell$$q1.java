package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.console.Shell$$q1 */
public class Shell$$q1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        C90188n0.f258954v = intent.getStringExtra("acc");
        C90188n0.f258955w = intent.getStringExtra(StateEvent.ActionValue.STAGE_PASS);
        Log.m105929w("MicroMsg.Shell", "dkwt shell [%s %s]", C90188n0.f258954v, C90188n0.f258955w);
    }
}
