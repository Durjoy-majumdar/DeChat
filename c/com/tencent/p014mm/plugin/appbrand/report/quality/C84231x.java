package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84213o;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.x */
public final class C84231x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C84228v f246050d;

    /* renamed from: e */
    public final /* synthetic */ C84213o.C84214a f246051e;

    /* renamed from: f */
    public final /* synthetic */ boolean f246052f;

    /* renamed from: g */
    public final /* synthetic */ C83780d1 f246053g;

    /* renamed from: h */
    public final /* synthetic */ C84213o f246054h;

    /* renamed from: i */
    public final /* synthetic */ CheckBitmapIsBlankResultDetails f246055i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84231x(C84228v vVar, C84213o.C84214a aVar, boolean z, C83780d1 d1Var, C84213o oVar, CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails) {
        super(0);
        this.f246050d = vVar;
        this.f246051e = aVar;
        this.f246052f = z;
        this.f246053g = d1Var;
        this.f246054h = oVar;
        this.f246055i = checkBitmapIsBlankResultDetails;
    }

    public Object invoke() {
        List<String> b = this.f246050d.mo116913b();
        ((C119157j) C119157j.f356862d).mo183870a(new C84230w(this.f246050d, this.f246051e, this.f246052f, b, this.f246053g, this.f246054h, this.f246055i));
        return C13598b0.f38549a;
    }
}
