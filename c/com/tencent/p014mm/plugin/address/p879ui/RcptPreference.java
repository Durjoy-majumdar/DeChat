package com.tencent.p014mm.plugin.address.p879ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.address.model.RcptItem;

/* renamed from: com.tencent.mm.plugin.address.ui.RcptPreference */
public class RcptPreference extends Preference {

    /* renamed from: J */
    public RcptItem f196924J;

    public RcptPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f196924J != null) {
            ((TextView) view.findViewById(C0966R.C0970id.lvn)).setText(this.f196924J.f196786d);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdx, viewGroup2);
        return x;
    }

    public RcptPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
