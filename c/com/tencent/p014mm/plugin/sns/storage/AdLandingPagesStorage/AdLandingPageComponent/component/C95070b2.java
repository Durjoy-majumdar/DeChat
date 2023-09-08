package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b2 */
public class C95070b2 implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C95050a2 f275951d;

    public C95070b2(C95050a2 a2Var) {
        this.f275951d = a2Var;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$13");
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            int width2 = C95050a2.m120819U(this.f275951d).getWidth();
            int height2 = C95050a2.m120819U(this.f275951d).getHeight();
            if (height > 1 && width > 1 && width2 != 0) {
                if (height2 != 0) {
                    Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onLayoutChange, videoW=" + width + ", videoH=" + height + ", containerW=" + width2 + ", containH=" + height2 + ", container.padding=" + C102260r.m134832A(C95050a2.m120819U(this.f275951d)));
                    if (height == height2) {
                        SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$13");
                        return;
                    }
                    if (height >= width && height2 >= width2) {
                        if (Math.abs(height - height2) < 2) {
                            ViewGroup.LayoutParams layoutParams = C95050a2.m120819U(this.f275951d).getLayoutParams();
                            layoutParams.height = height;
                            C95050a2.m120819U(this.f275951d).setLayoutParams(layoutParams);
                            Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onLayoutChange, reset VideoContainer.height");
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$13");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$13");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onLayoutChange, exp=" + e.toString());
        }
    }
}
