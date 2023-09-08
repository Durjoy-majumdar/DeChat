package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import lc3.C10485b;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.e1 */
public class C2253e1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceRankInfoUI f12336d;

    public C2253e1(ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f12336d = exdeviceRankInfoUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if ((Log.getLogLevel() == 0 ? 2 : ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WeRunLaunchGroupRankWeAppSwitch", 0)) == 2) {
            e0Var.mo107144g(3, this.f12336d.getString(C0966R.string.cen), C0966R.raw.bottomsheet_icon_transmit);
        }
        e0Var.mo107144g(0, this.f12336d.getString(C0966R.string.cel), C0966R.raw.bottomsheet_icon_transmit);
        e0Var.mo107144g(1, this.f12336d.getString(C0966R.string.ceo), C0966R.raw.bottomsheet_icon_moment);
        e0Var.mo107144g(2, this.f12336d.getString(C0966R.string.cek), C0966R.raw.bottomsheet_icon_donate);
    }
}
