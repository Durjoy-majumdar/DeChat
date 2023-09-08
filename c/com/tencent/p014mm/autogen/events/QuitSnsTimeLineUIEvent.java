package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.QuitSnsTimeLineUIEvent */
public final class QuitSnsTimeLineUIEvent extends IEvent {
    public QuitSnsTimeLineUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QuitSnsTimeLineUIEvent)) {
            return false;
        }
        QuitSnsTimeLineUIEvent quitSnsTimeLineUIEvent = (QuitSnsTimeLineUIEvent) iEvent;
        return true;
    }
}
