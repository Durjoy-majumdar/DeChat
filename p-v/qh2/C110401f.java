package qh2;

import com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {431, 433}, mo125471m = "takePictureAndJump")
/* renamed from: qh2.f */
public final class C110401f extends C66704d {

    /* renamed from: d */
    public Object f330272d;

    /* renamed from: e */
    public Object f330273e;

    /* renamed from: f */
    public /* synthetic */ Object f330274f;

    /* renamed from: g */
    public final /* synthetic */ ImproveCameraKitPluginLayout f330275g;

    /* renamed from: h */
    public int f330276h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110401f(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C110401f> dVar) {
        super(dVar);
        this.f330275g = improveCameraKitPluginLayout;
    }

    public final Object invokeSuspend(Object obj) {
        this.f330274f = obj;
        this.f330276h |= Integer.MIN_VALUE;
        return ImproveCameraKitPluginLayout.m142507z(this.f330275g, this);
    }
}
