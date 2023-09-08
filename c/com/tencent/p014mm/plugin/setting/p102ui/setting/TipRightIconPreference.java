package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.TipRightIconPreference */
public class TipRightIconPreference extends IconPreference {
    public TipRightIconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bec, viewGroup2);
        return x;
    }

    public TipRightIconPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
