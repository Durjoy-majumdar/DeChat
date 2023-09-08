package nw1;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: nw1.n */
public final class C11294n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33232d;

    /* renamed from: e */
    public final /* synthetic */ WxMediaCropLayout f33233e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11294n(ImageCropUI imageCropUI, WxMediaCropLayout wxMediaCropLayout) {
        super(0);
        this.f33232d = imageCropUI;
        this.f33233e = wxMediaCropLayout;
    }

    public Object invoke() {
        ImageCropUI imageCropUI = this.f33232d;
        int i = ImageCropUI.f19098D;
        String L7 = imageCropUI.mo5348L7();
        C87412m.m108593f(L7, "imgPath");
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(L7);
        int[] iArr = null;
        if (imageOptions != null) {
            if (!(imageOptions.outWidth > 0 && imageOptions.outHeight > 0)) {
                imageOptions = null;
            }
            if (imageOptions != null) {
                iArr = new int[]{imageOptions.outWidth, imageOptions.outHeight};
            }
        }
        if (iArr == null) {
            Log.m105920e("MicroMsg.AvatarCropUI", "load matting img info error");
            Log.m105924i("ImageCropReport", "inc: 8");
            C115669n.INSTANCE.mo175913w(1361, (long) 8, 1);
            this.f33232d.setResult(-1);
            this.f33232d.finish();
        } else {
            ImageCropUI imageCropUI2 = this.f33232d;
            imageCropUI2.f19119x = iArr;
            imageCropUI2.f19117v = BackwardSupportUtil.ExifHelper.getExifOrientation(imageCropUI2.mo5348L7());
            C61926c.m72668M(new C11293m(this.f33233e, this.f33232d));
        }
        return C13598b0.f38549a;
    }
}
