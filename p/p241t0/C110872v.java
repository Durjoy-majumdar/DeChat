package p241t0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C59742g;
import gy3.C87412m;
import gy3.C87413o;
import hy3.C60233d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p241t0.C110851h0;
import p603m0.C109451j;
import p854l0.C109072c;
import rx3.C13598b0;

/* renamed from: t0.v */
public final class C110872v<T> implements List<T>, C110851h0, C60233d {

    /* renamed from: d */
    public C110856i0 f331660d = new C110873a(C109451j.f327609f);

    /* renamed from: t0.v$b */
    public static final class C77816b extends C87413o implements C32226l<List<T>, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ int f226692d;

        /* renamed from: e */
        public final /* synthetic */ Collection<T> f226693e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77816b(int i, Collection<? extends T> collection) {
            super(1);
            this.f226692d = i;
            this.f226693e = collection;
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, LocaleUtil.ITALIAN);
            return Boolean.valueOf(list.addAll(this.f226692d, this.f226693e));
        }
    }

    /* renamed from: t0.v$a */
    public static final class C110873a<T> extends C110856i0 {

        /* renamed from: c */
        public C109072c<? extends T> f331661c;

        /* renamed from: d */
        public int f331662d;

        public C110873a(C109072c<? extends T> cVar) {
            C87412m.m108594g(cVar, "list");
            this.f331661c = cVar;
        }

        /* renamed from: a */
        public void mo159361a(C110856i0 i0Var) {
            C87412m.m108594g(i0Var, "value");
            synchronized (C110875w.f331664a) {
                this.f331661c = ((C110873a) i0Var).f331661c;
                this.f331662d = ((C110873a) i0Var).f331662d;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }

        /* renamed from: b */
        public C110856i0 mo159362b() {
            return new C110873a(this.f331661c);
        }

        /* renamed from: c */
        public final void mo162569c(C109072c<? extends T> cVar) {
            C87412m.m108594g(cVar, "<set-?>");
            this.f331661c = cVar;
        }
    }

    /* renamed from: t0.v$c */
    public static final class C110874c extends C87413o implements C32226l<List<T>, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ Collection<T> f331663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110874c(Collection<? extends T> collection) {
            super(1);
            this.f331663d = collection;
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, LocaleUtil.ITALIAN);
            return Boolean.valueOf(list.retainAll(this.f331663d));
        }
    }

    public boolean add(T t) {
        int i;
        C109072c<? extends T> cVar;
        boolean z;
        C110849h i2;
        do {
            Object obj = C110875w.f331664a;
            synchronized (obj) {
                C110873a aVar = (C110873a) C110865n.m151145h((C110873a) this.f331660d, C110865n.m151146i());
                i = aVar.f331662d;
                cVar = aVar.f331661c;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(cVar);
            C109072c<? extends T> add = cVar.add(t);
            z = false;
            if (C87412m.m108589b(add, cVar)) {
                return false;
            }
            synchronized (obj) {
                C110873a aVar2 = (C110873a) this.f331660d;
                synchronized (C110865n.f331651c) {
                    i2 = C110865n.m151146i();
                    C110873a aVar3 = (C110873a) C110865n.m151158u(aVar2, this, i2);
                    if (aVar3.f331662d == i) {
                        aVar3.mo162569c(add);
                        aVar3.f331662d++;
                        z = true;
                    }
                }
                C110865n.m151150m(i2, this);
            }
        } while (!z);
        return true;
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        C87412m.m108594g(collection, "elements");
        return mo162559n(new C77816b(i, collection));
    }

    public void clear() {
        C110849h i;
        synchronized (C110875w.f331664a) {
            C110873a aVar = (C110873a) this.f331660d;
            synchronized (C110865n.f331651c) {
                i = C110865n.m151146i();
                C110873a aVar2 = (C110873a) C110865n.m151158u(aVar, this, i);
                aVar2.mo162569c(C109451j.f327609f);
                aVar2.f331662d++;
            }
            C110865n.m151150m(i, this);
        }
    }

    public boolean contains(Object obj) {
        return mo162555l().f331661c.contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        return mo162555l().f331661c.containsAll(collection);
    }

    /* renamed from: f */
    public C110856i0 mo159357f() {
        return this.f331660d;
    }

    public T get(int i) {
        return mo162555l().f331661c.get(i);
    }

    /* renamed from: i */
    public C110856i0 mo159358i(C110856i0 i0Var, C110856i0 i0Var2, C110856i0 i0Var3) {
        C110851h0.C110852a.m151097a(this, i0Var, i0Var2, i0Var3);
        return null;
    }

    public int indexOf(Object obj) {
        return mo162555l().f331661c.indexOf(obj);
    }

    public boolean isEmpty() {
        return mo162555l().f331661c.isEmpty();
    }

    public Iterator<T> iterator() {
        return listIterator();
    }

    /* renamed from: k */
    public final int mo162554k() {
        return ((C110873a) C110865n.m151145h((C110873a) this.f331660d, C110865n.m151146i())).f331662d;
    }

    /* renamed from: l */
    public final C110873a<T> mo162555l() {
        return (C110873a) C110865n.m151154q((C110873a) this.f331660d, this);
    }

    public int lastIndexOf(Object obj) {
        return mo162555l().f331661c.lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return new C110839b0(this, 0);
    }

    /* renamed from: m */
    public void mo159359m(C110856i0 i0Var) {
        C87412m.m108594g(i0Var, "value");
        i0Var.f331619b = this.f331660d;
        this.f331660d = (C110873a) i0Var;
    }

    /* renamed from: n */
    public final boolean mo162559n(C32226l<? super List<T>, Boolean> lVar) {
        int i;
        C109072c<? extends T> cVar;
        Boolean invoke;
        C110849h i2;
        boolean z;
        do {
            Object obj = C110875w.f331664a;
            synchronized (obj) {
                C110873a aVar = (C110873a) C110865n.m151145h((C110873a) this.f331660d, C110865n.m151146i());
                i = aVar.f331662d;
                cVar = aVar.f331661c;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(cVar);
            C109072c.C109073a<? extends T> d = cVar.mo160319d();
            invoke = lVar.invoke(d);
            C109072c<? extends T> build = d.build();
            if (C87412m.m108589b(build, cVar)) {
                break;
            }
            synchronized (obj) {
                C110873a aVar2 = (C110873a) this.f331660d;
                synchronized (C110865n.f331651c) {
                    i2 = C110865n.m151146i();
                    C110873a aVar3 = (C110873a) C110865n.m151158u(aVar2, this, i2);
                    z = true;
                    if (aVar3.f331662d == i) {
                        aVar3.mo162569c(build);
                        aVar3.f331662d++;
                    } else {
                        z = false;
                    }
                }
                C110865n.m151150m(i2, this);
            }
        } while (!z);
        return invoke.booleanValue();
    }

    public final T remove(int i) {
        int i2;
        C109072c<? extends T> cVar;
        C110849h i3;
        boolean z;
        T t = get(i);
        do {
            Object obj = C110875w.f331664a;
            synchronized (obj) {
                C110873a aVar = (C110873a) C110865n.m151145h((C110873a) this.f331660d, C110865n.m151146i());
                i2 = aVar.f331662d;
                cVar = aVar.f331661c;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(cVar);
            C109072c<? extends T> n0 = cVar.mo160320n0(i);
            if (C87412m.m108589b(n0, cVar)) {
                break;
            }
            synchronized (obj) {
                C110873a aVar2 = (C110873a) this.f331660d;
                synchronized (C110865n.f331651c) {
                    i3 = C110865n.m151146i();
                    C110873a aVar3 = (C110873a) C110865n.m151158u(aVar2, this, i3);
                    z = true;
                    if (aVar3.f331662d == i2) {
                        aVar3.mo162569c(n0);
                        aVar3.f331662d++;
                    } else {
                        z = false;
                    }
                }
                C110865n.m151150m(i3, this);
            }
        } while (!z);
        return t;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        int i;
        C109072c<? extends T> cVar;
        boolean z;
        C110849h i2;
        C87412m.m108594g(collection, "elements");
        do {
            Object obj = C110875w.f331664a;
            synchronized (obj) {
                C110873a aVar = (C110873a) C110865n.m151145h((C110873a) this.f331660d, C110865n.m151146i());
                i = aVar.f331662d;
                cVar = aVar.f331661c;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(cVar);
            C109072c<? extends T> removeAll = cVar.removeAll(collection);
            z = false;
            if (C87412m.m108589b(removeAll, cVar)) {
                return false;
            }
            synchronized (obj) {
                C110873a aVar2 = (C110873a) this.f331660d;
                synchronized (C110865n.f331651c) {
                    i2 = C110865n.m151146i();
                    C110873a aVar3 = (C110873a) C110865n.m151158u(aVar2, this, i2);
                    if (aVar3.f331662d == i) {
                        aVar3.mo162569c(removeAll);
                        aVar3.f331662d++;
                        z = true;
                    }
                }
                C110865n.m151150m(i2, this);
            }
        } while (!z);
        return true;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        return mo162559n(new C110874c(collection));
    }

    public T set(int i, T t) {
        int i2;
        C109072c<? extends T> cVar;
        C110849h i3;
        boolean z;
        T t2 = get(i);
        do {
            Object obj = C110875w.f331664a;
            synchronized (obj) {
                C110873a aVar = (C110873a) C110865n.m151145h((C110873a) this.f331660d, C110865n.m151146i());
                i2 = aVar.f331662d;
                cVar = aVar.f331661c;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(cVar);
            C109072c<? extends T> cVar2 = cVar.set(i, t);
            if (C87412m.m108589b(cVar2, cVar)) {
                break;
            }
            synchronized (obj) {
                C110873a aVar2 = (C110873a) this.f331660d;
                synchronized (C110865n.f331651c) {
                    i3 = C110865n.m151146i();
                    C110873a aVar3 = (C110873a) C110865n.m151158u(aVar2, this, i3);
                    z = true;
                    if (aVar3.f331662d == i2) {
                        aVar3.mo162569c(cVar2);
                        aVar3.f331662d++;
                    } else {
                        z = false;
                    }
                }
                C110865n.m151150m(i3, this);
            }
        } while (!z);
        return t2;
    }

    public final int size() {
        return mo162555l().f331661c.size();
    }

    public List<T> subList(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > size()) {
            z = false;
        }
        if (z) {
            return new C110858j0(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    public boolean addAll(Collection<? extends T> collection) {
        int i;
        C109072c<? extends T> cVar;
        boolean z;
        C110849h i2;
        C87412m.m108594g(collection, "elements");
        do {
            Object obj = C110875w.f331664a;
            synchronized (obj) {
                C110873a aVar = (C110873a) C110865n.m151145h((C110873a) this.f331660d, C110865n.m151146i());
                i = aVar.f331662d;
                cVar = aVar.f331661c;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(cVar);
            C109072c<? extends T> addAll = cVar.addAll(collection);
            z = false;
            if (C87412m.m108589b(addAll, cVar)) {
                return false;
            }
            synchronized (obj) {
                C110873a aVar2 = (C110873a) this.f331660d;
                synchronized (C110865n.f331651c) {
                    i2 = C110865n.m151146i();
                    C110873a aVar3 = (C110873a) C110865n.m151158u(aVar2, this, i2);
                    if (aVar3.f331662d == i) {
                        aVar3.mo162569c(addAll);
                        aVar3.f331662d++;
                        z = true;
                    }
                }
                C110865n.m151150m(i2, this);
            }
        } while (!z);
        return true;
    }

    public ListIterator<T> listIterator(int i) {
        return new C110839b0(this, i);
    }

    public void add(int i, T t) {
        int i2;
        C109072c<? extends T> cVar;
        C110849h i3;
        boolean z;
        do {
            Object obj = C110875w.f331664a;
            synchronized (obj) {
                C110873a aVar = (C110873a) C110865n.m151145h((C110873a) this.f331660d, C110865n.m151146i());
                i2 = aVar.f331662d;
                cVar = aVar.f331661c;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(cVar);
            C109072c<? extends T> add = cVar.add(i, t);
            if (!C87412m.m108589b(add, cVar)) {
                synchronized (obj) {
                    C110873a aVar2 = (C110873a) this.f331660d;
                    synchronized (C110865n.f331651c) {
                        i3 = C110865n.m151146i();
                        C110873a aVar3 = (C110873a) C110865n.m151158u(aVar2, this, i3);
                        z = true;
                        if (aVar3.f331662d == i2) {
                            aVar3.mo162569c(add);
                            aVar3.f331662d++;
                        } else {
                            z = false;
                        }
                    }
                    C110865n.m151150m(i3, this);
                }
            } else {
                return;
            }
        } while (!z);
    }

    public boolean remove(Object obj) {
        int i;
        C109072c<? extends T> cVar;
        boolean z;
        C110849h i2;
        do {
            Object obj2 = C110875w.f331664a;
            synchronized (obj2) {
                C110873a aVar = (C110873a) C110865n.m151145h((C110873a) this.f331660d, C110865n.m151146i());
                i = aVar.f331662d;
                cVar = aVar.f331661c;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(cVar);
            C109072c<? extends T> remove = cVar.remove(obj);
            z = false;
            if (C87412m.m108589b(remove, cVar)) {
                return false;
            }
            synchronized (obj2) {
                C110873a aVar2 = (C110873a) this.f331660d;
                synchronized (C110865n.f331651c) {
                    i2 = C110865n.m151146i();
                    C110873a aVar3 = (C110873a) C110865n.m151158u(aVar2, this, i2);
                    if (aVar3.f331662d == i) {
                        aVar3.mo162569c(remove);
                        aVar3.f331662d++;
                        z = true;
                    }
                }
                C110865n.m151150m(i2, this);
            }
        } while (!z);
        return true;
    }
}
