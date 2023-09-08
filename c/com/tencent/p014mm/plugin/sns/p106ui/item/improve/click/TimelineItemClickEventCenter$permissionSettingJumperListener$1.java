package com.tencent.p014mm.plugin.sns.p106ui.item.improve.click;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsJumpPermissionSettingEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import ke3.C88144b;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/item/improve/click/TimelineItemClickEventCenter$permissionSettingJumperListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsJumpPermissionSettingEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1 */
public final class TimelineItemClickEventCenter$permissionSettingJumperListener$1 extends IListener<SnsJumpPermissionSettingEvent> {
    public TimelineItemClickEventCenter$permissionSettingJumperListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
        SnsJumpPermissionSettingEvent snsJumpPermissionSettingEvent = (SnsJumpPermissionSettingEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
        C87412m.m108594g(snsJumpPermissionSettingEvent, "event");
        SnsJumpPermissionSettingEvent.C92582a aVar = snsJumpPermissionSettingEvent.f265164d;
        long j = aVar.f265166b;
        String str = aVar.f265165a;
        Intent intent = new Intent();
        intent.putExtra("sns_permission_snsinfo_svr_id", j);
        intent.putExtra("sns_permission_userName", str);
        intent.putExtra("sns_permission_anim", true);
        intent.putExtra("sns_permission_block_scene", 5);
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 0);
        ArrayList<IListener<?>> arrayList = TimelineItemClickEventCenter.f280079a;
        SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        Context context = TimelineItemClickEventCenter.f280080b;
        SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        C88144b.m109795m(context, Scopes.PROFILE, Qe == 0 ? ".ui.PermissionSettingUI" : ".ui.PermissionSettingUI2", intent, 11);
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
        return true;
    }
}
