package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.plugin.mmsight.p077ui.C105562q;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.s */
public class C105575s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105562q f314023d;

    public C105575s(C105562q qVar) {
        this.f314023d = qVar;
    }

    public void run() {
        C89779i0 i0Var = this.f314023d.f313996o;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C105562q.C105564b bVar = this.f314023d.f313997p;
        if (bVar != null) {
            bVar.mo150278b();
        }
    }
}
