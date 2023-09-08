package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.sdk.platformtools.Log;
import ot0.C110064b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.n */
public class C104900n implements C110064b {

    /* renamed from: a */
    public final /* synthetic */ C104873k f311478a;

    public C104900n(C104873k kVar) {
        this.f311478a = kVar;
    }

    /* renamed from: a */
    public void mo121222a() {
        C104930w0 w0Var = this.f311478a.f311430q;
        if (w0Var != null) {
            Log.m105919d("MicroMsg.AppBrandInputInvokeHandler", "[bindInput] onComposingDismissed %s", w0Var.getEditableText());
            C104873k kVar = this.f311478a;
            kVar.f311438y.mo161469a(kVar.f311430q.getEditableText(), false);
        }
    }
}
