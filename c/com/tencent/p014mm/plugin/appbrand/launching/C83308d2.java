package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.d2 */
public final class C83308d2 extends C87413o implements C32226l<C83368m1.C83377e, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83319f2 f243461d;

    /* renamed from: e */
    public final /* synthetic */ C83368m1.C83374d f243462e;

    /* renamed from: f */
    public final /* synthetic */ C83368m1.C83377e f243463f;

    /* renamed from: g */
    public final /* synthetic */ WeAppPluginAutoUpdateStruct f243464g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83308d2(C83319f2 f2Var, C83368m1.C83374d dVar, C83368m1.C83377e eVar, WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct) {
        super(1);
        this.f243461d = f2Var;
        this.f243462e = dVar;
        this.f243463f = eVar;
        this.f243464g = weAppPluginAutoUpdateStruct;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C83368m1.C83377e) obj, LocaleUtil.ITALIAN);
        this.f243461d.getClass();
        Log.m105924i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.defaultBatchReporter", "update plugin(" + this.f243462e.f243616d + ") to latest succeed, version=" + this.f243463f.f243626a.pkgVersion() + ", source=" + this.f243463f.f243627b);
        WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = this.f243464g;
        weAppPluginAutoUpdateStruct.f236622m = 1;
        weAppPluginAutoUpdateStruct.mo86054n();
        return C13598b0.f38549a;
    }
}
