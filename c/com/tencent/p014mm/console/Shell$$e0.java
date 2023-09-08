package com.tencent.p014mm.console;

import android.content.Intent;
import ce2.C28544a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$e0 */
public class Shell$$e0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        C28544a.INSTANCE.mo56047c("<cmd><diagnostic><PthreadHook enable='1' source='push' multiprocess='0' duration='24' hook='.*\\.so$' force='1' thread='.*'/></diagnostic></cmd>");
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "PthreadHook enable", 1).show();
    }
}
