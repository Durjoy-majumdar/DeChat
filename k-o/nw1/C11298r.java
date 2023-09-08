package nw1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LongBitmapHandler;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: nw1.r */
public final class C11298r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33239d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11298r(ImageCropUI imageCropUI) {
        super(0);
        this.f33239d = imageCropUI;
    }

    public Object invoke() {
        ImageCropUI imageCropUI = this.f33239d;
        int i = ImageCropUI.f19098D;
        imageCropUI.f19117v = BackwardSupportUtil.ExifHelper.getExifOrientation(imageCropUI.mo5348L7());
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(this.f33239d.mo5348L7());
        boolean z = false;
        boolean z2 = LongBitmapHandler.isLongHorizontal(imageOptions.outWidth, imageOptions.outHeight) && imageOptions.outWidth > 480;
        if (LongBitmapHandler.isLongVertical(imageOptions.outWidth, imageOptions.outHeight) && imageOptions.outHeight > 480) {
            z = true;
        }
        if (z2 || z) {
            C61926c.m72668M(new C11296p(this.f33239d));
        } else {
            ImageCropUI imageCropUI2 = this.f33239d;
            int i2 = imageCropUI2.f19117v;
            Bitmap extractThumbNail = BitmapUtil.extractThumbNail(imageCropUI2.mo5348L7(), 940, 940, true);
            Bitmap rotate = extractThumbNail != null ? BitmapUtil.rotate(extractThumbNail, (float) this.f33239d.f19117v) : null;
            if (rotate == null) {
                Log.m105924i("ImageCropReport", "inc: 8");
                C115669n.INSTANCE.mo175913w(1361, (long) 8, 1);
                this.f33239d.setResult(-1);
                this.f33239d.finish();
            } else {
                C61926c.m72668M(new C11297q(this.f33239d, rotate));
            }
        }
        return C13598b0.f38549a;
    }
}
