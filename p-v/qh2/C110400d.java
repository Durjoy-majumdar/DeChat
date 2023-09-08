package qh2;

import com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout", mo125469f = "CameraKitPluginLayout.kt", mo125470l = {270}, mo125471m = "takePictureAndJump")
/* renamed from: qh2.d */
public final class C110400d extends C66704d {

    /* renamed from: d */
    public Object f330267d;

    /* renamed from: e */
    public Object f330268e;

    /* renamed from: f */
    public /* synthetic */ Object f330269f;

    /* renamed from: g */
    public final /* synthetic */ CameraKitPluginLayout f330270g;

    /* renamed from: h */
    public int f330271h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110400d(CameraKitPluginLayout cameraKitPluginLayout, C15601d<? super C110400d> dVar) {
        super(dVar);
        this.f330270g = cameraKitPluginLayout;
    }

    public final Object invokeSuspend(Object obj) {
        this.f330269f = obj;
        this.f330271h |= Integer.MIN_VALUE;
        return CameraKitPluginLayout.m142487q(this.f330270g, this);
    }
}
