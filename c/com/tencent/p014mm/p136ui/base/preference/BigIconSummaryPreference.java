package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.base.preference.BigIconSummaryPreference */
public class BigIconSummaryPreference extends IconSummaryPreference {
    public BigIconSummaryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        x.setMinimumHeight(x.getResources().getDimensionPixelSize(C0966R.dimen.f3907ik));
        return x;
    }

    public BigIconSummaryPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
