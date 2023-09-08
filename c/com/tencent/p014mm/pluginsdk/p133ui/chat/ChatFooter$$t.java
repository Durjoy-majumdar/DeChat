package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$t */
public class ChatFooter$$t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212059d;

    public ChatFooter$$t(ChatFooter chatFooter) {
        this.f212059d = chatFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChatFooter chatFooter = this.f212059d;
        chatFooter.f211944u3 = false;
        chatFooter.f211750D2.mo98691b(6);
        this.f212059d.f211780L.mo100662x();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$53", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
