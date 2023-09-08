package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.profile.ui.u2 */
public class C70294u2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI2 f203061d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.u2$a */
    public class C70295a implements MTimerHandler.CallBack {
        public C70295a() {
        }

        public boolean onTimerExpired() {
            C70294u2.this.f203061d.mo96695N7(false);
            return false;
        }
    }

    public C70294u2(SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2) {
        this.f203061d = sayHiWithSnsPermissionUI2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f203061d.f202835W0;
        if (gVar != null) {
            gVar.dismiss();
            this.f203061d.f202835W0 = null;
        }
        new MTimerHandler(new C70295a(), false).startTimer(500);
    }
}
