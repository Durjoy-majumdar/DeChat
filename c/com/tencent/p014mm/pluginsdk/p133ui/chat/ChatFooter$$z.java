package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import android.widget.PopupWindow;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$z */
public class ChatFooter$$z implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212073d;

    public ChatFooter$$z(ChatFooter chatFooter) {
        this.f212073d = chatFooter;
    }

    public void onDismiss() {
        View contentView = this.f212073d.f211746C2.getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "onDismiss", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        contentView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(contentView, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "onDismiss", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
