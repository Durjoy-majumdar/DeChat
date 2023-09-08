package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileDescribeView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import xc0.C78795g;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.ProfileDescribePreference */
public class ProfileDescribePreference extends Preference {

    /* renamed from: J */
    public ProfileDescribeView f212450J;

    /* renamed from: K */
    public C72996z1 f212451K;

    /* renamed from: L */
    public View f212452L;

    /* renamed from: M */
    public C44673z4 f212453M;

    public ProfileDescribePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: I */
    public boolean mo100738I() {
        if (!this.f212451K.mo62927s3()) {
            C44673z4 z4Var = this.f212453M;
            return z4Var != null && !Util.isNullOrNil(z4Var.field_conDescription);
        }
        return !Util.isNullOrNil(this.f212451K.f149513S0) || (!Util.isNullOrNil(this.f212451K.f149515T0) || C78795g.m95196e().mo108708f(this.f212451K.getUsername()));
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f212451K != null) {
            this.f212450J.mo100270b();
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f212452L == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            ProfileDescribeView profileDescribeView = new ProfileDescribeView(x.getContext());
            this.f212450J = profileDescribeView;
            viewGroup2.addView(profileDescribeView, new AbsListView.LayoutParams(-1, -2));
            ProfileDescribeView profileDescribeView2 = this.f212450J;
            profileDescribeView2.f24012d = this.f212451K;
            profileDescribeView2.mo100270b();
            this.f212452L = x;
        }
        return this.f212452L;
    }

    public ProfileDescribePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileDescribePreference(Context context) {
        super(context);
    }
}
