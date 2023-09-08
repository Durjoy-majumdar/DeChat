package com.tencent.p014mm.plugin.sns.p104ad.widget.dragad;

import android.animation.Animator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.dragad.AdDragViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.dragad.a */
public class C94758a extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ AdDragViewContainer f274387d;

    public C94758a(AdDragViewContainer adDragViewContainer) {
        this.f274387d = adDragViewContainer;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$4");
        AdDragViewContainer adDragViewContainer = this.f274387d;
        int i = AdDragViewContainer.f274369w;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        AdDragViewContainer.C94757c cVar = adDragViewContainer.f274382s;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        if (cVar != null) {
            AdDragViewContainer adDragViewContainer2 = this.f274387d;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
            AdDragViewContainer.C94757c cVar2 = adDragViewContainer2.f274382s;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
            cVar2.mo130527c();
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$4");
    }
}
