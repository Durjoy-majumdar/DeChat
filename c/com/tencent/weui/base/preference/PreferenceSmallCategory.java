package com.tencent.weui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;

public class PreferenceSmallCategory extends PreferenceCategory {
    public PreferenceSmallCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceSmallCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutResource(C0966R.C0971layout.be_);
    }
}
