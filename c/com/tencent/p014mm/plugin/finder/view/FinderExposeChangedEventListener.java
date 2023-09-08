package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderExposeInfoChangeEvent;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import te3.C49417ff1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderExposeChangedEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderExposeInfoChangeEvent;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener */
public abstract class FinderExposeChangedEventListener extends IListener<FinderExposeInfoChangeEvent> {
    public FinderExposeChangedEventListener() {
        super(C40008f.f107254d);
    }

    public boolean callback(IEvent iEvent) {
        FinderExposeInfoChangeEvent finderExposeInfoChangeEvent = (FinderExposeInfoChangeEvent) iEvent;
        C87412m.m108594g(finderExposeInfoChangeEvent, "event");
        C61926c.m72668M(new C56650s1(finderExposeInfoChangeEvent, this));
        return false;
    }

    /* renamed from: e */
    public abstract FinderItem mo2473e(long j);

    /* renamed from: f */
    public abstract String mo2474f();

    /* renamed from: g */
    public abstract void mo2475g(long j, C49417ff1 ff12);
}
