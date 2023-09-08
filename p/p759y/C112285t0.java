package p759y;

import fy3.C32227p;
import java.util.List;
import kotlin.ResultKt;
import p175j0.C60667k2;
import p190l1.C109085c;
import p190l1.C109106l;
import p190l1.C109111s;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91593i;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", mo125469f = "Scrollable.kt", mo125470l = {230}, mo125471m = "invokeSuspend")
/* renamed from: y.t0 */
public final class C112285t0 extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f336225d;

    /* renamed from: e */
    public /* synthetic */ Object f336226e;

    /* renamed from: f */
    public final /* synthetic */ C112266n0 f336227f;

    /* renamed from: g */
    public final /* synthetic */ C60667k2<C112196b1> f336228g;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", mo125469f = "Scrollable.kt", mo125470l = {231}, mo125471m = "invokeSuspend")
    /* renamed from: y.t0$a */
    public static final class C112286a extends C91593i implements C32227p<C109085c, C15601d<? super C13598b0>, Object> {

        /* renamed from: e */
        public int f336229e;

        /* renamed from: f */
        public /* synthetic */ Object f336230f;

        /* renamed from: g */
        public final /* synthetic */ C112266n0 f336231g;

        /* renamed from: h */
        public final /* synthetic */ C60667k2<C112196b1> f336232h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112286a(C112266n0 n0Var, C60667k2<C112196b1> k2Var, C15601d<? super C112286a> dVar) {
            super(2, dVar);
            this.f336231g = n0Var;
            this.f336232h = k2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112286a aVar = new C112286a(this.f336231g, this.f336232h, dVar);
            aVar.f336230f = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112286a) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C109085c cVar;
            boolean z;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f336229e;
            boolean z2 = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109085c cVar2 = (C109085c) this.f336230f;
                this.f336230f = cVar2;
                this.f336229e = 1;
                Object a = C112280r0.m153171a(cVar2, this);
                if (a == aVar) {
                    return aVar;
                }
                cVar = cVar2;
                obj = a;
            } else if (i == 1) {
                cVar = (C109085c) this.f336230f;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C109106l lVar = (C109106l) obj;
            List<C109111s> list = lVar.f326709a;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = true;
                    break;
                } else if (!(!list.get(i2).mo160355b())) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                C112266n0 n0Var = this.f336231g;
                C60667k2<C112196b1> k2Var = this.f336232h;
                long a2 = n0Var.mo163998a(cVar, lVar, cVar.mo160332b());
                C112196b1 value = k2Var.getValue();
                float d = value.mo164022d(a2);
                if (value.f335911b) {
                    d *= (float) -1;
                }
                if (value.f335913d.mo90553b(d) != 0.0f) {
                    z2 = false;
                }
                if (!z2) {
                    List<C109111s> list2 = lVar.f326709a;
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        list2.get(i3).mo160354a();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112285t0(C112266n0 n0Var, C60667k2<C112196b1> k2Var, C15601d<? super C112285t0> dVar) {
        super(2, dVar);
        this.f336227f = n0Var;
        this.f336228g = k2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C112285t0 t0Var = new C112285t0(this.f336227f, this.f336228g, dVar);
        t0Var.f336226e = obj;
        return t0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112285t0) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C109119z zVar;
        C112286a aVar;
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f336225d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zVar = (C109119z) this.f336226e;
        } else if (i == 1) {
            zVar = (C109119z) this.f336226e;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            aVar = new C112286a(this.f336227f, this.f336228g, (C15601d<? super C112286a>) null);
            this.f336226e = zVar;
            this.f336225d = 1;
        } while (zVar.mo160337A(aVar, this) != aVar2);
        return aVar2;
    }
}
