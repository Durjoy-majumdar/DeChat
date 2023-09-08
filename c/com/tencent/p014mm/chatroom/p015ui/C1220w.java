package com.tencent.p014mm.chatroom.p015ui;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.chatroom.ui.w */
public class C1220w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI f10262d;

    public C1220w(ChatroomInfoUI chatroomInfoUI) {
        this.f10262d = chatroomInfoUI;
    }

    public void run() {
        C76912y0.m92768g(this.f10262d.getContext(), this.f10262d.getResources().getString(C0966R.string.mtp));
        Intent intent = new Intent();
        intent.putExtra("dismiss_chatroom", true);
        this.f10262d.setResult(-1, intent);
        if (!this.f10262d.isFinishing()) {
            this.f10262d.finish();
        }
    }
}
