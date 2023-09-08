package p697tm;

import com.tencent.p014mm.autogen.events.ReceiveMsgEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import wi0.C38158d;

/* renamed from: tm.o1 */
public class C37172o1 extends IStaticListener<ReceiveMsgEvent> {
    public boolean callback(IEvent iEvent) {
        C72963f4 f4Var;
        ReceiveMsgEvent receiveMsgEvent = (ReceiveMsgEvent) iEvent;
        if (C86709a0.m107522a() && (f4Var = receiveMsgEvent.f78913d.f78914a) != null) {
            String t = f4Var.mo108768t();
            if (C72996z1.m85804J4(t)) {
                C38158d h1 = C81161g2.m99451h1();
                StringBuilder sb = new StringBuilder();
                sb.append(Util.getInt(h1.mo61553Lo(t + "_unreadCount", "0"), 0) + 1);
                sb.append("");
                C81161g2.m99451h1().mo61552B9(t + "_unreadCount", sb.toString());
                C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69771j(t);
                C81964j.m100678a(C81661j.m100180e(t), j != null ? j.mo108786G2() : 0);
            }
        }
        return false;
    }
}
