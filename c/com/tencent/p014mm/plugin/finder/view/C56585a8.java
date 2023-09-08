package com.tencent.p014mm.plugin.finder.view;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.finder.view.a8 */
public final class C56585a8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f162218d;

    /* renamed from: e */
    public final /* synthetic */ TestPreloadPreview f162219e;

    public C56585a8(View view, TestPreloadPreview testPreloadPreview) {
        this.f162218d = view;
        this.f162219e = testPreloadPreview;
    }

    public final void run() {
        this.f162218d.setTranslationX(-this.f162219e.getTranslateOffset());
    }
}
