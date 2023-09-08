package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.p136ui.conversation.C74720p;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.conversation.l0 */
public final class C74707l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FolderHelper f219657d;

    public C74707l0(FolderHelper folderHelper) {
        this.f219657d = folderHelper;
    }

    public final void run() {
        C13598b0 b0Var;
        FolderHelper folderHelper = this.f219657d;
        C74720p.C74733m m = folderHelper.mo103790m("message_fold");
        if (m != null) {
            if (m.f219762q.getTop() > folderHelper.f219417s || m.f219762q.getTop() <= folderHelper.f219416r) {
                folderHelper.mo103801x(false);
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            folderHelper.mo103801x(true);
        }
    }
}
