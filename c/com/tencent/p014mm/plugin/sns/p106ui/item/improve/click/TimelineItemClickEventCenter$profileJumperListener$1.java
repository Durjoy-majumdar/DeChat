package com.tencent.p014mm.plugin.sns.p106ui.item.improve.click;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.SnsJumpProfileEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import p214om.C11502f;
import wc3.C15141z;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/item/improve/click/TimelineItemClickEventCenter$profileJumperListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsJumpProfileEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1 */
public final class TimelineItemClickEventCenter$profileJumperListener$1 extends IListener<SnsJumpProfileEvent> {
    public TimelineItemClickEventCenter$profileJumperListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
        SnsJumpProfileEvent snsJumpProfileEvent = (SnsJumpProfileEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
        C87412m.m108594g(snsJumpProfileEvent, "event");
        String str = snsJumpProfileEvent.f265167d.f265168a;
        Log.m105924i("MicroMsg.TimelineItemClickEventCenter", "jump to profile page username:" + str);
        Intent intent = new Intent();
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 6);
        intent.putExtra("Contact_User", str);
        C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
        ArrayList<IListener<?>> arrayList = TimelineItemClickEventCenter.f280079a;
        SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        Context context = TimelineItemClickEventCenter.f280080b;
        SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        ((C67654r1) yM).mo93174g(intent, context);
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
        return true;
    }
}
