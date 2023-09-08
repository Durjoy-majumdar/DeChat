package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ball.ui.z */
public class C105095z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105085q f311895d;

    public C105095z(C105085q qVar) {
        this.f311895d = qVar;
    }

    public void run() {
        if (this.f311895d.mo149235e()) {
            this.f311895d.mo149237g();
            C105070f fVar = this.f311895d.f311870d;
            if (fVar.f311845c.getVisibility() != 0 && fVar.f311846d.getVisibility() != 0) {
                fVar.mo149221d();
            } else if (fVar.f311845c.getVisibility() == 0) {
                boolean z = fVar.f311845c.f311954W0;
                Log.m105925i("MicroMsg.FloatBallContainer", "detachFromWindow, hide floatBallView, needTranslateAnimation: %b", Boolean.valueOf(z));
                if (z) {
                    fVar.f311845c.mo149344y(new C105069e(fVar));
                } else {
                    fVar.f311845c.mo149342x(false, (AnimatorListenerAdapter) null);
                    fVar.mo149221d();
                }
            } else if (fVar.f311846d.getVisibility() == 0) {
                Log.m105924i("MicroMsg.FloatBallContainer", "detachFromWindow, hide floatMenuView");
                fVar.f311849g.mo164421a(1);
                fVar.f311846d.setCanAddFloatBallWhenHide(fVar.f311851i);
                fVar.f311851i = false;
                fVar.f311846d.mo149359b((AnimatorListenerAdapter) null);
                fVar.mo149221d();
            }
            this.f311895d.f311870d = null;
        }
    }
}
