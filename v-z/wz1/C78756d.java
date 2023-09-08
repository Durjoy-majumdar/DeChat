package wz1;

import android.util.Pair;
import com.tencent.p014mm.autogen.events.NotifyGroupSolitatireEvent;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import sz1.C77815b;
import wz1.C78757e;
import xz1.C79013a;

/* renamed from: wz1.d */
public class C78756d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f230475d;

    /* renamed from: e */
    public final /* synthetic */ C78757e f230476e;

    public C78756d(C78757e eVar, C72963f4 f4Var) {
        this.f230476e = eVar;
        this.f230475d = f4Var;
    }

    public void run() {
        long j;
        Pair remove = this.f230476e.f230477a.remove(Long.valueOf(this.f230475d.getMsgId()));
        Boolean remove2 = this.f230476e.f230478b.remove(Long.valueOf(this.f230475d.getMsgId()));
        C78757e.C78760c remove3 = this.f230476e.f230480d.remove(Long.valueOf(this.f230475d.getMsgId()));
        if (remove != null) {
            C79013a f = ((C77815b) C86312j.m106911c(C77815b.class)).vx0().mo108668f((String) remove.first, (String) remove.second);
            NotifyGroupSolitatireEvent notifyGroupSolitatireEvent = new NotifyGroupSolitatireEvent();
            NotifyGroupSolitatireEvent.C67738a aVar = notifyGroupSolitatireEvent.f193754d;
            aVar.f193756a = 1;
            aVar.f193758c = f.field_key;
            aVar.f193757b = f.field_username;
            aVar.f193759d = remove2.booleanValue();
            if (remove2.booleanValue()) {
                j = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(f.field_firstMsgId).mo108774y2();
            } else {
                j = this.f230475d.mo108774y2();
            }
            notifyGroupSolitatireEvent.f193755e.f193761b = j;
            notifyGroupSolitatireEvent.publish();
            this.f230476e.mo108682c(f, remove2.booleanValue(), C75592q0.m90789s(), j);
            if (remove3 != null) {
                C79013a aVar2 = remove3.f230488a;
                aVar2.field_msgSvrId = j;
                this.f230476e.mo108688i(aVar2, remove3.f230489b, remove3.f230490c);
            }
        }
    }
}
