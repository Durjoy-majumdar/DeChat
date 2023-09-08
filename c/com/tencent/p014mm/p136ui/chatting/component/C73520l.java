package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import p530fx.C75818e;

/* renamed from: com.tencent.mm.ui.chatting.component.l */
public class C73520l implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C75818e f215964d;

    /* renamed from: e */
    public final /* synthetic */ ChatroomComponent f215965e;

    public C73520l(ChatroomComponent chatroomComponent, C75818e eVar) {
        this.f215965e = chatroomComponent;
        this.f215964d = eVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C75818e eVar = this.f215964d;
        if (eVar != null) {
            eVar.cancel();
        }
        C72940a aVar = this.f215965e.f215464q;
        if (aVar != null) {
            aVar.cancel();
        }
    }
}
