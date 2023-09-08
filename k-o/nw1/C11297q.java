package nw1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: nw1.q */
public final class C11297q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33237d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f33238e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11297q(ImageCropUI imageCropUI, Bitmap bitmap) {
        super(0);
        this.f33237d = imageCropUI;
        this.f33238e = bitmap;
    }

    public Object invoke() {
        ImageCropUI imageCropUI = this.f33237d;
        int i = ImageCropUI.f19098D;
        ImageView N7 = imageCropUI.mo5350N7();
        Bitmap bitmap = this.f33238e;
        ImageCropUI imageCropUI2 = this.f33237d;
        N7.setVisibility(0);
        N7.setScaleType(ImageView.ScaleType.FIT_CENTER);
        N7.setImageBitmap(bitmap);
        imageCropUI2.f19121z = true;
        C89779i0 i0Var = imageCropUI2.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        return C13598b0.f38549a;
    }
}
