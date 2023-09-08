package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;

/* renamed from: com.tencent.mm.ui.chatting.component.q */
public class C73578q implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C72940a f216090d;

    public C73578q(ChatroomComponent chatroomComponent, C72940a aVar) {
        this.f216090d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f216090d.cancel();
    }
}
