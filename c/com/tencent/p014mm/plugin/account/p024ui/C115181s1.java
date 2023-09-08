package com.tencent.p014mm.plugin.account.p024ui;

/* renamed from: com.tencent.mm.plugin.account.ui.s1 */
public class C115181s1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f345227d;

    public C115181s1(MobileInputUI mobileInputUI) {
        this.f345227d = mobileInputUI;
    }

    public void run() {
        MobileInputUI mobileInputUI = this.f345227d;
        int i = MobileInputUI.f344669V;
        mobileInputUI.hideVKB();
        mobileInputUI.f344682M.mo174715a(MobileInputUI$$t.GoNext);
    }
}
