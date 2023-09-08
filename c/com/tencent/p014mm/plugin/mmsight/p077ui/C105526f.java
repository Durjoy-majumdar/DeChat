package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.f */
public final class C105526f implements C105518b0 {

    /* renamed from: a */
    public final /* synthetic */ ImproveMMSightRecordButton f313921a;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.f$a */
    public static final class C105527a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ImproveMMSightRecordButton f313922d;

        /* renamed from: e */
        public final /* synthetic */ boolean f313923e;

        public C105527a(ImproveMMSightRecordButton improveMMSightRecordButton, boolean z) {
            this.f313922d = improveMMSightRecordButton;
            this.f313923e = z;
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "match max progress to play reverse ani, ani end " + this.f313922d.f313730r + ", " + this.f313922d.f313718G);
            ImproveMMSightRecordButton improveMMSightRecordButton = this.f313922d;
            if (!improveMMSightRecordButton.f313718G) {
                improveMMSightRecordButton.f313730r = false;
            } else if (improveMMSightRecordButton.f313730r) {
                improveMMSightRecordButton.f313730r = false;
                C105518b0 b0Var = improveMMSightRecordButton.f313714C;
                if (b0Var != null) {
                    b0Var.mo150366a(this.f313923e);
                }
            } else {
                C105591z0 z0Var = improveMMSightRecordButton.f313726n;
                if (z0Var != null) {
                    z0Var.mo150438a();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "match max progress to play reverse ani, ani start");
            ImproveMMSightRecordButton improveMMSightRecordButton = this.f313922d;
            int i = ImproveMMSightRecordButton.f313711H;
            improveMMSightRecordButton.mo150288c();
        }
    }

    public C105526f(ImproveMMSightRecordButton improveMMSightRecordButton) {
        this.f313921a = improveMMSightRecordButton;
    }

    /* renamed from: a */
    public void mo150366a(boolean z) {
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "onProgressFinish >> progress is reach maxProgress");
        this.f313921a.f313716E = System.currentTimeMillis();
        ImproveMMSightRecordButton improveMMSightRecordButton = this.f313921a;
        if (improveMMSightRecordButton.f313730r && improveMMSightRecordButton.f313716E - improveMMSightRecordButton.f313715D >= 1500) {
            improveMMSightRecordButton.mo150289d();
            C105518b0 b0Var = this.f313921a.f313714C;
            if (b0Var != null) {
                b0Var.mo150366a(z);
                return;
            }
            return;
        }
        improveMMSightRecordButton.mo150287b(new C105527a(this.f313921a, z));
    }
}
