package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m7$$e$$c */
public class m7$$e$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74123m7 f165367d;

    public m7$$e$$c(m7$$e m7__e, C74123m7 m7Var) {
        this.f165367d = m7Var;
    }

    public void run() {
        View view = this.f165367d.f217577x;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
