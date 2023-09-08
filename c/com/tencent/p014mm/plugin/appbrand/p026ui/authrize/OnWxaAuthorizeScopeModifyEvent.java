package com.tencent.p014mm.plugin.appbrand.p026ui.authrize;

import com.tencent.p014mm.sdk.event.IEvent;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import te3.C51793w7;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/authrize/OnWxaAuthorizeScopeModifyEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.authrize.OnWxaAuthorizeScopeModifyEvent */
public final class OnWxaAuthorizeScopeModifyEvent extends IEvent {

    /* renamed from: d */
    public final String f246586d;

    /* renamed from: e */
    public final List<C51793w7> f246587e;

    public OnWxaAuthorizeScopeModifyEvent(String str, List<? extends C51793w7> list) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "authorizeInfoList");
        this.f246586d = str;
        this.f246587e = list;
    }
}
