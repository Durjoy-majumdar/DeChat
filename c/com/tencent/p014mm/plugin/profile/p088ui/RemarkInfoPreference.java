package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.profile.ui.RemarkInfoPreference */
public class RemarkInfoPreference extends Preference {

    /* renamed from: J */
    public TextView f20226J;

    /* renamed from: K */
    public TextView f20227K;

    /* renamed from: L */
    public MMActivity f20228L;

    public RemarkInfoPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20228L = (MMActivity) context;
    }

    /* renamed from: r */
    public CharSequence mo5913r() {
        return this.f20227K.getText().toString();
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        this.f20226J = (TextView) view.findViewById(C0966R.C0970id.knx);
        this.f20227K = (TextView) view.findViewById(C0966R.C0970id.k_z);
        ((ImageView) view.findViewById(C0966R.C0970id.f4k)).setVisibility(8);
        TextView textView = this.f20226J;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.f20227K;
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
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdz, viewGroup2);
        return x;
    }

    public RemarkInfoPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
        this.f121272H = C0966R.C0971layout.f359893bf2;
    }
}
