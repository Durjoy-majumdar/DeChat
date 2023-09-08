package com.tencent.p014mm.plugin.multitalk.p078ui;

import android.app.KeyguardManager;
import android.os.PowerManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import v82.C111418b0;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkAddMembersUI */
public class MultiTalkAddMembersUI extends MultiTalkSelectContactUI {
    /* renamed from: Z7 */
    public void mo66629Z7() {
        this.f115194D = false;
        super.mo66629Z7();
    }

    public void initView() {
        super.initView();
        this.f218609h.setBackgroundResource(C0966R.color.f3285m7);
        MultiSelectContactView multiSelectContactView = this.f218609h;
        int i = C111418b0.f333542c;
        multiSelectContactView.setPadding(i, i, i, 0);
    }

    public void onPause() {
        super.onPause();
        ((KeyguardManager) MMApplicationContext.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        hasWindowFocus();
        ((PowerManager) MMApplicationContext.getContext().getSystemService("power")).isScreenOn();
    }

    public void onStop() {
        super.onStop();
        if (this.f115194D) {
            this.f115194D = false;
            mo66629Z7();
            C105851w0.zx0().mo150626C(false);
        }
    }
}
