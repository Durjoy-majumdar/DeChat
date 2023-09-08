package ll2;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ll2.C21441c;

/* renamed from: ll2.d */
public final class C21444d extends C21440b {

    /* renamed from: c */
    public final Context f60688c;

    /* renamed from: d */
    public final int f60689d;

    /* renamed from: e */
    public final Matrix f60690e = new Matrix();

    /* renamed from: f */
    public final PointF f60691f = new PointF();

    /* renamed from: g */
    public final PointF f60692g = new PointF();

    /* renamed from: h */
    public boolean f60693h;

    public C21444d(Context context, int i) {
        C87412m.m108594g(context, "context");
        this.f60688c = context;
        this.f60689d = i;
    }

    /* renamed from: a */
    public void mo33607a(float f) {
        mo33611f(f);
    }

    /* renamed from: b */
    public void mo33608b(C21441c.C21442a aVar) {
        C87412m.m108594g(aVar, "animationInfo");
        if (!this.f60693h && (this.f60678a instanceof C19706a)) {
            aVar.f60685f.f60686a.set(aVar.f60684e.f60686a);
            aVar.f60685f.f60687b.set(aVar.f60684e.f60687b);
            View view = this.f60678a;
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            PointF imageViewMatrixScale = ((C19706a) view).getImageViewMatrixScale();
            if (imageViewMatrixScale != null) {
                aVar.f60684e.f60686a.set(imageViewMatrixScale);
            }
            View view2 = this.f60678a;
            C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            PointF imageViewMatrixTranslation = ((C19706a) view2).getImageViewMatrixTranslation();
            if (imageViewMatrixTranslation != null) {
                aVar.f60684e.f60687b.set(imageViewMatrixTranslation);
            }
            this.f60679b = aVar;
            this.f60693h = true;
            C21441c.C21443b bVar = aVar.f60684e;
            C21441c.C21443b bVar2 = aVar.f60685f;
            Log.m105919d("MicroMsg.ScaleImageAnimator", "alvinluo onDismissStart start scale: %s, translation: %s, animationEndInfo.scale: %s, animationEndInfo.translation: %s", bVar.f60686a, bVar.f60687b, bVar2.f60686a, bVar2.f60687b);
        }
    }

    /* renamed from: c */
    public void mo33609c(float f) {
        mo33611f(f);
    }

    /* renamed from: d */
    public void mo33606d(C21441c.C21442a aVar) {
        C87412m.m108594g(aVar, "animationInfo");
        super.mo33606d(aVar);
        this.f60693h = false;
    }

    /* renamed from: e */
    public boolean mo33610e() {
        if (this.f60689d != 1) {
            return false;
        }
        return !(this.f60688c.getResources().getConfiguration().orientation == 2);
    }

    /* renamed from: f */
    public final void mo33611f(float f) {
        C21441c.C21442a aVar = this.f60679b;
        if (aVar != null) {
            PointF pointF = this.f60691f;
            C87412m.m108591d(aVar);
            PointF pointF2 = aVar.f60684e.f60686a;
            C21441c.C21442a aVar2 = this.f60679b;
            C87412m.m108591d(aVar2);
            PointF pointF3 = aVar2.f60685f.f60686a;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            float f4 = pointF3.x;
            float f5 = pointF3.y;
            float f6 = (f2 > f4 ? 1 : (f2 == f4 ? 0 : -1)) == 0 ? f2 : ((f4 - f2) * f) + f2;
            float f7 = (f3 > f4 ? 1 : (f3 == f4 ? 0 : -1)) == 0 ? f3 : ((f5 - f3) * f) + f3;
            Log.m105927v("MicroMsg.ScaleImageAnimator", "alvinluo computeScale scale factor: %s, start: (%s, %s), end: (%s, %s), current: (%s, %s)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7));
            pointF.x = f6;
            pointF.y = f7;
            PointF pointF4 = this.f60692g;
            C21441c.C21442a aVar3 = this.f60679b;
            C87412m.m108591d(aVar3);
            PointF pointF5 = aVar3.f60684e.f60687b;
            C21441c.C21442a aVar4 = this.f60679b;
            C87412m.m108591d(aVar4);
            PointF pointF6 = aVar4.f60685f.f60687b;
            float f8 = pointF5.x;
            float f9 = pointF5.y;
            float f15 = pointF6.x;
            float f16 = pointF6.y;
            float f17 = (f8 > f15 ? 1 : (f8 == f15 ? 0 : -1)) == 0 ? f8 : ((f15 - f8) * f) + f8;
            float f18 = (f9 > f16 ? 1 : (f9 == f16 ? 0 : -1)) == 0 ? f9 : ((f16 - f9) * f) + f9;
            Log.m105927v("MicroMsg.ScaleImageAnimator", "alvinluo computeTranslation translate factor: %s, start: (%s, %s), end: (%s, %s), current: (%s, %s)", Float.valueOf(f), Float.valueOf(f8), Float.valueOf(f9), Float.valueOf(f15), Float.valueOf(f16), Float.valueOf(f17), Float.valueOf(f18));
            pointF4.x = f17;
            pointF4.y = f18;
            this.f60690e.reset();
            Matrix matrix = this.f60690e;
            PointF pointF7 = this.f60691f;
            matrix.setScale(pointF7.x, pointF7.y);
            Matrix matrix2 = this.f60690e;
            PointF pointF8 = this.f60692g;
            matrix2.postTranslate(pointF8.x, pointF8.y);
            View view = this.f60678a;
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((C19706a) view).setImageViewMatrix(this.f60690e);
        }
    }
}
