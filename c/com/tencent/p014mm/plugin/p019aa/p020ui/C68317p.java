package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.DialogInterface;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.aa.ui.p */
public class C68317p implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C68322q f196342d;

    /* renamed from: com.tencent.mm.plugin.aa.ui.p$a */
    public class C68318a implements Runnable {
        public C68318a() {
        }

        public void run() {
            C68317p.this.f196342d.f196347a.showNormalStWcKb();
        }
    }

    public C68317p(C68322q qVar) {
        this.f196342d = qVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C119179t tVar = C119157j.f356862d;
        C68318a aVar = new C68318a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 300, false);
    }
}
