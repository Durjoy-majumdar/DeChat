package com.tencent.p014mm.plugin.finder.preload.tabPreload;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HomeUITabChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import do1.C58329a;
import do1.C58341h;
import eb0.C31543z5;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/preload/tabPreload/FinderStreamTabPreloadCore$mainUiIndexChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/HomeUITabChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore$mainUiIndexChangeListener$1 */
public final class FinderStreamTabPreloadCore$mainUiIndexChangeListener$1 extends IListener<HomeUITabChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderStreamTabPreloadCore f160338d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderStreamTabPreloadCore$mainUiIndexChangeListener$1(FinderStreamTabPreloadCore finderStreamTabPreloadCore, C40008f fVar) {
        super(fVar);
        this.f160338d = finderStreamTabPreloadCore;
    }

    public boolean callback(IEvent iEvent) {
        HomeUITabChangeEvent homeUITabChangeEvent = (HomeUITabChangeEvent) iEvent;
        C87412m.m108594g(homeUITabChangeEvent, "event");
        if (homeUITabChangeEvent.f78831d.f78832a == 2) {
            for (C58341h hVar : this.f160338d.f160333e) {
                boolean m = hVar.mo83095m();
                if (m) {
                    Log.m105924i(hVar.f167027c, "performEnterFindMoreFriendTab: foreground prefetch open");
                    hVar.f167031g.set(true);
                }
                boolean compareAndSet = hVar.f167032h.compareAndSet(false, true);
                if ((hVar.f167031g.compareAndSet(false, true) || m) && !hVar.f167028d && hVar.f167025a == hVar.f167026b.mo78459i3()) {
                    long f = hVar.mo83090f();
                    boolean z = hVar.mo83092i().mo77246R5(hVar.mo83092i().mo77283w(hVar.f167025a)) != null;
                    if (!m) {
                        String str = hVar.f167027c;
                        Log.m105924i(str, "performEnterFindMoreFriendTab: case2, hasRedDot=" + z + ", delay=" + f);
                        C58329a.m67539b(hVar.f167029e, hVar.f167036l, f, "performEnterFindMoreFriendTab#2", (C58329a.C58330a) null, 8, (Object) null);
                    } else if (compareAndSet) {
                        C58341h.C58347j jVar = hVar.f167036l;
                        long c = (jVar.f167016e + jVar.f167015d) - C31543z5.m39453c();
                        String str2 = hVar.f167027c;
                        Log.m105924i(str2, "performEnterFindMoreFriendTab: case1, hasRedDot=" + z + ", delay=" + f + ", postDelayDelta=" + c + ", lastTriggerSource=" + hVar.f167036l.f167017f);
                        if (c < 0 || c > f) {
                            C58329a.m67539b(hVar.f167029e, hVar.f167036l, f, "performEnterFindMoreFriendTab#1", (C58329a.C58330a) null, 8, (Object) null);
                        }
                    }
                }
            }
        } else {
            for (C58341h hVar2 : this.f160338d.f160333e) {
                hVar2.f167032h.set(false);
                if (hVar2.mo83095m()) {
                    String str3 = hVar2.f167027c;
                    Log.m105924i(str3, "performExitFindMoreFriendTab: foreground prefetch open, runnable triggerSource=" + hVar2.f167036l.f167017f);
                    hVar2.f167031g.set(true);
                    if (hVar2.f167025a == hVar2.f167026b.mo78459i3()) {
                        long f2 = hVar2.mo83090f();
                        boolean z2 = hVar2.f167030f.get();
                        String str4 = hVar2.f167027c;
                        Log.m105924i(str4, "performExitFindMoreFriendTab: delay=" + f2 + ", isBackground=" + z2);
                        if (!z2) {
                            hVar2.f167029e.mo83079a(hVar2.f167036l, f2, "performExitFindMoreFriendTab", C58329a.C58330a.WxForeground);
                        }
                    }
                } else if (hVar2.f167031g.compareAndSet(true, false)) {
                    Log.m105924i(hVar2.f167027c, "performExitFindMoreFriendTab:");
                    hVar2.f167029e.mo83080c("performExitFindMoreFriendTab");
                    C31543z5.m39453c();
                }
            }
        }
        return false;
    }
}
