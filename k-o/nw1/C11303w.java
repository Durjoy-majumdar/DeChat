package nw1;

import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: nw1.w */
public final class C11303w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageCropUI f33247d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f33248e;

    /* renamed from: f */
    public final /* synthetic */ Intent f33249f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11303w(ImageCropUI imageCropUI, C8479f0<String> f0Var, Intent intent) {
        super(0);
        this.f33247d = imageCropUI;
        this.f33248e = f0Var;
        this.f33249f = intent;
    }

    public Object invoke() {
        ImageCropUI imageCropUI = this.f33247d;
        if (!imageCropUI.f19118w) {
            try {
                String mD5String = MD5Util.getMD5String(String.valueOf(System.currentTimeMillis()));
                Bitmap bitmap = this.f33247d.f19120y;
                if (bitmap == null) {
                    Log.m105920e("MicroMsg.AvatarCropUI", "emojiBmp is null");
                    C61926c.m72668M(new C11299s(this.f33247d));
                } else {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width > 640 || height > 640) {
                        if (width > height) {
                            height = (int) (((float) (height * 640)) / ((float) width));
                            width = 640;
                        } else {
                            width = (int) (((float) (width * 640)) / ((float) height));
                            height = 640;
                        }
                    }
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                    if (createScaledBitmap == null) {
                        Log.m105920e("MicroMsg.AvatarCropUI", "commpressedImg is null");
                        C61926c.m72668M(new C11300t(this.f33247d));
                    } else {
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                        BitmapUtil.saveBitmapToImage(createScaledBitmap, 100, compressFormat, this.f33247d.mo5349M7() + mD5String, false);
                        Log.m105924i("MicroMsg.AvatarCropUI", "save bitmap to image successful");
                        byte[] O = C86013q1.m106433O(this.f33247d.mo5349M7() + mD5String, 0, -1);
                        C8479f0<String> f0Var = this.f33248e;
                        T mD5String2 = MD5Util.getMD5String(O);
                        C87412m.m108593f(mD5String2, "getMD5String(fileData)");
                        f0Var.f27484d = mD5String2;
                        if (!C86013q1.m106450k(this.f33247d.mo5349M7() + ((String) this.f33248e.f27484d))) {
                            C86013q1.m106435Q(this.f33247d.mo5349M7(), mD5String, (String) this.f33248e.f27484d);
                        } else {
                            C86013q1.m106447h(this.f33247d.mo5349M7() + mD5String);
                        }
                        this.f33249f.putExtra("emoji_type", 0);
                    }
                }
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.AvatarCropUI", e, "", null);
                C61926c.m72668M(new C11301u(this.f33247d, e));
            }
            return C13598b0.f38549a;
        }
        byte[] O2 = C86013q1.m106433O(imageCropUI.mo5348L7(), 0, -1);
        C8479f0<String> f0Var2 = this.f33248e;
        T mD5String3 = MD5Util.getMD5String(O2);
        C87412m.m108593f(mD5String3, "getMD5String(fileData)");
        f0Var2.f27484d = mD5String3;
        if (!C86013q1.m106450k(this.f33247d.mo5349M7() + ((String) this.f33248e.f27484d))) {
            C86013q1.m106438T(this.f33247d.mo5349M7() + ((String) this.f33248e.f27484d), O2, 0, O2.length);
        } else {
            Log.m105924i("MicroMsg.AvatarCropUI", "file is exist. do not need to copy!");
        }
        this.f33249f.putExtra("emoji_type", 1);
        C61926c.m72668M(new C11302v(this.f33247d, this.f33249f, this.f33248e));
        return C13598b0.f38549a;
    }
}
