package com.tencent.p014mm.app;

import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import kb0.C33869m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p919sl.C77725b;
import te3.C50796p82;
import te3.C50927q82;

/* renamed from: com.tencent.mm.app.m1 */
public class C28683m1 implements C11385n {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C77725b.class;
        C97625j3.m125815e().mo123470p(1145, this);
        Log.m105925i("MicroMsg.WorkerProfile", "onSceneEnd(GetServiceNotifyOptions), errType : %d, errCode : %d, errMsg : %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0 && yVar.getType() == 1145) {
            C33869m mVar = (C33869m) yVar;
            C47350c cVar = mVar.f91518d;
            if ((((C50796p82) cVar.f127055a.f127080a).f139635d & 1) != 0) {
                boolean z = ((C50927q82) cVar.f127056b.f127083a).f140182d;
                C85801v1 u = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
                if (z != u.mo119686g(aVar, true)) {
                    Log.m105925i("MicroMsg.WorkerProfile", "service notify message notice switch changed(to : %b)", Boolean.valueOf(z));
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.valueOf(z));
                    ((C77725b) MvvmEventCenter.getEvent(cls)).publish();
                }
                boolean z2 = ((C50927q82) mVar.f91518d.f127056b.f127083a).f140184f;
                C85801v1 u2 = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC;
                if (z2 != u2.mo119686g(aVar2, true)) {
                    Log.m105925i("MicroMsg.WorkerProfile", "wxa custom session notify message notice switch changed(to : %b)", Boolean.valueOf(z2));
                    C97625j3.m125812b().mo105906u().mo119677K(aVar2, Boolean.valueOf(z2));
                    ((C77725b) MvvmEventCenter.getEvent(cls)).publish();
                }
            }
        }
    }
}
