package com.tencent.p014mm.storage;

import a14.C0000n0;
import fy3.C32227p;
import i40.C60247c;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.storage.ImageQueryStorage$deleteMsgRoom$1", mo125469f = "ImageQueryStorage.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.storage.y3 */
public final class C57607y3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f164926d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57607y3(String str, C15601d<? super C57607y3> dVar) {
        super(2, dVar);
        this.f164926d = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C57607y3(this.f164926d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C57607y3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = C57604w3.class;
        ResultKt.throwOnFailure(obj);
        C60247c.C60248a aVar = C60247c.f171775g;
        ((C57603t1) ((C57604w3) aVar.mo85234a(cls)).mo85233d3(C57603t1.class)).mo81951c3(this.f164926d);
        ((C57598k2) ((C57604w3) aVar.mo85234a(cls)).mo85233d3(C57598k2.class)).mo81950c3(this.f164926d);
        ((C57596i4) ((C57604w3) aVar.mo85234a(cls)).mo85233d3(C57596i4.class)).mo81949c3(this.f164926d);
        return C13598b0.f38549a;
    }
}
