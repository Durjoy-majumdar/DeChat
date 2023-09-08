package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx3.C13598b0;
import xm0.C91291c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.e2 */
public final class C83312e2 extends C87413o implements C32227p<C83368m1.C83369a, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83319f2 f243467d;

    /* renamed from: e */
    public final /* synthetic */ C83368m1.C83374d f243468e;

    /* renamed from: f */
    public final /* synthetic */ String f243469f;

    /* renamed from: g */
    public final /* synthetic */ AtomicInteger f243470g;

    /* renamed from: h */
    public final /* synthetic */ AtomicReference<String> f243471h;

    /* renamed from: i */
    public final /* synthetic */ WeAppPluginAutoUpdateStruct f243472i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83312e2(C83319f2 f2Var, C83368m1.C83374d dVar, String str, AtomicInteger atomicInteger, AtomicReference<String> atomicReference, WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct) {
        super(2);
        this.f243467d = f2Var;
        this.f243468e = dVar;
        this.f243469f = str;
        this.f243470g = atomicInteger;
        this.f243471h = atomicReference;
        this.f243472i = weAppPluginAutoUpdateStruct;
    }

    public Object invoke(Object obj, Object obj2) {
        C83368m1.C83369a aVar = (C83368m1.C83369a) obj;
        C87412m.m108594g(aVar, "err");
        this.f243467d.getClass();
        Log.m105924i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.defaultBatchReporter", "update plugin(" + this.f243468e.f243616d + ") to latest failed, ERROR(" + aVar + ") errMsg(" + ((String) obj2) + ')');
        AppBrandPluginUpdateStatusChangeIPCMessage.C83247a aVar2 = AppBrandPluginUpdateStatusChangeIPCMessage.f243132n;
        String str = this.f243469f;
        C87412m.m108593f(str, "instanceId");
        aVar2.mo115490a(str, C91291c.UPDATE_FAILED, this.f243468e.f243616d, this.f243470g.get(), this.f243471h.get());
        WeAppPluginAutoUpdateStruct weAppPluginAutoUpdateStruct = this.f243472i;
        weAppPluginAutoUpdateStruct.f236622m = 2;
        weAppPluginAutoUpdateStruct.mo86054n();
        return C13598b0.f38549a;
    }
}
