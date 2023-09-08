package com.tencent.p014mm.plugin.finder.view;

import bo1.C54511w;
import bo1.C54512y;
import com.tencent.p014mm.plugin.finder.view.TestPreloadPreview;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.view.c8 */
public final class C56590c8 implements C54511w {

    /* renamed from: a */
    public final /* synthetic */ TestPreloadPreview f162230a;

    public C56590c8(TestPreloadPreview testPreloadPreview) {
        this.f162230a = testPreloadPreview;
    }

    /* renamed from: a */
    public void mo12829a(String str, C54512y yVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(yVar, "task");
    }

    /* renamed from: b */
    public void mo12830b(String str, int i, int i2, String str2, String str3, C54512y yVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "fileFormat");
        C87412m.m108594g(str3, "codingFormat");
        C87412m.m108594g(yVar, "task");
        TestPreloadPreview testPreloadPreview = this.f162230a;
        TestPreloadPreview.C56580b a = TestPreloadPreview.m65246a(testPreloadPreview, TestPreloadPreview.m65249d(testPreloadPreview, str));
        a.f162184c = i;
        a.f162185d = 2;
        a.f162187f = str3;
        a.f162186e = str2;
        TestPreloadPreview.m65251f(this.f162230a);
    }

    /* renamed from: c */
    public void mo12831c(String str, int i, long j) {
        C87412m.m108594g(str, "mediaId");
        TestPreloadPreview testPreloadPreview = this.f162230a;
        TestPreloadPreview.C56580b a = TestPreloadPreview.m65246a(testPreloadPreview, TestPreloadPreview.m65249d(testPreloadPreview, str));
        a.f162184c = i;
        a.f162182a = j;
        a.f162185d = 2;
        TestPreloadPreview.m65251f(this.f162230a);
    }

    /* renamed from: d */
    public void mo12832d(String str, String str2, C54512y yVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "msg");
        C87412m.m108594g(yVar, "task");
    }

    /* renamed from: e */
    public void mo12833e(String str) {
        C87412m.m108594g(str, "mediaId");
    }

    /* renamed from: f */
    public void mo12834f(String str, boolean z, int i, C54512y yVar, long j) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(yVar, "task");
        TestPreloadPreview testPreloadPreview = this.f162230a;
        TestPreloadPreview.C56580b a = TestPreloadPreview.m65246a(testPreloadPreview, TestPreloadPreview.m65249d(testPreloadPreview, str));
        a.f162182a = j;
        a.f162184c = i;
        a.f162185d = 3;
        TestPreloadPreview.m65251f(this.f162230a);
    }
}
