package com.tencent.p014mm.plugin.p081mv.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderPostStatusEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C64682rk1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/mv/model/MvCreateReportHelper$finderPostFinishListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderPostStatusEvent;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.model.MvCreateReportHelper$finderPostFinishListener$1 */
public final class MvCreateReportHelper$finderPostFinishListener$1 extends IListener<FinderPostStatusEvent> {
    public MvCreateReportHelper$finderPostFinishListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        MvCreateActionStruct remove;
        String str;
        FinderPostStatusEvent finderPostStatusEvent = (FinderPostStatusEvent) iEvent;
        C87412m.m108594g(finderPostStatusEvent, "event");
        FinderPostStatusEvent.C28746a aVar = finderPostStatusEvent.f78800d;
        if (aVar == null || !aVar.f78802b || (remove = MvCreateReportHelper.f163009e.remove(Long.valueOf(aVar.f78801a))) == null) {
            return false;
        }
        C64682rk1 rk12 = aVar.f78803c;
        if (rk12 == null || (str = rk12.f185183d) == null) {
            str = "";
        }
        remove.f156555n = remove.mo86045b("MvObjectId", str, true);
        remove.mo86054n();
        remove.mo86056r();
        return false;
    }
}
