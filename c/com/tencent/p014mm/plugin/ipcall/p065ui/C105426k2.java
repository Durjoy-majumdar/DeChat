package com.tencent.p014mm.plugin.ipcall.p065ui;

import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallFuncButton;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j12.C108528a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.k2 */
public class C105426k2 implements IPCallFuncButton.C105390b {

    /* renamed from: a */
    public final /* synthetic */ C105420i2 f313457a;

    public C105426k2(C105420i2 i2Var) {
        this.f313457a = i2Var;
    }

    /* renamed from: a */
    public void mo150121a(boolean z) {
        Log.m105919d("MicroMsg.TalkUIController", "switch speaker, isChecked: %b", Boolean.valueOf(z));
        if (C105385g.Fx0().mo150084b()) {
            this.f313457a.getClass();
            C108528a wx02 = C105385g.wx0();
            if (wx02 != null) {
                wx02.f324872q = z;
            }
            this.f313457a.getClass();
            C108528a wx03 = C105385g.wx0();
            if (wx03 != null) {
                wx03.f324873r = z;
            }
            C105385g.yx0().mo160364b(z);
            C115669n.INSTANCE.mo160131h(12057, 0, 1, 0, 0);
        } else if (!(true ^ C105385g.Ex0().f304601e) && !C105385g.Fx0().mo150085c()) {
            C105385g.Ex0().mo143088d(z);
        }
    }
}
