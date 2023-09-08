package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView */
public class WalletBalanceFetchResultItemView extends LinearLayout {

    /* renamed from: d */
    public TextView f117165d;

    /* renamed from: e */
    public TextView f117166e;

    /* renamed from: f */
    public boolean f117167f;

    public WalletBalanceFetchResultItemView(Context context, boolean z) {
        super(context);
        this.f117167f = z;
        mo67532a();
    }

    /* renamed from: a */
    public final void mo67532a() {
        if (this.f117167f) {
            View.inflate(getContext(), C0966R.C0971layout.f6552i2, this);
        } else {
            View.inflate(getContext(), C0966R.C0971layout.f6551i1, this);
        }
        this.f117165d = (TextView) findViewById(C0966R.C0970id.aiy);
        this.f117166e = (TextView) findViewById(C0966R.C0970id.aix);
    }

    /* renamed from: b */
    public void mo67533b(int i, CharSequence charSequence) {
        mo67534c(getContext().getString(i), charSequence, "", "", false);
    }

    /* renamed from: c */
    public void mo67534c(String str, CharSequence charSequence, String str2, String str3, boolean z) {
        this.f117165d.setText(str);
        if (!Util.isNullOrNil(str2)) {
            this.f117165d.setTextColor(C43423i0.m46931b(str2, true));
        }
        if (z) {
            this.f117166e.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), charSequence, this.f117166e.getTextSize()));
        } else {
            this.f117166e.setText(charSequence);
        }
        if (!Util.isNullOrNil(str3)) {
            this.f117166e.setTextColor(C43423i0.m46931b(str3, true));
        }
    }

    /* renamed from: d */
    public void mo67535d(String str, CharSequence charSequence, int i, int i2, boolean z) {
        this.f117165d.setText(str);
        if (i != -1) {
            this.f117165d.setTextColor(i);
        }
        if (z) {
            this.f117166e.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), charSequence, this.f117166e.getTextSize()));
        } else {
            this.f117166e.setText(charSequence);
        }
        if (i2 != -1) {
            this.f117166e.setTextColor(i2);
        }
    }

    public WalletBalanceFetchResultItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117167f = false;
        mo67532a();
    }

    public WalletBalanceFetchResultItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f117167f = false;
        mo67532a();
    }
}
