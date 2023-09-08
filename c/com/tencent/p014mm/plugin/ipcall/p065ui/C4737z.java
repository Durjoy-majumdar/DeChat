package com.tencent.p014mm.plugin.ipcall.p065ui;

import com.tencent.p014mm.p136ui.base.VerticalScrollBar;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.z */
public class C4737z implements VerticalScrollBar.C6756b {

    /* renamed from: d */
    public final /* synthetic */ IPCallContactUI f19751d;

    public C4737z(IPCallContactUI iPCallContactUI) {
        this.f19751d = iPCallContactUI;
    }

    /* renamed from: S0 */
    public void mo5638S0(String str) {
        if ("↑".equals(str)) {
            this.f19751d.f19452f.setSelection(0);
            return;
        }
        C4684j jVar = this.f19751d.f19453g;
        int intValue = jVar.f19656r.containsKey(str) ? jVar.f19656r.get(str).intValue() : -1;
        if (intValue != -1) {
            this.f19751d.f19452f.setSelection(intValue);
        }
    }
}
