package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMPageControlView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView */
public class AdLandingControlView extends MMPageControlView {
    public AdLandingControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo131771a(int i) {
        SnsMethodCalculate.markStartTimeMs("generatePageControl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView");
        removeAllViews();
        int i2 = this.f284231e;
        if (i >= i2) {
            SnsMethodCalculate.markEndTimeMs("generatePageControl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.f284233g = null;
            if (i == i3) {
                if (((HashMap) this.f284232f).size() > i3) {
                    this.f284233g = (ImageView) ((HashMap) this.f284232f).get(Integer.valueOf(i3));
                }
                if (this.f284233g == null) {
                    this.f284233g = (ImageView) View.inflate(this.f284230d, this.f284234h, (ViewGroup) null).findViewById(C0966R.C0970id.gvo);
                    ((HashMap) this.f284232f).put(Integer.valueOf(i3), this.f284233g);
                }
                this.f284233g.setSelected(true);
            } else {
                if (((HashMap) this.f284232f).size() > i3) {
                    this.f284233g = (ImageView) ((HashMap) this.f284232f).get(Integer.valueOf(i3));
                }
                if (this.f284233g == null) {
                    this.f284233g = (ImageView) View.inflate(this.f284230d, this.f284234h, (ViewGroup) null).findViewById(C0966R.C0970id.gvo);
                    ((HashMap) this.f284232f).put(Integer.valueOf(i3), this.f284233g);
                }
                this.f284233g.setSelected(false);
            }
            addView(this.f284233g);
        }
        SnsMethodCalculate.markEndTimeMs("generatePageControl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView");
    }
}
