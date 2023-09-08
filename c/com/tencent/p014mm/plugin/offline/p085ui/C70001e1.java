package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.offline.p085ui.C57154g1;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.offline.ui.e1 */
public final class C70001e1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C57154g1.C57160a f202017d;

    public C70001e1(C57154g1.C57160a aVar) {
        this.f202017d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C87412m.m108594g(dialogInterface, "dialog");
        C57154g1.C57160a aVar = this.f202017d;
        dialogInterface.dismiss();
        aVar.f163800a.f210014g.mo105043a();
    }
}
