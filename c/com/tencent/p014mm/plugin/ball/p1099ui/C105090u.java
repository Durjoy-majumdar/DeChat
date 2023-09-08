package com.tencent.p014mm.plugin.ball.p1099ui;

import com.tencent.p014mm.plugin.ball.view.FloatBallView;

/* renamed from: com.tencent.mm.plugin.ball.ui.u */
public class C105090u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ float f311880d;

    /* renamed from: e */
    public final /* synthetic */ C105085q f311881e;

    public C105090u(C105085q qVar, float f) {
        this.f311881e = qVar;
        this.f311880d = f;
    }

    public void run() {
        if (this.f311881e.mo149235e()) {
            C105070f fVar = this.f311881e.f311870d;
            float f = this.f311880d;
            FloatBallView floatBallView = fVar.f311845c;
            if (floatBallView != null) {
                floatBallView.setFloatBallAlpha(f);
            }
        }
    }
}
