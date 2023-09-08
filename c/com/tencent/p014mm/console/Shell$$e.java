package com.tencent.p014mm.console;

import android.content.Intent;
import di3.C86312j;
import p773yy.C79168k;

/* renamed from: com.tencent.mm.console.Shell$$e */
public class Shell$$e implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        String stringExtra = intent.getStringExtra("sql");
        if (stringExtra != null) {
            ((C79168k) C86312j.m106911c(C79168k.class)).Bb0(stringExtra);
        }
    }
}
