package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.d */
public final class C5344d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ColorfulChatroomQRCodeUI f20978d;

    public C5344d(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        this.f20978d = colorfulChatroomQRCodeUI;
    }

    public final void run() {
        C76701a.makeText((Context) this.f20978d.getContext(), (int) C0966R.string.iak, 1).show();
    }
}
