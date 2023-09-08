package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.aa.ui.t */
public class C68334t implements C76879j.C47267l {

    /* renamed from: a */
    public final /* synthetic */ AARemittanceUI f196357a;

    /* renamed from: com.tencent.mm.plugin.aa.ui.t$a */
    public class C68335a implements Runnable {
        public C68335a() {
        }

        public void run() {
            C68334t.this.f196357a.hideVKB();
            C68334t.this.f196357a.showNormalStWcKb();
        }
    }

    public C68334t(AARemittanceUI aARemittanceUI) {
        this.f196357a = aARemittanceUI;
    }

    public boolean onFinish(CharSequence charSequence) {
        if (!Util.isNullOrNil(charSequence.toString())) {
            this.f196357a.f195980x = charSequence.toString();
            this.f196357a.mo93738M7();
        } else {
            AARemittanceUI aARemittanceUI = this.f196357a;
            aARemittanceUI.f195980x = null;
            aARemittanceUI.mo93738M7();
        }
        C119179t tVar = C119157j.f356862d;
        C68335a aVar = new C68335a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 300, false);
        return true;
    }
}
