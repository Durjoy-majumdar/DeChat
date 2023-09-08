package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.AppBrandResetAllServiceUnreadCountEvent */
public final class AppBrandResetAllServiceUnreadCountEvent extends IEvent {
    public AppBrandResetAllServiceUnreadCountEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandResetAllServiceUnreadCountEvent)) {
            return false;
        }
        AppBrandResetAllServiceUnreadCountEvent appBrandResetAllServiceUnreadCountEvent = (AppBrandResetAllServiceUnreadCountEvent) iEvent;
        return true;
    }
}
