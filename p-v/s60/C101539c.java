package s60;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import k60.C99102f;
import r60.C101350i;
import w60.C65941g;

/* renamed from: s60.c */
public class C101539c extends C101536b<Bitmap> {

    /* renamed from: d */
    public boolean f297276d;

    /* renamed from: e */
    public float f297277e;

    public C101539c(boolean z, float f) {
        this.f297276d = z;
        this.f297277e = f;
    }

    /* renamed from: a */
    public C65941g<? extends Bitmap> mo139547a(C101350i<?> iVar, C99102f<?, Bitmap> fVar, C65941g<Bitmap> gVar) {
        Bitmap bitmap = (Bitmap) gVar.f189590a;
        if (this.f297276d) {
            if (bitmap.getWidth() == bitmap.getHeight()) {
                bitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * this.f297277e);
            } else {
                int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                if (min <= 0) {
                    min = Math.max(bitmap.getWidth(), bitmap.getHeight());
                }
                bitmap = BitmapUtil.getRoundedCornerBitmap(BitmapUtil.getCenterCropBitmap(bitmap, min, min, true), false, ((float) min) * this.f297277e);
            }
        }
        return new C65941g<>(bitmap);
    }

    /* renamed from: b */
    public String mo139548b(String str) {
        return "_round_" + this.f297277e + "_";
    }
}
