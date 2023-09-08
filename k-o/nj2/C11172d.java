package nj2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import fy3.C32227p;
import kotlin.ResultKt;
import oj2.C62035b;
import rx3.C13598b0;
import rx3.C13604l;
import wj2.C53183e;
import wx3.C15601d;
import xx3.C15911a;
import yj2.C53529b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.PluginRingtone$Companion$getRingBackPlayInfo$2", mo125469f = "PluginRingtone.kt", mo125470l = {428}, mo125471m = "invokeSuspend")
/* renamed from: nj2.d */
public final class C11172d extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends C53183e, ? extends C62035b>>, Object> {

    /* renamed from: d */
    public int f32966d;

    /* renamed from: e */
    public final /* synthetic */ String f32967e;

    /* renamed from: f */
    public final /* synthetic */ boolean f32968f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11172d(String str, boolean z, C15601d<? super C11172d> dVar) {
        super(2, dVar);
        this.f32967e = str;
        this.f32968f = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11172d(this.f32967e, this.f32968f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11172d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f32966d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f32967e;
            boolean z = this.f32968f;
            this.f32966d = 1;
            obj = C53895h.m60469g(C53872d1.f151119c, new C53529b(str, z, (C15601d<? super C53529b>) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
