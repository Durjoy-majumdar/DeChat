package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v1 */
public class C95245v1 implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C95222u1 f276420d;

    public C95245v1(C95222u1 u1Var) {
        this.f276420d = u1Var;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$14");
        try {
            int height = view.getHeight();
            int width = view.getWidth();
            int width2 = C95222u1.m121195b0(this.f276420d).getWidth();
            int height2 = C95222u1.m121195b0(this.f276420d).getHeight();
            if (width > 1 && height > 1 && width2 != 0) {
                if (height2 != 0) {
                    Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onLayoutChange, video.w=" + view.getWidth() + ", h=" + view.getHeight() + ", container.w=" + width2 + ", h=" + height2 + ", container.padding=" + C102260r.m134832A(C95222u1.m121195b0(this.f276420d)));
                    if (!(height == height2 && width == width2)) {
                        ViewGroup.LayoutParams layoutParams = C95222u1.m121195b0(this.f276420d).getLayoutParams();
                        layoutParams.height = height;
                        layoutParams.width = width;
                        C95222u1.m121195b0(this.f276420d).setLayoutParams(layoutParams);
                        Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onLayoutChange, reset VideoContainer.height and width");
                    }
                    SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$14");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$14");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onLayoutChange, exp=" + e.toString());
        }
    }
}
