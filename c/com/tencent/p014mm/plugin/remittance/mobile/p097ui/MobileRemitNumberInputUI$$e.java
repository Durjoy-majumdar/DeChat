package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$e */
public class MobileRemitNumberInputUI$$e implements C74965a.C74969d {

    /* renamed from: d */
    public final /* synthetic */ MobileRemitNumberInputUI f203898d;

    public MobileRemitNumberInputUI$$e(MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f203898d = mobileRemitNumberInputUI;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        MobileRemitNumberInputUI mobileRemitNumberInputUI = this.f203898d;
        mobileRemitNumberInputUI.f203893t = i;
        if (!z) {
            mobileRemitNumberInputUI.f203893t = 0;
        }
        mobileRemitNumberInputUI.mo97205I7(z);
        Log.m105925i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "onInputPanelChange() isKeyboardShow:%s keyboardHeight:%s", Boolean.valueOf(z), Integer.valueOf(i));
    }
}
