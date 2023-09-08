package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.base.preference.SummaryBelowPreference */
public class SummaryBelowPreference extends Preference {

    /* renamed from: J */
    public View f24292J;

    public SummaryBelowPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f24292J == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            View.inflate(this.f121274d, C0966R.C0971layout.bf4, viewGroup2);
            this.f24292J = x;
        }
        return this.f24292J;
    }

    public SummaryBelowPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SummaryBelowPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
