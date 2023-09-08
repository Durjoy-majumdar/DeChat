package com.tencent.p014mm.p136ui.conversation.banner;

import android.view.View;
import com.tencent.p014mm.p136ui.conversation.banner.InviteFriendBanner;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.banner.p */
public class C6958p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ InviteFriendBanner.C69522 f24664d;

    public C6958p(InviteFriendBanner.C69522 r1) {
        this.f24664d = r1;
    }

    public void run() {
        View view = InviteFriendBanner.this.f24652h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/InviteFriendBanner$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/conversation/banner/InviteFriendBanner$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        InviteFriendBanner.this.f24652h.setPadding(0, 0, 0, 0);
    }
}
