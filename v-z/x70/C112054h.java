package x70;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitOperate", mo125469f = "CameraKitOperate.kt", mo125470l = {185}, mo125471m = "emitSwitchState")
/* renamed from: x70.h */
public final class C112054h extends C66704d {

    /* renamed from: d */
    public /* synthetic */ Object f335460d;

    /* renamed from: e */
    public final /* synthetic */ C112065s f335461e;

    /* renamed from: f */
    public int f335462f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112054h(C112065s sVar, C15601d<? super C112054h> dVar) {
        super(dVar);
        this.f335461e = sVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f335460d = obj;
        this.f335462f |= Integer.MIN_VALUE;
        return C112065s.m152791r(this.f335461e, this);
    }
}
