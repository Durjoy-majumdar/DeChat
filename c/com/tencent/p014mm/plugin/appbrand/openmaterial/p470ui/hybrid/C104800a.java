package com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid;

import android.animation.Animator;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.HybridOpenMaterialView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.a */
public class C104800a implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ HybridOpenMaterialView f311264d;

    public C104800a(HybridOpenMaterialView hybridOpenMaterialView) {
        this.f311264d = hybridOpenMaterialView;
    }

    public void onAnimationCancel(Animator animator) {
        this.f311264d.f311234E = false;
    }

    public void onAnimationEnd(Animator animator) {
        HybridOpenMaterialView hybridOpenMaterialView = this.f311264d;
        hybridOpenMaterialView.f311234E = false;
        hybridOpenMaterialView.f311232C = hybridOpenMaterialView.f311240i;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f311264d.f311234E = true;
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "show, onAnimationStart");
        HybridOpenMaterialView.C104798j jVar = this.f311264d.f311241j;
        if (jVar != null) {
            jVar.mo148673c();
        }
    }
}
