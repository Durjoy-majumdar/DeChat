package vp3;

import android.graphics.Bitmap;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import qr3.C36070f;
import rx3.C13598b0;
import yp3.C112478a;
import yp3.C91542c;

/* renamed from: vp3.b */
public final class C65849b {

    /* renamed from: a */
    public final String f189362a = ("BitmapEffector@" + hashCode());

    /* renamed from: b */
    public int f189363b;

    /* renamed from: c */
    public int f189364c;

    /* renamed from: d */
    public Bitmap f189365d;

    /* renamed from: e */
    public final C111580c f189366e = new C111580c();

    /* renamed from: vp3.b$b */
    public static final class C65850b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65849b f189367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65850b(C65849b bVar) {
            super(0);
            this.f189367d = bVar;
        }

        public Object invoke() {
            this.f189367d.f189366e.mo163259b();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vp3.b$a */
    public static final class C65851a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l f189368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65851a(C32226l lVar) {
            super(1);
            this.f189368d = lVar;
        }

        public Object invoke(Object obj) {
            C91542c.m114881b(new C111579a(this, (Bitmap) obj));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo89890a(C32226l<? super Bitmap, C13598b0> lVar) {
        int i;
        C87412m.m108595h(lVar, "callback");
        int i2 = this.f189363b;
        if (i2 <= 0 || (i = this.f189364c) <= 0) {
            String str = this.f189362a;
            C112478a.m153628f(str, "size error [" + this.f189363b + ", " + this.f189364c + ']', new Object[0]);
            lVar.invoke(this.f189365d);
            return;
        }
        if (C36070f.f96151a) {
            C111580c cVar = this.f189366e;
            cVar.mo163272i(i2, i);
            cVar.mo163261d();
            this.f189366e.mo163271h(new C65851a(lVar));
        } else {
            lVar.invoke(null);
        }
        this.f189366e.mo163269e(new C65850b(this));
    }

    /* renamed from: b */
    public final void mo89891b(Bitmap bitmap) {
        C87412m.m108595h(bitmap, "bitmap");
        String str = this.f189362a;
        C112478a.m153625c(str, "setInputBitmap: " + bitmap + ", size:[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']', new Object[0]);
        this.f189365d = bitmap;
        this.f189366e.mo163263k(bitmap);
    }
}
