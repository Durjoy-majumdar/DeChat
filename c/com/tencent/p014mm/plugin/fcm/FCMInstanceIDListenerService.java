package com.tencent.p014mm.plugin.fcm;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import tc1.C37012b;

/* renamed from: com.tencent.mm.plugin.fcm.FCMInstanceIDListenerService */
public class FCMInstanceIDListenerService extends FirebaseInstanceIdService {
    /* renamed from: e */
    public void mo57003e() {
        String b = FirebaseInstanceId.m155204a().mo169410b();
        Log.m105924i("MicroMsg.FCM.FCMInstanceIDListenerService", "Refreshed token: " + b);
        if (C86709a0.m107523b().mo121115m()) {
            C37012b a = C37012b.m41119a();
            if (a != null) {
                a.mo60934b(b);
            } else {
                Log.m105928w("MicroMsg.FCM.FCMInstanceIDListenerService", "fcmRegister null, not reg token");
            }
        } else {
            Log.m105928w("MicroMsg.FCM.FCMInstanceIDListenerService", "User is not logined, not reg token");
        }
    }
}
