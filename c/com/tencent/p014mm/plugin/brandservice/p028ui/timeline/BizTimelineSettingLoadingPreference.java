package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimelineSettingLoadingPreference */
public class BizTimelineSettingLoadingPreference extends Preference {

    /* renamed from: J */
    public View f12054J;

    public BizTimelineSettingLoadingPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f12054J == null) {
            this.f12054J = mo1087x(viewGroup);
        }
        super.mo1086w(this.f12054J);
        return this.f12054J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
    }

    public BizTimelineSettingLoadingPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12054J = null;
        this.f121271G = C0966R.C0971layout.f6637kd;
    }
}
