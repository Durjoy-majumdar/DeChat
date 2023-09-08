package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.b2 */
public final class C83292b2 extends C87413o implements C32227p<C83368m1.C83369a, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83527z1 f243406d;

    /* renamed from: e */
    public final /* synthetic */ C83368m1.C83374d f243407e;

    /* renamed from: f */
    public final /* synthetic */ WeAppPluginAutoUpdateStruct f243408f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83292b2(C83527z1 z1Var, C83368m1.C83374d dVar, WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct) {
        super(2);
        this.f243406d = z1Var;
        this.f243407e = dVar;
        this.f243408f = weAppPluginAutoUpdateStruct;
    }

    public Object invoke(Object obj, Object obj2) {
        C83368m1.C83369a aVar = (C83368m1.C83369a) obj;
        C87412m.m108594g(aVar, "err");
        this.f243406d.getClass();
        Log.m105924i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.gameBatchReporter", "update plugin(" + this.f243407e.f243616d + ") to latest failed, ERROR(" + aVar + ") errMsg(" + ((String) obj2) + ')');
        WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = this.f243408f;
        weAppPluginAutoUpdateStruct.f236622m = 2;
        weAppPluginAutoUpdateStruct.mo86054n();
        return C13598b0.f38549a;
    }
}
