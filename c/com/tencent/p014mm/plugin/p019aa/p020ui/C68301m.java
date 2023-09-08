package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: com.tencent.mm.plugin.aa.ui.m */
public class C68301m implements WalletFormView.C75211e {

    /* renamed from: a */
    public final /* synthetic */ int f196322a;

    /* renamed from: b */
    public final /* synthetic */ AARemittanceUI f196323b;

    public C68301m(AARemittanceUI aARemittanceUI, int i) {
        this.f196323b = aARemittanceUI;
        this.f196322a = i;
    }

    /* renamed from: a */
    public void mo93874a(CharSequence charSequence) {
        if (Util.isEqual(this.f196322a, 0)) {
            Log.m105924i("MicroMsg.AARemittanceUI", "mAmountRemindBit == 0");
            this.f196323b.f195974r.setVisibility(8);
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
        if (i >= this.f196322a) {
            AARemittanceUI aARemittanceUI = this.f196323b;
            int i3 = aARemittanceUI.f195971o.mo105091i(charSequence, aARemittanceUI.f195966g, i2);
            if (i3 != 0) {
                this.f196323b.f195974r.setVisibility(0);
                this.f196323b.f195973q.setText(C75157y0.m90139b(i));
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f196323b.f195972p.getLayoutParams();
                layoutParams.leftMargin = i3;
                this.f196323b.f195972p.setLayoutParams(layoutParams);
                return;
            }
            this.f196323b.f195974r.setVisibility(8);
            return;
        }
        this.f196323b.f195974r.setVisibility(8);
    }
}
