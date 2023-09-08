package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.base.preference.RadioCheckPreference */
public class RadioCheckPreference extends Preference {

    /* renamed from: J */
    public boolean f24280J;

    /* renamed from: K */
    public CheckBox f24281K;

    /* renamed from: L */
    public TextView f24282L;

    /* renamed from: M */
    public int f24283M;

    /* renamed from: N */
    public String f24284N;

    /* renamed from: P */
    public int f24285P;

    /* renamed from: Q */
    public int f24286Q;

    public RadioCheckPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: I */
    public void mo7745I(boolean z) {
        this.f24280J = z;
        CheckBox checkBox = this.f24281K;
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        mo69921C(8);
        CheckBox checkBox = (CheckBox) view.findViewById(C0966R.C0970id.ic6);
        this.f24281K = checkBox;
        checkBox.setChecked(this.f24280J);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kmw);
        this.f24282L = textView;
        String str = this.f24284N;
        int i = this.f24283M;
        this.f24283M = i;
        this.f24284N = str;
        if (textView != null) {
            if (i > 0) {
                textView.setBackgroundResource(i);
            }
            if (!TextUtils.isEmpty(this.f24284N)) {
                this.f24282L.setText(this.f24284N);
            }
        }
        int i2 = this.f24285P;
        this.f24285P = i2;
        TextView textView2 = this.f24282L;
        if (textView2 != null) {
            textView2.setVisibility(i2);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24281K.getLayoutParams();
        int i3 = this.f24286Q;
        if (-1 != i3) {
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, i3, layoutParams.bottomMargin);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bfa, viewGroup2);
        return x;
    }

    public RadioCheckPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24280J = false;
        this.f24283M = -1;
        this.f24284N = "";
        this.f24285P = 8;
        this.f24286Q = -1;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
