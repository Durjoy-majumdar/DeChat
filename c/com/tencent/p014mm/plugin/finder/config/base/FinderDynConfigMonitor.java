package com.tencent.p014mm.plugin.finder.config.base;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import qe1.C35841c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/config/base/FinderDynConfigMonitor;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/DynamicConfigUpdatedEvent;", "<init>", "()V", "plugin-finder-config_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.config.base.FinderDynConfigMonitor */
public final class FinderDynConfigMonitor extends IListener<DynamicConfigUpdatedEvent> {

    /* renamed from: d */
    public static final FinderDynConfigMonitor f81089d;

    /* renamed from: e */
    public static ConcurrentHashMap<String, WeakReference<C35841c>> f81090e = new ConcurrentHashMap<>();

    static {
        FinderDynConfigMonitor finderDynConfigMonitor = new FinderDynConfigMonitor();
        f81089d = finderDynConfigMonitor;
        finderDynConfigMonitor.alive();
    }

    private FinderDynConfigMonitor() {
        super(C40008f.f107254d);
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((DynamicConfigUpdatedEvent) iEvent, "event");
        for (Map.Entry next : f81090e.entrySet()) {
            C35841c cVar = (C35841c) ((WeakReference) next.getValue()).get();
            if (cVar != null) {
                cVar.mo60441b();
            }
            C35841c cVar2 = (C35841c) ((WeakReference) next.getValue()).get();
            if (cVar2 != null) {
                cVar2.mo60440a();
            }
        }
        return false;
    }
}
