package com.tencent.p014mm.plugin.appbrand.api;

import com.tencent.p014mm.sdk.event.IEvent;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/api/OnWeAppFinishedEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "protocol-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.api.OnWeAppFinishedEvent */
public final class OnWeAppFinishedEvent extends IEvent {

    /* renamed from: d */
    public final String f10859d;

    /* renamed from: e */
    public final String f10860e;

    public OnWeAppFinishedEvent(String str, String str2) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "appId");
        this.f10859d = str;
        this.f10860e = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnWeAppFinishedEvent)) {
            return false;
        }
        OnWeAppFinishedEvent onWeAppFinishedEvent = (OnWeAppFinishedEvent) obj;
        return C87412m.m108589b(this.f10859d, onWeAppFinishedEvent.f10859d) && C87412m.m108589b(this.f10860e, onWeAppFinishedEvent.f10860e);
    }

    public int hashCode() {
        return (this.f10859d.hashCode() * 31) + this.f10860e.hashCode();
    }

    public String toString() {
        return "OnWeAppFinishedEvent(username=" + this.f10859d + ", appId=" + this.f10860e + ')';
    }
}
