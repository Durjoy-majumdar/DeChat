package com.tencent.p014mm.plugin.finder.view;

import cm1.C55015f1;
import com.tencent.p014mm.plugin.finder.view.TestPreloadPreview;
import e03.C20485a;
import gy3.C87412m;
import p1081gi.C98121d;
import p1081gi.C98127h;
import wp1.C66167g;

/* renamed from: com.tencent.mm.plugin.finder.view.f8 */
public final class C56609f8 implements C20485a {

    /* renamed from: a */
    public final /* synthetic */ TestPreloadPreview f162302a;

    public C56609f8(TestPreloadPreview testPreloadPreview) {
        this.f162302a = testPreloadPreview;
    }

    /* renamed from: a */
    public void mo32049a(String str, int i, C98127h hVar) {
        C87412m.m108594g(str, "mediaId");
        TestPreloadPreview testPreloadPreview = this.f162302a;
        TestPreloadPreview.C56580b a = TestPreloadPreview.m65246a(testPreloadPreview, TestPreloadPreview.m65249d(testPreloadPreview, str));
        a.f162190i = TestPreloadPreview.C56581c.DOWNLOADER_START;
        a.f162185d = 2;
        if (hVar != null) {
            a.f162187f = hVar.field_requestVideoFormat == 1 ? "H264" : "H265";
            a.f162186e = hVar.f287699a1;
            String str2 = hVar.field_mediaId;
            C87412m.m108593f(str2, "it.field_mediaId");
            a.f162196o = str2;
        }
        TestPreloadPreview.m65251f(this.f162302a);
    }

    /* renamed from: b */
    public void mo32050b(String str, int i, C98121d dVar) {
        C87412m.m108594g(str, "mediaId");
        TestPreloadPreview testPreloadPreview = this.f162302a;
        TestPreloadPreview.C56580b a = TestPreloadPreview.m65246a(testPreloadPreview, TestPreloadPreview.m65249d(testPreloadPreview, str));
        a.f162185d = 3;
        a.f162190i = TestPreloadPreview.C56581c.DOWNLOADER_STOP;
        C55015f1 c = C66167g.f190173a.mo90234c(str, false);
        a.f162194m = c.field_cacheSize;
        a.f162195n = c.field_totalSize;
        String str2 = c.field_mediaId;
        C87412m.m108593f(str2, "it.field_mediaId");
        a.f162196o = str2;
        TestPreloadPreview.m65251f(this.f162302a);
    }

    /* renamed from: c */
    public void mo32051c(String str, int i, C98121d dVar) {
        C87412m.m108594g(str, "mediaId");
        TestPreloadPreview testPreloadPreview = this.f162302a;
        TestPreloadPreview.C56580b a = TestPreloadPreview.m65246a(testPreloadPreview, TestPreloadPreview.m65249d(testPreloadPreview, str));
        a.f162190i = TestPreloadPreview.C56581c.DOWNLOADER_COMPLETE;
        a.f162185d = 3;
        C55015f1 c = C66167g.f190173a.mo90234c(str, false);
        a.f162194m = c.field_cacheSize;
        a.f162195n = c.field_totalSize;
        String str2 = c.field_mediaId;
        C87412m.m108593f(str2, "it.field_mediaId");
        a.f162196o = str2;
        TestPreloadPreview.m65251f(this.f162302a);
    }

    /* renamed from: e */
    public void mo32052e(String str, long j, long j2) {
        C87412m.m108594g(str, "mediaId");
        TestPreloadPreview testPreloadPreview = this.f162302a;
        TestPreloadPreview.C56580b a = TestPreloadPreview.m65246a(testPreloadPreview, TestPreloadPreview.m65249d(testPreloadPreview, str));
        a.f162190i = TestPreloadPreview.C56581c.DOWNLOADER_RUNNING;
        a.f162185d = 2;
        C55015f1 c = C66167g.f190173a.mo90234c(str, false);
        a.f162186e = c.field_fileFormat;
        a.f162194m = Math.max(j, c.field_cacheSize);
        a.f162195n = c.field_totalSize;
        String str2 = c.field_mediaId;
        C87412m.m108593f(str2, "it.field_mediaId");
        a.f162196o = str2;
        TestPreloadPreview.m65251f(this.f162302a);
    }
}
