package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.profile.ui.c3 */
public class C70260c3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI3 f203014d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.c3$a */
    public class C70261a implements MTimerHandler.CallBack {
        public C70261a() {
        }

        public boolean onTimerExpired() {
            C70260c3.this.f203014d.mo96720Q7(false);
            return false;
        }
    }

    public C70260c3(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f203014d = sayHiWithSnsPermissionUI3;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f203014d.f202932f1;
        if (gVar != null) {
            gVar.dismiss();
            this.f203014d.f202932f1 = null;
        }
        new MTimerHandler(new C70261a(), false).startTimer(500);
    }
}
