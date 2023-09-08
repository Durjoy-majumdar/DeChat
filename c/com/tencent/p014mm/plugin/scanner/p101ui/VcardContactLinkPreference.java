package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference */
public class VcardContactLinkPreference extends KeyValuePreference {
    public VcardContactLinkPreference(Context context) {
        super(context);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ((TextView) view.findViewById(16908304)).setTextColor(C76577a.m92153d(this.f121274d, C0966R.color.f3271lq));
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        return super.mo1087x(viewGroup);
    }

    public VcardContactLinkPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VcardContactLinkPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
