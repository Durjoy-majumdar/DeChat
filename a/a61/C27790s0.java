package a61;

import com.tencent.p014mm.autogen.events.RePullEmojiInfoDescEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import p441aq.C92054g;

/* renamed from: a61.s0 */
public class C27790s0 extends IStaticListener<RePullEmojiInfoDescEvent> {
    public boolean callback(IEvent iEvent) {
        RePullEmojiInfoDescEvent.C28792a aVar;
        RePullEmojiInfoDescEvent rePullEmojiInfoDescEvent = (RePullEmojiInfoDescEvent) iEvent;
        Class cls = C92054g.class;
        if (rePullEmojiInfoDescEvent == null || (aVar = rePullEmojiInfoDescEvent.f78897d) == null) {
            return false;
        }
        String str = aVar.f78898a;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        ((C92054g) C86312j.m106911c(cls)).getClass();
        if (!C30790w2.m39221h().mo57715b().mo142032qq(str)) {
            return false;
        }
        ((C92054g) C86312j.m106911c(cls)).mo126027Cd().mo57680g();
        return false;
    }
}
