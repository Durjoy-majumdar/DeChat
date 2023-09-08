package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.profile.ui.p2 */
public class C70288p2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI f203055d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.p2$a */
    public class C70289a implements MTimerHandler.CallBack {
        public C70289a() {
        }

        public boolean onTimerExpired() {
            C70288p2.this.f203055d.mo96666P7(false);
            return false;
        }
    }

    public C70288p2(SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI) {
        this.f203055d = sayHiWithSnsPermissionUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f203055d.f202761l1;
        if (gVar != null) {
            gVar.dismiss();
            this.f203055d.f202761l1 = null;
        }
        new MTimerHandler(new C70289a(), false).startTimer(500);
    }
}
