package ll2;

import android.graphics.PointF;
import android.view.View;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ll2.C21441c;

/* renamed from: ll2.b */
public abstract class C21440b implements C21441c {

    /* renamed from: a */
    public View f60678a;

    /* renamed from: b */
    public C21441c.C21442a f60679b;

    /* renamed from: d */
    public void mo33606d(C21441c.C21442a aVar) {
        C87412m.m108594g(aVar, "animationInfo");
        this.f60679b = aVar;
        View view = aVar.f60680a;
        this.f60678a = view;
        if (view instanceof C19706a) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            C19706a aVar2 = (C19706a) view;
            PointF imageViewMatrixScale = aVar2.getImageViewMatrixScale();
            PointF imageViewMatrixTranslation = aVar2.getImageViewMatrixTranslation();
            C21441c.C21443b bVar = aVar.f60684e;
            bVar.f60686a.set(imageViewMatrixScale != null ? imageViewMatrixScale.x : 1.0f, imageViewMatrixScale != null ? imageViewMatrixScale.y : 1.0f);
            bVar.f60687b.set(imageViewMatrixTranslation != null ? imageViewMatrixTranslation.x : 0.0f, imageViewMatrixTranslation != null ? imageViewMatrixTranslation.y : 0.0f);
            C21441c.C21443b bVar2 = aVar.f60684e;
            Log.m105925i("MicroMsg.BaseOCRImageAnimator", "alvinluo onShowStart start scale: %s, translation: %s", bVar2.f60686a, bVar2.f60687b);
            int imageWidth = aVar2.getImageWidth();
            int imageHeight = aVar2.getImageHeight();
            PointF pointF = aVar.f60683d;
            float f = pointF.x;
            float f2 = pointF.y;
            float f3 = (float) imageWidth;
            float f4 = (float) imageHeight;
            float f5 = f * 1.0f;
            if ((f3 * 1.0f) / f4 > f5 / f2) {
                aVar.f60681b = false;
                C21441c.C21443b bVar3 = aVar.f60685f;
                PointF pointF2 = bVar3.f60686a;
                float f6 = f5 / f3;
                pointF2.x = f6;
                pointF2.y = f6;
                PointF pointF3 = bVar3.f60687b;
                pointF3.x = 0.0f;
                pointF3.y = (f2 - (f6 * f4)) / 2.0f;
            } else {
                aVar.f60681b = true;
                C21441c.C21443b bVar4 = aVar.f60685f;
                PointF pointF4 = bVar4.f60686a;
                float f7 = (f2 * 1.0f) / f4;
                pointF4.x = f7;
                pointF4.y = f7;
                PointF pointF5 = bVar4.f60687b;
                pointF5.x = (f - (f7 * f3)) / 2.0f;
                pointF5.y = 0.0f;
            }
            C21441c.C21443b bVar5 = aVar.f60685f;
            Log.m105925i("MicroMsg.BaseOCRImageAnimator", "alvinluo onShowStart target scale: %s, translation: %s, isLongImage: %b", bVar5.f60686a, bVar5.f60687b, Boolean.valueOf(aVar.f60681b));
        }
    }
}
