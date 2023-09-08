package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statemachine.State;

/* renamed from: com.tencent.mm.plugin.appbrand.report.e0 */
public abstract class C84111e0 extends State {
    public void enter() {
        super.enter();
        Log.m105924i("MicroMsg.LoggerState", getName() + " [ENTERING]");
    }

    public void exit() {
        super.exit();
        Log.m105924i("MicroMsg.LoggerState", getName() + " [EXITING]");
    }
}
