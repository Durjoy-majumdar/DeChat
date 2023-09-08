package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;

/* renamed from: com.tencent.mm.chatroom.ui.g1 */
public class C1216g1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72940a f10247d;

    /* renamed from: e */
    public final /* synthetic */ ModRemarkRoomNameUI f10248e;

    public C1216g1(ModRemarkRoomNameUI modRemarkRoomNameUI, C72940a aVar) {
        this.f10248e = modRemarkRoomNameUI;
        this.f10247d = aVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10247d.mo100867d(this.f10248e.getContext(), this.f10248e.getString(C0966R.string.a3h), this.f10248e.getString(C0966R.string.blb), false, false, (DialogInterface.OnCancelListener) null);
    }
}
