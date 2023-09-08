package com.tencent.p014mm.console;

import android.content.Intent;
import ce2.C28544a;
import ce2.C28545b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$u */
public class Shell$$u implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        String nullAsNil = Util.nullAsNil(intent.getStringExtra("name_regex"));
        C28544a.INSTANCE.mo56047c("<cmd><diagnostic>" + String.format("<fetch target='%s' name_regex='%s' network='any' />", new Object[]{C28545b.m38262a("§§´¥ì±¬"), nullAsNil}) + "</diagnostic></cmd>");
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Diag op3 triggered.", 1).show();
    }
}
