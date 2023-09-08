package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.appcache.m3$$b;
import com.tencent.p014mm.plugin.appbrand.appcache.m3$$c;
import com.tencent.p014mm.plugin.appbrand.launching.C83484u0;
import ei0.C86518b;
import gy3.C87412m;
import te3.C90415hz1;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.t0 */
public final class C83464t0 implements m3$$b {

    /* renamed from: a */
    public final /* synthetic */ C83484u0.C83485a f243894a;

    /* renamed from: b */
    public final /* synthetic */ C90415hz1[] f243895b;

    public C83464t0(C83484u0.C83485a aVar, C90415hz1[] hz1Arr) {
        this.f243894a = aVar;
        this.f243895b = hz1Arr;
    }

    /* renamed from: a */
    public void mo113493a(String str, C86518b.C86519a aVar, Object obj) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(aVar, "errCode");
        C83484u0.C83485a aVar2 = this.f243894a;
        C90415hz1 hz12 = this.f243895b[0];
        C87412m.m108591d(hz12);
        C83484u0.C83485a.m102447a(aVar2, str, aVar, (m3$$c) obj, hz12);
    }

    /* renamed from: b */
    public void mo113494b(Object obj) {
        WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
        C87412m.m108594g(wxaPkgLoadProgress, "progressInfo");
        ((C83484u0.C83489e) C83484u0.this.f243940h).invoke(wxaPkgLoadProgress);
    }
}
