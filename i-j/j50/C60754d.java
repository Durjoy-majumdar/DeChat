package j50;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: j50.d */
public final class C60754d extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173067d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60754d(C60735a aVar) {
        super(1);
        this.f173067d = aVar;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2 = (Bitmap) obj;
        C60735a aVar = this.f173067d;
        aVar.getClass();
        if (bitmap2 == null) {
            Log.m105928w("MicroMsg.LiveCore", "genBlendBitmap null!");
        } else {
            int i = C75044y4.m89990b(MMApplicationContext.getContext()).x;
            int i2 = C75044y4.m89990b(MMApplicationContext.getContext()).y;
            if (aVar.f173012U == null) {
                aVar.f173012U = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            if (aVar.f173014V == null && (bitmap = aVar.f173012U) != null) {
                aVar.f173014V = new Canvas(bitmap);
            }
            if (aVar.f173016W == null) {
                aVar.f173016W = new Matrix();
            }
            Matrix matrix = aVar.f173016W;
            if (matrix != null) {
                Point point = aVar.f173003P;
                matrix.setTranslate(((float) (i - bitmap2.getWidth())) - ((float) point.x), (float) point.y);
            }
            Matrix matrix2 = aVar.f173016W;
            if (matrix2 != null) {
                Canvas canvas = aVar.f173014V;
                if (canvas != null) {
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Canvas canvas2 = aVar.f173014V;
                if (canvas2 != null) {
                    canvas2.drawBitmap(bitmap2, matrix2, new Paint());
                }
            }
        }
        return C13598b0.f38549a;
    }
}
