package vz1;

import com.tencent.p014mm.autogen.events.NotifyGroupSolitatireEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import sz1.C77815b;
import xz1.C79013a;
import xz1.C79015c;

/* renamed from: vz1.b */
public class C78499b extends IStaticListener<NotifyGroupSolitatireEvent> {
    public boolean callback(IEvent iEvent) {
        NotifyGroupSolitatireEvent notifyGroupSolitatireEvent = (NotifyGroupSolitatireEvent) iEvent;
        Class cls = C77815b.class;
        if (notifyGroupSolitatireEvent != null && !Util.isNullOrNil(notifyGroupSolitatireEvent.f193754d.f193757b) && !Util.isNullOrNil(notifyGroupSolitatireEvent.f193754d.f193758c)) {
            NotifyGroupSolitatireEvent.C67738a aVar = notifyGroupSolitatireEvent.f193754d;
            Log.m105925i("NotifyGroupSolitatireInsertEventIListener", "NotifyGroupSolitatireEvent %s %s %s %s %s", Integer.valueOf(notifyGroupSolitatireEvent.f193754d.f193756a), aVar.f193757b, aVar.f193758c, Long.valueOf(notifyGroupSolitatireEvent.f193755e.f193761b), Long.valueOf(notifyGroupSolitatireEvent.f193755e.f193760a));
            int i = notifyGroupSolitatireEvent.f193754d.f193756a;
            if (i == 0 && notifyGroupSolitatireEvent.f193755e.f193760a != 0) {
                C79015c xx02 = ((C77815b) C86312j.m106911c(cls)).xx0();
                NotifyGroupSolitatireEvent.C67738a aVar2 = notifyGroupSolitatireEvent.f193754d;
                C79013a Ow = xx02.mo108980Ow(aVar2.f193757b, aVar2.f193758c, true);
                if (Ow != null && Ow.field_firstMsgId == 0) {
                    Ow.field_firstMsgId = notifyGroupSolitatireEvent.f193755e.f193760a;
                    boolean kD = ((C77815b) C86312j.m106911c(cls)).xx0().mo108984kD(Ow, true);
                    NotifyGroupSolitatireEvent.C67738a aVar3 = notifyGroupSolitatireEvent.f193754d;
                    Log.m105925i("NotifyGroupSolitatireInsertEventIListener", "NotifyGroupSolitatireEvent username:%s key:%s msgId:%s ret:%s", aVar3.f193757b, aVar3.f193758c, Long.valueOf(notifyGroupSolitatireEvent.f193755e.f193760a), Boolean.valueOf(kD));
                }
            } else if (i == 1 && notifyGroupSolitatireEvent.f193755e.f193761b != 0) {
                C79015c xx03 = ((C77815b) C86312j.m106911c(cls)).xx0();
                NotifyGroupSolitatireEvent.C67738a aVar4 = notifyGroupSolitatireEvent.f193754d;
                C79013a Ow2 = xx03.mo108980Ow(aVar4.f193757b, aVar4.f193758c, true);
                if (Ow2 != null && Ow2.field_msgSvrId == 0) {
                    Ow2.field_msgSvrId = notifyGroupSolitatireEvent.f193755e.f193761b;
                    boolean kD2 = ((C77815b) C86312j.m106911c(cls)).xx0().mo108984kD(Ow2, true);
                    NotifyGroupSolitatireEvent.C67738a aVar5 = notifyGroupSolitatireEvent.f193754d;
                    Log.m105925i("NotifyGroupSolitatireInsertEventIListener", "NotifyGroupSolitatireEvent username:%s key:%s msgSvrId:%s ret:%s", aVar5.f193757b, aVar5.f193758c, Long.valueOf(notifyGroupSolitatireEvent.f193755e.f193761b), Boolean.valueOf(kD2));
                }
            }
        }
        return true;
    }
}
