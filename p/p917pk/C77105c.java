package p917pk;

import com.tencent.p014mm.dynamicbackground.view.GradientColorBackgroundView;

/* renamed from: pk.c */
public final class C77105c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GradientColorBackgroundView f225211d;

    /* renamed from: e */
    public final /* synthetic */ int f225212e;

    /* renamed from: f */
    public final /* synthetic */ int f225213f;

    public C77105c(GradientColorBackgroundView gradientColorBackgroundView, int i, int i2) {
        this.f225211d = gradientColorBackgroundView;
        this.f225212e = i;
        this.f225213f = i2;
    }

    public final void run() {
        GradientColorBackgroundView gradientColorBackgroundView = this.f225211d;
        gradientColorBackgroundView.f195259e = this.f225212e;
        gradientColorBackgroundView.f195260f = this.f225213f;
        gradientColorBackgroundView.f195262h = true;
    }
}
