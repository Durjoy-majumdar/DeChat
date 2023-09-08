package h03;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.thumbplayer.effect.player.MultiMediaImagePlayer$tryGetImageFromLocalCache$2", mo125469f = "MultiMediaImagePlayer.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: h03.h */
public final class C98297h extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C107994g f288130d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98297h(C107994g gVar, C15601d<? super C98297h> dVar) {
        super(2, dVar);
        this.f288130d = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C98297h(this.f288130d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C98297h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        if (C86013q1.m106450k(this.f288130d.f323410n)) {
            C107994g gVar = this.f288130d;
            gVar.f323414r = BitmapUtil.decodeFileWithSample(gVar.f323410n);
            String str = this.f288130d.f323407k;
            StringBuilder sb = new StringBuilder();
            sb.append("loadImageBitmap file already exist: ");
            sb.append(this.f288130d.f323414r);
            sb.append(", size:[");
            Bitmap bitmap = this.f288130d.f323414r;
            Integer num = null;
            sb.append(bitmap != null ? new Integer(bitmap.getWidth()) : null);
            sb.append(", ");
            Bitmap bitmap2 = this.f288130d.f323414r;
            if (bitmap2 != null) {
                num = new Integer(bitmap2.getHeight());
            }
            sb.append(num);
            sb.append("], path:");
            sb.append(this.f288130d.f323410n);
            Log.m105924i(str, sb.toString());
            if (this.f288130d.f323414r != null) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
