package f13;

import com.tencent.p014mm.autogen.events.TranslateMessageQueryStatusEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import d13.C97403b;
import di3.C86312j;
import g13.C98071g;

/* renamed from: f13.f */
public class C75670f extends IStaticListener<TranslateMessageQueryStatusEvent> {
    public boolean callback(IEvent iEvent) {
        TranslateMessageQueryStatusEvent translateMessageQueryStatusEvent = (TranslateMessageQueryStatusEvent) iEvent;
        TranslateMessageQueryStatusEvent.C67802b bVar = translateMessageQueryStatusEvent.f193968e;
        C97403b bVar2 = (C97403b) C86312j.m106911c(C97403b.class);
        bVar2.requireAccountInitialized();
        C98071g gVar = bVar2.f285906d;
        bVar.f193970a = gVar.f287524e.containsKey(translateMessageQueryStatusEvent.f193967d.f193969a);
        return true;
    }
}
