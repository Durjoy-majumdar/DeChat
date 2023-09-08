package com.tencent.p014mm.plugin.mmsight.p077ui;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.CancellationException;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.e */
public final class C105524e extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ImproveMMSightRecordButton f313918d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f313919e;

    public C105524e(ImproveMMSightRecordButton improveMMSightRecordButton, ViewPropertyAnimator viewPropertyAnimator) {
        this.f313918d = improveMMSightRecordButton;
        this.f313919e = viewPropertyAnimator;
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i("MicroMsg.ImproveMMSightRecordButton", "outerView ani end");
        ImproveMMSightCircularCustomProgressBar improveMMSightCircularCustomProgressBar = this.f313918d.f313723h;
        if (improveMMSightCircularCustomProgressBar != null) {
            improveMMSightCircularCustomProgressBar.setVisibility(0);
        }
        ImproveMMSightRecordButton improveMMSightRecordButton = this.f313918d;
        improveMMSightRecordButton.getClass();
        Log.printInfoStack("MicroMsg.ImproveMMSightRecordButton", "startProgress " + improveMMSightRecordButton.f313712A + ", " + improveMMSightRecordButton.f313713B + ", " + improveMMSightRecordButton.isEnabled(), new Object[0]);
        if (!improveMMSightRecordButton.f313729q) {
            Log.m105928w("MicroMsg.ImproveMMSightRecordButton", "startProgress but is enable, is cancel");
        } else {
            improveMMSightRecordButton.f313715D = System.currentTimeMillis();
            C105538j jVar = improveMMSightRecordButton.f313724i;
            if (jVar != null) {
                jVar.mo150385a();
            }
            improveMMSightRecordButton.f313730r = true;
            ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar = improveMMSightRecordButton.f313722g;
            if (improveMMSightCircularProgressBar != null) {
                improveMMSightCircularProgressBar.setVisibility(0);
            }
            ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar2 = improveMMSightRecordButton.f313722g;
            if (improveMMSightCircularProgressBar2 != null) {
                int i = improveMMSightRecordButton.f313712A;
                int i2 = improveMMSightRecordButton.f313713B;
                C105526f fVar = new C105526f(improveMMSightRecordButton);
                Log.m105924i("MicroMsg.ImproveMMSightCircularProgressBar", "setInitData >> " + i + ", " + i2);
                improveMMSightCircularProgressBar2.f313707o = (float) i;
                improveMMSightCircularProgressBar2.f313708p = (float) i2;
                improveMMSightCircularProgressBar2.f313705j = fVar;
            }
            ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar3 = improveMMSightRecordButton.f313722g;
            if (improveMMSightCircularProgressBar3 != null) {
                Log.m105924i("MicroMsg.ImproveMMSightCircularProgressBar", "startProgress");
                C105534i iVar = improveMMSightCircularProgressBar3.f313710r;
                if (iVar != null) {
                    iVar.f313941j = false;
                    C53973z1 z1Var = iVar.f313935d;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                    iVar.f313935d = null;
                    iVar.f313938g = 0;
                    iVar.f313942k = null;
                    improveMMSightCircularProgressBar3.f313710r = null;
                }
                C105534i iVar2 = new C105534i(improveMMSightCircularProgressBar3.f313707o, improveMMSightCircularProgressBar3.f313708p);
                iVar2.f313942k = new C105519c(improveMMSightCircularProgressBar3);
                iVar2.f313938g = System.currentTimeMillis();
                iVar2.f313941j = true;
                C53973z1 z1Var2 = iVar2.f313935d;
                if (z1Var2 != null) {
                    C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
                }
                iVar2.f313935d = C53895h.m60466d(iVar2.f313934c, (C66212f) null, (C53934p0) null, new C105529g(iVar2, (C15601d<? super C105529g>) null), 3, (Object) null);
                improveMMSightCircularProgressBar3.f313710r = iVar2;
            }
        }
        this.f313919e.setListener((Animator.AnimatorListener) null);
    }
}
