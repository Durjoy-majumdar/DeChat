package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import android.content.Intent;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.SnsJumpProfileEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import kotlin.Metadata;
import l31.C99333f;
import p214om.C11502f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveEventUIC$profileJumperListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsJumpProfileEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1 */
public final class ImproveEventUIC$profileJumperListener$1 extends IListener<SnsJumpProfileEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveEventUIC f279639d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveEventUIC$profileJumperListener$1(ImproveEventUIC improveEventUIC, C0125s sVar) {
        super(sVar);
        this.f279639d = improveEventUIC;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
        SnsJumpProfileEvent snsJumpProfileEvent = (SnsJumpProfileEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
        C87412m.m108594g(snsJumpProfileEvent, "event");
        ImproveEventUIC improveEventUIC = this.f279639d;
        SnsMethodCalculate.markStartTimeMs("access$profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        improveEventUIC.getClass();
        SnsMethodCalculate.markStartTimeMs("profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        String str = snsJumpProfileEvent.f265167d.f265168a;
        Log.m105924i("MicroMsg.Improve.EventUIC", "jump to profile page username:" + str);
        Intent intent = new Intent();
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 6);
        intent.putExtra("Contact_User", str);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, improveEventUIC.getContext());
        ((C99333f) C86312j.m106911c(C99333f.class)).um0(12076, C87412m.m108589b(str, C75592q0.m90789s()) ? "BrowseMyAlbumTime" : "BrowseOtherAlbumTime");
        SnsMethodCalculate.markEndTimeMs("profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        SnsMethodCalculate.markEndTimeMs("access$profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
        return true;
    }
}
