package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.preference.PreferenceFooterCategory */
public class PreferenceFooterCategory extends Preference {

    /* renamed from: J */
    public TextView f24275J;

    /* renamed from: K */
    public boolean f24276K = false;

    public PreferenceFooterCategory(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bei;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(16908310);
        this.f24275J = textView;
        if (textView != null) {
            CharSequence charSequence = this.f121279i;
            if (charSequence == null || charSequence.length() <= 0) {
                this.f24275J.setVisibility(8);
                return;
            }
            this.f24275J.setVisibility(0);
            this.f24275J.setText(this.f121279i);
            if (this.f24276K) {
                this.f24275J.setTextSize(0, 38.0f);
            } else {
                this.f24275J.setTextSize(0, ((float) C76577a.m92155f(this.f121274d, C0966R.dimen.f3684bd)) * C76577a.m92161l(this.f121274d));
            }
        }
    }

    public PreferenceFooterCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121271G = C0966R.C0971layout.bei;
    }

    public PreferenceFooterCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bei;
    }
}
