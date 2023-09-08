package com.tencent.p014mm.plugin.remittance.bankcard.p096ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView */
public class BankRemitDetailItemView extends LinearLayout {

    /* renamed from: d */
    public TextView f20394d;

    /* renamed from: e */
    public TextView f20395e;

    /* renamed from: f */
    public boolean f20396f;

    public BankRemitDetailItemView(Context context, boolean z) {
        super(context);
        this.f20396f = z;
        mo6013a();
    }

    /* renamed from: a */
    public final void mo6013a() {
        if (this.f20396f) {
            View.inflate(getContext(), C0966R.C0971layout.f6552i2, this);
        } else {
            View.inflate(getContext(), C0966R.C0971layout.f6551i1, this);
        }
        this.f20394d = (TextView) findViewById(C0966R.C0970id.aiy);
        this.f20395e = (TextView) findViewById(C0966R.C0970id.aix);
    }

    /* renamed from: b */
    public void mo6014b(int i, CharSequence charSequence) {
        mo6015c(getContext().getString(i), charSequence, false);
    }

    /* renamed from: c */
    public void mo6015c(String str, CharSequence charSequence, boolean z) {
        this.f20394d.setText(str);
        if (z) {
            this.f20395e.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), charSequence, this.f20395e.getTextSize()));
        } else {
            this.f20395e.setText(charSequence);
        }
    }

    public BankRemitDetailItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20396f = false;
        mo6013a();
    }

    public BankRemitDetailItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20396f = false;
        mo6013a();
    }
}
