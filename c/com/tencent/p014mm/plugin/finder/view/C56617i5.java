package com.tencent.p014mm.plugin.finder.view;

import android.graphics.Bitmap;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import vp3.C65849b;

/* renamed from: com.tencent.mm.plugin.finder.view.i5 */
public final class C56617i5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f162317d;

    /* renamed from: e */
    public final /* synthetic */ C56621j5 f162318e;

    /* renamed from: com.tencent.mm.plugin.finder.view.i5$a */
    public static final class C56618a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56621j5 f162319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56618a(C56621j5 j5Var) {
            super(1);
            this.f162319d = j5Var;
        }

        public Object invoke(Object obj) {
            this.f162319d.f162326r.setImageBitmap((Bitmap) obj);
            return C13598b0.f38549a;
        }
    }

    public C56617i5(Bitmap bitmap, C56621j5 j5Var) {
        this.f162317d = bitmap;
        this.f162318e = j5Var;
    }

    public final void run() {
        C65849b bVar = new C65849b();
        Bitmap bitmap = this.f162317d;
        C87412m.m108593f(bitmap, "resource");
        bVar.mo89891b(bitmap);
        int width = this.f162318e.f162326r.getWidth();
        int height = this.f162318e.f162326r.getHeight();
        bVar.f189363b = width;
        bVar.f189364c = height;
        bVar.f189366e.f334033b.mo154924d();
        bVar.mo89890a(new C56618a(this.f162318e));
    }
}
