package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;

/* renamed from: com.tencent.mm.ui.base.preference.TextButtonPreference */
public class TextButtonPreference extends Preference {
    public TextButtonPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: q */
    public int mo7748q() {
        return C0966R.C0971layout.f359884bd1;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(16908310);
        if (textView != null) {
            textView.setText(this.f121279i);
            textView.setEnabled(mo69930u());
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        super.mo1087x(viewGroup);
        return C85868k2.m106137b(this.f121274d).inflate(C0966R.C0971layout.f359884bd1, viewGroup, false);
    }

    public TextButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
