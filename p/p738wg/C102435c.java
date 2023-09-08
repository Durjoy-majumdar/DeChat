package p738wg;

import com.tencent.p014mm.autogen.events.ExtNetSceneSendMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import pc0.C100760a0;

/* renamed from: wg.c */
public class C102435c extends IStaticListener<ExtNetSceneSendMsgEvent> {
    public boolean callback(IEvent iEvent) {
        ExtNetSceneSendMsgEvent extNetSceneSendMsgEvent = (ExtNetSceneSendMsgEvent) iEvent;
        C100760a0.C100764f a = C100760a0.m131931a(extNetSceneSendMsgEvent.f264772d.f264774a);
        ExtNetSceneSendMsgEvent.C92498a aVar = extNetSceneSendMsgEvent.f264772d;
        a.f295187a = aVar.f264774a;
        a.f295189c = aVar.f264775b;
        a.f295190d = aVar.f264776c;
        a.f295191e = 0;
        a.f295194h = 4;
        C100760a0.C89338b a2 = a.mo140195a();
        ExtNetSceneSendMsgEvent.C92499b bVar = extNetSceneSendMsgEvent.f264773e;
        bVar.f264778b = a2.f257313a;
        bVar.f264777a = a2.f257314b;
        return true;
    }
}
