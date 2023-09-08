package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.d2 */
public class C105403d2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105420i2 f313371d;

    public C105403d2(C105420i2 i2Var) {
        this.f313371d = i2Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.TalkUIController", "user choose end this call because isNotFree");
        C105420i2 i2Var = this.f313371d;
        i2Var.f313452y.mo150067j(0, 0);
        ((MMNotification) C97625j3.m125816f()).mo93207e(42);
        i2Var.f313450w.finish();
    }
}
