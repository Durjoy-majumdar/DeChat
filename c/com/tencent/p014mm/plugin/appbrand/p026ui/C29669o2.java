package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ke3.C88144b;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.o2 */
public final class C29669o2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f80625d;

    public C29669o2(Activity activity) {
        this.f80625d = activity;
    }

    public final void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f7586ke, 1).show();
        Activity activity = this.f80625d;
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra("animation_pop_in", true);
        intent.putExtra("Intro_Switch", true);
        C13598b0 b0Var = C13598b0.f38549a;
        C88144b.m109801s(activity, ".ui.LauncherUI", intent, (Bundle) null);
        C84572p2.m104168b(this.f80625d);
    }
}
