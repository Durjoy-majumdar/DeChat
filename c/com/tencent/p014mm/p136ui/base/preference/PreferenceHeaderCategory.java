package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.base.preference.PreferenceHeaderCategory */
public class PreferenceHeaderCategory extends Preference {
    public PreferenceHeaderCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        x.findViewById(16908310).setBackgroundResource(C0966R.C0969drawable.bcs);
        return x;
    }

    public PreferenceHeaderCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.be_;
    }
}
