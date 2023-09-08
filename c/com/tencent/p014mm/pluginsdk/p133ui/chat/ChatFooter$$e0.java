package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$e0 */
public class ChatFooter$$e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211990d;

    public ChatFooter$$e0(ChatFooter chatFooter) {
        this.f211990d = chatFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$63", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChatFooter$$n1 chatFooter$$n1 = this.f211990d.f211784M;
        if (chatFooter$$n1 != null) {
            chatFooter$$n1.mo70088a(false);
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$63", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
