package px0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: px0.b */
public final class C22037b extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f62367d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f62368e;

    /* renamed from: f */
    public final /* synthetic */ Canvas f62369f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f62370g;

    /* renamed from: h */
    public final /* synthetic */ Bitmap f62371h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22037b(ImageView imageView, Bitmap bitmap, Canvas canvas, C32226l<? super Bitmap, C13598b0> lVar, Bitmap bitmap2) {
        super(1);
        this.f62367d = imageView;
        this.f62368e = bitmap;
        this.f62369f = canvas;
        this.f62370g = lVar;
        this.f62371h = bitmap2;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        EffectManager effectManager = C22038c.f62372a;
        Log.m105924i("MicroMsg.NativeFinderDrawCardManager", "setForegroundPic requestEffect effectBitmap:" + bitmap);
        C22058r rVar = C22058r.f62430a;
        Paint b = rVar.mo35166b();
        int b2 = C76577a.m92151b(this.f62367d.getContext(), 113) - (this.f62368e.getHeight() / 2);
        if (bitmap != null) {
            this.f62369f.drawBitmap(bitmap, rVar.mo35165a(bitmap), (Paint) null);
        }
        Canvas canvas = this.f62369f;
        Bitmap bitmap2 = this.f62368e;
        C87412m.m108594g(bitmap2, "fgBitmap");
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight());
        RectF rectF2 = new RectF();
        float f = (float) C22055p.f62409o;
        float f2 = (float) C22055p.f62410p;
        rectF2.set(0.0f, 0.0f, f, f2);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
        matrix.postTranslate(0.0f, (float) b2);
        canvas.drawBitmap(bitmap2, matrix, (Paint) null);
        this.f62369f.drawRect(0.0f, 0.0f, f, f2, b);
        C32226l<Bitmap, C13598b0> lVar = this.f62370g;
        Bitmap bitmap3 = this.f62371h;
        C87412m.m108593f(bitmap3, "syntheticBm");
        lVar.invoke(bitmap3);
        return C13598b0.f38549a;
    }
}
