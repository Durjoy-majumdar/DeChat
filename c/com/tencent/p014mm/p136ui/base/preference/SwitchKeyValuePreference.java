package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7018q1;

/* renamed from: com.tencent.mm.ui.base.preference.SwitchKeyValuePreference */
public class SwitchKeyValuePreference extends Preference {

    /* renamed from: J */
    public TextView f24295J;

    /* renamed from: K */
    public boolean f24296K;

    public SwitchKeyValuePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: I */
    public final void mo7747I() {
        TextView textView = this.f24295J;
        if (textView != null) {
            if (this.f24296K) {
                textView.setTextColor(C7018q1.m7264b(this.f121274d));
            } else {
                textView.setTextColor(C7018q1.m7263a(this.f121274d));
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f24295J = (TextView) view.findViewById(16908304);
        mo7747I();
    }

    public SwitchKeyValuePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24296K = true;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
