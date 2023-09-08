package com.tencent.p014mm.plugin.brandservice.model;

import android.view.View;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.plugin.bizui.widget.StoryListView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18206a;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/brandservice/model/BizFinderLiveUILogic$addLiveStatusChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/BizFinderLineStatusChangedEvent;", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.model.BizFinderLiveUILogic$addLiveStatusChangeListener$1 */
public final class BizFinderLiveUILogic$addLiveStatusChangeListener$1 extends IListener<BizFinderLineStatusChangedEvent> {

    /* renamed from: d */
    public final /* synthetic */ WeakReference<StoryListView> f50169d;

    /* renamed from: e */
    public final /* synthetic */ StoryListView f50170e;

    /* renamed from: f */
    public final /* synthetic */ WeakReference<C18508z2> f50171f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizFinderLiveUILogic$addLiveStatusChangeListener$1(WeakReference<StoryListView> weakReference, StoryListView storyListView, WeakReference<C18508z2> weakReference2, C40008f fVar) {
        super(fVar);
        this.f50169d = weakReference;
        this.f50170e = storyListView;
        this.f50171f = weakReference2;
    }

    public boolean callback(IEvent iEvent) {
        StoryListView storyListView;
        View childAt;
        BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent = (BizFinderLineStatusChangedEvent) iEvent;
        C87412m.m108594g(bizFinderLineStatusChangedEvent, "event");
        if (!(bizFinderLineStatusChangedEvent.f107369d.f107372c == 3 || (storyListView = this.f50169d.get()) == null)) {
            int firstVisiblePosition = storyListView.getFirstVisiblePosition();
            int lastVisiblePosition = storyListView.getLastVisiblePosition();
            boolean z = true;
            if (firstVisiblePosition <= lastVisiblePosition) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (!(firstVisiblePosition == 0 || (childAt = this.f50170e.getChildAt(i)) == null)) {
                        Object tag = childAt.getTag();
                        C19623o0 o0Var = null;
                        C18206a aVar = tag instanceof C18206a ? (C18206a) tag : null;
                        if (aVar != null) {
                            o0Var = aVar.f50327a;
                        }
                        if (o0Var != null && o0Var.mo25754B2()) {
                            String str = o0Var.field_talker;
                            if (!(str == null || C112551y.m153811k(str)) && C87412m.m108589b(o0Var.field_talker, bizFinderLineStatusChangedEvent.f107369d.f107370a)) {
                                break;
                            }
                        }
                    }
                    if (firstVisiblePosition == lastVisiblePosition) {
                        break;
                    }
                    firstVisiblePosition++;
                    i = i2;
                }
            }
            z = false;
            if (z) {
                C18508z2 z2Var = this.f50171f.get();
                if (z2Var != null) {
                    z2Var.notifyDataSetChanged();
                }
                C19428d.f54856a.mo25155H(12);
                Log.m105924i("MicroMsg.BizFinderLiveUILogic", "refreshData on live stop for for card title");
            }
        }
        return false;
    }
}
