package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C45612m0;

/* renamed from: com.tencent.mm.ui.chatting.component.u */
public class C30830u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f82843d;

    /* renamed from: e */
    public final /* synthetic */ ChatroomComponent f82844e;

    public C30830u(ChatroomComponent chatroomComponent, String str) {
        this.f82844e = chatroomComponent;
        this.f82843d = str;
    }

    public void run() {
        if (this.f82844e.f215752d == null) {
            Log.m105920e("MicroMsg.ChattingUI.ChatroomComponent", "[getChatroomInfoDetail] mChattingContext is null!");
        } else {
            C45612m0.m50686c(this.f82843d);
        }
    }
}
