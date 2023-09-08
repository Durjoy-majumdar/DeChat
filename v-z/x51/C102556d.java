package x51;

import com.tencent.p014mm.storage.C96984r2;
import di3.C86312j;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p441aq.C92054g;
import te3.C101824o80;

/* renamed from: x51.d */
public class C102556d implements Cloneable, Iterable<C102562g> {

    /* renamed from: d */
    public ArrayList<C102562g> f301972d;

    /* renamed from: e */
    public HashMap<String, C96984r2> f301973e;

    /* renamed from: f */
    public HashMap<String, C96984r2> f301974f;

    /* renamed from: g */
    public boolean f301975g;

    /* renamed from: x51.d$b */
    public class C102558b implements Iterator<C102562g> {

        /* renamed from: d */
        public int f301976d = 0;

        public C102558b(C102557a aVar) {
        }

        public boolean hasNext() {
            int i = this.f301976d;
            ArrayList<C102562g> arrayList = C102556d.this.f301972d;
            return i < (arrayList == null ? 0 : arrayList.size());
        }

        public Object next() {
            ArrayList<C102562g> arrayList;
            C102556d dVar = C102556d.this;
            int i = this.f301976d;
            this.f301976d = i + 1;
            ArrayList<C102562g> arrayList2 = dVar.f301972d;
            if (arrayList2 == null || arrayList2.size() <= i || i < 0 || (arrayList = dVar.f301972d) == null) {
                return null;
            }
            return arrayList.get(i);
        }

        public void remove() {
        }
    }

    public C102556d() {
        this.f301973e = new HashMap<>();
        this.f301974f = new HashMap<>();
        this.f301975g = C75592q0.m90796z();
    }

    /* renamed from: f */
    public void mo142180f() {
        Class cls = C92054g.class;
        if (this.f301972d != null && ((C92054g) C86312j.m106911c(cls)).zx0().f268264b != null) {
            Iterator<C102562g> it = this.f301972d.iterator();
            while (it.hasNext()) {
                C102562g next = it.next();
                C101824o80 o802 = next.f301983b;
                if (o802 != null) {
                    int b = ((C92054g) C86312j.m106911c(cls)).zx0().mo127628b(o802.f298994d);
                    if (b >= 0) {
                        next.mo142189b(6);
                        next.f301986e = b;
                    }
                    if (b < 0 && next.f301987f == 6) {
                        next.mo142189b(3);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public C102556d clone() {
        C102556d dVar = null;
        try {
            C102556d dVar2 = (C102556d) super.clone();
            try {
                ArrayList<C102562g> arrayList = this.f301972d;
                if (arrayList == null) {
                    return dVar2;
                }
                dVar2.f301972d = (ArrayList) arrayList.clone();
                return dVar2;
            } catch (CloneNotSupportedException unused) {
                dVar = dVar2;
                return dVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return dVar;
        }
    }

    public Iterator<C102562g> iterator() {
        return new C102558b((C102557a) null);
    }

    /* renamed from: k */
    public C96984r2 mo142183k(String str) {
        C96984r2 r2Var = this.f301973e.get(str);
        if (r2Var != null) {
            return r2Var;
        }
        C96984r2 r2Var2 = new C96984r2(str);
        this.f301973e.put(str, r2Var2);
        return r2Var2;
    }

    /* renamed from: l */
    public C102562g mo142184l(String str) {
        String str2;
        ArrayList<C102562g> arrayList = this.f301972d;
        if (arrayList == null) {
            return null;
        }
        Iterator<C102562g> it = arrayList.iterator();
        while (it.hasNext()) {
            C102562g next = it.next();
            C101824o80 o802 = next.f301983b;
            if (o802 != null && (str2 = o802.f298994d) != null && str2.equals(str)) {
                return next;
            }
        }
        return null;
    }

    public C102556d(List<C102562g> list) {
        this();
        if (list != null) {
            ArrayList<C102562g> arrayList = new ArrayList<>();
            this.f301972d = arrayList;
            arrayList.addAll(list);
        }
    }
}
