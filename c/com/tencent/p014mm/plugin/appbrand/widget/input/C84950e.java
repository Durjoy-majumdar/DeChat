package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.text.Editable;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.e */
public final class C84950e extends C68727y0 {

    /* renamed from: d */
    public final String f247603d;

    /* renamed from: e */
    public final C84954e1<?> f247604e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84950e(String str, C84954e1<?> e1Var) {
        super(Integer.valueOf(e1Var.getInputId()));
        C87412m.m108594g(e1Var, "inputComponent");
        this.f247603d = str;
        this.f247604e = e1Var;
    }

    /* renamed from: b */
    public String mo94515b() {
        Editable currentValue = this.f247604e.currentValue();
        if (currentValue != null) {
            return currentValue.toString();
        }
        return null;
    }

    public String getInputType() {
        return this.f247603d;
    }
}
