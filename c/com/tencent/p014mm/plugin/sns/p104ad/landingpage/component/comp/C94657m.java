package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m */
public class C94657m implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ View f273919d;

    /* renamed from: e */
    public final /* synthetic */ C94651l f273920e;

    public C94657m(C94651l lVar, View view) {
        this.f273920e = lVar;
        this.f273919d = view;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
        try {
            int height = view.getHeight();
            int width = view.getWidth();
            int width2 = this.f273920e.f273914z.getWidth();
            int height2 = this.f273920e.f273914z.getHeight();
            if (width > 1 && height > 1 && width2 != 0) {
                if (height2 != 0) {
                    Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onLayoutChange, video.w=" + view.getWidth() + ", h=" + view.getHeight() + ", container.w=" + width2 + ", h=" + height2 + ", container.padding=" + C102260r.m134832A(this.f273920e.f273914z));
                    ImageView thumbView = this.f273920e.f273883A.getThumbView();
                    if (thumbView != null) {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                        layoutParams.addRule(13);
                        thumbView.setLayoutParams(layoutParams);
                    }
                    if (height == height2) {
                        this.f273919d.removeOnLayoutChangeListener(this);
                        SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
                        return;
                    }
                    if (height >= width && height2 >= width2) {
                        if (Math.abs(height - height2) <= 2) {
                            ViewGroup.LayoutParams layoutParams2 = this.f273920e.f273914z.getLayoutParams();
                            layoutParams2.height = height;
                            this.f273920e.f273914z.setLayoutParams(layoutParams2);
                            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onLayoutChange, reset VideoContainer.height");
                        }
                    }
                    this.f273919d.removeOnLayoutChangeListener(this);
                    SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onLayoutChange, exp=" + e.toString());
        }
    }
}
