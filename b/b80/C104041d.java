package b80;

import a14.C0000n0;
import android.os.Bundle;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraKitMethodReportStruct;
import d14.C58087u0;
import fy3.C32227p;
import i80.C108399b;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl$checkListenerCreated$1$callback$1", mo125469f = "Camera1Impl.kt", mo125470l = {73, 77}, mo125471m = "invokeSuspend")
/* renamed from: b80.d */
public final class C104041d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f307696d;

    /* renamed from: e */
    public final /* synthetic */ C104043f f307697e;

    /* renamed from: f */
    public final /* synthetic */ String f307698f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104041d(C104043f fVar, String str, C15601d<? super C104041d> dVar) {
        super(2, dVar);
        this.f307697e = fVar;
        this.f307698f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C104041d(this.f307697e, this.f307698f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C104041d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f307696d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C104043f fVar = this.f307697e;
            this.f307696d = 1;
            if (fVar.mo143111p(this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C104043f fVar2 = this.f307697e;
        fVar2.getClass();
        CameraKitMethodReportStruct cameraKitMethodReportStruct = new CameraKitMethodReportStruct();
        cameraKitMethodReportStruct.f310057i = cameraKitMethodReportStruct.mo86045b("SessionId", String.valueOf(fVar2.f304625d), true);
        cameraKitMethodReportStruct.f310052d = cameraKitMethodReportStruct.mo86045b("MethodName", "GrabStopPreview", true);
        cameraKitMethodReportStruct.mo86054n();
        Bundle bundle = new Bundle();
        bundle.putString("camera_string", this.f307698f);
        C58087u0<C13604l<C108399b, Bundle>> u0Var = this.f307697e.f307701q;
        C13604l lVar = new C13604l(C108399b.CameraGrab, bundle);
        this.f307696d = 2;
        if (u0Var.emit(lVar, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
