package qh2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import lh2.C109337b;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$observeCameraStatus$1$1$1", mo125469f = "CameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: qh2.b */
public final class C110397b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ CameraKitPluginLayout f330263d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110397b(CameraKitPluginLayout cameraKitPluginLayout, C15601d<? super C110397b> dVar) {
        super(2, dVar);
        this.f330263d = cameraKitPluginLayout;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C110397b(this.f330263d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C110397b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C109337b recordPlugin = this.f330263d.getRecordPlugin();
        Boolean valueOf = recordPlugin != null ? Boolean.valueOf(recordPlugin.mo160528c()) : null;
        Log.m105920e("MicroMsg.CameraKitPluginLayout", "CameraStatus trigger CameraGrab ,isRecording:" + valueOf);
        if (C87412m.m108589b(valueOf, Boolean.TRUE)) {
            Log.m105924i("MicroMsg.CameraKitPluginLayout", "CameraGrab and StopRecord");
            C109337b recordPlugin2 = this.f330263d.getRecordPlugin();
            if (recordPlugin2 != null) {
                recordPlugin2.mo160533i();
            }
        }
        return C13598b0.f38549a;
    }
}
