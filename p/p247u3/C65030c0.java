package p247u3;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import p247u3.C65145q1;
import p247u3.C65153r;
import rx3.C13598b0;
import rx3.C13603j;
import sx3.C110818d0;
import sx3.C64197v;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: u3.c0 */
public final class C65030c0<Key, Value> extends C65145q1<Key, Value> {

    /* renamed from: c */
    public int f187193c = Integer.MIN_VALUE;

    /* renamed from: d */
    public final C53896h0 f187194d;

    /* renamed from: e */
    public final C65153r<Key, Value> f187195e;

    /* renamed from: u3.c0$a */
    public static final /* synthetic */ class C65031a extends C24565l implements C32224a<C13598b0> {
        public C65031a(C65030c0 c0Var) {
            super(0, c0Var, C65030c0.class, "invalidate", "invalidate()V", 0);
        }

        public Object invoke() {
            ((C65030c0) this.receiver).mo89308c();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u3.c0$b */
    public static final class C65032b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65030c0 f187196d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65032b(C65030c0 c0Var) {
            super(0);
            this.f187196d = c0Var;
        }

        public Object invoke() {
            C65153r<Key, Value> rVar = this.f187196d.f187195e;
            C65052e0 e0Var = new C65052e0(new C65046d0(this.f187196d));
            rVar.getClass();
            rVar.f187567a.remove(e0Var);
            C65153r<Key, Value> rVar2 = this.f187196d.f187195e;
            if (rVar2.f187568b.compareAndSet(false, true)) {
                Iterator<C65153r.C65156c> it = rVar2.f187567a.iterator();
                while (it.hasNext()) {
                    it.next().mo89246b();
                }
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.paging.LegacyPagingSource$3", mo125469f = "LegacyPagingSource.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: u3.c0$c */
    public static final class C65033c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C65030c0 f187197d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65033c(C65030c0 c0Var, C15601d dVar) {
            super(2, dVar);
            this.f187197d = c0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            return new C65033c(this.f187197d, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65033c) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (!this.f187197d.f187555b.get() && this.f187197d.f187195e.f187568b.get()) {
                this.f187197d.mo89308c();
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.paging.LegacyPagingSource$load$2", mo125469f = "LegacyPagingSource.kt", mo125470l = {116}, mo125471m = "invokeSuspend")
    /* renamed from: u3.c0$d */
    public static final class C65034d extends C91594j implements C32227p<C0000n0, C15601d<? super C65145q1.C65150b.C65152b<Key, Value>>, Object> {

        /* renamed from: d */
        public int f187198d;

        /* renamed from: e */
        public final /* synthetic */ C65030c0 f187199e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0 f187200f;

        /* renamed from: g */
        public final /* synthetic */ C65145q1.C65146a f187201g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65034d(C65030c0 c0Var, C8479f0 f0Var, C65145q1.C65146a aVar, C15601d dVar) {
            super(2, dVar);
            this.f187199e = c0Var;
            this.f187200f = f0Var;
            this.f187201g = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C87412m.m108594g(dVar, "completion");
            return new C65034d(this.f187199e, this.f187200f, this.f187201g, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C65034d) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f187198d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f187198d = 1;
                obj = this.f187199e.f187195e.mo89317b((C65153r.C65158e) this.f187200f.f27484d, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C65153r.C65154a aVar2 = (C65153r.C65154a) obj;
            List<Value> list = aVar2.f187570a;
            return new C65145q1.C65150b.C65152b(list, (!list.isEmpty() || !(this.f187201g instanceof C65145q1.C65146a.C65148b)) ? aVar2.f187571b : null, (!aVar2.f187570a.isEmpty() || !(this.f187201g instanceof C65145q1.C65146a.C65147a)) ? aVar2.f187572c : null, aVar2.f187573d, aVar2.f187574e);
        }
    }

    public C65030c0(C53896h0 h0Var, C65153r<Key, Value> rVar) {
        C87412m.m108594g(h0Var, "fetchDispatcher");
        C87412m.m108594g(rVar, "dataSource");
        this.f187194d = h0Var;
        this.f187195e = rVar;
        rVar.f187567a.add(new C65052e0(new C65031a(this)));
        this.f187554a.add(new C65032b(this));
        C53895h.m60466d(C0001s1.f0d, h0Var, (C53934p0) null, new C65033c(this, (C15601d) null), 2, (Object) null);
    }

    /* renamed from: a */
    public boolean mo89232a() {
        return this.f187195e.f187569c == C65153r.C65157d.POSITIONAL;
    }

    /* renamed from: b */
    public Key mo72455b(C65164r1<Key, Value> r1Var) {
        int i;
        boolean z;
        Value value;
        C87412m.m108594g(r1Var, "state");
        int ordinal = this.f187195e.f187569c.ordinal();
        int i2 = 0;
        if (ordinal == 0) {
            Integer num = r1Var.f187591b;
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            int i3 = intValue - r1Var.f187593d;
            int i4 = 0;
            while (i4 < C64197v.m75536e(r1Var.f187590a) && i3 > C64197v.m75536e(r1Var.f187590a.get(i4).f187562a)) {
                i3 -= r1Var.f187590a.get(i4).f187562a.size();
                i4++;
            }
            C65145q1.C65150b.C65152b<Key, Value> a = r1Var.mo89319a(intValue);
            if (a == null || (i = a.f187563b) == null) {
                i = 0;
            }
            if (i != null) {
                return Integer.valueOf(((Integer) i).intValue() + i3);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } else if (ordinal == 1) {
            return null;
        } else {
            if (ordinal == 2) {
                Integer num2 = r1Var.f187591b;
                if (num2 == null) {
                    return null;
                }
                int intValue2 = num2.intValue();
                List<C65145q1.C65150b.C65152b<Key, Value>> list = r1Var.f187590a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((C65145q1.C65150b.C65152b) it.next()).f187562a.isEmpty()) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    value = null;
                } else {
                    int i5 = intValue2 - r1Var.f187593d;
                    while (i2 < C64197v.m75536e(r1Var.f187590a) && i5 > C64197v.m75536e(r1Var.f187590a.get(i2).f187562a)) {
                        i5 -= r1Var.f187590a.get(i2).f187562a.size();
                        i2++;
                    }
                    for (C65145q1.C65150b.C65152b bVar : r1Var.f187590a) {
                        if (!bVar.f187562a.isEmpty()) {
                            List<C65145q1.C65150b.C65152b<Key, Value>> list2 = r1Var.f187590a;
                            ListIterator<C65145q1.C65150b.C65152b<Key, Value>> listIterator = list2.listIterator(list2.size());
                            while (listIterator.hasPrevious()) {
                                C65145q1.C65150b.C65152b previous = listIterator.previous();
                                if (!previous.f187562a.isEmpty()) {
                                    value = i5 < 0 ? C110818d0.m150914L(bVar.f187562a) : (i2 != C64197v.m75536e(r1Var.f187590a) || i5 <= C64197v.m75536e(((C65145q1.C65150b.C65152b) C110818d0.m150923U(r1Var.f187590a)).f187562a)) ? r1Var.f187590a.get(i2).f187562a.get(i5) : C110818d0.m150923U(previous.f187562a);
                                }
                            }
                            throw new NoSuchElementException("List contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (value != null) {
                    return this.f187195e.mo89316a(value);
                }
                return null;
            }
            throw new C13603j();
        }
    }

    /* renamed from: d */
    public Object mo72456d(C65145q1.C65146a<Key> aVar, C15601d<? super C65145q1.C65150b<Key, Value>> dVar) {
        C65069i0 i0Var;
        int i;
        boolean z = aVar instanceof C65145q1.C65146a.C65149c;
        if (z) {
            i0Var = C65069i0.REFRESH;
        } else if (aVar instanceof C65145q1.C65146a.C65147a) {
            i0Var = C65069i0.APPEND;
        } else if (aVar instanceof C65145q1.C65146a.C65148b) {
            i0Var = C65069i0.PREPEND;
        } else {
            throw new C13603j();
        }
        C65069i0 i0Var2 = i0Var;
        if (this.f187193c == Integer.MIN_VALUE) {
            System.out.println("WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            if (z) {
                int i2 = aVar.f187556a;
                if (i2 % 3 == 0) {
                    i = i2 / 3;
                    this.f187193c = i;
                }
            }
            i = aVar.f187556a;
            this.f187193c = i;
        }
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = new C65153r.C65158e(i0Var2, aVar.mo89309a(), aVar.f187556a, aVar.f187557b, this.f187193c);
        return C53895h.m60469g(this.f187194d, new C65034d(this, f0Var, aVar, (C15601d) null), dVar);
    }

    /* renamed from: e */
    public final void mo89233e(int i) {
        int i2 = this.f187193c;
        if (i2 == Integer.MIN_VALUE || i == i2) {
            this.f187193c = i;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.f187193c + '.').toString());
    }
}
