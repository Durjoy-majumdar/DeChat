package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.p136ui.conversation.FolderHelper;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.k0 */
public final class C44995k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74720p.C74733m f122049d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup.LayoutParams f122050e;

    /* renamed from: f */
    public final /* synthetic */ FolderHelper.C44909a f122051f;

    public C44995k0(C74720p.C74733m mVar, ViewGroup.LayoutParams layoutParams, FolderHelper.C44909a aVar) {
        this.f122049d = mVar;
        this.f122050e = layoutParams;
        this.f122051f = aVar;
    }

    public final void run() {
        View view = this.f122049d.f219763r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        C74720p.C74733m mVar = this.f122049d;
        mVar.f219760o = 0;
        mVar.f219762q.setLayoutParams(this.f122050e);
        View view2 = this.f122049d.f219762q;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f122049d.f219762q.requestLayout();
        FolderHelper.C44909a aVar3 = this.f122051f;
        if (aVar3 != null) {
            aVar3.mo70206a(this.f122049d);
        }
    }
}
