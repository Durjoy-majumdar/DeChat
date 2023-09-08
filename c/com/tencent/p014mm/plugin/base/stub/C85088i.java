package com.tencent.p014mm.plugin.base.stub;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kr0.C88273g1;
import kr0.C88274h0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;

/* renamed from: com.tencent.mm.plugin.base.stub.i */
public class C85088i implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ int f247940d;

    public C85088i(int i) {
        this.f247940d = i;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Class cls = C88274h0.class;
        Log.m105925i("MicroMsg.WXBizLogic", "doPreloadMiniProgramTranslateLink, %d, %d, %s, cgiType=%d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(this.f247940d));
        if (i == 0 && i2 == 0) {
            C85083h.m104913b(true, this.f247940d);
            if (this.f247940d == 3) {
                C88273g1 g1Var = C88273g1.OPEN_SDK_API_PRELOAD;
                ((C88274h0) C86312j.m106911c(cls)).mo113299AC(g1Var);
                ((C88274h0) C86312j.m106911c(cls)).mo113303QK(g1Var);
            }
            return 0;
        }
        C85083h.m104913b(false, this.f247940d);
        return 0;
    }
}
