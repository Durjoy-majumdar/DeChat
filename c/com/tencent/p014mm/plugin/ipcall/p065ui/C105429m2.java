package com.tencent.p014mm.plugin.ipcall.p065ui;

import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallFuncButton;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.m2 */
public class C105429m2 implements IPCallFuncButton.C105390b {

    /* renamed from: a */
    public final /* synthetic */ C105420i2 f313459a;

    public C105429m2(C105420i2 i2Var) {
        this.f313459a = i2Var;
    }

    /* renamed from: a */
    public void mo150121a(boolean z) {
        if (z) {
            C105420i2 i2Var = this.f313459a;
            if (i2Var.f313451x == null) {
                i2Var.f313432e.setVisibility(8);
            } else {
                i2Var.f313432e.setVisibility(4);
            }
            i2Var.f313432e.setVisibility(8);
            i2Var.f313431d.setVisibility(8);
            i2Var.f313428a.setText("");
            i2Var.f313429b.setText("");
            i2Var.f313437j.setVisibility(0);
        } else {
            C105420i2 i2Var2 = this.f313459a;
            if (i2Var2.f313451x != null) {
                i2Var2.f313432e.setVisibility(0);
                i2Var2.f313431d.setVisibility(8);
            } else {
                i2Var2.f313431d.setVisibility(0);
                i2Var2.f313432e.setVisibility(8);
            }
            i2Var2.mo150166h(i2Var2.f313447t);
            i2Var2.f313437j.setVisibility(4);
        }
        C115669n.INSTANCE.mo160131h(12057, 0, 0, 1, 0);
    }
}
