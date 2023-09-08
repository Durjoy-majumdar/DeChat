package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.a2 */
public final class C83288a2 extends C87413o implements C32226l<C83368m1.C83377e, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83527z1 f243400d;

    /* renamed from: e */
    public final /* synthetic */ C83368m1.C83374d f243401e;

    /* renamed from: f */
    public final /* synthetic */ C83368m1.C83377e f243402f;

    /* renamed from: g */
    public final /* synthetic */ WeAppPluginAutoUpdateStruct f243403g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83288a2(C83527z1 z1Var, C83368m1.C83374d dVar, C83368m1.C83377e eVar, WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct) {
        super(1);
        this.f243400d = z1Var;
        this.f243401e = dVar;
        this.f243402f = eVar;
        this.f243403g = weAppPluginAutoUpdateStruct;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C83368m1.C83377e) obj, LocaleUtil.ITALIAN);
        this.f243400d.getClass();
        Log.m105924i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "update plugin(" + this.f243401e.f243616d + ") to latest succeed, version=" + this.f243402f.f243626a.pkgVersion() + ", source=" + this.f243402f.f243627b);
        WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = this.f243403g;
        weAppPluginAutoUpdateStruct.f236622m = 1;
        weAppPluginAutoUpdateStruct.mo86054n();
        return C13598b0.f38549a;
    }
}
