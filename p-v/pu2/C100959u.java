package pu2;

import android.view.MenuItem;
import com.tencent.p014mm.autogen.events.SnsJumpPermissionSettingEvent;
import com.tencent.p014mm.autogen.events.SnsJumpReportEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import nj3.C11184p0;

/* renamed from: pu2.u */
public final class C100959u implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C100954s f295628d;

    /* renamed from: e */
    public final /* synthetic */ String f295629e;

    /* renamed from: f */
    public final /* synthetic */ SnsInfo f295630f;

    public C100959u(C100954s sVar, String str, SnsInfo snsInfo) {
        this.f295628d = sVar;
        this.f295629e = str;
        this.f295630f = snsInfo;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$popPermissionMenuWindow$2");
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            SnsJumpPermissionSettingEvent snsJumpPermissionSettingEvent = new SnsJumpPermissionSettingEvent();
            String str = this.f295629e;
            SnsInfo snsInfo = this.f295630f;
            SnsJumpPermissionSettingEvent.C92582a aVar = snsJumpPermissionSettingEvent.f265164d;
            aVar.f265165a = str;
            aVar.f265166b = snsInfo.field_snsId;
            snsJumpPermissionSettingEvent.publish();
        } else if (itemId == 1) {
            SnsJumpReportEvent snsJumpReportEvent = new SnsJumpReportEvent();
            SnsInfo snsInfo2 = this.f295630f;
            SnsJumpReportEvent.C92584a aVar2 = snsJumpReportEvent.f265169d;
            aVar2.f265171b = snsInfo2.field_snsId;
            aVar2.f265170a = snsInfo2.field_userName;
            snsJumpReportEvent.publish();
        } else if (itemId == 2) {
            C100954s sVar = this.f295628d;
            SnsMethodCalculate.markStartTimeMs("access$showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
            sVar.mo140473F();
            SnsMethodCalculate.markEndTimeMs("access$showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        }
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$popPermissionMenuWindow$2");
    }
}
