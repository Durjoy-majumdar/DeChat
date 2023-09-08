package com.tencent.p014mm.wallet_core.p137ui;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.WalletErrorCodeDialogClickEvent;
import ob0.C117747y;

/* renamed from: com.tencent.mm.wallet_core.ui.x */
public class C75241x implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBaseUI f221367d;

    /* renamed from: e */
    public final /* synthetic */ C117747y f221368e;

    public C75241x(WalletBaseUI walletBaseUI, C117747y yVar) {
        this.f221367d = walletBaseUI;
        this.f221368e = yVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C75190a0.m90155a(this.f221367d);
        C117747y yVar = this.f221368e;
        if (yVar != null && yVar.getReqResp() != null) {
            WalletErrorCodeDialogClickEvent walletErrorCodeDialogClickEvent = new WalletErrorCodeDialogClickEvent();
            walletErrorCodeDialogClickEvent.f194036d.f194037a = this.f221368e.getReqResp().getUri();
            walletErrorCodeDialogClickEvent.publish();
        }
    }
}
