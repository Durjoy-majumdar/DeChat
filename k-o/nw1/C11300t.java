package nw1;

import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: nw1.t */
public final class C11300t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33241d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11300t(ImageCropUI imageCropUI) {
        super(0);
        this.f33241d = imageCropUI;
    }

    public Object invoke() {
        Log.m105924i("ImageCropReport", "inc: 8");
        C115669n.INSTANCE.mo175913w(1361, (long) 8, 1);
        C89779i0 i0Var = this.f33241d.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f33241d.setResult(-2);
        this.f33241d.finish();
        return C13598b0.f38549a;
    }
}
