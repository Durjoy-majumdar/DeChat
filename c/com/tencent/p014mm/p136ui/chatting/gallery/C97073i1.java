package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C0000n0;
import a14.C53965x0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$pauseVideo$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {335}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.ui.chatting.gallery.i1 */
public final class C97073i1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f284777d;

    /* renamed from: e */
    public final /* synthetic */ C97136u0 f284778e;

    /* renamed from: f */
    public final /* synthetic */ C97087m1 f284779f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97073i1(C97136u0 u0Var, C97087m1 m1Var, C15601d<? super C97073i1> dVar) {
        super(2, dVar);
        this.f284778e = u0Var;
        this.f284779f = m1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C97073i1(this.f284778e, this.f284779f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C97073i1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f284777d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f284777d = 1;
            if (C53965x0.m60607b(100, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C97136u0 u0Var = this.f284778e;
        C97087m1 m1Var = this.f284779f;
        boolean z = C97136u0.f285023E;
        u0Var.mo136046I(m1Var, true);
        return C13598b0.f38549a;
    }
}
