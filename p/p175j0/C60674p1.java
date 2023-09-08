package p175j0;

import a14.C0000n0;
import a14.C53873d2;
import a14.C53916l;
import a14.C53930o0;
import a14.C53973z1;
import d14.C58052j1;
import d14.C58087u0;
import e14.C58509v;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import p175j0.C60661k1;
import p241t0.C110849h;
import p241t0.C110865n;
import p241t0.C64198e;
import p241t0.C64199g;
import p854l0.C61178e;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", mo125469f = "Recomposer.kt", mo125470l = {744}, mo125471m = "invokeSuspend")
/* renamed from: j0.p1 */
public final class C60674p1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f172819d;

    /* renamed from: e */
    public int f172820e;

    /* renamed from: f */
    public /* synthetic */ Object f172821f;

    /* renamed from: g */
    public final /* synthetic */ C60661k1 f172822g;

    /* renamed from: h */
    public final /* synthetic */ C32228q<C0000n0, C60683t0, C15601d<? super C13598b0>, Object> f172823h;

    /* renamed from: i */
    public final /* synthetic */ C60683t0 f172824i;

    @C91590f(mo125468c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", mo125469f = "Recomposer.kt", mo125470l = {745}, mo125471m = "invokeSuspend")
    /* renamed from: j0.p1$a */
    public static final class C60675a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f172825d;

        /* renamed from: e */
        public /* synthetic */ Object f172826e;

        /* renamed from: f */
        public final /* synthetic */ C32228q<C0000n0, C60683t0, C15601d<? super C13598b0>, Object> f172827f;

        /* renamed from: g */
        public final /* synthetic */ C60683t0 f172828g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60675a(C32228q<? super C0000n0, ? super C60683t0, ? super C15601d<? super C13598b0>, ? extends Object> qVar, C60683t0 t0Var, C15601d<? super C60675a> dVar) {
            super(2, dVar);
            this.f172827f = qVar;
            this.f172828g = t0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C60675a aVar = new C60675a(this.f172827f, this.f172828g, dVar);
            aVar.f172826e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60675a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f172825d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C32228q<C0000n0, C60683t0, C15601d<? super C13598b0>, Object> qVar = this.f172827f;
                C60683t0 t0Var = this.f172828g;
                this.f172825d = 1;
                if (qVar.invoke((C0000n0) this.f172826e, t0Var, this) == aVar) {
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

    /* renamed from: j0.p1$b */
    public static final class C60676b extends C87413o implements C32227p<Set<? extends Object>, C110849h, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60661k1 f172829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60676b(C60661k1 k1Var) {
            super(2);
            this.f172829d = k1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            C53916l<C13598b0> lVar;
            Set set = (Set) obj;
            C87412m.m108594g(set, "changed");
            C87412m.m108594g((C110849h) obj2, "<anonymous parameter 1>");
            C60661k1 k1Var = this.f172829d;
            synchronized (k1Var.f172787d) {
                if (((C60661k1.C60664c) ((C58052j1) k1Var.f172798o).getValue()).compareTo(C60661k1.C60664c.Idle) >= 0) {
                    ((ArrayList) k1Var.f172791h).add(set);
                    lVar = k1Var.mo85597v();
                } else {
                    lVar = null;
                }
            }
            if (lVar != null) {
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60674p1(C60661k1 k1Var, C32228q<? super C0000n0, ? super C60683t0, ? super C15601d<? super C13598b0>, ? extends Object> qVar, C60683t0 t0Var, C15601d<? super C60674p1> dVar) {
        super(2, dVar);
        this.f172822g = k1Var;
        this.f172823h = qVar;
        this.f172824i = t0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C60674p1 p1Var = new C60674p1(this.f172822g, this.f172823h, this.f172824i, dVar);
        p1Var.f172821f = obj;
        return p1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60674p1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C53973z1 z1Var;
        C64198e eVar;
        C58052j1 j1Var;
        C61178e eVar2;
        Object remove;
        C58052j1 j1Var2;
        C61178e eVar3;
        Object remove2;
        C58052j1 j1Var3;
        C61178e eVar4;
        Object add;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f172820e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            z1Var = C53873d2.m60393e(((C0000n0) this.f172821f).getCoroutineContext());
            C60661k1 k1Var = this.f172822g;
            synchronized (k1Var.f172787d) {
                Throwable th = k1Var.f172789f;
                if (th != null) {
                    throw th;
                } else if (((C60661k1.C60664c) ((C58052j1) k1Var.f172798o).getValue()).compareTo(C60661k1.C60664c.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down".toString());
                } else if (k1Var.f172788e == null) {
                    k1Var.f172788e = z1Var;
                    k1Var.mo85597v();
                } else {
                    throw new IllegalStateException("Recomposer already running".toString());
                }
            }
            C60676b bVar = new C60676b(this.f172822g);
            C110865n.m151143f(C110865n.f331649a);
            synchronized (C110865n.f331651c) {
                ((ArrayList) C110865n.f331655g).add(bVar);
            }
            C64199g gVar = new C64199g(bVar);
            C58087u0<C61178e<C60661k1.C60663b>> u0Var = C60661k1.f172783q;
            C60661k1.C60663b bVar2 = this.f172822g.f172799p;
            do {
                j1Var3 = (C58052j1) C60661k1.f172783q;
                eVar4 = (C61178e) j1Var3.getValue();
                add = eVar4.add(bVar2);
                if (eVar4 == add) {
                    break;
                } else if (add == null) {
                    add = C58509v.f167541a;
                }
                break;
                break;
            } while (!j1Var3.mo82835j(eVar4, add));
            try {
                break;
                C60661k1 k1Var2 = this.f172822g;
                synchronized (k1Var2.f172787d) {
                    ArrayList arrayList = (ArrayList) k1Var2.f172790g;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C60689y) arrayList.get(i2)).mo51664h();
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                C60675a aVar2 = new C60675a(this.f172823h, this.f172824i, (C15601d<? super C60675a>) null);
                this.f172821f = z1Var;
                this.f172819d = gVar;
                this.f172820e = 1;
                if (C53930o0.m60559f(aVar2, this) == aVar) {
                    return aVar;
                }
                eVar = gVar;
            } catch (Throwable th4) {
                th = th4;
                eVar = gVar;
                eVar.dispose();
                C60661k1 k1Var3 = this.f172822g;
                synchronized (k1Var3.f172787d) {
                    if (k1Var3.f172788e == z1Var) {
                        k1Var3.f172788e = null;
                    }
                    k1Var3.mo85597v();
                }
                C58087u0<C61178e<C60661k1.C60663b>> u0Var2 = C60661k1.f172783q;
                C60661k1.C60663b bVar3 = this.f172822g.f172799p;
                do {
                    j1Var = (C58052j1) C60661k1.f172783q;
                    eVar2 = (C61178e) j1Var.getValue();
                    remove = eVar2.remove(bVar3);
                    if (eVar2 == remove) {
                        break;
                    } else if (remove == null) {
                        remove = C58509v.f167541a;
                    }
                } while (!j1Var.mo82835j(eVar2, remove));
                throw th;
            }
        } else if (i == 1) {
            eVar = (C64198e) this.f172819d;
            z1Var = (C53973z1) this.f172821f;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eVar.dispose();
        C60661k1 k1Var4 = this.f172822g;
        synchronized (k1Var4.f172787d) {
            if (k1Var4.f172788e == z1Var) {
                k1Var4.f172788e = null;
            }
            k1Var4.mo85597v();
        }
        C58087u0<C61178e<C60661k1.C60663b>> u0Var3 = C60661k1.f172783q;
        C60661k1.C60663b bVar4 = this.f172822g.f172799p;
        do {
            j1Var2 = (C58052j1) C60661k1.f172783q;
            eVar3 = (C61178e) j1Var2.getValue();
            remove2 = eVar3.remove(bVar4);
            if (eVar3 == remove2) {
                break;
            } else if (remove2 == null) {
                remove2 = C58509v.f167541a;
            }
        } while (!j1Var2.mo82835j(eVar3, remove2));
        return C13598b0.f38549a;
    }
}
