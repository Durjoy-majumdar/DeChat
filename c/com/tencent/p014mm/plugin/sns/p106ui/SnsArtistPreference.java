package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsArtistPreference */
public final class SnsArtistPreference extends Preference {

    /* renamed from: J */
    public String f21184J;

    /* renamed from: K */
    public String f21185K;

    /* renamed from: L */
    public int f21186L;

    /* renamed from: M */
    public int f21187M;

    /* renamed from: N */
    public TextView f21188N;

    /* renamed from: P */
    public String f21189P;

    /* renamed from: Q */
    public MMActivity f21190Q;

    public SnsArtistPreference(Context context) {
        this(context, (AttributeSet) null);
        this.f21190Q = (MMActivity) context;
    }

    /* renamed from: I */
    public void mo6442I() {
        String str;
        MMActivity mMActivity;
        SnsMethodCalculate.markStartTimeMs("updateArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        if (!(this.f21188N == null || (str = this.f21189P) == null || str.equals("") || (mMActivity = this.f21190Q) == null)) {
            this.f21188N.setText(mMActivity.getString(C0966R.string.f361327iz0, new Object[]{this.f21189P}));
            this.f21188N.setVisibility(0);
        }
        SnsMethodCalculate.markEndTimeMs("updateArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        SnsMethodCalculate.markStartTimeMs("onBindView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        super.mo1086w(view);
        this.f21188N = (TextView) view.findViewById(C0966R.C0970id.f6157yw);
        SnsMethodCalculate.markStartTimeMs("getmTitle", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        String str = this.f21185K;
        SnsMethodCalculate.markEndTimeMs("getmTitle", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        ((TextView) view.findViewById(C0966R.C0970id.f5772o8)).setText(str);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kiq);
        if (textView != null) {
            textView.setVisibility(this.f21187M);
            textView.setText(this.f21184J);
            int i = this.f21186L;
            if (i != -1) {
                textView.setBackgroundDrawable(C76577a.m92158i(this.f21190Q, i));
            }
        }
        mo6442I();
        SnsMethodCalculate.markEndTimeMs("onBindView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("onCreateView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        this.f21185K = this.f21190Q.getString(C0966R.string.f361328iz1);
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f359883bd0, viewGroup2);
        SnsMethodCalculate.markEndTimeMs("onCreateView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        return x;
    }

    public SnsArtistPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f21190Q = (MMActivity) context;
    }

    public SnsArtistPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21184J = "";
        this.f21185K = "";
        this.f21186L = -1;
        this.f21187M = 8;
        this.f21188N = null;
        this.f21189P = "";
        this.f21190Q = (MMActivity) context;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
