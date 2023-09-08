package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ConfigurationChangedEvent */
public final class ConfigurationChangedEvent extends IEvent {
    public ConfigurationChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ConfigurationChangedEvent)) {
            return false;
        }
        ConfigurationChangedEvent configurationChangedEvent = (ConfigurationChangedEvent) iEvent;
        return true;
    }
}
