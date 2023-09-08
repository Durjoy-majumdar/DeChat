package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference */
public class WalletBalancePrivacyCheckBoxPreference extends CheckBoxPreference {

    /* renamed from: Y */
    public boolean f21819Y;

    /* renamed from: Z */
    public MMSwitchBtn f21820Z;

    /* renamed from: p0 */
    public View f21821p0;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference$a */
    public class C5762a implements MMSwitchBtn.C7041b {
        public C5762a() {
        }

        public void onStatusChange(boolean z) {
            WalletBalancePrivacyCheckBoxPreference walletBalancePrivacyCheckBoxPreference = WalletBalancePrivacyCheckBoxPreference.this;
            Boolean valueOf = Boolean.valueOf(z);
            Preference.C6763a aVar = walletBalancePrivacyCheckBoxPreference.f121275e;
            if (aVar != null) {
                aVar.mo7744a(walletBalancePrivacyCheckBoxPreference, valueOf);
            }
        }
    }

    public WalletBalancePrivacyCheckBoxPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public int mo6386I() {
        return C0966R.C0971layout.f6546hu;
    }

    /* renamed from: J */
    public boolean mo6804J() {
        MMSwitchBtn mMSwitchBtn = this.f21820Z;
        return mMSwitchBtn != null ? mMSwitchBtn.f220433y : this.f21819Y;
    }

    /* renamed from: K */
    public void mo6805K(boolean z) {
        this.f21819Y = z;
    }

    /* renamed from: L */
    public void mo6806L(String str, int i) {
    }

    /* renamed from: M */
    public void mo6807M(int i) {
    }

    /* renamed from: N */
    public void mo6808N(boolean z) {
        MMSwitchBtn mMSwitchBtn = this.f21820Z;
        if (mMSwitchBtn != null) {
            this.f21819Y = z;
            mMSwitchBtn.setCheck(z);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        mo69921C(8);
        MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) view.findViewById(C0966R.C0970id.bab);
        this.f21820Z = mMSwitchBtn;
        mMSwitchBtn.setSwitchListener(new C5762a());
        this.f21820Z.setCheck(this.f21819Y);
        if (!mo69930u()) {
            this.f21820Z.setEnabled(false);
            ((TextView) view.findViewById(16908310)).setTextColor(view.getResources().getColor(C0966R.color.f3309nb));
            ((TextView) view.findViewById(16908304)).setTextColor(view.getResources().getColor(C0966R.color.f3309nb));
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        this.f21821p0 = x;
        return x;
    }

    public WalletBalancePrivacyCheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WalletBalancePrivacyCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21819Y = false;
        this.f121271G = C0966R.C0971layout.f6546hu;
    }
}
