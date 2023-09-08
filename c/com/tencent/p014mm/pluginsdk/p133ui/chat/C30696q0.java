package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.q0 */
public class C30696q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f82602d;

    public C30696q0(ChatFooter chatFooter) {
        this.f82602d = chatFooter;
    }

    public void run() {
        View view = this.f82602d.f211919p3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$94", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$94", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
