package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$b0 */
public class ChatFooter$$b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211980d;

    public ChatFooter$$b0(ChatFooter chatFooter) {
        this.f211980d = chatFooter;
    }

    public void run() {
        ChatFooter chatFooter = this.f211980d;
        if (chatFooter.f211842Z0) {
            View view = chatFooter.f211800Q0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$60", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$60", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f211980d.f211890j2;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$60", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$60", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view5 = chatFooter.f211800Q0;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$60", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$60", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f211980d.f211890j2;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$60", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$60", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
