package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import com.tencent.p014mm.plugin.exdevice.model.C41158q1;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.m0 */
public class C41349m0 implements C41158q1.C41162d {

    /* renamed from: a */
    public final /* synthetic */ ExdeviceProfileUI f111329a;

    public C41349m0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111329a = exdeviceProfileUI;
    }

    /* renamed from: a */
    public void mo64226a(String str) {
        ExdeviceProfileUI exdeviceProfileUI = this.f111329a;
        int i = ExdeviceProfileUI.f111160M;
        exdeviceProfileUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("image_path", str);
        C88144b.m109802t(exdeviceProfileUI, ".ui.transmit.SelectConversationUI", intent, 1);
    }
}
