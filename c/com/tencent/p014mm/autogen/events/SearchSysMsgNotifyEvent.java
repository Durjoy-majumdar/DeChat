package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent */
public final class SearchSysMsgNotifyEvent extends IEvent {
    public SearchSysMsgNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SearchSysMsgNotifyEvent)) {
            return false;
        }
        SearchSysMsgNotifyEvent searchSysMsgNotifyEvent = (SearchSysMsgNotifyEvent) iEvent;
        return true;
    }
}
