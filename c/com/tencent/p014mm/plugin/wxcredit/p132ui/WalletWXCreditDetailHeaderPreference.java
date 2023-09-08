package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailHeaderPreference */
public class WalletWXCreditDetailHeaderPreference extends Preference {

    /* renamed from: J */
    public LayoutInflater f23932J;

    /* renamed from: K */
    public TextView f23933K;

    /* renamed from: L */
    public TextView f23934L;

    public WalletWXCreditDetailHeaderPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f23934L = (TextView) view.findViewById(C0966R.C0970id.lk4);
        this.f23933K = (TextView) view.findViewById(C0966R.C0970id.lka);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        this.f23932J.inflate(C0966R.C0971layout.cgx, viewGroup2);
        return x;
    }

    public WalletWXCreditDetailHeaderPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WalletWXCreditDetailHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23932J = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
