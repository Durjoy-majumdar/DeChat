package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.e */
public class C92947e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BakToPcUI f267705d;

    public C92947e(BakToPcUI bakToPcUI) {
        this.f267705d = bakToPcUI;
    }

    public void run() {
        BakToPcUI bakToPcUI = this.f267705d;
        int i = BakToPcUI.f267682i;
        if (bakToPcUI.f267683e == 0) {
            bakToPcUI.f267684f.setEnabled(true);
            bakToPcUI.f267685g.setEnabled(true);
            return;
        }
        bakToPcUI.f267684f.setEnabled(false);
        bakToPcUI.f267685g.setEnabled(false);
    }
}
