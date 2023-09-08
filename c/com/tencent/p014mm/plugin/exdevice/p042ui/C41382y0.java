package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import com.tencent.p014mm.plugin.exdevice.model.C41158q1;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.y0 */
public class C41382y0 implements C41158q1.C41162d {

    /* renamed from: a */
    public final /* synthetic */ ExdeviceRankInfoUI f111412a;

    public C41382y0(ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f111412a = exdeviceRankInfoUI;
    }

    /* renamed from: a */
    public void mo64226a(String str) {
        ExdeviceRankInfoUI exdeviceRankInfoUI = this.f111412a;
        int i = ExdeviceRankInfoUI.f111217R;
        exdeviceRankInfoUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("image_path", str);
        C88144b.m109802t(exdeviceRankInfoUI, ".ui.transmit.SelectConversationUI", intent, 1);
    }
}
