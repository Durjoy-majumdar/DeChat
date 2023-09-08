package com.tencent.p014mm.plugin.appbrand.backgroundrunning.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference */
public class AppBrandAuthPreference extends Preference {

    /* renamed from: J */
    public boolean f10887J;

    /* renamed from: K */
    public String f10888K;

    /* renamed from: L */
    public TextView f10889L;

    /* renamed from: M */
    public CheckBox f10890M;

    public AppBrandAuthPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: I */
    public void mo1534I(boolean z) {
        this.f10887J = z;
        CheckBox checkBox = this.f10890M;
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        CheckBox checkBox = (CheckBox) view.findViewById(C0966R.C0970id.bab);
        this.f10890M = checkBox;
        if (checkBox != null) {
            checkBox.setChecked(this.f10887J);
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.a06);
        this.f10889L = textView;
        if (textView != null && !Util.isNullOrNil(this.f10888K)) {
            this.f10889L.setText(this.f10888K);
        }
        mo69921C(8);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f6438ev, viewGroup2);
        return x;
    }

    public AppBrandAuthPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10887J = false;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
