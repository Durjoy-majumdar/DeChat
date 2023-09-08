package com.unionpay;

import android.content.DialogInterface;

/* renamed from: com.unionpay.o */
public final class C116527o implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ UPPayWapActivity f349494d;

    public C116527o(UPPayWapActivity uPPayWapActivity) {
        this.f349494d = uPPayWapActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UPPayWapActivity uPPayWapActivity = this.f349494d;
        int i2 = UPPayWapActivity.f349470o;
        uPPayWapActivity.mo180509G7("cancel", (String) null);
    }
}
