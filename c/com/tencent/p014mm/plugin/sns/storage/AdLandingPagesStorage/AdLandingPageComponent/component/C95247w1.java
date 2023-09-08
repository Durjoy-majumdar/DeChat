package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w1 */
public class C95247w1 implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ View f276422d;

    /* renamed from: e */
    public final /* synthetic */ C95222u1 f276423e;

    public C95247w1(C95222u1 u1Var, View view) {
        this.f276423e = u1Var;
        this.f276422d = view;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$15");
        try {
            int height = view.getHeight();
            int width = view.getWidth();
            int width2 = C95222u1.m121195b0(this.f276423e).getWidth();
            int height2 = C95222u1.m121195b0(this.f276423e).getHeight();
            if (width > 1 && height > 1 && width2 != 0) {
                if (height2 != 0) {
                    int b = C76577a.m92151b(C95222u1.m121192W(this.f276423e), 75);
                    C95222u1 u1Var = this.f276423e;
                    SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                    boolean I = u1Var.mo140729I();
                    SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                    if (I) {
                        C95222u1 u1Var2 = this.f276423e;
                        SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        boolean J = u1Var2.mo140730J();
                        SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        if (J) {
                            b = 0;
                        }
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width - b, -2);
                    layoutParams.addRule(12);
                    layoutParams.bottomMargin = C76577a.m92151b(C95222u1.m121192W(this.f276423e), 3);
                    C95222u1.m121191V(this.f276423e).setLayoutParams(layoutParams);
                    this.f276422d.removeOnLayoutChangeListener(this);
                    SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$15");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$15");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onLayoutChange, exp=" + e.toString());
        }
    }
}
