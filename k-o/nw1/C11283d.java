package nw1;

import android.content.Intent;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p143ds.C7510m;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: nw1.d */
public final class C11283d extends C87413o implements C32227p<Boolean, C7510m.C7513c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33218d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11283d(ImageCropUI imageCropUI) {
        super(2);
        this.f33218d = imageCropUI;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C7510m.C7513c cVar = (C7510m.C7513c) obj2;
        C87412m.m108594g(cVar, "result");
        C89779i0 i0Var = this.f33218d.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (booleanValue) {
            Log.m105924i("ImageCropReport", "inc: 9");
            C115669n.INSTANCE.mo175913w(1361, (long) 9, 1);
            Intent intent = new Intent();
            intent.putExtra("CropImage_OutputPath", cVar.f25774b);
            this.f33218d.setResult(-1, intent);
            Log.m105924i("MicroMsg.AvatarCropUI", "finish avatar/cover crop");
            this.f33218d.finish();
        } else {
            Log.m105924i("ImageCropReport", "inc: 8");
            C115669n.INSTANCE.mo175913w(1361, (long) 8, 1);
            this.f33218d.setResult(-1);
            Log.m105920e("MicroMsg.AvatarCropUI", "avatar/cover crop error");
            this.f33218d.finish();
        }
        return C13598b0.f38549a;
    }
}
