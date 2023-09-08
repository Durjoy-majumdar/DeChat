package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.base.preference.CheckPreference */
public class CheckPreference extends Preference {

    /* renamed from: J */
    public boolean f24225J;

    /* renamed from: K */
    public CheckBox f24226K;

    /* renamed from: L */
    public TextView f24227L;

    /* renamed from: M */
    public int f24228M;

    /* renamed from: N */
    public String f24229N;

    /* renamed from: P */
    public int f24230P;

    /* renamed from: Q */
    public int f24231Q;

    public CheckPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        CheckBox checkBox = (CheckBox) view.findViewById(C0966R.C0970id.bab);
        this.f24226K = checkBox;
        checkBox.setChecked(this.f24225J);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kmw);
        this.f24227L = textView;
        String str = this.f24229N;
        int i = this.f24228M;
        this.f24228M = i;
        this.f24229N = str;
        if (textView != null) {
            if (i > 0) {
                textView.setBackgroundResource(i);
            }
            if (!TextUtils.isEmpty(this.f24229N)) {
                this.f24227L.setText(this.f24229N);
            }
        }
        int i2 = this.f24230P;
        this.f24230P = i2;
        TextView textView2 = this.f24227L;
        if (textView2 != null) {
            textView2.setVisibility(i2);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24226K.getLayoutParams();
        int i3 = this.f24231Q;
        if (-1 != i3) {
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, i3, layoutParams.bottomMargin);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        return super.mo1087x(viewGroup);
    }

    public CheckPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24225J = false;
        this.f24228M = -1;
        this.f24229N = "";
        this.f24230P = 8;
        this.f24231Q = -1;
        this.f121271G = C0966R.C0971layout.bf6;
    }
}
