package zj2;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gk2.C59528a;
import kotlin.ResultKt;
import p13.C62189a;
import q13.C62579a;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.service.RingtoneServiceHelper$doShakeOnly$1", mo125469f = "RingtoneServiceHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: zj2.c */
public final class C66858c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C66862f f192040d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66858c(C66862f fVar, C15601d<? super C66858c> dVar) {
        super(2, dVar);
        this.f192040d = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66858c(this.f192040d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66858c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        if (this.f192040d.f192064p != null) {
            Log.m105920e("MicroMsg.RingtoneServiceHelper", "old vibrate has not release");
            C62189a aVar = this.f192040d.f192064p;
            if (aVar != null) {
                aVar.mo87248c();
            }
            this.f192040d.f192064p = null;
        }
        this.f192040d.f192064p = new C62189a();
        Log.m105924i("MicroMsg.RingtoneServiceHelper", "init vibrate player in do shake only " + this.f192040d.f192064p);
        C66132f fVar = this.f192040d.f192050b;
        if (fVar != null) {
            C59528a i = fVar.mo90178i();
            C66862f fVar2 = this.f192040d;
            Log.m105924i("MicroMsg.RingtoneServiceHelper", "do shake only " + i);
            C62189a aVar2 = fVar2.f192064p;
            if (aVar2 != null) {
                aVar2.mo87246a(i, (C62579a) null);
            }
            C62189a aVar3 = fVar2.f192064p;
            if (aVar3 != null) {
                aVar3.mo87247b();
            }
            fVar2.f192046B = true;
        }
        return C13598b0.f38549a;
    }
}
