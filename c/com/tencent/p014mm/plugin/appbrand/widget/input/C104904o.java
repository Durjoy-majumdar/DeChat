package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.KeyEvent;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.o */
public class C104904o implements C104863f1.C104865b {

    /* renamed from: a */
    public final /* synthetic */ C104873k f311506a;

    public C104904o(C104873k kVar) {
        this.f311506a = kVar;
    }

    /* renamed from: a */
    public boolean mo148819a(int i, KeyEvent keyEvent) {
        if (i != 67 || C84975p1.m104769e(this.f311506a.f311430q.getText())) {
            return false;
        }
        C104873k kVar = this.f311506a;
        kVar.mo148843u(kVar.f311430q.getText().toString());
        return true;
    }
}
