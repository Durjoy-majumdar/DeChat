package hd3;

import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.autogen.events.EmojiUnicodeConfUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: hd3.c */
public class C32853c extends IStaticListener<DynamicConfigUpdatedEvent> {
    public boolean callback(IEvent iEvent) {
        DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent = (DynamicConfigUpdatedEvent) iEvent;
        int i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("AndroidUseUnicodeEmoji"), 0);
        EmojiUnicodeConfUpdateEvent emojiUnicodeConfUpdateEvent = new EmojiUnicodeConfUpdateEvent();
        emojiUnicodeConfUpdateEvent.f78778d.f78779a = i;
        emojiUnicodeConfUpdateEvent.publish();
        return false;
    }
}
