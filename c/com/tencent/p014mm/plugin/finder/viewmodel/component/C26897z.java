package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderCommentFooter;
import rs1.C63539a6;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.z */
public final class C26897z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C63539a6 f74792d;

    public C26897z(C63539a6 a6Var) {
        this.f74792d = a6Var;
    }

    public final void run() {
        FinderCommentDrawer finderCommentDrawer = this.f74792d.mo88396a().f158605H;
        FinderCommentFooter footer = finderCommentDrawer != null ? finderCommentDrawer.getFooter() : null;
        if (footer != null) {
            footer.setFrozen(false);
        }
    }
}
