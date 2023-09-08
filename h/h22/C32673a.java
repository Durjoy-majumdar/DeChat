package h22;

import com.tencent.p014mm.autogen.events.AggressiveCleanCacheEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;

/* renamed from: h22.a */
public final class C32673a extends IStaticListener<AggressiveCleanCacheEvent> {
    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((AggressiveCleanCacheEvent) iEvent, "event");
        Log.m105924i("MicroMsg.AggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SYNC_KEYBUF2_STRING_SYNC, "");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SYNC_LAST_BUFF_STRING_SYNC, "");
        return true;
    }
}
