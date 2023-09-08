package com.tencent.p014mm.booter.notification;

import android.app.Notification;
import bd2.C54451c;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import zc2.C119091c;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.booter.notification.d */
public class C28872d extends C86301e implements C54451c {
    public String D10() {
        return ((MMNotification) C97625j3.m125816f()).f194715b;
    }

    /* renamed from: TZ */
    public void mo56286TZ() {
        C119091c.f356647a.mo183768a();
    }

    /* renamed from: sT */
    public void mo56287sT(int i, Notification notification) {
        if (C86709a0.m107523b().mo121114l()) {
            ((MMNotification) C97625j3.m125816f()).mo93215l(i, notification, true);
        } else {
            Log.m105924i("MicroMsg.MMNotificationService", "notify no login ");
        }
    }
}
