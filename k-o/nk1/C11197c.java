package nk1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: nk1.c */
public final class C11197c extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<String> f33010d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f33011e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11197c(C8479f0<String> f0Var, C32226l<? super Boolean, C13598b0> lVar) {
        super(1);
        this.f33010d = f0Var;
        this.f33011e = lVar;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C11193b.f33004b.put(this.f33010d.f27484d, bitmap);
            new Canvas(bitmap).drawColor(1711276032);
            C32226l<Boolean, C13598b0> lVar = this.f33011e;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        } else {
            C32226l<Boolean, C13598b0> lVar2 = this.f33011e;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.FALSE);
            }
        }
        return C13598b0.f38549a;
    }
}
