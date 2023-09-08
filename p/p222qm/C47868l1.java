package p222qm;

import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import pc0.C100760a0;

/* renamed from: qm.l1 */
public class C47868l1 extends IStaticListener<SendMsgEvent> {
    public boolean callback(IEvent iEvent) {
        SendMsgEvent sendMsgEvent = (SendMsgEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        for (String next : Util.stringsToList(sendMsgEvent.f9496d.f9497a.split(","))) {
            C100760a0.C100764f a = C100760a0.m131931a(next);
            a.f295187a = next;
            SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
            a.f295189c = aVar.f9498b;
            a.f295190d = aVar.f9499c;
            a.f295191e = aVar.f9500d;
            a.f295194h = 4;
            a.mo140195a().mo123694a();
        }
        return false;
    }
}
