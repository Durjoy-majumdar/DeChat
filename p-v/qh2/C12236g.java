package qh2;

import a14.C0000n0;
import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout;
import fy3.C32227p;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$takePictureAndJump$2", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: qh2.g */
public final class C12236g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ ImproveCameraKitPluginLayout f35308d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12236g(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C12236g> dVar) {
        super(2, dVar);
        this.f35308d = improveCameraKitPluginLayout;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12236g(this.f35308d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12236g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        View cameraView = this.f35308d.getCameraView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(cameraView, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout$takePictureAndJump$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cameraView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(cameraView, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout$takePictureAndJump$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return C13598b0.f38549a;
    }
}
