package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.FavourLayout;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout */
public class WcPayCashierBankcardItemLayout extends LinearLayout {

    /* renamed from: d */
    public CdnImageView f210393d;

    /* renamed from: e */
    public TextView f210394e;

    /* renamed from: f */
    public TextView f210395f;

    /* renamed from: g */
    public RadioButton f210396g;

    /* renamed from: h */
    public FavourLayout f210397h;

    public WcPayCashierBankcardItemLayout(Context context) {
        super(context);
        mo99687a();
    }

    /* renamed from: a */
    public final void mo99687a() {
        View.inflate(getContext(), C0966R.C0971layout.ch4, this);
        this.f210393d = (CdnImageView) findViewById(C0966R.C0970id.lrl);
        this.f210394e = (TextView) findViewById(C0966R.C0970id.lrn);
        this.f210395f = (TextView) findViewById(C0966R.C0970id.lro);
        this.f210396g = (RadioButton) findViewById(C0966R.C0970id.lrs);
        this.f210397h = (FavourLayout) findViewById(C0966R.C0970id.lrq);
    }

    public WcPayCashierBankcardItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo99687a();
    }

    public WcPayCashierBankcardItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo99687a();
    }
}
