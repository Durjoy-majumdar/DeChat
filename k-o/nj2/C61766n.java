package nj2;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import oj2.C62035b;
import rx3.C13598b0;
import wj2.C66132f;
import wj2.C66135h;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.RingBackHelper$getRingBackSettingMediaDesc$2", mo125469f = "RingBackHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: nj2.n */
public final class C61766n extends C91594j implements C32227p<C0000n0, C15601d<? super C66132f>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C62035b f175574d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61766n(C62035b bVar, C15601d<? super C61766n> dVar) {
        super(2, dVar);
        this.f175574d = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61766n(this.f175574d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61766n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C66132f fVar = this.f175574d.f176356a;
        return fVar == null ? C66135h.f190107E.mo90187b() : fVar;
    }
}
