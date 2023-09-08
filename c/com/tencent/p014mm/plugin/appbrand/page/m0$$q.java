package com.tencent.p014mm.plugin.appbrand.page;

import android.os.SystemClock;
import android.view.Choreographer;
import android.view.animation.Animation;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$q */
public class m0$$q implements Choreographer.FrameCallback {

    /* renamed from: d */
    public final /* synthetic */ long f244807d;

    /* renamed from: e */
    public final /* synthetic */ long f244808e;

    /* renamed from: f */
    public final /* synthetic */ C83817h4 f244809f;

    /* renamed from: g */
    public final /* synthetic */ C83820i0 f244810g;

    /* renamed from: h */
    public final /* synthetic */ C83820i0 f244811h;

    /* renamed from: i */
    public final /* synthetic */ Animation f244812i;

    /* renamed from: j */
    public final /* synthetic */ C83849m0 f244813j;

    public m0$$q(C83849m0 m0Var, long j, long j2, C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2, Animation animation) {
        this.f244813j = m0Var;
        this.f244807d = j;
        this.f244808e = j2;
        this.f244809f = h4Var;
        this.f244810g = i0Var;
        this.f244811h = i0Var2;
        this.f244812i = animation;
    }

    public void doFrame(long j) {
        float elapsedRealtime = (((float) (SystemClock.elapsedRealtime() - this.f244807d)) + 0.0f) / ((float) this.f244808e);
        if (1.0f <= elapsedRealtime) {
            this.f244813j.mo116361m(this.f244809f, this.f244810g, this.f244811h);
            return;
        }
        this.f244813j.mo116362n(this.f244809f, this.f244810g, this.f244811h, (float) ((int) (this.f244812i.getInterpolator().getInterpolation(elapsedRealtime) * 100.0f)));
        Choreographer.getInstance().postFrameCallback(this);
    }
}
