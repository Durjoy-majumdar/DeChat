package com.tencent.p014mm.plugin.multitalk.model;

import a14.C0000n0;
import f82.C107494c;
import f82.C107496d;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C36570n;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.model.MultiTalkRenderLogic$sendVideo$1", mo125469f = "MultiTalkRenderLogic.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.multitalk.model.c0 */
public final class C105790c0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C105783b0 f314590d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f314591e;

    /* renamed from: f */
    public final /* synthetic */ int f314592f;

    /* renamed from: g */
    public final /* synthetic */ int f314593g;

    /* renamed from: h */
    public final /* synthetic */ int f314594h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105790c0(C105783b0 b0Var, byte[] bArr, int i, int i2, int i3, C15601d<? super C105790c0> dVar) {
        super(2, dVar);
        this.f314590d = b0Var;
        this.f314591e = bArr;
        this.f314592f = i;
        this.f314593g = i2;
        this.f314594h = i3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C105790c0(this.f314590d, this.f314591e, this.f314592f, this.f314593g, this.f314594h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C105790c0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C107496d dVar = this.f314590d.f314574b;
        if (dVar != null) {
            byte[] bArr = this.f314591e;
            int i = this.f314592f;
            int i2 = this.f314593g;
            int i3 = this.f314594h;
            C87412m.m108594g(bArr, "buffer");
            ((C107494c) ((C36570n) dVar.f321618e).getValue()).mo157920b(bArr, i, i2, i3);
        }
        return C13598b0.f38549a;
    }
}
