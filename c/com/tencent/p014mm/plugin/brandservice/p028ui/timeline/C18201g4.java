package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.g4 */
public class C18201g4 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizPersonalCenterReportStruct f50302d;

    /* renamed from: e */
    public final /* synthetic */ BizTimeLineUI f50303e;

    public C18201g4(BizTimeLineUI bizTimeLineUI, BizPersonalCenterReportStruct bizPersonalCenterReportStruct) {
        this.f50303e = bizTimeLineUI;
        this.f50302d = bizPersonalCenterReportStruct;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        BizPersonalCenterReportStruct bizPersonalCenterReportStruct = this.f50302d;
        bizPersonalCenterReportStruct.f107854d = 6;
        bizPersonalCenterReportStruct.mo86054n();
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("biz_from_scene", 2);
        intent.putExtra("biz_time_line_line_session_id", this.f50303e.f50208A);
        intent.putExtra("biz_enter_source", this.f50303e.f50209B);
        C88144b.m109801s(this.f50303e, ".ui.conversation.NewBizConversationUI", intent, (Bundle) null);
        this.f50303e.f50249v.mo22985l("", 0, 0, 7, -1, 0, false, 0);
        this.f50303e.f50210C = true;
        return true;
    }
}
