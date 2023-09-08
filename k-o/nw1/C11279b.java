package nw1;

import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: nw1.b */
public final class C11279b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33212d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11279b(ImageCropUI imageCropUI) {
        super(0);
        this.f33212d = imageCropUI;
    }

    public Object invoke() {
        C89779i0 i0Var = this.f33212d.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f33212d.finish();
        return C13598b0.f38549a;
    }
}
