package com.tencent.p014mm.plugin.appbrand.config;

import com.tencent.p014mm.sdk.event.IEvent;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/config/WxaAttrStorageNotifyEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "data-storage_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttrStorageNotifyEvent */
public final class WxaAttrStorageNotifyEvent extends IEvent {

    /* renamed from: d */
    public final String f10891d;

    /* renamed from: e */
    public final int f10892e;

    /* renamed from: f */
    public final Object f10893f;

    public WxaAttrStorageNotifyEvent(String str, int i, Object obj) {
        C87412m.m108594g(str, "event");
        this.f10891d = str;
        this.f10892e = i;
        this.f10893f = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxaAttrStorageNotifyEvent)) {
            return false;
        }
        WxaAttrStorageNotifyEvent wxaAttrStorageNotifyEvent = (WxaAttrStorageNotifyEvent) obj;
        return C87412m.m108589b(this.f10891d, wxaAttrStorageNotifyEvent.f10891d) && this.f10892e == wxaAttrStorageNotifyEvent.f10892e && C87412m.m108589b(this.f10893f, wxaAttrStorageNotifyEvent.f10893f);
    }

    public int hashCode() {
        int hashCode = ((this.f10891d.hashCode() * 31) + this.f10892e) * 31;
        Object obj = this.f10893f;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "WxaAttrStorageNotifyEvent(event=" + this.f10891d + ", eventId=" + this.f10892e + ", obj=" + this.f10893f + ')';
    }
}
