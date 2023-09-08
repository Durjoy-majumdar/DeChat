package com.tencent.p014mm.p136ui.conversation.banner;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.ui.conversation.banner.h0 */
public class C116082h0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C116083i0 f348361d;

    public C116082h0(C116083i0 i0Var) {
        this.f348361d = i0Var;
    }

    public boolean onTimerExpired() {
        C116083i0 i0Var = this.f348361d;
        int i = i0Var.f348381x + 1;
        i0Var.f348381x = i;
        Log.m105927v("MicroMsg.NetWarnView", "timer fired, percent:%d", Integer.valueOf(i));
        C116083i0 i0Var2 = this.f348361d;
        if (i0Var2.f348381x > 99) {
            return false;
        }
        if (i0Var2.f348380w == 1) {
            i0Var2.f348368h.setText(i0Var2.f230570g.get().getResources().getString(C0966R.string.h77, new Object[]{Integer.valueOf(this.f348361d.f348381x)}));
        }
        return true;
    }
}
