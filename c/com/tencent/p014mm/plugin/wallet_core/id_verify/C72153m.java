package com.tencent.p014mm.plugin.wallet_core.id_verify;

import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import java.util.ArrayList;
import te3.C77922en3;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.m */
public class C72153m implements C7045j.C7056k {

    /* renamed from: a */
    public final /* synthetic */ C72156n f209289a;

    public C72153m(C72156n nVar) {
        this.f209289a = nVar;
    }

    public void onResult(boolean z, Object obj, Object obj2) {
        this.f209289a.f209322e.f209194t.mo8101d();
        if (z && this.f209289a.f209322e.f209194t.mo8099b() < ((ArrayList) this.f209289a.f209322e.f209164F).size()) {
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f209289a.f209322e;
            ArrayList arrayList = (ArrayList) wcPayRealnameVerifyIdInputUI.f209164F;
            this.f209289a.f209322e.f209159A.f209233f.setValue((C77922en3) arrayList.get(wcPayRealnameVerifyIdInputUI.f209194t.mo8099b()));
            C72156n nVar = this.f209289a;
            nVar.f209321d = nVar.f209322e.f209194t.mo8099b();
        }
    }
}
