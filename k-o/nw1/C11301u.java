package nw1;

import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.io.IOException;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: nw1.u */
public final class C11301u extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33242d;

    /* renamed from: e */
    public final /* synthetic */ IOException f33243e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11301u(ImageCropUI imageCropUI, IOException iOException) {
        super(0);
        this.f33242d = imageCropUI;
        this.f33243e = iOException;
    }

    public Object invoke() {
        Log.m105924i("ImageCropReport", "inc: 8");
        C115669n.INSTANCE.mo175913w(1361, (long) 8, 1);
        C89779i0 i0Var = this.f33242d.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        Log.printErrStackTrace("MicroMsg.AvatarCropUI", this.f33243e, "", null);
        this.f33242d.setResult(-2);
        this.f33242d.finish();
        return C13598b0.f38549a;
    }
}
