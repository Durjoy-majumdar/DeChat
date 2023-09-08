package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.g */
public final class C4435g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f19167d;

    public C4435g(C101218e0 e0Var) {
        this.f19167d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/ui/MentionSomeoneDialogUtil$initMentionSomeoneDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f19167d.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/ui/MentionSomeoneDialogUtil$initMentionSomeoneDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
