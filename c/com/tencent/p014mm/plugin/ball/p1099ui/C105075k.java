package com.tencent.p014mm.plugin.ball.p1099ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.ball.ui.k */
public class C105075k implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ FloatBallProxyUI f311855a;

    public C105075k(FloatBallProxyUI floatBallProxyUI) {
        this.f311855a = floatBallProxyUI;
    }

    public void onDismiss() {
        Log.m105924i("MicroMsg.FloatBallProxyUI", "dismiss bottom sheet");
        FloatBallProxyUI.m140992H7(this.f311855a, 2);
        this.f311855a.finish();
    }
}
