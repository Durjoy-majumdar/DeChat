package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.offline.p085ui.C57154g1;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.offline.ui.f1 */
public final class C70004f1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C57154g1.C57160a f202021d;

    public C70004f1(C57154g1.C57160a aVar) {
        this.f202021d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C87412m.m108594g(dialogInterface, "dialog");
        C57154g1.C57160a aVar = this.f202021d;
        dialogInterface.dismiss();
        aVar.f163800a.finish();
    }
}
