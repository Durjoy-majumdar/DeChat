package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.ui.base.preference.NormalIconPreference */
public class NormalIconPreference extends IconPreference {
    public NormalIconPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        return super.mo1087x(viewGroup);
    }

    public NormalIconPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NormalIconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
