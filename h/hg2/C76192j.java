package hg2;

import com.tencent.p014mm.autogen.events.RollbackTencentNewsEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75586j4;

/* renamed from: hg2.j */
public class C76192j extends IStaticListener<RollbackTencentNewsEvent> {
    public boolean callback(IEvent iEvent) {
        RollbackTencentNewsEvent rollbackTencentNewsEvent = (RollbackTencentNewsEvent) iEvent;
        if (!(rollbackTencentNewsEvent instanceof RollbackTencentNewsEvent)) {
            return false;
        }
        long j = rollbackTencentNewsEvent.f193921d.f193922a;
        C76193l.xx0(C76193l.yx0().mo105929Ow(j, 20), 20);
        C75586j4 yx02 = C76193l.yx0();
        yx02.getClass();
        String str = "delete from " + yx02.mo105933kD(20) + " where " + "reserved2" + " = " + j;
        Log.m105919d("MicroMsg.ReaderAppInfoStorage", "deleteGroupByMsgSvrID:%s", str);
        if (yx02.f222063d.execSQL(yx02.mo105933kD(20), str)) {
            yx02.mo105930SE(20);
            yx02.doNotify();
        }
        return true;
    }
}
