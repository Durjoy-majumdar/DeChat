package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderFeedUiActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/FinderSettingInfoUI$coverSetEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderFeedUiActionEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI$coverSetEvent$1 */
public final class FinderSettingInfoUI$coverSetEvent$1 extends IListener<FinderFeedUiActionEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderSettingInfoUI f17093d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderSettingInfoUI$coverSetEvent$1(FinderSettingInfoUI finderSettingInfoUI, C40008f fVar) {
        super(fVar);
        this.f17093d = finderSettingInfoUI;
    }

    public boolean callback(IEvent iEvent) {
        FinderFeedUiActionEvent finderFeedUiActionEvent = (FinderFeedUiActionEvent) iEvent;
        C87412m.m108594g(finderFeedUiActionEvent, "event");
        FinderFeedUiActionEvent.C1047a aVar = finderFeedUiActionEvent.f9202d;
        if (aVar == null) {
            return true;
        }
        FinderSettingInfoUI finderSettingInfoUI = this.f17093d;
        String str = finderSettingInfoUI.f17081d;
        Log.m105924i(str, "callback actionType:" + aVar.f9205c);
        if (aVar.f9205c != 50000 || Util.isNullOrNil(aVar.f9211i) || finderSettingInfoUI.isFinishing()) {
            return true;
        }
        finderSettingInfoUI.finish();
        return true;
    }
}
