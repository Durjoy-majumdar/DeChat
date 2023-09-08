package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: com.tencent.mm.plugin.remittance.ui.m */
public class C70923m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditText f205362d;

    /* renamed from: e */
    public final /* synthetic */ C70900k f205363e;

    public C70923m(C70900k kVar, EditText editText) {
        this.f205363e = kVar;
        this.f205362d = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f205362d.length() > 0 && this.f205363e.f205320b != null) {
            dialogInterface.dismiss();
            this.f205363e.f205320b.mo97226a(this.f205362d.getText().toString());
        }
    }
}
