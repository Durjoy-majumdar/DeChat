package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.PluginEmptyTextPreference */
public final class PluginEmptyTextPreference extends Preference {

    /* renamed from: J */
    public Context f20731J;

    /* renamed from: K */
    public String f20732K;

    public PluginEmptyTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20731J = context;
        this.f121271G = C0966R.C0971layout.bn6;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ((TextView) view.findViewById(C0966R.C0970id.cjf)).setText(this.f20732K);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        View.inflate(this.f20731J, C0966R.C0971layout.bn6, (ViewGroup) null);
        return x;
    }
}
