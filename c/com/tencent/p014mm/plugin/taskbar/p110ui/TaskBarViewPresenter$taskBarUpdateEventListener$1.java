package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.TaskBarDataUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/taskbar/ui/TaskBarViewPresenter$taskBarUpdateEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/TaskBarDataUpdateEvent;", "plugin-taskbar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$taskBarUpdateEventListener$1 */
public final class TaskBarViewPresenter$taskBarUpdateEventListener$1 extends IListener<TaskBarDataUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ TaskBarViewPresenter f206553d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskBarViewPresenter$taskBarUpdateEventListener$1(TaskBarViewPresenter taskBarViewPresenter, C40008f fVar) {
        super(fVar);
        this.f206553d = taskBarViewPresenter;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((TaskBarDataUpdateEvent) iEvent, "event");
        Log.m105924i("MicroMsg.TaskBarViewPresenter", "received taskBarUpdateEventListener");
        this.f206553d.mo98233c(true);
        return false;
    }
}
