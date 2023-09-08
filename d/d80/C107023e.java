package d80;

import androidx.camera.core.CameraSelector;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl", mo125469f = "CameraXImpl.kt", mo125470l = {240}, mo125471m = "fillExtReportData")
/* renamed from: d80.e */
public final class C107023e extends C66704d {

    /* renamed from: d */
    public Object f320406d;

    /* renamed from: e */
    public Object f320407e;

    /* renamed from: f */
    public Object f320408f;

    /* renamed from: g */
    public /* synthetic */ Object f320409g;

    /* renamed from: h */
    public final /* synthetic */ C107007b f320410h;

    /* renamed from: i */
    public int f320411i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107023e(C107007b bVar, C15601d<? super C107023e> dVar) {
        super(dVar);
        this.f320410h = bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f320409g = obj;
        this.f320411i |= Integer.MIN_VALUE;
        return C107007b.m144815I(this.f320410h, (CameraSelector) null, this);
    }
}
