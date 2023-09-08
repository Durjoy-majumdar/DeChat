package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$f1 */
public class ChatFooter$$f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211994d;

    public ChatFooter$$f1(ChatFooter chatFooter) {
        this.f211994d = chatFooter;
    }

    public void run() {
        View view = this.f211994d.f211919p3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$92", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$92", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ChatFooter chatFooter = this.f211994d;
        chatFooter.f211924q3.mo104517q(chatFooter.getResources().getColor(C0966R.color.f3131gg), 0.5f);
    }
}
