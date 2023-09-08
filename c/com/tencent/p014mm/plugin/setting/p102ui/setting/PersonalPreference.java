package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import di3.C86312j;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.PersonalPreference */
public class PersonalPreference extends Preference {

    /* renamed from: J */
    public ImageView f20728J = null;

    /* renamed from: K */
    public int f20729K = -1;

    /* renamed from: L */
    public String f20730L = null;

    public PersonalPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        if (this.f20728J == null) {
            this.f20728J = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        }
        int i = this.f20729K;
        if (i > 0) {
            this.f20728J.setImageResource(i);
        } else if (this.f20730L != null) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f20728J, this.f20730L);
        }
        this.f20728J.setOnClickListener((View.OnClickListener) null);
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bdt, viewGroup2);
        return x;
    }

    public PersonalPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
        this.f121272H = C0966R.C0971layout.f359893bf2;
    }
}
