package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.k */
public class C70565k implements WalletFormView.C75211e {

    /* renamed from: a */
    public final /* synthetic */ MobileRemittanceUI f204026a;

    public C70565k(MobileRemittanceUI mobileRemittanceUI) {
        this.f204026a = mobileRemittanceUI;
    }

    /* renamed from: a */
    public void mo93874a(CharSequence charSequence) {
        if (Util.isEqual(this.f204026a.f203972j, 0)) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "mAmountRemindBit == 0");
            this.f204026a.f203948H.setVisibility(8);
            return;
        }
        long longValue = new Double(Util.getDouble(charSequence.toString(), 0.0d)).longValue();
        int i = 0;
        int i2 = 0;
        while (longValue != 0) {
            longValue /= 10;
            i++;
            i2 = (int) (longValue % 10);
        }
        MobileRemittanceUI mobileRemittanceUI = this.f204026a;
        if (i >= mobileRemittanceUI.f203972j) {
            int i3 = mobileRemittanceUI.f203945E.mo105091i(charSequence, mobileRemittanceUI.f203980t, i2);
            if (i3 != 0) {
                this.f204026a.f203948H.setVisibility(0);
                this.f204026a.f203947G.setText(C75157y0.m90139b(i));
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f204026a.f203946F.getLayoutParams();
                layoutParams.leftMargin = i3;
                this.f204026a.f203946F.setLayoutParams(layoutParams);
                return;
            }
            this.f204026a.f203948H.setVisibility(8);
            return;
        }
        mobileRemittanceUI.f203948H.setVisibility(8);
    }
}
