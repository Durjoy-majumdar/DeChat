package j50;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: j50.b */
public final class C60752b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173060d;

    /* renamed from: e */
    public final /* synthetic */ int f173061e;

    /* renamed from: f */
    public final /* synthetic */ int f173062f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f173063g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60752b(C60735a aVar, int i, int i2, C32226l<? super Bitmap, C13598b0> lVar) {
        super(0);
        this.f173060d = aVar;
        this.f173061e = i;
        this.f173062f = i2;
        this.f173063g = lVar;
    }

    public Object invoke() {
        C110194c previewTexture = this.f173060d.f173031q.getPreviewTexture();
        if (previewTexture != null) {
            C60735a aVar = this.f173060d;
            int i = this.f173061e;
            int i2 = this.f173062f;
            C32226l<Bitmap, C13598b0> lVar = this.f173063g;
            if (aVar.f173019Z == null && aVar.f173030p0 == null) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                aVar.f173030p0 = createBitmap;
                if (createBitmap != null) {
                    aVar.f173019Z = new Canvas(createBitmap);
                }
            }
            int i3 = previewTexture.f329657j;
            float f = (float) i;
            float f2 = ((float) i3) / f;
            int i4 = previewTexture.f329658n;
            float f3 = (float) i2;
            float f4 = ((float) i4) / f3;
            if (f2 >= f4) {
                f2 = f4;
            }
            int i5 = (i3 - ((int) (f * f2))) / 2;
            int i6 = (i4 - ((int) (f3 * f2))) / 2;
            aVar.f173017X.set(i5, i6, i3 - i5, i4 - i6);
            aVar.f173018Y.set(0, 0, i, i2);
            Canvas canvas = aVar.f173019Z;
            if (canvas != null) {
                canvas.drawBitmap(C111742d.f334647a.mo163472r(previewTexture.f329652e, previewTexture.f329657j, previewTexture.f329658n), aVar.f173017X, aVar.f173018Y, (Paint) null);
            }
            lVar.invoke(aVar.f173030p0);
        }
        return C13598b0.f38549a;
    }
}
