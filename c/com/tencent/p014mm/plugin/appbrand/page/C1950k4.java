package com.tencent.p014mm.plugin.appbrand.page;

import a14.C53916l;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.page.k4 */
public final class C1950k4 extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f11849d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f11850e;

    /* renamed from: f */
    public final /* synthetic */ long f11851f;

    /* renamed from: g */
    public final /* synthetic */ C53916l<Bitmap> f11852g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1950k4(String str, C83780d1 d1Var, long j, C53916l<? super Bitmap> lVar) {
        super(1);
        this.f11849d = str;
        this.f11850e = d1Var;
        this.f11851f = j;
        this.f11852g = lVar;
    }

    public Object invoke(Object obj) {
        Log.m105918d("MicroMsg.AppBrand.PageSnapshotStore", "takeSnapshot(" + this.f11849d + ") using game delegate, appId:" + this.f11850e.getAppId() + ", cost:" + (Util.currentTicks() - this.f11851f));
        this.f11852g.resumeWith(Result.m168114constructorimpl((Bitmap) obj));
        return C13598b0.f38549a;
    }
}
