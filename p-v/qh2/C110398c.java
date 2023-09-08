package qh2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.os.Bundle;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout;
import d14.C45253g;
import d14.C58050i1;
import f14.C58901s;
import fy3.C32227p;
import i80.C108399b;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C13604l;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$observeCameraStatus$1", mo125469f = "CameraKitPluginLayout.kt", mo125470l = {94}, mo125471m = "invokeSuspend")
/* renamed from: qh2.c */
public final class C110398c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f330264d;

    /* renamed from: e */
    public final /* synthetic */ CameraKitPluginLayout f330265e;

    /* renamed from: qh2.c$a */
    public static final class C110399a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ CameraKitPluginLayout f330266d;

        public C110399a(CameraKitPluginLayout cameraKitPluginLayout) {
            this.f330266d = cameraKitPluginLayout;
        }

        public Object emit(Object obj, C15601d dVar) {
            C13604l lVar = (C13604l) obj;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int ordinal = ((C108399b) lVar.f38555d).ordinal();
            if (ordinal == 1) {
                C53896h0 h0Var = C53872d1.f151117a;
                Object g = C53895h.m60469g(C58901s.f168555a, new C110397b(this.f330266d, (C15601d<? super C110397b>) null), dVar);
                return g == aVar ? g : C13598b0.f38549a;
            } else if (ordinal != 2) {
                return C13598b0.f38549a;
            } else {
                Bundle bundle = (Bundle) lVar.f38556e;
                Object r = this.f330266d.mo151234r(bundle != null ? bundle.getBoolean("camera_boolean") : false, dVar);
                return r == aVar ? r : C13598b0.f38549a;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110398c(CameraKitPluginLayout cameraKitPluginLayout, C15601d<? super C110398c> dVar) {
        super(2, dVar);
        this.f330265e = cameraKitPluginLayout;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110398c(this.f330265e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C110398c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f330264d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58050i1<C13604l<C108399b, Bundle>> cameraState = this.f330265e.getCameraUsage().getCameraState();
            C110399a aVar2 = new C110399a(this.f330265e);
            this.f330264d = 1;
            if (cameraState.mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
