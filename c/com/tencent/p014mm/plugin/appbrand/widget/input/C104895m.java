package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.text.Editable;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import go3.C87283v;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.m */
public class C104895m extends C87283v {

    /* renamed from: d */
    public final /* synthetic */ C104873k f311466d;

    public C104895m(C104873k kVar) {
        this.f311466d = kVar;
    }

    public void afterTextChanged(Editable editable) {
        WeakReference<C83780d1> weakReference = this.f311466d.f311428o;
        if (weakReference != null && weakReference.get() != null) {
            C104873k kVar = this.f311466d;
            if (kVar.f311430q != null) {
                kVar.mo148840r();
                if (C84975p1.m104769e(editable)) {
                    Log.m105919d("MicroMsg.AppBrandInputInvokeHandler", "[bindInput] text composing %s", editable);
                    return;
                }
                Log.m105919d("MicroMsg.AppBrandInputInvokeHandler", "[bindInput] not composing text %s", editable);
                Editable editableText = this.f311466d.f311430q.getEditableText();
                C104873k kVar2 = this.f311466d;
                kVar2.f311438y.mo161469a(editableText, kVar2.f311439z);
            }
        }
    }
}
