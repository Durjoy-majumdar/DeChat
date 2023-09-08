package com.tencent.p014mm.plugin.appbrand.page;

import android.view.animation.Animation;
import go3.C87282f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.w */
public final class C83957w extends C87282f {

    /* renamed from: a */
    public final /* synthetic */ C83943v f245103a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f245104b;

    public C83957w(C83943v vVar, Runnable runnable) {
        this.f245103a = vVar;
        this.f245104b = runnable;
    }

    public void onAnimationEnd(Animation animation) {
        this.f245103a.f245081B = null;
        Runnable runnable = this.f245104b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
