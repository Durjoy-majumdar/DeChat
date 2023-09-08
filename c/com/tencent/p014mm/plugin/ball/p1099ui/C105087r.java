package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ball.ui.r */
public class C105087r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f311876d;

    /* renamed from: e */
    public final /* synthetic */ C105085q f311877e;

    public C105087r(C105085q qVar, boolean z) {
        this.f311877e = qVar;
        this.f311876d = z;
    }

    public void run() {
        if (this.f311877e.mo149235e()) {
            C105070f fVar = this.f311877e.f311870d;
            boolean z = this.f311876d;
            FloatBallView floatBallView = fVar.f311845c;
            if (floatBallView != null) {
                floatBallView.mo149275R(z);
            }
            if (!z) {
                FloatMenuView floatMenuView = fVar.f311846d;
                if (floatMenuView != null) {
                    floatMenuView.mo149359b((AnimatorListenerAdapter) null);
                }
                FloatBallView floatBallView2 = fVar.f311845c;
                if (floatBallView2 != null) {
                    floatBallView2.mo149275R(z);
                }
            }
            if (this.f311876d) {
                C105085q qVar = this.f311877e;
                if (qVar.f311872f) {
                    Log.m105924i("MicroMsg.FloatBallUIManager", "alvinluo checkFloatBallViewWhenForeground forceHideAllFloatBall and hide");
                    if (qVar.mo149235e()) {
                        qVar.f311870d.mo149222e(false, (AnimatorListenerAdapter) null);
                    }
                }
            }
        }
    }
}
