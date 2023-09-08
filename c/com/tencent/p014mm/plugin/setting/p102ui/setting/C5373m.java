package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.m */
public final class C5373m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ColorfulSelfQRCodeUI f21016d;

    public C5373m(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
        this.f21016d = colorfulSelfQRCodeUI;
    }

    public final void run() {
        C76701a.makeText((Context) this.f21016d.getContext(), (int) C0966R.string.iak, 1).show();
    }
}
