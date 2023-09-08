package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Intent;
import android.os.Bundle;
import di3.C86312j;
import f62.C75707s0;
import ke3.C88144b;
import pb1.C62251b1;
import t22.C101715i;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b1$$f */
public final /* synthetic */ class b1$$f implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C94163b1 f272002a;

    /* renamed from: b */
    public final /* synthetic */ String f272003b;

    public /* synthetic */ b1$$f(C94163b1 b1Var, String str) {
        this.f272002a = b1Var;
        this.f272003b = str;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        C94163b1 b1Var = this.f272002a;
        String str2 = this.f272003b;
        b1Var.mo129363p();
        if (z) {
            ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96076P7().mo90704g(str2);
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_content", C101715i.m133625b(b1Var.f271951g));
            intent.putExtra("Retr_Msg_Type", 9);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Select_Conv_User", str2);
            C88144b.m109801s(b1Var.f271948d, ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
            Intent n = b1Var.mo129361n();
            String str3 = b1Var.f271963v;
            long j = b1Var.f271962u;
            int i2 = C62251b1.f176956C0;
            ((C62251b1) C86312j.m106911c(C62251b1.class)).mo87305En(n, str3, j, 3);
        }
    }
}
