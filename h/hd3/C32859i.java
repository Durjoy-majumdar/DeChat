package hd3;

import com.tencent.p014mm.autogen.events.GetEmojiIsUseUnicodeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: hd3.i */
public class C32859i extends IStaticListener<GetEmojiIsUseUnicodeEvent> {
    public boolean callback(IEvent iEvent) {
        int i;
        GetEmojiIsUseUnicodeEvent getEmojiIsUseUnicodeEvent = (GetEmojiIsUseUnicodeEvent) iEvent;
        Class cls = C10485b.class;
        try {
            if (((C10485b) C86709a0.m107533q(cls)).vh0() == null) {
                i = 0;
                getEmojiIsUseUnicodeEvent.f78823d.f78824a = i;
                return false;
            }
            i = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("AndroidUseUnicodeEmoji"), 0);
            getEmojiIsUseUnicodeEvent.f78823d.f78824a = i;
            return false;
        } catch (Exception unused) {
        }
    }
}
