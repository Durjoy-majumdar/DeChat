package com.tencent.p014mm.plugin.sns.p106ui.item.improve.click;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsJumpReportEvent;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import ke3.C88144b;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/item/improve/click/TimelineItemClickEventCenter$reportJumperListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsJumpReportEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1 */
public final class TimelineItemClickEventCenter$reportJumperListener$1 extends IListener<SnsJumpReportEvent> {
    public TimelineItemClickEventCenter$reportJumperListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
        SnsJumpReportEvent snsJumpReportEvent = (SnsJumpReportEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
        C87412m.m108594g(snsJumpReportEvent, "event");
        Intent intent = new Intent();
        SnsJumpReportEvent.C92584a aVar = snsJumpReportEvent.f265169d;
        long j = aVar.f265171b;
        String str = aVar.f265170a;
        Log.m105924i("MicroMsg.TimelineItemClickEventCenter", "expose id " + j + ' ' + str);
        intent.putExtra("k_expose_msg_id", j);
        intent.putExtra("k_username", str);
        intent.putExtra("showShare", false);
        String str2 = C74928u.C45092d.f122306a;
        C87412m.m108593f(str2, "KExposeH5Url");
        String format = String.format(str2, Arrays.copyOf(new Object[]{33}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        intent.putExtra("rawUrl", format);
        ArrayList<IListener<?>> arrayList = TimelineItemClickEventCenter.f280079a;
        SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        Context context = TimelineItemClickEventCenter.f280080b;
        SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
        return true;
    }
}
