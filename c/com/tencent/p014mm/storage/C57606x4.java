package com.tencent.p014mm.storage;

import bp3.C54526i;
import com.tencent.p014mm.autogen.events.AggressiveCleanCacheEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i40.C60247c;

/* renamed from: com.tencent.mm.storage.x4 */
public final class C57606x4 extends IStaticListener<AggressiveCleanCacheEvent> {
    public boolean callback(IEvent iEvent) {
        Class cls = C57604w3.class;
        C87412m.m108594g((AggressiveCleanCacheEvent) iEvent, "event");
        Log.m105924i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        C54526i iVar = C54526i.f152882a;
        if (!iVar.mo75389a() || !iVar.mo75390b()) {
            Log.m105924i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "entrance is close");
            return true;
        }
        C60247c.C60248a aVar = C60247c.f171775g;
        if (((C57604w3) aVar.mo85234a(cls)).getDB() == null) {
            return true;
        }
        Log.m105924i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "exist old db need to create new db");
        ((C57604w3) aVar.mo85234a(cls)).onCleared();
        C57593a4.f164912a.mo81936a();
        return true;
    }
}
