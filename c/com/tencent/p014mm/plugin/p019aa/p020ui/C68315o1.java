package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.aa.ui.o1 */
public class C68315o1 implements C76879j.C47267l {

    /* renamed from: a */
    public final /* synthetic */ PaylistAAUI f196340a;

    /* renamed from: com.tencent.mm.plugin.aa.ui.o1$a */
    public class C68316a implements Runnable {
        public C68316a() {
        }

        public void run() {
            C68315o1.this.f196340a.hideVKB();
        }
    }

    public C68315o1(PaylistAAUI paylistAAUI) {
        this.f196340a = paylistAAUI;
    }

    public boolean onFinish(CharSequence charSequence) {
        if (!Util.isNullOrNil(charSequence.toString())) {
            this.f196340a.f196264z = charSequence.toString();
            this.f196340a.mo93857S7();
        } else {
            PaylistAAUI paylistAAUI = this.f196340a;
            paylistAAUI.f196264z = null;
            paylistAAUI.mo93857S7();
        }
        MMHandlerThread.postToMainThreadDelayed(new C68316a(), 500);
        return true;
    }
}
