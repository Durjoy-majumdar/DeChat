package q90;

import java.util.Set;
import p823sg.C101611g;
import p823sg.C101614i;

/* renamed from: q90.d */
public abstract class C101062d<T, V, X, Y> implements C101611g<T, V> {

    /* renamed from: a */
    public C101060a f295871a;

    /* renamed from: b */
    public C101611g<T, X> f295872b;

    /* renamed from: c */
    public C62585c<T, Y> f295873c;

    /* renamed from: d */
    public int f295874d;

    /* renamed from: e */
    public C101611g.C101612b<T, V> f295875e;

    /* renamed from: q90.d$a */
    public class C101063a implements C101611g.C101612b<T, X> {
        public C101063a() {
        }

        public void preRemoveCallback(T t, X x, X x2) {
            C101062d dVar = C101062d.this;
            C101611g.C101612b<T, V> bVar = dVar.f295875e;
            if (bVar != null) {
                bVar.preRemoveCallback(t, dVar.mo139565j(x), C101062d.this.mo139565j(x2));
            }
        }
    }

    /* renamed from: q90.d$b */
    public class C101064b implements C101611g.C48378a<T, X> {
        public C101064b(C101062d dVar, C101611g.C48378a aVar) {
        }
    }

    public C101062d(int i) {
        this.f295872b = null;
        this.f295873c = null;
        this.f295875e = null;
        this.f295874d = i;
        mo139561g();
    }

    /* renamed from: a */
    public void mo122812a(C101611g.C48378a<T, V> aVar) {
        this.f295872b.mo122812a(new C101064b(this, aVar));
    }

    /* renamed from: b */
    public V mo139556b(T t) {
        V j = mo139565j(this.f295872b.mo139556b(t));
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            C101069i iVar = (C101069i) cVar;
            Object b = iVar.mo140123b(mo139558d(), t);
            C101061b bVar = (C101061b) iVar.f295881a.get(b);
            C101061b bVar2 = (C101061b) ((C101614i) iVar.f295882b).mo139556b(b);
        }
        return j;
    }

    /* renamed from: c */
    public void mo139557c(T t, V v) {
        this.f295872b.mo139557c(t, mo139563h(t, v));
        if (this.f295873c != null) {
            Object d = mo139558d();
            C62585c<T, Y> cVar = this.f295873c;
            Object i = mo139564i(t, v);
            C101069i iVar = (C101069i) cVar;
            iVar.getClass();
            C101061b bVar = (C101061b) i;
            C101060a aVar = C101060a.f295868c;
            Object b = iVar.mo140123b(d, t);
            iVar.f295881a.mo139557c(b, bVar);
            ((C101614i) iVar.f295882b).mo139557c(b, bVar);
        }
    }

    public boolean check(T t) {
        boolean check = this.f295872b.check(t);
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            C101069i iVar = (C101069i) cVar;
            Object b = iVar.mo140123b(mo139558d(), t);
            if (!iVar.f295881a.check(b)) {
                iVar.f295882b.check(b);
            }
        }
        return check;
    }

    public boolean checkAndUpTime(T t) {
        boolean checkAndUpTime = this.f295872b.checkAndUpTime(t);
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            C101069i iVar = (C101069i) cVar;
            Object b = iVar.mo140123b(mo139558d(), t);
            iVar.f295881a.checkAndUpTime(b);
            iVar.f295882b.checkAndUpTime(b);
        }
        return checkAndUpTime;
    }

    public void clear() {
        this.f295872b.clear();
    }

    public int createCount() {
        int createCount = this.f295872b.createCount();
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            ((C101069i) cVar).f295881a.createCount();
        }
        return createCount;
    }

    /* renamed from: d */
    public abstract T mo139558d();

    /* renamed from: e */
    public C101611g<T, X> mo139559e() {
        return new C101614i(this.f295874d, new C101063a());
    }

    public int evictionCount() {
        int evictionCount = this.f295872b.evictionCount();
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            ((C101069i) cVar).f295881a.evictionCount();
        }
        return evictionCount;
    }

    /* renamed from: f */
    public C62585c<T, Y> mo139560f(C101060a aVar) {
        return null;
    }

    /* renamed from: g */
    public void mo139561g() {
        this.f295872b = mo139559e();
        this.f295873c = mo139560f(this.f295871a);
    }

    public V get(T t) {
        V j = mo139565j(this.f295872b.get(t));
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            C101069i iVar = (C101069i) cVar;
            Object b = iVar.mo140123b(mo139558d(), t);
            if (((C101061b) iVar.f295881a.get(b)) == null) {
                C101061b bVar = (C101061b) iVar.f295882b.get(b);
            }
        }
        return j;
    }

    /* renamed from: h */
    public abstract X mo139563h(T t, V v);

    public int hitCount() {
        int hitCount = this.f295872b.hitCount();
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            ((C101069i) cVar).f295881a.hitCount();
        }
        return hitCount;
    }

    /* renamed from: i */
    public abstract Y mo139564i(T t, V v);

    /* renamed from: j */
    public abstract V mo139565j(X x);

    public Set<T> keySet() {
        return this.f295872b.keySet();
    }

    public int maxSize() {
        int maxSize = this.f295872b.maxSize();
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            ((C101069i) cVar).f295881a.maxSize();
        }
        return maxSize;
    }

    public int missCount() {
        int missCount = this.f295872b.missCount();
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            ((C101069i) cVar).f295881a.missCount();
        }
        return missCount;
    }

    public V put(T t, V v) {
        V j = mo139565j(this.f295872b.put(t, mo139563h(t, v)));
        if (this.f295873c != null) {
            Object d = mo139558d();
            C62585c<T, Y> cVar = this.f295873c;
            Object i = mo139564i(t, v);
            C101069i iVar = (C101069i) cVar;
            iVar.getClass();
            C101061b bVar = (C101061b) i;
            C101060a aVar = C101060a.f295868c;
            Object b = iVar.mo140123b(d, t);
            if (((C101061b) iVar.f295881a.put(b, bVar)) == null && iVar.f295882b.check(b)) {
                C101061b bVar2 = (C101061b) iVar.f295882b.put(b, bVar);
            }
        }
        return j;
    }

    public int putCount() {
        int putCount = this.f295872b.putCount();
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            ((C101069i) cVar).f295881a.putCount();
        }
        return putCount;
    }

    public V remove(T t) {
        V j = mo139565j(this.f295872b.remove(t));
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            C101069i iVar = (C101069i) cVar;
            Object b = iVar.mo140123b(mo139558d(), t);
            C101061b bVar = (C101061b) iVar.f295881a.remove(b);
            C101061b bVar2 = (C101061b) iVar.f295882b.remove(b);
        }
        return j;
    }

    public int size() {
        int size = this.f295872b.size();
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            ((C101069i) cVar).f295881a.size();
        }
        return size;
    }

    public int sizeOf(T t, V v) {
        return this.f295872b.sizeOf(t, mo139563h(t, v));
    }

    public void trimToSize(int i) {
        this.f295872b.trimToSize(i);
    }

    public C101062d(int i, C101611g.C101612b<T, V> bVar) {
        this.f295872b = null;
        this.f295873c = null;
        this.f295875e = bVar;
        this.f295874d = i;
        mo139561g();
    }

    public C101062d(int i, C101611g.C101612b<T, V> bVar, C101060a aVar) {
        this.f295872b = null;
        this.f295873c = null;
        this.f295875e = bVar;
        this.f295874d = i;
        this.f295871a = aVar;
        mo139561g();
    }
}
