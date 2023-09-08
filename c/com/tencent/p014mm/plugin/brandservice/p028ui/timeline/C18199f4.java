package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.f4 */
public class C18199f4 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizPersonalCenterReportStruct f50299d;

    /* renamed from: e */
    public final /* synthetic */ BizTimeLineUI f50300e;

    public C18199f4(BizTimeLineUI bizTimeLineUI, BizPersonalCenterReportStruct bizPersonalCenterReportStruct) {
        this.f50300e = bizTimeLineUI;
        this.f50299d = bizPersonalCenterReportStruct;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        BizPersonalCenterReportStruct bizPersonalCenterReportStruct = this.f50299d;
        bizPersonalCenterReportStruct.f107854d = 5;
        bizPersonalCenterReportStruct.mo86054n();
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("biz_from_scene", 2);
        intent.putExtra("biz_time_line_line_session_id", this.f50300e.f50208A);
        intent.putExtra("biz_enter_source", this.f50300e.f50209B);
        C88144b.m109791i(this.f50300e.getContext(), "brandservice", ".ui.personalcenter.BizPersonalCenterActivity", intent, (Bundle) null);
        return true;
    }
}
