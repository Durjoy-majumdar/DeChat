package com.tencent.p014mm.plugin.textstatus.p112ui;

import com.tencent.p014mm.autogen.events.StatusIconConfigUpdateEvent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.f */
public final class C71540f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ StatusIconConfigUpdateEvent f207297d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusEditHalfScreenActivity f207298e;

    public C71540f(StatusIconConfigUpdateEvent statusIconConfigUpdateEvent, TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
        this.f207297d = statusIconConfigUpdateEvent;
        this.f207298e = textStatusEditHalfScreenActivity;
    }

    public final void run() {
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "config update old" + this.f207297d.f107775d.f107776a + " new:" + this.f207297d.f107775d.f107777b);
        TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f207298e;
        textStatusEditHalfScreenActivity.mo98539B8(textStatusEditHalfScreenActivity.f207139h);
        this.f207298e.mo98602t8();
    }
}
