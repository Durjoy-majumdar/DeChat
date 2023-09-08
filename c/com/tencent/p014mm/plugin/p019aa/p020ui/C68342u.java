package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.DialogInterface;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.aa.ui.u */
public class C68342u implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AARemittanceUI f196365d;

    /* renamed from: com.tencent.mm.plugin.aa.ui.u$a */
    public class C68343a implements Runnable {
        public C68343a() {
        }

        public void run() {
            C68342u.this.f196365d.hideVKB();
            C68342u.this.f196365d.showNormalStWcKb();
        }
    }

    public C68342u(AARemittanceUI aARemittanceUI) {
        this.f196365d = aARemittanceUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C119179t tVar = C119157j.f356862d;
        C68343a aVar = new C68343a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 300, false);
    }
}
