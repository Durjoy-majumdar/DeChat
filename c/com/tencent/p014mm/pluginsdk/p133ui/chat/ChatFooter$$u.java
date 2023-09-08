package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$u */
public class ChatFooter$$u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212061d;

    public ChatFooter$$u(ChatFooter chatFooter) {
        this.f212061d = chatFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$54", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChatFooter chatFooter = this.f212061d;
        if (chatFooter.f211780L != null) {
            chatFooter.f211944u3 = false;
            chatFooter.f211750D2.mo98691b(7);
            C72825s0 s0Var = this.f212061d.f211780L;
            s0Var.mo100651F(s0Var.mo100652a(), this.f212061d.f211862d4);
            ChatFooter.m85258l(this.f212061d);
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$54", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
