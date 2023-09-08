package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import av2.C92126r;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.r0 */
public class C96175r0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f280966d;

    /* renamed from: e */
    public final /* synthetic */ GalleryTitleManager f280967e;

    public C96175r0(GalleryTitleManager galleryTitleManager, SnsInfo snsInfo) {
        this.f280967e = galleryTitleManager;
        this.f280966d = snsInfo;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$2");
        GalleryTitleManager galleryTitleManager = this.f280967e;
        SnsInfo snsInfo = this.f280966d;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager.getClass();
        SnsMethodCalculate.markStartTimeMs("doFootSheetCLick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        Log.m105924i("MicroMsg.GalleryTitleManager", "request deal QBAR string");
        C92126r rVar = galleryTitleManager.f276841h;
        if (rVar != null && rVar.mo126104g()) {
            galleryTitleManager.f276841h.mo126101d().mo107572p();
        }
        Bundle bundle = new Bundle();
        bundle.putString("stat_msg_id", "sns_" + C102236a0.m134765q0(snsInfo.field_snsId));
        bundle.putString("stat_chat_talker_username", snsInfo.field_userName);
        bundle.putString("stat_send_msg_user", snsInfo.field_userName);
        bundle.putInt("stat_scene", 3);
        bundle.putInt("pay_qrcode_session_type", 3);
        bundle.putString("pay_qrcode_session_name", snsInfo.field_userName);
        bundle.putString("pay_qrcode_timeline_objid", C102236a0.m134765q0(snsInfo.field_snsId));
        SnsMethodCalculate.markStartTimeMs("DealQBarString", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        Log.m105924i("MicroMsg.GalleryTitleManager", "request deal QBAR string");
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        aVar.f264650b = (Activity) galleryTitleManager.f276837d;
        ImageQBarDataBean imageQBarDataBean = galleryTitleManager.f276853w;
        aVar.f264649a = imageQBarDataBean.f273113d;
        aVar.f264651c = imageQBarDataBean.f273114e;
        aVar.f264652d = imageQBarDataBean.f273115f;
        aVar.f264657i = 38;
        aVar.f264660l = bundle;
        SnsMethodCalculate.markStartTimeMs("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        Bundle bundle2 = dealQBarStrEvent.f264648d.f264660l;
        if (bundle2 == null) {
            Log.m105924i("MicroMsg.GalleryTitleManager", "addStatInfo4AppBrand, statObj is null");
            bundle2 = new Bundle();
            dealQBarStrEvent.f264648d.f264660l = bundle2;
        }
        Log.m105924i("MicroMsg.GalleryTitleManager", "addStatInfo4AppBrand, from sns");
        bundle2.putInt("LaunchCodeScene_ScanScene", 2);
        SnsMethodCalculate.markEndTimeMs("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        dealQBarStrEvent.publish();
        SnsMethodCalculate.markEndTimeMs("DealQBarString", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        SnsMethodCalculate.markEndTimeMs("doFootSheetCLick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$2");
    }
}
