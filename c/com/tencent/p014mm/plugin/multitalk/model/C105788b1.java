package com.tencent.p014mm.plugin.multitalk.model;

import android.graphics.Bitmap;
import c92.C104329g;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.multitalk.model.b1 */
public final class C105788b1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C105810k f314585d;

    /* renamed from: e */
    public final /* synthetic */ C105808j f314586e;

    /* renamed from: f */
    public final /* synthetic */ String f314587f;

    /* renamed from: g */
    public final /* synthetic */ Bitmap f314588g;

    /* renamed from: h */
    public final /* synthetic */ int f314589h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105788b1(C105810k kVar, C105808j jVar, String str, Bitmap bitmap, int i) {
        super(0);
        this.f314585d = kVar;
        this.f314586e = jVar;
        this.f314587f = str;
        this.f314588g = bitmap;
        this.f314589h = i;
    }

    public Object invoke() {
        C105810k kVar = this.f314585d;
        if (kVar != null) {
            kVar.mo150702c();
        }
        long currentTicks = Util.currentTicks();
        this.f314586e.mo150771a(this.f314587f, this.f314588g, 90, this.f314589h);
        C104329g.f308829a.mo146027a(4, Util.ticksToNow(currentTicks));
        return C13598b0.f38549a;
    }
}
