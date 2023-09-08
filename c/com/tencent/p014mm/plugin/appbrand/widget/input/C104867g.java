package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;
import gy3.C8480h;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.g */
public final class C104867g extends C68727y0 {

    /* renamed from: d */
    public final String f311410d;

    /* renamed from: e */
    public final BaseInputConnection f311411e;

    public C104867g(String str, BaseInputConnection baseInputConnection) {
        super((Integer) null, 1, (C8480h) null);
        this.f311410d = str;
        this.f311411e = baseInputConnection;
    }

    /* renamed from: b */
    public String mo94515b() {
        Editable editable;
        BaseInputConnection baseInputConnection = this.f311411e;
        if (baseInputConnection == null || (editable = baseInputConnection.getEditable()) == null) {
            return null;
        }
        return editable.toString();
    }

    public String getInputType() {
        return this.f311410d;
    }
}
