package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferUISelectPreference */
public class WalletDelayTransferUISelectPreference extends Preference {

    /* renamed from: J */
    public View f21825J;

    /* renamed from: K */
    public boolean f21826K;

    public WalletDelayTransferUISelectPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        int i = 8;
        mo69921C(8);
        TextView textView = (TextView) view.findViewById(16908310);
        String text = textView != null ? textView.getText() : "";
        if (this.f21826K) {
            view.setContentDescription(text + " " + view.getContext().getText(C0966R.string.f361557ks1));
        } else {
            view.setContentDescription(text + " " + view.getContext().getText(C0966R.string.f361558ks2));
        }
        WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.k0t);
        if (this.f21826K) {
            i = 0;
        }
        weImageView.setVisibility(i);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        viewGroup2.setPadding(0, 0, 0, 0);
        ((ViewGroup) x.findViewById(C0966R.C0970id.its)).setPadding(0, 0, 0, 0);
        View.inflate(this.f121274d, C0966R.C0971layout.bey, viewGroup2);
        this.f21825J = x;
        return x;
    }

    public WalletDelayTransferUISelectPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WalletDelayTransferUISelectPreference(Context context) {
        super(context);
    }
}
