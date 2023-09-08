package nw1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: nw1.b0 */
public final class C11280b0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f33213d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f33214e;

    /* renamed from: f */
    public final /* synthetic */ C32227p<Integer, Integer, Object> f33215f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11280b0(String str, ImageView imageView, C32227p<? super Integer, ? super Integer, ? extends Object> pVar) {
        super(0);
        this.f33213d = str;
        this.f33214e = imageView;
        this.f33215f = pVar;
    }

    public Object invoke() {
        int i;
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(this.f33213d);
        int i2 = 1280;
        if (imageOptions != null) {
            int i3 = imageOptions.outWidth;
            int i4 = imageOptions.outHeight;
            double sqrt = Math.sqrt((double) (1638400 / (i3 * i4)));
            if (sqrt <= 1.0d) {
                i3 = (int) (((double) i3) * sqrt);
                i4 = (int) (sqrt * ((double) i4));
                if (i3 < 1280 && i4 < 1280) {
                    i4 = 1280;
                    int i5 = i2;
                    i2 = i4;
                    i = i5;
                }
            }
            i2 = i3;
            int i54 = i2;
            i2 = i4;
            i = i54;
        } else {
            i = 1280;
        }
        Bitmap createThumbBitmap = BitmapUtil.createThumbBitmap(this.f33213d, i2, i, true, false);
        if (createThumbBitmap == null) {
            Log.m105920e("WxMediaCropLayout", "source is null. file exit=" + C86013q1.m106450k(this.f33213d) + " mediaPath=" + this.f33213d + " targetHeight=" + i2 + " targetWidth=" + i);
        } else {
            C61926c.m72668M(new C11278a0(this.f33214e, createThumbBitmap, createThumbBitmap.getWidth(), createThumbBitmap.getHeight(), this.f33215f));
        }
        return C13598b0.f38549a;
    }
}
