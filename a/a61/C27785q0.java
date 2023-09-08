package a61;

import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;

/* renamed from: a61.q0 */
public class C27785q0 extends IStaticListener<ManualAuthEvent> {
    public boolean callback(IEvent iEvent) {
        ManualAuthEvent manualAuthEvent = (ManualAuthEvent) iEvent;
        if (manualAuthEvent == null) {
            return false;
        }
        Log.m105924i("MicroMsg.emoji.EmojiEvent", "manualAuthEventListener callback");
        if (!manualAuthEvent.f78867d.f78868a) {
            return false;
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
        Boolean bool = Boolean.TRUE;
        i.mo119677K(aVar, bool);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN, bool);
        return false;
    }
}
