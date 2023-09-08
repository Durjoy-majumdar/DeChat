package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C0000n0;
import fy3.C32227p;
import hd0.C98429r0;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$repairVideoDuration$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.ui.chatting.gallery.j1 */
public final class C97077j1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C97136u0 f284784d;

    /* renamed from: e */
    public final /* synthetic */ int f284785e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97077j1(C97136u0 u0Var, int i, C15601d<? super C97077j1> dVar) {
        super(2, dVar);
        this.f284784d = u0Var;
        this.f284785e = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C97077j1(this.f284784d, this.f284785e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C97077j1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C98429r0.m127795A(this.f284784d.f285034r, this.f284785e);
        return C13598b0.f38549a;
    }
}
