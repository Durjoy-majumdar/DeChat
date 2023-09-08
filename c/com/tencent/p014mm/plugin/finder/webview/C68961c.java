package com.tencent.p014mm.plugin.finder.webview;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.finder.webview.c */
public final class C68961c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f198166d;

    public C68961c(View view) {
        this.f198166d = view;
    }

    public final void run() {
        View view = this.f198166d;
        if (view != null) {
            view.requestLayout();
        }
    }
}
