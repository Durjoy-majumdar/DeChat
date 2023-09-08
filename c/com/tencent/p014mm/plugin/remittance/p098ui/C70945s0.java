package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.RemittanceRefuseEvent;
import com.tencent.p014mm.plugin.remittance.model.C57178n0;
import com.tencent.p014mm.plugin.remittance.model.C70585g0;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceDetailUI;

/* renamed from: com.tencent.mm.plugin.remittance.ui.s0 */
public class C70945s0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RemittanceRefuseEvent f205390d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceDetailUI.C707132 f205391e;

    public C70945s0(RemittanceDetailUI.C707132 r1, RemittanceRefuseEvent remittanceRefuseEvent) {
        this.f205391e = r1;
        this.f205390d = remittanceRefuseEvent;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (RemittanceDetailUI.this.f204739Z0) {
            RemittanceRefuseEvent.C67777a aVar = this.f205390d.f193895d;
            RemittanceDetailUI.this.doSceneProgress(new C57178n0(aVar.f193896a, aVar.f193897b, RemittanceDetailUI.this.f204731V0, 2, "", ""));
            return;
        }
        RemittanceRefuseEvent.C67777a aVar2 = this.f205390d.f193895d;
        String str = aVar2.f193896a;
        String str2 = aVar2.f193897b;
        int i2 = aVar2.f193898c;
        String str3 = aVar2.f193899d;
        aVar2.getClass();
        RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
        C70585g0 g0Var = new C70585g0(str, str2, i2, "refuse", str3, 0, remittanceDetailUI.f204731V0, remittanceDetailUI.f204752h1);
        g0Var.setProcessName("RemittanceProcess");
        RemittanceDetailUI.this.doSceneProgress(g0Var);
    }
}
