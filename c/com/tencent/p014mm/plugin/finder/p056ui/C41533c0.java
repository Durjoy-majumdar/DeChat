package com.tencent.p014mm.plugin.finder.p056ui;

/* renamed from: com.tencent.mm.plugin.finder.ui.c0 */
public final class C41533c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderConversationFragment f111839d;

    public C41533c0(FinderConversationFragment finderConversationFragment) {
        this.f111839d = finderConversationFragment;
    }

    public final void run() {
        FinderConversationFragment finderConversationFragment = this.f111839d;
        int i = FinderConversationFragment.f111770H;
        finderConversationFragment.mo62821V().notifyItemChanged(0);
    }
}
