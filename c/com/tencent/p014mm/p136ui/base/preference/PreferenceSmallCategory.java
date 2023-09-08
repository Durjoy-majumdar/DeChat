package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.base.preference.PreferenceSmallCategory */
public class PreferenceSmallCategory extends PreferenceCategory {
    public PreferenceSmallCategory(Context context) {
        this(context, (AttributeSet) null);
    }

    public PreferenceSmallCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceSmallCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.be_;
    }
}
