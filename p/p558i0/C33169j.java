package p558i0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import p257w.C111626b;
import p257w.C37890a0;
import p257w.C37903i;
import p257w.C37905j1;
import p257w.C37907l;
import p257w.C37950z;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", mo125469f = "RippleAnimation.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: i0.j */
public final class C33169j extends C91594j implements C32227p<C0000n0, C15601d<? super C53973z1>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f90033d;

    /* renamed from: e */
    public final /* synthetic */ C108301h f90034e;

    @C91590f(mo125468c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", mo125469f = "RippleAnimation.kt", mo125470l = {112}, mo125471m = "invokeSuspend")
    /* renamed from: i0.j$a */
    public static final class C33170a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f90035d;

        /* renamed from: e */
        public final /* synthetic */ C108301h f90036e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33170a(C108301h hVar, C15601d<? super C33170a> dVar) {
            super(2, dVar);
            this.f90036e = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C33170a(this.f90036e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C33170a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f90035d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111626b<Float, C37907l> bVar = this.f90036e.f324285g;
                Float f = new Float(0.0f);
                C37950z zVar = C37890a0.f100293a;
                C37905j1 c = C37903i.m41595c(150, 0, C37890a0.C37891a.f100294a, 2, (Object) null);
                this.f90035d = 1;
                if (C111626b.m152137b(bVar, f, c, (Object) null, (C32226l) null, this, 12, (Object) null) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33169j(C108301h hVar, C15601d<? super C33169j> dVar) {
        super(2, dVar);
        this.f90034e = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C33169j jVar = new C33169j(this.f90034e, dVar);
        jVar.f90033d = obj;
        return jVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C33169j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        return C53895h.m60466d((C0000n0) this.f90033d, (C66212f) null, (C53934p0) null, new C33170a(this.f90034e, (C15601d<? super C33170a>) null), 3, (Object) null);
    }
}
