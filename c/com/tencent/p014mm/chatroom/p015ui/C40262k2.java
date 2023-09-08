package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C117747y;
import p203mi.C47053y;
import p239sv.C77792p;

/* renamed from: com.tencent.mm.chatroom.ui.k2 */
public class C40262k2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f108273d;

    /* renamed from: e */
    public final /* synthetic */ TransferRoomOwnerUI f108274e;

    public C40262k2(TransferRoomOwnerUI transferRoomOwnerUI, String str) {
        this.f108274e = transferRoomOwnerUI;
        this.f108273d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C86709a0.m107529k().f251779b.mo123460f(C72996z1.m85847r5(this.f108274e.f108223o) ? (C117747y) ((C77792p) C86312j.m106911c(C77792p.class)).mo107734WU(this.f108274e.f108223o, this.f108273d) : new C47053y(this.f108274e.f108223o, this.f108273d));
        TransferRoomOwnerUI transferRoomOwnerUI = this.f108274e;
        transferRoomOwnerUI.f108265u = C76879j.m92723Q(transferRoomOwnerUI, transferRoomOwnerUI.getString(C0966R.string.a3h), this.f108274e.getString(C0966R.string.i9r), true, false, (DialogInterface.OnCancelListener) null);
    }
}
