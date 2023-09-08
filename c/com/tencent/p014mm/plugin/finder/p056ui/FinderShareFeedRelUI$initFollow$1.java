package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedContactChangeEvent;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initFollow$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedContactChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$initFollow$1 */
public final class FinderShareFeedRelUI$initFollow$1 extends IListener<FeedContactChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17199d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderShareFeedRelUI$initFollow$1(FinderShareFeedRelUI finderShareFeedRelUI, C40008f fVar) {
        super(fVar);
        this.f17199d = finderShareFeedRelUI;
    }

    public boolean callback(IEvent iEvent) {
        String str;
        FeedContactChangeEvent feedContactChangeEvent = (FeedContactChangeEvent) iEvent;
        C87412m.m108594g(feedContactChangeEvent, "event");
        FinderContact finderContact = this.f17199d.f17172x0;
        String str2 = "";
        if (finderContact == null || (str = finderContact.username) == null) {
            str = str2;
        }
        if (Util.isNullOrNil(str)) {
            return false;
        }
        FeedContactChangeEvent.C55118a aVar = feedContactChangeEvent.f154748d;
        String str3 = aVar != null ? aVar.f154749a : null;
        if (str3 != null) {
            str2 = str3;
        }
        if (!Util.isEqual(str, str2)) {
            return false;
        }
        this.f17199d.f17165p0 = feedContactChangeEvent;
        return false;
    }
}
