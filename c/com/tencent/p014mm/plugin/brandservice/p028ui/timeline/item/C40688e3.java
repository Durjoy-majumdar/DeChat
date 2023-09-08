package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import jc0.C21210b;
import kw0.C46746a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.e3 */
public final class C40688e3 extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C18225c3 f109304d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f109305e;

    /* renamed from: f */
    public final /* synthetic */ C21210b f109306f;

    /* renamed from: g */
    public final /* synthetic */ String f109307g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40688e3(C18225c3 c3Var, ImageView imageView, C21210b bVar, String str) {
        super(1);
        this.f109304d = c3Var;
        this.f109305e = imageView;
        this.f109306f = bVar;
        this.f109307g = str;
    }

    public Object invoke(Object obj) {
        float f;
        float f2;
        float f3;
        Bitmap bitmap = (Bitmap) obj;
        Log.m105924i("MicroMsg.BizTLRecFeedFinder", "setForegroundPic requestEffect effectBitmap:" + bitmap);
        if (bitmap != null) {
            C18225c3 c3Var = this.f109304d;
            ImageView imageView = this.f109305e;
            Bitmap bitmap2 = this.f109306f.f59988d;
            C87412m.m108593f(bitmap2, "imageData.bitmap");
            c3Var.getClass();
            C87412m.m108594g(imageView, "iv");
            Bitmap bitmap3 = null;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), bitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                C46746a aVar = C46746a.f125826a;
                Matrix matrix = new Matrix();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int width2 = imageView.getWidth();
                int height2 = imageView.getHeight();
                if (width * height2 > width2 * height) {
                    f = ((float) height2) / ((float) height);
                    f3 = (((float) width2) - (((float) width) * f)) * 0.5f;
                    f2 = 0.0f;
                } else {
                    float f4 = ((float) width2) / ((float) width);
                    f2 = (((float) height2) - (((float) height) * f4)) * 0.5f;
                    f = f4;
                    f3 = 0.0f;
                }
                matrix.setScale(f, f);
                matrix.postTranslate(f3, f2);
                Matrix e = aVar.mo71972e(imageView, bitmap2);
                canvas.drawBitmap(bitmap, matrix, (Paint) null);
                canvas.drawBitmap(bitmap2, e, (Paint) null);
                bitmap3 = createBitmap;
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.BizTLRecFeedFinder", "merge Two pics fail: " + e2.getMessage());
            }
            if (bitmap3 != null) {
                Log.m105924i("MicroMsg.BizTLRecFeedFinder", "setImageBitmap");
                C20828a.m22825b().mo32526o(this.f109307g, bitmap3);
                this.f109305e.setImageBitmap(bitmap3);
            }
        }
        return C13598b0.f38549a;
    }
}
