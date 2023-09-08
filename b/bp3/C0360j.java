package bp3;

import a14.C0000n0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.util.ImageQueryUtil$getBitmap$2", mo125469f = "ImageQueryUtil.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: bp3.j */
public final class C0360j extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f959d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0360j(String str, C15601d<? super C0360j> dVar) {
        super(2, dVar);
        this.f959d = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0360j(this.f959d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0360j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.ImageQueryUtil", "getBitmap >> " + this.f959d);
        return BitmapUtil.decodeFile(this.f959d, (BitmapFactory.Options) null);
    }
}
