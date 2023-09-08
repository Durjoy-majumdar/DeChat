package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactSocialInfoPreference */
public class ContactSocialInfoPreference extends Preference {

    /* renamed from: J */
    public ImageView f20173J;

    /* renamed from: K */
    public ImageView f20174K;

    /* renamed from: L */
    public ImageView f20175L;

    /* renamed from: M */
    public ImageView f20176M;

    /* renamed from: N */
    public ImageView f20177N;

    /* renamed from: P */
    public ImageView f20178P;

    /* renamed from: Q */
    public int f20179Q = 8;

    /* renamed from: R */
    public int f20180R = 8;

    /* renamed from: S */
    public int f20181S = 8;

    /* renamed from: T */
    public int f20182T = 8;

    /* renamed from: U */
    public int f20183U = 8;

    /* renamed from: V */
    public int f20184V = 8;

    /* renamed from: W */
    public TextView f20185W;

    public ContactSocialInfoPreference(Context context) {
        super(context);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        this.f20173J = (ImageView) view.findViewById(C0966R.C0970id.f4y);
        this.f20174K = (ImageView) view.findViewById(C0966R.C0970id.f56);
        this.f20175L = (ImageView) view.findViewById(C0966R.C0970id.f4t);
        this.f20176M = (ImageView) view.findViewById(C0966R.C0970id.f48);
        this.f20177N = (ImageView) view.findViewById(C0966R.C0970id.f4f);
        this.f20178P = (ImageView) view.findViewById(C0966R.C0970id.f5e);
        this.f20185W = (TextView) view.findViewById(C0966R.C0970id.knx);
        ImageView imageView = this.f20173J;
        if (imageView != null) {
            imageView.setVisibility(this.f20179Q);
        }
        ImageView imageView2 = this.f20174K;
        if (imageView2 != null) {
            imageView2.setVisibility(this.f20180R);
        }
        ImageView imageView3 = this.f20175L;
        if (imageView3 != null) {
            imageView3.setVisibility(this.f20181S);
        }
        ImageView imageView4 = this.f20176M;
        if (imageView4 != null) {
            imageView4.setVisibility(this.f20182T);
        }
        ImageView imageView5 = this.f20177N;
        if (imageView5 != null) {
            imageView5.setVisibility(this.f20183U);
        }
        TextView textView = this.f20185W;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(this.f121274d, C0966R.dimen.f3815f9);
            this.f20185W.setLayoutParams(layoutParams);
        }
        ImageView imageView6 = this.f20178P;
        if (imageView6 != null) {
            imageView6.setVisibility(this.f20184V);
        }
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f359889be2, viewGroup2);
        return x;
    }

    public ContactSocialInfoPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContactSocialInfoPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
