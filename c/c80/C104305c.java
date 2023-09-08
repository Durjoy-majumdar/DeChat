package c80;

import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl", mo125469f = "Camera2Impl.kt", mo125470l = {297}, mo125471m = "afterSessionFinishToPreview")
/* renamed from: c80.c */
public final class C104305c extends C66704d {

    /* renamed from: d */
    public Object f308723d;

    /* renamed from: e */
    public Object f308724e;

    /* renamed from: f */
    public /* synthetic */ Object f308725f;

    /* renamed from: g */
    public final /* synthetic */ C104306e f308726g;

    /* renamed from: h */
    public int f308727h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104305c(C104306e eVar, C15601d<? super C104305c> dVar) {
        super(dVar);
        this.f308726g = eVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f308725f = obj;
        this.f308727h |= Integer.MIN_VALUE;
        return C104306e.m139267I(this.f308726g, this);
    }
}
