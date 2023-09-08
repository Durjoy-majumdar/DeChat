package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;

/* renamed from: com.tencent.mm.plugin.account.ui.LanguagePreference */
public class LanguagePreference extends Preference {

    /* renamed from: J */
    public C68448a f196667J;

    /* renamed from: com.tencent.mm.plugin.account.ui.LanguagePreference$a */
    public static class C68448a {

        /* renamed from: a */
        public String f196668a;

        /* renamed from: b */
        public String f196669b;

        /* renamed from: c */
        public boolean f196670c;

        public C68448a(String str, String str2, String str3, boolean z) {
            this.f196668a = str;
            this.f196669b = str3;
            this.f196670c = z;
        }
    }

    public LanguagePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.fhj);
        WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.k0t);
        boolean z = true;
        int i = 0;
        boolean z2 = textView != null;
        if (weImageView == null) {
            z = false;
        }
        if (z && z2) {
            textView.setText(this.f196667J.f196668a);
            if (!this.f196667J.f196670c) {
                i = 8;
            }
            weImageView.setVisibility(i);
        }
        mo69921C(8);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdp, viewGroup2);
        return x;
    }

    public LanguagePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
