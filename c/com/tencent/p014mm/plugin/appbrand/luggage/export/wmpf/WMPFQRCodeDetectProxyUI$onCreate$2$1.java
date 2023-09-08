package com.tencent.p014mm.plugin.appbrand.luggage.export.wmpf;

import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFQRCodeDetectProxyUI$onCreate$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/RecogQBarOfImageFileResultEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI$onCreate$2$1 */
public final class WMPFQRCodeDetectProxyUI$onCreate$2$1 extends IListener<RecogQBarOfImageFileResultEvent> {

    /* renamed from: d */
    public final /* synthetic */ WMPFQRCodeDetectProxyUI f108797d;

    /* renamed from: e */
    public final /* synthetic */ String f108798e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WMPFQRCodeDetectProxyUI$onCreate$2$1(WMPFQRCodeDetectProxyUI wMPFQRCodeDetectProxyUI, String str) {
        super(wMPFQRCodeDetectProxyUI);
        this.f108797d = wMPFQRCodeDetectProxyUI;
        this.f108798e = str;
    }

    public boolean callback(IEvent iEvent) {
        RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
        C87412m.m108594g(recogQBarOfImageFileResultEvent, "event");
        String str = this.f108798e;
        RecogQBarOfImageFileResultEvent.C92550a aVar = recogQBarOfImageFileResultEvent.f265015d;
        if (!C87412m.m108589b(str, aVar != null ? aVar.f265016a : null)) {
            return false;
        }
        C96874n1 n1Var = C96874n1.f283849a;
        int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
        String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
        int c = n1Var.mo135194c(recogQBarOfImageFileResultEvent);
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        WMPFQRCodeDetectProxyUI wMPFQRCodeDetectProxyUI = this.f108797d;
        DealQBarStrEvent.C92468a aVar2 = dealQBarStrEvent.f264648d;
        aVar2.f264650b = wMPFQRCodeDetectProxyUI;
        aVar2.f264649a = d;
        aVar2.f264651c = b;
        aVar2.f264652d = c;
        aVar2.f264657i = 4;
        dealQBarStrEvent.publish();
        return true;
    }
}
