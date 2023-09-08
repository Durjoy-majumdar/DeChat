package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.e */
public class C72562e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OrderHandlerUI f211106d;

    public C72562e(OrderHandlerUI orderHandlerUI) {
        this.f211106d = orderHandlerUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f211106d.finish();
    }
}
