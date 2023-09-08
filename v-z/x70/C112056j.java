package x70;

import a14.C0000n0;
import a80.C103327c;
import android.util.Range;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitOperate$getExpoData$2$1", mo125469f = "CameraKitOperate.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: x70.j */
public final class C112056j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C112065s f335466d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<C13604l<Range<Integer>, Integer>> f335467e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112056j(C112065s sVar, C15601d<? super C13604l<Range<Integer>, Integer>> dVar, C15601d<? super C112056j> dVar2) {
        super(2, dVar2);
        this.f335466d = sVar;
        this.f335467e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112056j(this.f335466d, this.f335467e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112056j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C13604l<Range<Integer>, Integer> lVar;
        ResultKt.throwOnFailure(obj);
        C103327c cVar = this.f335466d.f335420e;
        boolean z = true;
        if (cVar == null || !cVar.mo143105g()) {
            z = false;
        }
        if (!z) {
            Log.m105920e("MicroMsg.Camera.CameraKit", "camera is not previewing, ignore getExpoData");
            C15601d<C13604l<Range<Integer>, Integer>> dVar = this.f335467e;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(new C13604l(null, new Integer(0))));
            return C13598b0.f38549a;
        }
        Log.m105924i("MicroMsg.Camera.CameraKit", "getExpoData");
        C15601d<C13604l<Range<Integer>, Integer>> dVar2 = this.f335467e;
        C103327c cVar2 = this.f335466d.f335420e;
        if (cVar2 == null || (lVar = cVar2.mo143128t()) == null) {
            lVar = new C13604l<>(null, new Integer(0));
        }
        dVar2.resumeWith(Result.m168114constructorimpl(lVar));
        return C13598b0.f38549a;
    }
}
