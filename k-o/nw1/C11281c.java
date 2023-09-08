package nw1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import zp3.C79406f;

/* renamed from: nw1.c */
public final class C11281c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33216d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11281c(ImageCropUI imageCropUI) {
        super(0);
        this.f33216d = imageCropUI;
    }

    public Object invoke() {
        ImageCropUI imageCropUI = this.f33216d;
        int i = ImageCropUI.f19098D;
        Bitmap createBitmap = BitmapUtil.createBitmap(imageCropUI.mo5350N7().getWidth(), imageCropUI.mo5350N7().getHeight(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap = null;
        if (createBitmap == null) {
            Log.m105924i("ImageCropReport", "inc: 8");
            C115669n.INSTANCE.mo175913w(1361, (long) 8, 1);
            imageCropUI.setResult(-1);
            imageCropUI.finish();
        } else {
            Canvas canvas = new Canvas(createBitmap);
            imageCropUI.mo5350N7().draw(canvas);
            canvas.setBitmap((Bitmap) null);
            try {
                bitmap = BitmapUtil.cropBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight() - C79406f.m96347a(imageCropUI, 56.0f), true);
            } catch (Throwable unused) {
                Log.m105924i("ImageCropReport", "inc: 8");
                C115669n.INSTANCE.mo175913w(1361, (long) 8, 1);
                imageCropUI.setResult(-1);
                imageCropUI.finish();
            }
        }
        String stringExtra = this.f33216d.getIntent().getStringExtra("CropImage_bg_vertical");
        C87412m.m108591d(stringExtra);
        String stringExtra2 = this.f33216d.getIntent().getStringExtra("CropImage_bg_horizontal");
        C87412m.m108591d(stringExtra2);
        ImageCropUI imageCropUI2 = this.f33216d;
        C87412m.m108591d(bitmap);
        if (!imageCropUI2.mo5351O7(stringExtra, bitmap, false) || !this.f33216d.mo5351O7(stringExtra2, bitmap, true)) {
            Log.m105924i("ImageCropReport", "inc: 8");
            C115669n.INSTANCE.mo175913w(1361, (long) 8, 1);
            this.f33216d.setResult(-1);
            Log.m105920e("MicroMsg.AvatarCropUI", "background crop error");
        } else {
            Intent intent = new Intent();
            intent.putExtra("CropImage_bg_vertical", stringExtra);
            intent.putExtra("CropImage_bg_horizontal", stringExtra2);
            this.f33216d.setResult(-1, intent);
            Log.m105924i("ImageCropReport", "inc: 9");
            C115669n.INSTANCE.mo175913w(1361, (long) 9, 1);
            Log.m105924i("MicroMsg.AvatarCropUI", "finish background crop");
        }
        C61926c.m72668M(new C11279b(this.f33216d));
        return C13598b0.f38549a;
    }
}
