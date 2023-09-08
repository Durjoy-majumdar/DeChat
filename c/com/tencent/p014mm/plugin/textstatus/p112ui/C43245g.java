package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.widget.PopupWindow;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.g */
public final class C43245g implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusLikeListFragment f117034d;

    public C43245g(TextStatusLikeListFragment textStatusLikeListFragment) {
        this.f117034d = textStatusLikeListFragment;
    }

    public final void onDismiss() {
        this.f117034d.f116946u = -1;
    }
}
