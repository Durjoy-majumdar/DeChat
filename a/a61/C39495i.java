package a61;

import com.tencent.p014mm.autogen.events.EmojiFileCheckerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f40.C86709a0;
import i61.C46173b;
import i61.C46174c;

/* renamed from: a61.i */
public class C39495i extends IStaticListener<EmojiFileCheckerEvent> {
    public boolean callback(IEvent iEvent) {
        EmojiFileCheckerEvent emojiFileCheckerEvent = (EmojiFileCheckerEvent) iEvent;
        if (C46174c.f124469b == null) {
            synchronized (C46174c.class) {
                C46174c.f124469b = new C46174c();
            }
        }
        C46174c cVar = C46174c.f124469b;
        cVar.getClass();
        if (emojiFileCheckerEvent == null) {
            return false;
        }
        emojiFileCheckerEvent.f107418d.getClass();
        C86709a0.m107525e().postToWorker(new C46173b(cVar, emojiFileCheckerEvent.f107418d.f107419a));
        return false;
    }
}
