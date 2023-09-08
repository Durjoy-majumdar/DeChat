package com.tencent.p014mm.console;

import android.content.Intent;
import ce2.C28544a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$f0 */
public class Shell$$f0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        C28544a.INSTANCE.mo56047c("<cmd><diagnostic><report><pthread/></report></diagnostic></cmd>");
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "PthreadHook report", 1).show();
    }
}
