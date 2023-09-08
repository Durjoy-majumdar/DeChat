package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$d0 */
public class ChatFooter$$d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter$$o1 f211986d;

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f211987e;

    public ChatFooter$$d0(ChatFooter chatFooter, ChatFooter$$o1 chatFooter$$o1) {
        this.f211987e = chatFooter;
        this.f211986d = chatFooter$$o1;
    }

    public void run() {
        this.f211987e.f211915p.setBackgroundResource(C0966R.C0969drawable.a_z);
        this.f211987e.f211915p.setText(C0966R.string.b5r);
        ChatFooter chatFooter = this.f211987e;
        if (chatFooter.f211774J2) {
            int ordinal = this.f211986d.ordinal();
            if (ordinal == 0 || ordinal == 5 || ordinal == 2 || ordinal == 3) {
                ChatFooter chatFooter2 = this.f211987e;
                if (chatFooter2.f211782L2 != null) {
                    ChatFooter.m85258l(chatFooter2);
                    return;
                }
                return;
            }
            return;
        }
        C76901s0 s0Var = chatFooter.f211957x0;
        if (s0Var != null) {
            s0Var.dismiss();
            C76901s0 s0Var2 = this.f211987e.f211746C2;
            if (s0Var2 != null) {
                s0Var2.getContentView().animate().alpha(0.0f).setDuration(300).withEndAction(this.f211987e.f211900l4).start();
            }
            this.f211987e.f211963y0.setVisibility(0);
            View view = this.f211987e.f211820U0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f211987e.f211825V0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f211987e.f211815T0;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f211987e.f211923q2;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f211987e.f211800Q0;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ChatFooter chatFooter3 = this.f211987e;
        chatFooter3.f211850b1 = false;
        chatFooter3.f211846a1 = false;
    }
}
