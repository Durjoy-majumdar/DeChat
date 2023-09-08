package com.tencent.p014mm.p136ui.conversation.banner;

import com.tencent.p014mm.sdk.platformtools.GreenManUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.conversation.banner.f0 */
public class C116080f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NetWarnBanner$1 f348359d;

    public C116080f0(NetWarnBanner$1 netWarnBanner$1) {
        this.f348359d = netWarnBanner$1;
    }

    public void run() {
        C116083i0 i0Var = this.f348359d.f348358d;
        String str = C116083i0.f348362F;
        String topActivityName = GreenManUtil.getTopActivityName(i0Var.f230570g.get());
        Log.m105925i("MicroMsg.NetWarnView", "curr top activity is: %s", topActivityName);
        if (!topActivityName.endsWith("NetworkDiagnoseAllInOneUI")) {
            C116083i0 i0Var2 = this.f348359d.f348358d;
            C116083i0.m163373h(i0Var2, i0Var2.f348382y ? 2 : i0Var2.f348383z ? 4 : i0Var2.f348363A ? 5 : 3);
        }
    }
}
