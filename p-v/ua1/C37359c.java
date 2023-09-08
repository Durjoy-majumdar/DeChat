package ua1;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.ExtStepCountEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import p206nj.C11171e;
import ra1.C47958b;

/* renamed from: ua1.c */
public class C37359c extends IStaticListener<ExtStepCountEvent> {
    public boolean callback(IEvent iEvent) {
        ExtStepCountEvent extStepCountEvent = (ExtStepCountEvent) iEvent;
        if (extStepCountEvent.f107516d == null) {
            Log.m105920e("MicroMsg.ExtStepCount", "StepCount revent.data is null");
            return false;
        }
        Log.m105924i("MicroMsg.ExtStepCount", " action = " + extStepCountEvent.f107516d.f107518a);
        if (extStepCountEvent.f107516d.f107518a != 1) {
            return false;
        }
        String str = (String) C47958b.wx0().mo119685f(C72994y1.C72995a.USERINFO_EXT_SPORT_PKGNAME_STRING, (Object) null);
        Log.m105924i("MicroMsg.SubCoreExt", "sendSportBroadcast pkgNames = " + str);
        if (str != null) {
            for (String str2 : str.split(";")) {
                Intent intent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_SET_SPORT_STEP");
                intent.setPackage(str2);
                if (C11171e.m11046c(12)) {
                    intent.setFlags(32);
                }
                intent.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "SPORT_MESSAGE");
                MMApplicationContext.getContext().sendBroadcast(intent);
            }
        }
        Log.m105918d("MicroMsg.ExtStepCount", " sendBroadcast");
        return true;
    }
}
