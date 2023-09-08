package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.l */
public class C72043l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f208995d;

    /* renamed from: e */
    public final /* synthetic */ WalletIdCardCheckUI f208996e;

    public C72043l(WalletIdCardCheckUI walletIdCardCheckUI, boolean z) {
        this.f208996e = walletIdCardCheckUI;
        this.f208995d = z;
    }

    public void run() {
        if (this.f208995d) {
            if (this.f208996e.f208846g.getHeight() + C76577a.m92151b(this.f208996e.getContext(), 32) + this.f208996e.mKeyboard.getHeight() + C76577a.m92151b(this.f208996e.getContext(), 30) > ((this.f208996e.f208847h.getHeight() - this.f208996e.f208843d.getTop()) - this.f208996e.f208843d.getHeight()) - C76577a.m92151b(this.f208996e.getContext(), 32)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f208996e.f208845f.getLayoutParams();
                layoutParams.topMargin = C76577a.m92151b(this.f208996e.getContext(), 25);
                this.f208996e.f208845f.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f208996e.f208846g.getLayoutParams();
                layoutParams2.removeRule(12);
                layoutParams2.addRule(3, C0966R.C0970id.f358436f34);
                layoutParams2.topMargin = C76577a.m92151b(this.f208996e.getContext(), 32);
                this.f208996e.f208846g.setLayoutParams(layoutParams2);
                return;
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f208996e.f208846g.getLayoutParams();
            layoutParams3.removeRule(3);
            layoutParams3.addRule(12);
            layoutParams3.bottomMargin = C76577a.m92151b(this.f208996e.getContext(), 32) + this.f208996e.mKeyboard.getHeight() + C76577a.m92151b(this.f208996e.getContext(), 30);
            this.f208996e.f208846g.setLayoutParams(layoutParams3);
            return;
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f208996e.f208846g.getLayoutParams();
        layoutParams4.removeRule(3);
        layoutParams4.addRule(12);
        layoutParams4.bottomMargin = C76577a.m92151b(this.f208996e.getContext(), 96);
        this.f208996e.f208846g.setLayoutParams(layoutParams4);
    }
}
