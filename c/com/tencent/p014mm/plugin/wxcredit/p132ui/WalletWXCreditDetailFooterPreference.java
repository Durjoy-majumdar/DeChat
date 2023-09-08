package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailFooterPreference */
public class WalletWXCreditDetailFooterPreference extends Preference implements View.OnClickListener {

    /* renamed from: J */
    public LayoutInflater f23928J;

    /* renamed from: K */
    public TextView f23929K;

    /* renamed from: L */
    public TextView f23930L;

    /* renamed from: M */
    public View.OnClickListener f23931M;

    public WalletWXCreditDetailFooterPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailFooterPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f23931M;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailFooterPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f23929K = (TextView) view.findViewById(C0966R.C0970id.lk5);
        this.f23930L = (TextView) view.findViewById(C0966R.C0970id.f359566lk3);
        this.f23929K.setOnClickListener(this);
        this.f23930L.setOnClickListener(this);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        this.f23928J.inflate(C0966R.C0971layout.cgw, viewGroup2);
        return x;
    }

    public WalletWXCreditDetailFooterPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WalletWXCreditDetailFooterPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23928J = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
