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

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactMoreInfoPreference */
public class ContactMoreInfoPreference extends Preference {

    /* renamed from: J */
    public ImageView f20128J;

    /* renamed from: K */
    public ImageView f20129K;

    /* renamed from: L */
    public ImageView f20130L;

    /* renamed from: M */
    public ImageView f20131M;

    /* renamed from: N */
    public ImageView f20132N;

    /* renamed from: P */
    public ImageView f20133P;

    /* renamed from: Q */
    public int f20134Q = 8;

    /* renamed from: R */
    public int f20135R = 8;

    /* renamed from: S */
    public int f20136S = 8;

    /* renamed from: T */
    public int f20137T = 8;

    /* renamed from: U */
    public int f20138U = 8;

    /* renamed from: V */
    public int f20139V = 8;

    /* renamed from: W */
    public TextView f20140W;

    public ContactMoreInfoPreference(Context context) {
        super(context);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        this.f20128J = (ImageView) view.findViewById(C0966R.C0970id.f4y);
        this.f20129K = (ImageView) view.findViewById(C0966R.C0970id.f56);
        this.f20130L = (ImageView) view.findViewById(C0966R.C0970id.f4t);
        this.f20131M = (ImageView) view.findViewById(C0966R.C0970id.f48);
        this.f20132N = (ImageView) view.findViewById(C0966R.C0970id.f4f);
        this.f20133P = (ImageView) view.findViewById(C0966R.C0970id.f5e);
        this.f20140W = (TextView) view.findViewById(C0966R.C0970id.knx);
        ImageView imageView = this.f20128J;
        if (imageView != null) {
            imageView.setVisibility(this.f20134Q);
        }
        ImageView imageView2 = this.f20129K;
        if (imageView2 != null) {
            imageView2.setVisibility(this.f20135R);
        }
        ImageView imageView3 = this.f20130L;
        if (imageView3 != null) {
            imageView3.setVisibility(this.f20136S);
        }
        ImageView imageView4 = this.f20131M;
        if (imageView4 != null) {
            imageView4.setVisibility(this.f20137T);
        }
        ImageView imageView5 = this.f20132N;
        if (imageView5 != null) {
            imageView5.setVisibility(this.f20138U);
        }
        TextView textView = this.f20140W;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(this.f121274d, C0966R.dimen.f3815f9);
            this.f20140W.setLayoutParams(layoutParams);
        }
        ImageView imageView6 = this.f20133P;
        if (imageView6 != null) {
            imageView6.setVisibility(this.f20139V);
        }
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdr, viewGroup2);
        return x;
    }

    public ContactMoreInfoPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContactMoreInfoPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
