package v23;

import android.graphics.Bitmap;
import ei2.C31606c;
import fy3.C32226l;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: v23.s */
public final class C37664s extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C31606c f99833d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f99834e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37664s(C31606c cVar, C32226l<? super Bitmap, C13598b0> lVar) {
        super(1);
        this.f99833d = cVar;
        this.f99834e = lVar;
    }

    public Object invoke(Object obj) {
        this.f99833d.destroy();
        C61926c.m72668M(new C37663r(this.f99834e, (Bitmap) obj));
        return C13598b0.f38549a;
    }
}
