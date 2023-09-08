package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.c */
public final class C105519c implements C105516a {

    /* renamed from: a */
    public final /* synthetic */ ImproveMMSightCircularProgressBar f313903a;

    public C105519c(ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar) {
        this.f313903a = improveMMSightCircularProgressBar;
    }

    /* renamed from: a */
    public void mo150364a(float f) {
        if (f <= 100.0f) {
            ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar = this.f313903a;
            improveMMSightCircularProgressBar.f313706n = f;
            improveMMSightCircularProgressBar.invalidate();
        }
    }

    public void onAnimationEnd() {
        Log.m105924i("MicroMsg.ImproveMMSightCircularProgressBar", "onAnimationEnd");
        C105518b0 b0Var = this.f313903a.f313705j;
        if (b0Var != null) {
            b0Var.mo150366a(true);
        }
    }
}
