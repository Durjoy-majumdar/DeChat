package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import p530fx.C75818e;

/* renamed from: com.tencent.mm.ui.chatting.component.j */
public class C73505j implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C75818e f215948d;

    public C73505j(ChatroomComponent chatroomComponent, C75818e eVar) {
        this.f215948d = eVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C75818e eVar = this.f215948d;
        if (eVar != null) {
            eVar.cancel();
        }
    }
}
