package com.tencent.p014mm.plugin.game.luggage.report;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LiteAppCloseWindowEvent;
import com.tencent.p014mm.autogen.events.LiteAppShowStatusChangeEvent;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/game/luggage/report/PageTimeReport27743$liteAppDestroyListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/LiteAppCloseWindowEvent;", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$liteAppDestroyListener$1 */
public final class PageTimeReport27743$liteAppDestroyListener$1 extends IListener<LiteAppCloseWindowEvent> {
    public PageTimeReport27743$liteAppDestroyListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        LiteAppCloseWindowEvent liteAppCloseWindowEvent = (LiteAppCloseWindowEvent) iEvent;
        C87412m.m108594g(liteAppCloseWindowEvent, "event");
        Long l = liteAppCloseWindowEvent.f309997d.f310000c;
        long j = PageTimeReport27743.f113098f;
        if (l == null || l.longValue() != j) {
            return false;
        }
        C41864d.m45389f();
        IListener<LiteAppShowStatusChangeEvent> iListener = PageTimeReport27743.f113094b;
        if (iListener != null) {
            iListener.dead();
        }
        ((LinkedList) PageTimeReport27743.f113097e).clear();
        dead();
        return true;
    }
}
