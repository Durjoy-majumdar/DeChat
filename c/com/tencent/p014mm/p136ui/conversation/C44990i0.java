package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.i0 */
public final class C44990i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74720p.C74733m f122044d;

    public C44990i0(C74720p.C74733m mVar) {
        this.f122044d = mVar;
    }

    public final void run() {
        View view = this.f122044d.f219763r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view2 = this.f122044d.f219762q;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
