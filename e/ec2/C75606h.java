package ec2;

import cc2.C67352d;
import com.tencent.p014mm.autogen.events.LbsroomLogicEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: ec2.h */
public class C75606h extends IStaticListener<LbsroomLogicEvent> {
    public boolean callback(IEvent iEvent) {
        LbsroomLogicEvent lbsroomLogicEvent = (LbsroomLogicEvent) iEvent;
        boolean z = true;
        switch (lbsroomLogicEvent.f193724d.f193726a) {
            case 1:
                C67352d.m79718c((String) null, 0);
                break;
            case 2:
                C67352d.m79716a(0);
                break;
            case 3:
                LbsroomLogicEvent.C67728b bVar = lbsroomLogicEvent.f193725e;
                if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(143875, 0)) != 1) {
                    z = false;
                }
                bVar.f193727a = z;
                break;
            case 4:
                C86709a0.m107535s().mo121142i().mo119676J(143875, 1);
                break;
            case 5:
                C86709a0.m107535s().mo121142i().mo119676J(143875, 0);
                break;
            case 6:
                C67352d.m79717b((String) null);
                break;
            case 7:
                LbsroomLogicEvent.C67728b bVar2 = lbsroomLogicEvent.f193725e;
                Long l = (Long) C86709a0.m107535s().mo121142i().mo119684e(8210, (Object) null);
                long currentTimeMillis = System.currentTimeMillis();
                if (l != null && currentTimeMillis <= l.longValue()) {
                    z = false;
                }
                bVar2.f193727a = z;
                break;
            default:
                Log.m105920e("OnLbsroomLogicListener", "LbsroomLogicEvent unkown opcode!");
                break;
        }
        return false;
    }
}
