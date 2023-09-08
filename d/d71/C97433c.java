package d71;

import android.graphics.Matrix;
import android.view.View;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import y61.C112395f;

/* renamed from: d71.c */
public final class C97433c extends C87413o implements C32227p<Matrix, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107004d f285987d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97433c(C107004d dVar) {
        super(2);
        this.f285987d = dVar;
    }

    public Object invoke(Object obj, Object obj2) {
        Matrix matrix = (Matrix) obj;
        ((Boolean) obj2).booleanValue();
        C87412m.m108594g(matrix, "m");
        this.f285987d.f320309b.f321806g.set(matrix);
        C112395f fVar = this.f285987d.f320308a;
        C87412m.m108592e(fVar, "null cannot be cast to non-null type android.view.View");
        ((View) fVar).invalidate();
        return C13598b0.f38549a;
    }
}
