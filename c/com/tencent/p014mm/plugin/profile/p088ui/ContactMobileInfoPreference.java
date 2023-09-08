package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactMobileInfoPreference */
public class ContactMobileInfoPreference extends Preference {

    /* renamed from: J */
    public TextView f20126J;

    /* renamed from: K */
    public TextView f20127K;

    public ContactMobileInfoPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        this.f20126J = (TextView) view.findViewById(C0966R.C0970id.knx);
        this.f20127K = (TextView) view.findViewById(C0966R.C0970id.gvp);
        TextView textView = this.f20126J;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.f20127K;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdq, viewGroup2);
        return x;
    }

    public ContactMobileInfoPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
