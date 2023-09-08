package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ball.ui.y */
public class C105094y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f311891d;

    /* renamed from: e */
    public final /* synthetic */ boolean f311892e;

    /* renamed from: f */
    public final /* synthetic */ AnimatorListenerAdapter f311893f;

    /* renamed from: g */
    public final /* synthetic */ C105085q f311894g;

    public C105094y(C105085q qVar, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f311894g = qVar;
        this.f311891d = z;
        this.f311892e = z2;
        this.f311893f = animatorListenerAdapter;
    }

    public void run() {
        if (this.f311894g.mo149235e()) {
            C105070f fVar = this.f311894g.f311870d;
            boolean z = this.f311891d;
            boolean z2 = this.f311892e;
            AnimatorListenerAdapter animatorListenerAdapter = this.f311893f;
            if (fVar.f311845c != null) {
                Log.m105925i("MicroMsg.FloatBallContainer", "resume FloatBallView, animation:%s", Boolean.valueOf(z));
                fVar.f311845c.mo149281Y(z, z2, animatorListenerAdapter);
            }
            if (fVar.f311846d != null) {
                Log.m105924i("MicroMsg.FloatBallContainer", "quickHide FloatMenuView");
                fVar.f311846d.mo149359b(animatorListenerAdapter);
            }
        }
    }
}
