package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.r */
public class C70574r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MobileRemittanceUI f204036d;

    public C70574r(MobileRemittanceUI mobileRemittanceUI) {
        this.f204036d = mobileRemittanceUI;
    }

    public void run() {
        int measuredWidth = this.f204036d.f203984x.getMeasuredWidth();
        MobileRemittanceUI mobileRemittanceUI = this.f204036d;
        String string = mobileRemittanceUI.getString(C0966R.string.gu_, new Object[]{mobileRemittanceUI.f203968f});
        MobileRemittanceUI mobileRemittanceUI2 = this.f204036d;
        String string2 = mobileRemittanceUI2.getString(C0966R.string.guk, new Object[]{mobileRemittanceUI2.f203969g});
        if (measuredWidth != 0) {
            float measureText = this.f204036d.f203986y.getPaint().measureText(string);
            float measureText2 = this.f204036d.f203987z.getPaint().measureText(string2) + ((float) C76577a.m92151b(this.f204036d, 17));
            float f = (float) measuredWidth;
            if (measureText + measureText2 > f) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f204036d.f203986y.getLayoutParams();
                layoutParams.width = (int) (f - measureText2);
                this.f204036d.f203986y.setLayoutParams(layoutParams);
            }
        }
        this.f204036d.f203986y.setText(string);
        this.f204036d.f203987z.setText(string2);
    }
}
