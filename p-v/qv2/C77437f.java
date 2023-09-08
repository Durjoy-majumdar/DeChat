package qv2;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;
import lt3.C21460a;
import mv2.C47106h;
import mv2.C47107i;
import op3.C117877b;
import rt3.C22252b;
import xt3.C53448e;

/* renamed from: qv2.f */
public class C77437f implements C87581a<Boolean, C117877b<Boolean, Boolean>> {

    /* renamed from: a */
    public C46888b f225863a = null;

    public Object call(Object obj) {
        C117877b bVar = (C117877b) obj;
        Log.m105926v("MicroMsg.SoterPrepareAskFunc", "alvinluo SoterPrepareAskFunc call");
        if (!((Boolean) bVar.mo182596a(0)).booleanValue()) {
            Log.m105924i("MicroMsg.SoterPrepareAskFunc", "alvinluo not need prepare ask, return");
            return (Boolean) bVar.mo182596a(1);
        }
        this.f225863a = C88643g.m110544b();
        if (!C22252b.m25806c()) {
            return Boolean.FALSE;
        }
        C53448e hVar = C86709a0.m107522a() ? new C47106h() : new C47107i();
        Log.m105927v("MicroMsg.SoterPrepareAskFunc", "alvinluo has ask: %b", Boolean.valueOf(C21460a.m24274h()));
        this.f225863a.mo72092b();
        C22252b.m25807d(new C77436e(this, bVar), false, hVar);
        Log.m105927v("MicroMsg.SoterPrepareAskFunc", "alvinluo prepareask isNeedSaveDeviceInfo: %b", bVar.mo182596a(1));
        return (Boolean) bVar.mo182596a(1);
    }
}
