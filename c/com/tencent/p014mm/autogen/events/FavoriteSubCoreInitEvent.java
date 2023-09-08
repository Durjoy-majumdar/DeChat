package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.FavoriteSubCoreInitEvent */
public final class FavoriteSubCoreInitEvent extends IEvent {
    public FavoriteSubCoreInitEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FavoriteSubCoreInitEvent)) {
            return false;
        }
        FavoriteSubCoreInitEvent favoriteSubCoreInitEvent = (FavoriteSubCoreInitEvent) iEvent;
        return true;
    }
}
