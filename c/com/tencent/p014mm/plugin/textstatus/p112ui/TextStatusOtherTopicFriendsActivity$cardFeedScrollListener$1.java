package com.tencent.p014mm.plugin.textstatus.p112ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StatusCardFeedItemScrollEvent;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusOtherTopicFriendsActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$cardFeedScrollListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/StatusCardFeedItemScrollEvent;", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity$cardFeedScrollListener$1 */
public final class TextStatusOtherTopicFriendsActivity$cardFeedScrollListener$1 extends IListener<StatusCardFeedItemScrollEvent> {

    /* renamed from: d */
    public final /* synthetic */ TextStatusOtherTopicFriendsActivity f117004d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusOtherTopicFriendsActivity$cardFeedScrollListener$1(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity, C40008f fVar) {
        super(fVar);
        this.f117004d = textStatusOtherTopicFriendsActivity;
    }

    public boolean callback(IEvent iEvent) {
        StatusCardFeedItemScrollEvent statusCardFeedItemScrollEvent = (StatusCardFeedItemScrollEvent) iEvent;
        C87412m.m108594g(statusCardFeedItemScrollEvent, "event");
        String str = statusCardFeedItemScrollEvent.f107771d.f107772a;
        Log.m105918d("MicroMsg.TextStatus.TextStatusOtherTopicFriendsActivity", "cardFeedScroll event callback() called with: scrollname = " + str);
        TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity = this.f117004d;
        C43246h hVar = new C43246h(textStatusOtherTopicFriendsActivity, str);
        TextStatusOtherTopicFriendsActivity.C30508a aVar = TextStatusOtherTopicFriendsActivity.f116976t;
        textStatusOtherTopicFriendsActivity.getClass();
        hVar.run();
        return false;
    }
}
