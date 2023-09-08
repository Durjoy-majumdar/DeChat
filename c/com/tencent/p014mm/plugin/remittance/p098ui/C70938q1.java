package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.remittance.ui.q1 */
public class C70938q1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RemittanceResultOldUI f205384d;

    public C70938q1(RemittanceResultOldUI remittanceResultOldUI) {
        this.f205384d = remittanceResultOldUI;
    }

    public void run() {
        RemittanceResultOldUI remittanceResultOldUI = this.f205384d;
        int i = remittanceResultOldUI.f205190f;
        if (i == 33 || i == 32) {
            remittanceResultOldUI.finish();
        } else if (Util.isNullOrNil(remittanceResultOldUI.f205191g) || this.f205384d.f205192h) {
            this.f205384d.finish();
        } else {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", this.f205384d.f205191g);
            intent.putExtra("finish_direct", false);
            C88144b.m109801s(this.f205384d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        }
    }
}
