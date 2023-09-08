package zj2;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gk2.C59528a;
import kotlin.ResultKt;
import p13.C62189a;
import q13.C62579a;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.service.RingtoneServiceHelper$initPlayer$1$2$1", mo125469f = "RingtoneServiceHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: zj2.e */
public final class C66860e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C66862f f192042d;

    /* renamed from: e */
    public final /* synthetic */ C59528a f192043e;

    /* renamed from: zj2.e$a */
    public static final class C66861a implements C62579a {

        /* renamed from: a */
        public final /* synthetic */ C66862f f192044a;

        public C66861a(C66862f fVar) {
            this.f192044a = fVar;
        }

        public final int getCurrentPosition() {
            C66857b bVar = this.f192044a.f192051c;
            if (bVar != null) {
                return (int) bVar.mo36972b();
            }
            return 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66860e(C66862f fVar, C59528a aVar, C15601d<? super C66860e> dVar) {
        super(2, dVar);
        this.f192042d = fVar;
        this.f192043e = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66860e(this.f192042d, this.f192043e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66860e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.RingtoneServiceHelper", "do vibrate " + this.f192042d.f192050b);
        C66862f fVar = this.f192042d;
        C62189a aVar = fVar.f192064p;
        if (aVar != null) {
            aVar.mo87246a(this.f192043e, new C66861a(fVar));
        }
        C62189a aVar2 = this.f192042d.f192064p;
        if (aVar2 != null) {
            aVar2.mo87247b();
        }
        return C13598b0.f38549a;
    }
}
