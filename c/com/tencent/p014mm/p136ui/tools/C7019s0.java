package com.tencent.p014mm.p136ui.tools;

import android.view.View;
import android.view.Window;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.tools.s0 */
public final class C7019s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Window f24773d;

    public C7019s0(Window window) {
        this.f24773d = window;
    }

    public final void run() {
        this.f24773d.setDecorFitsSystemWindows(true);
        this.f24773d.getDecorView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        this.f24773d.getDecorView().requestApplyInsets();
        Log.m105924i("KeyBoardHeightProviderUtil", "removeOnApplyWindowInsetsListener");
    }
}
