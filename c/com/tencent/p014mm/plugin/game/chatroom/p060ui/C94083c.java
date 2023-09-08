package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.c */
public class C94083c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ GameImagePreviewUI f271665d;

    public C94083c(GameImagePreviewUI gameImagePreviewUI) {
        this.f271665d = gameImagePreviewUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        this.f271665d.f271656n.mo107567l((View) null);
        e0Var.clear();
        e0Var.mo107125a(1, C0966R.string.iam);
    }
}
