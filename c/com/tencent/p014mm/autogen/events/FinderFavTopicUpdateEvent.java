package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.autogen.events.FinderFavTopicUpdateEvent */
public final class FinderFavTopicUpdateEvent extends IEvent {

    /* renamed from: d */
    public C1046a f9200d = new C1046a();

    /* renamed from: com.tencent.mm.autogen.events.FinderFavTopicUpdateEvent$a */
    public static final class C1046a {

        /* renamed from: a */
        public ArrayList f9201a;
    }

    public FinderFavTopicUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderFavTopicUpdateEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f9200d.f9201a, ((FinderFavTopicUpdateEvent) iEvent).f9200d.f9201a);
    }
}
