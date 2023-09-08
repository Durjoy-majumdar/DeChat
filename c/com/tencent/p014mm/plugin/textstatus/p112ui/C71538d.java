package com.tencent.p014mm.plugin.textstatus.p112ui;

import com.tencent.p014mm.autogen.events.StatusIconConfigUpdateEvent;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.d */
public final class C71538d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ StatusIconConfigUpdateEvent f207293d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusEditActivity f207294e;

    public C71538d(StatusIconConfigUpdateEvent statusIconConfigUpdateEvent, TextStatusEditActivity textStatusEditActivity) {
        this.f207293d = statusIconConfigUpdateEvent;
        this.f207294e = textStatusEditActivity;
    }

    public final void run() {
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "config update old" + this.f207293d.f107775d.f107776a + " new:" + this.f207293d.f107775d.f107777b);
        TextStatusEditActivity textStatusEditActivity = this.f207294e;
        TextStatusEditActivity.C71390b bVar = TextStatusEditActivity.f206867L1;
        textStatusEditActivity.mo98472q8();
        this.f207294e.mo98465k8();
    }
}
