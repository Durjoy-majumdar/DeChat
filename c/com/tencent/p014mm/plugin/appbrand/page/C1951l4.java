package com.tencent.p014mm.plugin.appbrand.page;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.page.PageSnapshotStore$takeSnapshot$4", mo125469f = "PageSnapshotStore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.appbrand.page.l4 */
public final class C1951l4 extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f11853d;

    /* renamed from: e */
    public final /* synthetic */ String f11854e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1951l4(C83780d1 d1Var, String str, C15601d<? super C1951l4> dVar) {
        super(2, dVar);
        this.f11853d = d1Var;
        this.f11854e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C1951l4(this.f11853d, this.f11854e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C1951l4) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        long currentTicks = Util.currentTicks();
        try {
            return this.f11853d.mo116159N0();
        } finally {
            Log.m105918d("MicroMsg.AppBrand.PageSnapshotStore", "takeSnapshot(" + this.f11854e + ") using normal way, appId:" + this.f11853d.getAppId() + ", cost:" + (Util.currentTicks() - currentTicks));
        }
    }
}
