package com.tencent.p014mm.chatroom.p015ui;

import eb0.C31519v2;
import eb0.C75597w2;

/* renamed from: com.tencent.mm.chatroom.ui.e */
public class C67954e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C75597w2.C31525a f195073d;

    /* renamed from: e */
    public final /* synthetic */ ChatroomInfoUI f195074e;

    public C67954e(ChatroomInfoUI chatroomInfoUI, C75597w2.C31525a aVar) {
        this.f195074e = chatroomInfoUI;
        this.f195073d = aVar;
    }

    public void run() {
        C31519v2.m39436a().mo55988e(this.f195074e.f194775G.field_chatroomname, "", this.f195073d);
    }

    public String toString() {
        return super.toString() + "|getContactCallBack2";
    }
}
