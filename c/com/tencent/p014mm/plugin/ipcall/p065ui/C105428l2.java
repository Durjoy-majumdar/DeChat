package com.tencent.p014mm.plugin.ipcall.p065ui;

import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallFuncButton;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import m12.C109468b;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.l2 */
public class C105428l2 implements IPCallFuncButton.C105390b {
    public C105428l2(C105420i2 i2Var) {
    }

    /* renamed from: a */
    public void mo150121a(boolean z) {
        if (C105385g.Fx0().f313245a == 5) {
            Log.m105919d("MicroMsg.TalkUIController", "switch mute, isChecked: %b", Boolean.valueOf(z));
            C109468b zx02 = C105385g.zx0();
            int z2 = z ? zx02.f327640a.mo152852z(412) : zx02.f327640a.mo152852z(413);
            if (z2 < 0) {
                Log.m105920e("MicroMsg.IPCallEngineManager", "tryMuteMicrophone ret:" + z2);
            }
            C105385g.yx0().f326758b.f324869n.mo160366b(z);
            C115669n.INSTANCE.mo160131h(12057, 1, 0, 0, 0);
        }
    }
}
