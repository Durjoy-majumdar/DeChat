package com.tencent.p014mm.plugin.surface.magiclivecard.p950mb;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WebViewUIDestroyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i70.C87667c;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/surface/magiclivecard/mb/MagicLiveCardService$webViewUIDestroyEventEventListener$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;", "plugin-surface-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.surface.magiclivecard.mb.MagicLiveCardService$webViewUIDestroyEventEventListener$2$1 */
public final class MagicLiveCardService$webViewUIDestroyEventEventListener$2$1 extends IListener<WebViewUIDestroyEvent> {

    /* renamed from: d */
    public final /* synthetic */ C85486a f249126d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicLiveCardService$webViewUIDestroyEventEventListener$2$1(C85486a aVar, C40008f fVar) {
        super(fVar);
        this.f249126d = aVar;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((WebViewUIDestroyEvent) iEvent, "event");
        Log.m105924i("MicroMsg.SurfaceApp.MagicLiveCardService", "webview destroy!");
        for (Map.Entry<String, C87667c<ViewType, T>.a> value : this.f249126d.f253923j.entrySet()) {
            C87667c.C87668a aVar = (C87667c.C87668a) value.getValue();
            if (aVar != null) {
                aVar.mo122105h();
            }
        }
        return false;
    }
}
