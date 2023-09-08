package com.tencent.p014mm.plugin.finder.config.base;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import qe1.C35841c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/config/base/FinderSvrConfigMonitor;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ConfigUpdatedEvent;", "<init>", "()V", "plugin-finder-config_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.config.base.FinderSvrConfigMonitor */
public final class FinderSvrConfigMonitor extends IListener<ConfigUpdatedEvent> {

    /* renamed from: d */
    public static final FinderSvrConfigMonitor f81091d;

    /* renamed from: e */
    public static ConcurrentHashMap<String, WeakReference<C35841c>> f81092e = new ConcurrentHashMap<>();

    static {
        FinderSvrConfigMonitor finderSvrConfigMonitor = new FinderSvrConfigMonitor();
        f81091d = finderSvrConfigMonitor;
        finderSvrConfigMonitor.alive();
    }

    private FinderSvrConfigMonitor() {
        super(C40008f.f107254d);
    }

    public boolean callback(IEvent iEvent) {
        WeakReference weakReference;
        C35841c cVar;
        ConfigUpdatedEvent configUpdatedEvent = (ConfigUpdatedEvent) iEvent;
        C87412m.m108594g(configUpdatedEvent, "event");
        if (f81092e != null) {
            String str = configUpdatedEvent.f9044d.f9045a;
            if (!((str == null || str.length() == 0) || (weakReference = f81092e.get(configUpdatedEvent.f9044d.f9045a)) == null || (cVar = (C35841c) weakReference.get()) == null)) {
                Log.m105924i("FinderSvrConfigMonitor", "config: " + configUpdatedEvent.f9044d.f9045a + " has update");
                cVar.mo60441b();
                cVar.mo60440a();
            }
        }
        return false;
    }
}
