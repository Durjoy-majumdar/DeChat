package kr1;

import android.content.DialogInterface;
import android.os.Bundle;
import qh2.C101198e;

/* renamed from: kr1.l */
public final class C99173l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99176o f290813d;

    public C99173l(C99176o oVar) {
        this.f290813d = oVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C101198e.C62622a.m73576a(this.f290813d.f290817e, C101198e.C101199b.SUB_RECORD_CANCEL_DELETE, (Bundle) null, 2, (Object) null);
    }
}
