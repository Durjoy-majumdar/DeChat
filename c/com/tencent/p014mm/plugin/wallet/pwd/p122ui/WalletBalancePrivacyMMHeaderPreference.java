package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import p158gt.C76057w;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyMMHeaderPreference */
public class WalletBalancePrivacyMMHeaderPreference extends Preference {

    /* renamed from: J */
    public String f21823J;

    /* renamed from: K */
    public Map<String, C76057w.C76058a> f21824K = new HashMap();

    public WalletBalancePrivacyMMHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.a5b);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.a5c);
        if (!Util.isNullOrNil(this.f21823J)) {
            textView.setText(this.f21823J);
        }
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
    }

    public WalletBalancePrivacyMMHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WalletBalancePrivacyMMHeaderPreference(Context context) {
        super(context);
    }
}
