package com.tencent.p014mm.plugin.ball.p1099ui;

import com.tencent.p014mm.plugin.ball.view.FloatBallView;

/* renamed from: com.tencent.mm.plugin.ball.ui.t */
public class C105089t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105085q f311879d;

    public C105089t(C105085q qVar) {
        this.f311879d = qVar;
    }

    public void run() {
        FloatBallView floatBallView;
        if (this.f311879d.mo149235e() && (floatBallView = this.f311879d.f311870d.f311845c) != null) {
            floatBallView.mo149293g(false, true);
        }
    }
}
