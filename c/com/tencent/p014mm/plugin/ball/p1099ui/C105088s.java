package com.tencent.p014mm.plugin.ball.p1099ui;

import android.view.WindowManager;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ball.ui.s */
public class C105088s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105085q f311878d;

    public C105088s(C105085q qVar) {
        this.f311878d = qVar;
    }

    public void run() {
        FloatBallView floatBallView;
        if (this.f311878d.mo149235e() && (floatBallView = this.f311878d.f311870d.f311845c) != null) {
            Log.m105927v("MicroMsg.FloatBallView", "collapseFloatBall collapseState: %s", Integer.valueOf(floatBallView.f311975k1));
            if (floatBallView.f311977m1 && !floatBallView.mo149271N()) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) floatBallView.getLayoutParams();
                boolean z = floatBallView.f312003y0;
                int i = layoutParams.x;
                floatBallView.mo149290e0(z, true, i, layoutParams.y, floatBallView.mo149319p(i, true), layoutParams.y, false);
            }
        }
    }
}
