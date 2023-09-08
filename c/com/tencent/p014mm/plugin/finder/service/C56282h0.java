package com.tencent.p014mm.plugin.finder.service;

import bo1.C54511w;
import bo1.C54512y;
import com.tencent.p014mm.plugin.finder.service.C56283i0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C60214y3;
import lo2.C99544i0;

/* renamed from: com.tencent.mm.plugin.finder.service.h0 */
public final class C56282h0 implements C54511w {

    /* renamed from: a */
    public final /* synthetic */ C56283i0.C56284a f160850a;

    public C56282h0(C56283i0.C56284a aVar) {
        this.f160850a = aVar;
    }

    /* renamed from: a */
    public void mo12829a(String str, C54512y yVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(yVar, "task");
        C60214y3.C60215a aVar = this.f160850a.f160854b;
        if (aVar != null) {
            ((C99544i0.C61323d) aVar).mo86284a(yVar.f152811i1);
        }
    }

    /* renamed from: b */
    public void mo12830b(String str, int i, int i2, String str2, String str3, C54512y yVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "fileFormat");
        C87412m.m108594g(str3, "codingFormat");
        C87412m.m108594g(yVar, "task");
        if (this.f160850a.f160854b != null) {
            long j = yVar.f152811i1;
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
            Log.m105924i("FinderAdPreloadHelper", "preloadVideo onStart, feedId is " + j);
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
        }
    }

    /* renamed from: c */
    public void mo12831c(String str, int i, long j) {
        C87412m.m108594g(str, "mediaId");
    }

    /* renamed from: d */
    public void mo12832d(String str, String str2, C54512y yVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "msg");
        C87412m.m108594g(yVar, "task");
        C60214y3.C60215a aVar = this.f160850a.f160854b;
        if (aVar != null) {
            ((C99544i0.C61323d) aVar).mo86284a(yVar.f152811i1);
        }
    }

    /* renamed from: e */
    public void mo12833e(String str) {
        C87412m.m108594g(str, "mediaId");
    }

    /* renamed from: f */
    public void mo12834f(String str, boolean z, int i, C54512y yVar, long j) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(yVar, "task");
        if (this.f160850a.f160854b != null) {
            long j2 = yVar.f152811i1;
            SnsMethodCalculate.markStartTimeMs("onSuccessfully", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
            Log.m105924i("FinderAdPreloadHelper", "preloadVideo onSuccessfully, feedId is " + j2 + ", isAllCompleted is " + z + ", percent is " + i + ", receivedSize is " + j);
            SnsMethodCalculate.markEndTimeMs("onSuccessfully", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
        }
    }
}
