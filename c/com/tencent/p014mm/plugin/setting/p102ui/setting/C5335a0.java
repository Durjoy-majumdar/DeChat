package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.a0 */
public class C5335a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SelfQRCodeUI f20968d;

    public C5335a0(SelfQRCodeUI selfQRCodeUI) {
        this.f20968d = selfQRCodeUI;
    }

    public void run() {
        C76701a.makeText((Context) this.f20968d, (int) C0966R.string.iak, 1).show();
    }
}
