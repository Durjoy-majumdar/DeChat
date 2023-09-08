package com.tencent.p014mm.plugin.offline.p085ui;

import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import di3.C86312j;
import p626nv.C76963d;
import te3.tg4;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$a0 */
public abstract class WalletOfflineCoinPurseUI$$a0 implements C115619a {

    /* renamed from: d */
    public TextView f201934d;

    /* renamed from: e */
    public TextView f201935e;

    /* renamed from: f */
    public ImageView f201936f;

    public WalletOfflineCoinPurseUI$$a0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        mo96314a();
    }

    /* renamed from: a */
    public abstract void mo96314a();

    /* renamed from: f */
    public boolean mo25956f(boolean z) {
        if (z) {
            this.f201936f.setVisibility(0);
            return true;
        }
        this.f201936f.setVisibility(8);
        return true;
    }

    /* renamed from: g */
    public boolean mo25958g(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: h */
    public boolean mo25960h(boolean z) {
        if (z) {
            this.f201934d.setVisibility(0);
            return true;
        }
        this.f201934d.setVisibility(8);
        return true;
    }

    /* renamed from: i */
    public boolean mo25962i(boolean z, tg4 tg4) {
        if (z) {
            this.f201936f.setVisibility(0);
            this.f201935e.setVisibility(0);
            this.f201935e.setText(tg4.f354436e);
            return true;
        }
        this.f201936f.setVisibility(8);
        this.f201935e.setVisibility(8);
        return true;
    }

    /* renamed from: j */
    public boolean mo64135j(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: k */
    public void mo64136k(C115631n nVar, boolean z) {
        ((C76963d) C86312j.m106911c(C76963d.class)).mo107037m2(this, nVar, z);
    }

    /* renamed from: l */
    public boolean mo64137l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo64138m(boolean z) {
        return ((C76963d) C86312j.m106911c(C76963d.class)).mo107036I0(z, this);
    }

    /* renamed from: n */
    public boolean mo64139n(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: o */
    public void mo64140o(boolean z, C115631n nVar) {
    }
}
