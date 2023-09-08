package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.base.preference.PreferenceCustomHeightCategory */
public class PreferenceCustomHeightCategory extends Preference {

    /* renamed from: J */
    public int f24274J = 0;

    public PreferenceCustomHeightCategory(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.f359885bd2;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f24274J != 0) {
            ((TextView) view.findViewById(16908310)).setHeight(this.f24274J);
        }
    }

    public PreferenceCustomHeightCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121271G = C0966R.C0971layout.f359885bd2;
    }

    public PreferenceCustomHeightCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.f359885bd2;
    }
}
