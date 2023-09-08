package com.tencent.p014mm.chatroom.p015ui;

import android.widget.CheckBox;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.storage.C44661m1;
import di3.C86312j;
import p530fx.C45819c;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.chatroom.ui.s */
public class C67989s implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f195127a;

    /* renamed from: b */
    public final /* synthetic */ CheckBox f195128b;

    /* renamed from: c */
    public final /* synthetic */ boolean f195129c;

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI f195130d;

    public C67989s(ChatroomInfoUI chatroomInfoUI, C101218e0 e0Var, CheckBox checkBox, boolean z) {
        this.f195130d = chatroomInfoUI;
        this.f195127a = e0Var;
        this.f195128b = checkBox;
        this.f195129c = z;
    }

    /* renamed from: a */
    public void mo2001a() {
        C44661m1 m1Var;
        this.f195127a.mo140680z();
        if (!this.f195128b.isChecked()) {
            ChatroomInfoUI chatroomInfoUI = this.f195130d;
            String str = chatroomInfoUI.f194770B;
            chatroomInfoUI.mo93266b8();
            C72940a b = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(str).mo71491b(str, false);
            chatroomInfoUI.f194788U = b;
            b.f212615d = new C68005v(chatroomInfoUI);
            b.mo100865c();
            return;
        }
        ChatroomInfoUI chatroomInfoUI2 = this.f195130d;
        if (!chatroomInfoUI2.f194771C || (m1Var = chatroomInfoUI2.f194775G) == null || m1Var.mo69790r2().size() <= 2) {
            ChatroomInfoUI chatroomInfoUI3 = this.f195130d;
            chatroomInfoUI3.mo93258T7(this.f195129c, chatroomInfoUI3.getResources().getString(C0966R.string.mtq));
            return;
        }
        ChatroomInfoUI chatroomInfoUI4 = this.f195130d;
        chatroomInfoUI4.mo93259U7(0, chatroomInfoUI4.getResources().getString(C0966R.string.mtq));
    }
}
