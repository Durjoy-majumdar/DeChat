package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: com.tencent.mm.plugin.remittance.ui.q */
public class C70934q implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditText f205380d;

    /* renamed from: e */
    public final /* synthetic */ C70900k f205381e;

    public C70934q(C70900k kVar, EditText editText) {
        this.f205381e = kVar;
        this.f205380d = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f205380d.length() > 0 && this.f205381e.f205320b != null) {
            dialogInterface.dismiss();
            this.f205381e.f205320b.mo97226a(this.f205380d.getText().toString());
        }
    }
}
