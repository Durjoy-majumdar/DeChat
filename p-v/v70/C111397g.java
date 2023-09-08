package v70;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import g80.C107768c;
import kotlin.ResultKt;
import p80.C110194c;
import rx3.C13598b0;
import w80.C111742d;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$getCurrentFrame$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.g */
public final class C111397g extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C111389d f333511d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111397g(C111389d dVar, C15601d<? super C111397g> dVar2) {
        super(2, dVar2);
        this.f333511d = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111397g(this.f333511d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111397g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C107768c cVar = this.f333511d.f333483n;
        cVar.getClass();
        try {
            C111742d.C111743a aVar = C111742d.f334647a;
            C110194c cVar2 = cVar.f322543n;
            if (cVar2 == null) {
                return null;
            }
            return aVar.mo163472r(cVar2.f329652e, cVar2.f329657j, cVar2.f329658n);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Camera.CameraRenderPipeline", e, "getCurrentFrame error", new Object[0]);
            return null;
        }
    }
}
