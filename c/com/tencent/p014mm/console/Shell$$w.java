package com.tencent.p014mm.console;

import android.content.Intent;
import ce2.C28544a;
import ce2.C28545b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$w */
public class Shell$$w implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        String nullAsNil = Util.nullAsNil(intent.getStringExtra("process"));
        C28544a.INSTANCE.mo56047c("<cmd><diagnostic>" + String.format("<fetch target='%s' process='%s' network='any' />", new Object[]{C28545b.m38262a("´­ ²°"), nullAsNil}) + "</diagnostic></cmd>");
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Diag op5 triggered.", 1).show();
    }
}
