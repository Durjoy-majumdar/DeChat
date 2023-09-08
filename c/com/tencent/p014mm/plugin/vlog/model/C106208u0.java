package com.tencent.p014mm.plugin.vlog.model;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C50601nw;

/* renamed from: com.tencent.mm.plugin.vlog.model.u0 */
public final class C106208u0 {

    /* renamed from: a */
    public C50601nw f316506a;

    /* renamed from: a */
    public final Bitmap mo152163a(Bitmap bitmap, C106204p pVar, int i, int i2) {
        if (!pVar.f316486d.contains(pVar.f316484b)) {
            Log.m105924i("MicroMsg.VLogGenerator", "cropBitmap: cropInfo is Error?");
        }
        float f = 1.0f;
        float width = (((float) bitmap.getWidth()) * 1.0f) / ((float) pVar.f316486d.width());
        float width2 = (((float) i) * 1.0f) / ((float) pVar.f316484b.width());
        float height = (((float) i2) * 1.0f) / ((float) pVar.f316484b.height());
        if (width2 < 1.0f || height < 1.0f) {
            f = Math.min(width2, height);
        }
        Rect rect = pVar.f316484b;
        int i3 = rect.left;
        Rect rect2 = pVar.f316486d;
        int i4 = (int) (((float) (i3 - rect2.left)) * width);
        int i5 = (int) (((float) (rect.top - rect2.top)) * width);
        int width3 = (int) (((float) rect.width()) * width);
        int height2 = (int) (((float) pVar.f316484b.height()) * width);
        Matrix matrix = new Matrix();
        float f2 = f / width;
        matrix.setScale(f2, f2);
        Log.m105924i("MicroMsg.VLogGenerator", "cropBitmap, left:" + i4 + ", top:" + i5 + ", width:" + width3 + ", height:" + height2 + ", scaleX:" + f2 + ", scaleY:" + f2 + ", bitmap size:[" + bitmap.getWidth() + ", " + bitmap.getHeight() + ']');
        if (i4 < 0 || i5 < 0 || i4 + width3 > bitmap.getWidth() || i5 + height2 > bitmap.getHeight()) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i4, i5, width3, height2, matrix, true);
        C87412m.m108593f(createBitmap, "createBitmap(origin, cro…eight, scaleMatrix, true)");
        return createBitmap;
    }
}
