package com.tencent.p014mm.plugin.textstatus.p112ui.card;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StatusSquareItemScrollEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$squareScrollListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/StatusSquareItemScrollEvent;", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC$squareScrollListener$1 */
public final class TextStatusCardFeedUIC$squareScrollListener$1 extends IListener<StatusSquareItemScrollEvent> {

    /* renamed from: d */
    public final /* synthetic */ TextStatusCardFeedUIC f117033d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusCardFeedUIC$squareScrollListener$1(TextStatusCardFeedUIC textStatusCardFeedUIC, C40008f fVar) {
        super(fVar);
        this.f117033d = textStatusCardFeedUIC;
    }

    public boolean callback(IEvent iEvent) {
        StatusSquareItemScrollEvent statusSquareItemScrollEvent = (StatusSquareItemScrollEvent) iEvent;
        C87412m.m108594g(statusSquareItemScrollEvent, "event");
        StatusSquareItemScrollEvent.C40172a aVar = statusSquareItemScrollEvent.f107778d;
        int i = aVar.f107780b;
        int i2 = aVar.f107781c;
        String str = aVar.f107779a;
        Log.m105919d("MicroMsg.TextStatus.TextStatusCardFeedUIC", "StatusSquareItemScrollEvent called with x:%s, y:%s", Integer.valueOf(i), Integer.valueOf(i2));
        this.f117033d.getIntent().putExtra("KEY_START_CARD_ANIM_X_OFFSET", i);
        this.f117033d.getIntent().putExtra("KEY_START_CARD_ANIM_Y_OFFSET", i2);
        this.f117033d.getIntent().putExtra("KEY_USER_NAME", str);
        return false;
    }
}
