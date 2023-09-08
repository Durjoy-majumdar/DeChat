package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.autogen.events.CancelRecogImageFileEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import java.util.ArrayList;
import rx3.C13598b0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.t0 */
public class C96223t0 implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f281180d;

    /* renamed from: e */
    public final /* synthetic */ GalleryTitleManager f281181e;

    public C96223t0(GalleryTitleManager galleryTitleManager, SnsInfo snsInfo) {
        this.f281181e = galleryTitleManager;
        this.f281180d = snsInfo;
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$4");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$4");
        if (GalleryTitleManager.m121500e(this.f281181e) != null) {
            GalleryTitleManager.m121500e(this.f281181e).mo132169a();
        }
        GalleryTitleManager galleryTitleManager = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        ArrayList<Integer> arrayList = galleryTitleManager.f276833A;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (arrayList.contains(1015)) {
            Log.m105924i("MicroMsg.GalleryTitleManager", "[OnSheetDismiss] didShow edit sns group");
            SnsReportHelper.f275506m0.mo131351L(3, false, C102236a0.m134728W(this.f281180d));
        }
        CancelRecogImageFileEvent cancelRecogImageFileEvent = new CancelRecogImageFileEvent();
        CancelRecogImageFileEvent.C40046a aVar = cancelRecogImageFileEvent.f107390d;
        GalleryTitleManager galleryTitleManager2 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        long j = galleryTitleManager2.f276847q;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        aVar.f107391a = j;
        cancelRecogImageFileEvent.f107390d.f107392b = GalleryTitleManager.m121497b(this.f281181e);
        cancelRecogImageFileEvent.publish();
        GalleryTitleManager galleryTitleManager3 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager3.f276841h = null;
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager4 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager4.f276842i = null;
        SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager5 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager5.f276844n = null;
        SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager6 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager6.f276845o = null;
        SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager7 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager7.f276853w = null;
        SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager8 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager8.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager9 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager9.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager10 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager10.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager11 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager11.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager12 = this.f281181e;
        SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager12.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$4");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$4");
        return null;
    }
}
