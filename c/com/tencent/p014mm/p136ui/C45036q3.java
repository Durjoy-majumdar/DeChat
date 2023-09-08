package com.tencent.p014mm.p136ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75604z3;

/* renamed from: com.tencent.mm.ui.q3 */
public class C45036q3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f122141d;

    /* renamed from: e */
    public final /* synthetic */ SingleChatInfoUI f122142e;

    public C45036q3(SingleChatInfoUI singleChatInfoUI, ProgressDialog progressDialog) {
        this.f122142e = singleChatInfoUI;
        this.f122141d = progressDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14553, 6, 3, this.f122142e.f121200n);
        this.f122141d.show();
        SingleChatInfoUI.f121192y = false;
        SingleChatInfoUI singleChatInfoUI = this.f122142e;
        C75604z3.m90836h(singleChatInfoUI.f121194e.getUsername(), new C45038r3(singleChatInfoUI, this.f122141d));
        singleChatInfoUI.f121195f.post(new C74820t3(singleChatInfoUI));
    }
}
