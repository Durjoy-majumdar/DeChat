package cm1;

import a14.C53916l;
import android.graphics.drawable.Drawable;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;

/* renamed from: cm1.v2 */
public final class C0786v2 extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C53916l<Drawable> f1842d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0786v2(C53916l<? super Drawable> lVar) {
        super(1);
        this.f1842d = lVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f1842d.resumeWith(Result.m168114constructorimpl((Object) null));
        return C13598b0.f38549a;
    }
}
