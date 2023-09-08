package nw1;

import android.content.Intent;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: nw1.v */
public final class C11302v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33244d;

    /* renamed from: e */
    public final /* synthetic */ Intent f33245e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<String> f33246f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11302v(ImageCropUI imageCropUI, Intent intent, C8479f0<String> f0Var) {
        super(0);
        this.f33244d = imageCropUI;
        this.f33245e = intent;
        this.f33246f = f0Var;
    }

    public Object invoke() {
        C89779i0 i0Var = this.f33244d.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        Intent intent = this.f33245e;
        intent.putExtra("CropImage_OutputPath", this.f33244d.mo5349M7() + ((String) this.f33246f.f27484d));
        this.f33244d.setResult(-1, this.f33245e);
        Log.m105924i("MicroMsg.AvatarCropUI", "finish emoji crop");
        this.f33244d.finish();
        return C13598b0.f38549a;
    }
}
