package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.remittance.ui.F2fDynamicCodeItemLayout */
public class F2fDynamicCodeItemLayout extends LinearLayout {

    /* renamed from: d */
    public TextView f20413d;

    /* renamed from: e */
    public TextView f20414e;

    public F2fDynamicCodeItemLayout(Context context) {
        super(context);
        mo6023a();
    }

    /* renamed from: a */
    public final void mo6023a() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.brk, this);
        this.f20413d = (TextView) inflate.findViewById(C0966R.C0970id.iss);
        this.f20414e = (TextView) inflate.findViewById(C0966R.C0970id.ist);
    }

    public F2fDynamicCodeItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6023a();
    }

    public F2fDynamicCodeItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo6023a();
    }
}
