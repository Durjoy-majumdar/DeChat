package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.RefreshSmileyPanelEvent */
public final class RefreshSmileyPanelEvent extends IEvent {
    public RefreshSmileyPanelEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RefreshSmileyPanelEvent)) {
            return false;
        }
        RefreshSmileyPanelEvent refreshSmileyPanelEvent = (RefreshSmileyPanelEvent) iEvent;
        return true;
    }
}
