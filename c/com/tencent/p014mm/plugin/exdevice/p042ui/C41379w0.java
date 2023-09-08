package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.w0 */
public class C41379w0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceRankInfoUI.C41303l f111409d;

    public C41379w0(ExdeviceRankInfoUI.C41303l lVar) {
        this.f111409d = lVar;
    }

    public void run() {
        C76701a.makeText((Context) ExdeviceRankInfoUI.this, (int) C0966R.string.cej, 1).show();
        ExdeviceRankInfoUI.this.finish();
    }
}
