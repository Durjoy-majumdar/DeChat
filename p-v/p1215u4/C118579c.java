package p1215u4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p1014o4.C117693m;
import p1214t4.C118382a;
import p1214t4.C118384c;
import p1214t4.C118385d;
import p1218v4.C118655d;
import p1221x4.C118847o;

/* renamed from: u4.c */
public abstract class C118579c<T> implements C118382a<T> {

    /* renamed from: a */
    public final List<String> f354872a = new ArrayList();

    /* renamed from: b */
    public T f354873b;

    /* renamed from: c */
    public C118655d<T> f354874c;

    /* renamed from: d */
    public C118580a f354875d;

    /* renamed from: u4.c$a */
    public interface C118580a {
    }

    public C118579c(C118655d<T> dVar) {
        this.f354874c = dVar;
    }

    /* renamed from: a */
    public void mo183170a(T t) {
        this.f354873b = t;
        mo183335e(this.f354875d, t);
    }

    /* renamed from: b */
    public abstract boolean mo183332b(C118847o oVar);

    /* renamed from: c */
    public abstract boolean mo183333c(T t);

    /* renamed from: d */
    public void mo183334d(Iterable<C118847o> iterable) {
        ((ArrayList) this.f354872a).clear();
        for (C118847o next : iterable) {
            if (mo183332b(next)) {
                ((ArrayList) this.f354872a).add(next.f355541a);
            }
        }
        if (((ArrayList) this.f354872a).isEmpty()) {
            C118655d<T> dVar = this.f354874c;
            synchronized (dVar.f355049c) {
                if (dVar.f355050d.remove(this) && dVar.f355050d.isEmpty()) {
                    dVar.mo183378d();
                }
            }
        } else {
            C118655d<T> dVar2 = this.f354874c;
            synchronized (dVar2.f355049c) {
                if (dVar2.f355050d.add(this)) {
                    if (dVar2.f355050d.size() == 1) {
                        dVar2.f355051e = dVar2.mo183374a();
                        C117693m.m165966c().mo182389a(C118655d.f355046f, String.format("%s: initial state = %s", new Object[]{dVar2.getClass().getSimpleName(), dVar2.f355051e}), new Throwable[0]);
                        dVar2.mo183377c();
                    }
                    mo183170a(dVar2.f355051e);
                }
            }
        }
        mo183335e(this.f354875d, this.f354873b);
    }

    /* renamed from: e */
    public final void mo183335e(C118580a aVar, T t) {
        if (!((ArrayList) this.f354872a).isEmpty() && aVar != null) {
            if (t == null || mo183333c(t)) {
                List<String> list = this.f354872a;
                C118385d dVar = (C118385d) aVar;
                synchronized (dVar.f353795c) {
                    C118384c cVar = dVar.f353793a;
                    if (cVar != null) {
                        cVar.mo165549d(list);
                    }
                }
                return;
            }
            List<String> list2 = this.f354872a;
            C118385d dVar2 = (C118385d) aVar;
            synchronized (dVar2.f353795c) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) list2).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (dVar2.mo183174a(str)) {
                        C117693m.m165966c().mo182389a(C118385d.f353792d, String.format("Constraints met for %s", new Object[]{str}), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                C118384c cVar2 = dVar2.f353793a;
                if (cVar2 != null) {
                    cVar2.mo165550f(arrayList);
                }
            }
        }
    }
}
