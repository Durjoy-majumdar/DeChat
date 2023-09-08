package com.tencent.p014mm.chatroom.p015ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.chatroom.ui.preference.SignaturePreference */
public class SignaturePreference extends Preference {
    public SignaturePreference(Context context) {
        super(context);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        viewGroup2.setPadding(0, 0, 0, 0);
        View.inflate(this.f121274d, C0966R.C0971layout.f359888be1, viewGroup2);
        return x;
    }

    public SignaturePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SignaturePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
