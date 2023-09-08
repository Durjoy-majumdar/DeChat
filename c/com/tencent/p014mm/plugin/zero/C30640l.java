package com.tencent.p014mm.plugin.zero;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import p206nj.C88957l;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.zero.l */
public class C30640l extends C86301e {
    public void onCreate(Context context) {
        Log.m105924i("MicroMsg.FixupLoadVoipSoService", "[tomys] Load voip so and its dependencies.");
        C88957l.m111078n("voipComm");
        C88957l.m111078n("voipCodec");
    }
}
