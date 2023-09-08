package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.ActivityToggleAnimEndEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C46120y4;
import ht1.C60200t1;
import kotlin.Metadata;
import rs1.C13371q;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderActivityToggleAnimUIC$onCreateAfter$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ActivityToggleAnimEndEvent;", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderActivityToggleAnimUIC$onCreateAfter$1 */
public final class FinderActivityToggleAnimUIC$onCreateAfter$1 extends IListener<ActivityToggleAnimEndEvent> {

    /* renamed from: p */
    public final /* synthetic */ C13371q f74782p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderActivityToggleAnimUIC$onCreateAfter$1(C13371q qVar, AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.f74782p = qVar;
    }

    public boolean callback(IEvent iEvent) {
        ActivityToggleAnimEndEvent activityToggleAnimEndEvent = (ActivityToggleAnimEndEvent) iEvent;
        C87412m.m108594g(activityToggleAnimEndEvent, "event");
        if (this.f74782p.getActivity().hashCode() != activityToggleAnimEndEvent.f74717h.f74718a) {
            return false;
        }
        Log.m105924i("Finder.ActivityToggleAnimUIC", "ActivityToggleAnimEndEvent: notify resize banner and adjust seekbar");
        C46120y4 kc02 = ((C60200t1) C86312j.m106911c(C60200t1.class)).kc0();
        View rootView = this.f74782p.getRootView();
        kc02.mo8973a(rootView instanceof ViewGroup ? (ViewGroup) rootView : null);
        return false;
    }
}
