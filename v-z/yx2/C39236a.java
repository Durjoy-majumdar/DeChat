package yx2;

import android.content.Context;
import com.tencent.p014mm.autogen.events.AggressiveCleanCacheEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: yx2.a */
public final class C39236a extends IStaticListener<AggressiveCleanCacheEvent> {
    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((AggressiveCleanCacheEvent) iEvent, "event");
        Log.m105924i("MicroMsg.DynamicBackgroundAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        C39238d dVar = C39238d.f105557a;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        dVar.mo61996a(context);
        return true;
    }
}
