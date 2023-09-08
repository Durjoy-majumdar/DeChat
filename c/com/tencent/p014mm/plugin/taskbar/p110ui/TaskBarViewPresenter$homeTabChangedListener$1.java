package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HomeUITabChangeEvent;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/taskbar/ui/TaskBarViewPresenter$homeTabChangedListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/HomeUITabChangeEvent;", "plugin-taskbar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$homeTabChangedListener$1 */
public final class TaskBarViewPresenter$homeTabChangedListener$1 extends IListener<HomeUITabChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ TaskBarViewPresenter f206552d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskBarViewPresenter$homeTabChangedListener$1(TaskBarViewPresenter taskBarViewPresenter, C40008f fVar) {
        super(fVar);
        this.f206552d = taskBarViewPresenter;
    }

    public boolean callback(IEvent iEvent) {
        TaskBarViewPresenter.C30482a aVar;
        HomeUITabChangeEvent homeUITabChangeEvent = (HomeUITabChangeEvent) iEvent;
        C87412m.m108594g(homeUITabChangeEvent, "event");
        TaskBarViewPresenter taskBarViewPresenter = this.f206552d;
        boolean z = true;
        boolean z2 = taskBarViewPresenter.f206531j == 0;
        HomeUITabChangeEvent.C28762a aVar2 = homeUITabChangeEvent.f78831d;
        if (aVar2 != null) {
            int i = aVar2.f78832a;
            taskBarViewPresenter.f206531j = i;
            if (!z2) {
                if (i != 0) {
                    z = false;
                }
                if (z && (aVar = taskBarViewPresenter.f206522a) != null) {
                    ((TaskBarView) aVar).mo98196E1();
                }
            }
        }
        return false;
    }
}
