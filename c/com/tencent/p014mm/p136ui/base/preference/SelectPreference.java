package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;

/* renamed from: com.tencent.mm.ui.base.preference.SelectPreference */
public class SelectPreference extends Preference {

    /* renamed from: J */
    public View f24288J;

    /* renamed from: K */
    public TextView f24289K;

    /* renamed from: L */
    public String f24290L;

    /* renamed from: M */
    public boolean f24291M;

    public SelectPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }

    /* renamed from: I */
    public void mo7746I(String str) {
        this.f24290L = str;
        if (this.f24289K == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f24289K.setVisibility(8);
            this.f24289K.setText("");
            return;
        }
        this.f24289K.setVisibility(0);
        this.f24289K.setText(str);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        int i = 8;
        mo69921C(8);
        WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.k0t);
        if (this.f24291M) {
            i = 0;
        }
        weImageView.setVisibility(i);
        this.f24289K = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
        mo7746I(this.f24290L);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bey, viewGroup2);
        this.f24288J = x;
        return x;
    }

    public SelectPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SelectPreference(Context context) {
        super(context);
    }
}
