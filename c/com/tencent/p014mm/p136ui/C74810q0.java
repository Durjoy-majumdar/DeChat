package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import eb0.C97625j3;
import ke3.C88144b;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.ui.q0 */
public class C74810q0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GlobalAlertMgr f219942d;

    /* renamed from: com.tencent.mm.ui.q0$a */
    public class C74811a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface f219943d;

        public C74811a(DialogInterface dialogInterface) {
            this.f219943d = dialogInterface;
        }

        public void run() {
            if (C97625j3.m125812b().mo105883I()) {
                Intent intent = new Intent();
                intent.putExtra("had_detected_no_sdcard_space", true);
                C88144b.m109791i(C74810q0.this.f219942d.f214221a, "clean", ".ui.CleanUI", intent, (Bundle) null);
            } else {
                C76912y0.m92771j(C74810q0.this.f219942d.f214221a, (View) null);
            }
            this.f219943d.dismiss();
            C115669n.INSTANCE.idkeyStat(282, 1, 1, false);
        }
    }

    public C74810q0(GlobalAlertMgr globalAlertMgr) {
        this.f219942d = globalAlertMgr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MMHandlerThread.postToMainThread(new C74811a(dialogInterface));
    }
}
