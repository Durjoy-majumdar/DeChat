package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.base.preference.PreferenceTitleCategory */
public class PreferenceTitleCategory extends PreferenceCategory {
    public PreferenceTitleCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(16908310);
        if (textView != null) {
            CharSequence charSequence = this.f121279i;
            if (charSequence == null || charSequence.length() <= 0) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(this.f121279i);
        }
    }

    public PreferenceTitleCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = this.f121271G;
        if (i2 != C0966R.C0971layout.bej || i2 != C0966R.C0971layout.bem) {
            this.f121271G = C0966R.C0971layout.beg;
        }
    }
}
