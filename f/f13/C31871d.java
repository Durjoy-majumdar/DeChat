package f13;

import com.tencent.p014mm.autogen.events.TranslateMessageEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import d13.C97403b;
import di3.C86312j;

/* renamed from: f13.d */
public class C31871d extends IStaticListener<TranslateMessageEvent> {
    public boolean callback(IEvent iEvent) {
        Log.m105918d("MicroMsg.TranslateMessageListener", "recieve one translate request");
        ((C97403b) C86312j.m106911c(C97403b.class)).f285909g.post(new C75669c(this, (TranslateMessageEvent) iEvent));
        return true;
    }
}
