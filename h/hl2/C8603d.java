package hl2;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.scanner.image.AIScanImageCdnUploadUtil$saveBitmapToFile$2", mo125469f = "AIScanImageCdnUploadUtil.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: hl2.d */
public final class C8603d extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f27705d;

    /* renamed from: e */
    public final /* synthetic */ String f27706e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8603d(Bitmap bitmap, String str, C15601d<? super C8603d> dVar) {
        super(2, dVar);
        this.f27705d = bitmap;
        this.f27706e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8603d(this.f27705d, this.f27706e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8603d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        boolean z = false;
        try {
            z = BitmapUtil.saveBitmapToImage(this.f27705d, 100, Bitmap.CompressFormat.JPEG, this.f27706e, true);
        } catch (Throwable th) {
            Log.m105924i("MicroMsg.AIScanImageCdnUploadUtil", "save bitmap to image fail:" + th.getLocalizedMessage());
        }
        return Boolean.valueOf(z);
    }
}
