package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.PowerSettingPreference */
public class PowerSettingPreference extends Preference {

    /* renamed from: J */
    public View f24045J;

    public PowerSettingPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f24045J == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            viewGroup2.addView(LayoutInflater.from(this.f121274d).inflate(C0966R.C0971layout.bop, (ViewGroup) null), new AbsListView.LayoutParams(-1, -2));
            this.f24045J = x;
        }
        return this.f24045J;
    }

    public PowerSettingPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
