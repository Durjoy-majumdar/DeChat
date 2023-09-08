package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.scanner.ui.f */
public class C71019f extends Preference {

    /* renamed from: J */
    public View f205533J = null;

    public C71019f(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bnw;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f205533J == null) {
            this.f205533J = mo1087x(viewGroup);
        }
        super.mo1086w(this.f205533J);
        return this.f205533J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
    }
}
