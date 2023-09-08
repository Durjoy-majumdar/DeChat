package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.appcache.m3$$b;
import com.tencent.p014mm.plugin.appbrand.appcache.m3$$c;
import com.tencent.p014mm.plugin.appbrand.launching.C83484u0;
import ei0.C86518b;
import gy3.C87412m;
import lp3.C46888b;
import sx3.C110823p;
import te3.C90415hz1;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.r0 */
public final class C83451r0 implements m3$$b {

    /* renamed from: a */
    public final /* synthetic */ C83484u0.C83485a f243863a;

    /* renamed from: b */
    public final /* synthetic */ C86518b.C86519a[] f243864b;

    /* renamed from: c */
    public final /* synthetic */ C90415hz1[] f243865c;

    /* renamed from: d */
    public final /* synthetic */ C46888b f243866d;

    public C83451r0(C83484u0.C83485a aVar, C86518b.C86519a[] aVarArr, C90415hz1[] hz1Arr, C46888b bVar) {
        this.f243863a = aVar;
        this.f243864b = aVarArr;
        this.f243865c = hz1Arr;
        this.f243866d = bVar;
    }

    /* renamed from: a */
    public void mo113493a(String str, C86518b.C86519a aVar, Object obj) {
        m3$$c m3__c = (m3$$c) obj;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(aVar, "errCode");
        if (C110823p.m151009y(this.f243864b, aVar)) {
            C83484u0.C83485a aVar2 = this.f243863a;
            C90415hz1 hz12 = this.f243865c[1];
            C87412m.m108591d(hz12);
            C83484u0.C83485a.m102447a(aVar2, str, aVar, m3__c, hz12);
            this.f243866d.mo72091a((Object) null);
            return;
        }
        this.f243866d.resume();
    }

    /* renamed from: b */
    public void mo113494b(Object obj) {
        WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
        C87412m.m108594g(wxaPkgLoadProgress, "progressInfo");
        ((C83484u0.C83489e) C83484u0.this.f243940h).invoke(wxaPkgLoadProgress);
    }
}
