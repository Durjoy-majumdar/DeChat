package p261wl;

import android.app.Application;
import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import f40.C86709a0;
import fi3.C32058a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import p261wl.C38175j;

/* renamed from: wl.b */
public class C38166b {

    /* renamed from: a */
    public static final C38170c[] f100834a = {null};

    /* renamed from: b */
    public static C32058a f100835b;

    /* renamed from: c */
    public static Application f100836c;

    /* renamed from: wl.b$a */
    public static class C38167a<T extends C15510f> implements C15509d<T> {

        /* renamed from: d */
        public final C15509d<T> f100837d;

        /* renamed from: wl.b$a$a */
        public class C38168a implements Iterable<C38174i<T>> {
            public C38168a() {
            }

            public Iterator<C38174i<T>> iterator() {
                C38167a aVar = C38167a.this;
                return new C38169b(aVar, aVar.f100837d.all().iterator());
            }
        }

        /* renamed from: wl.b$a$b */
        public class C38169b implements Iterator<C38174i<T>> {

            /* renamed from: d */
            public final Iterator<C38174i<T>> f100839d;

            /* renamed from: e */
            public C38174i<T> f100840e = null;

            public C38169b(C38167a aVar, Iterator<C38174i<T>> it) {
                this.f100839d = it;
            }

            public boolean hasNext() {
                if (this.f100840e != null) {
                    return true;
                }
                while (this.f100839d.hasNext()) {
                    C38174i<T> next = this.f100839d.next();
                    if (C38166b.m41757d(C38166b.f100836c, next)) {
                        this.f100840e = next;
                        return true;
                    }
                }
                return false;
            }

            public Object next() {
                if (hasNext()) {
                    C38174i<T> iVar = this.f100840e;
                    this.f100840e = null;
                    return iVar;
                }
                throw new NoSuchElementException();
            }
        }

        public C38167a(C15509d<T> dVar) {
            this.f100837d = dVar;
        }

        public Iterable<C38174i<T>> all() {
            return new C38168a();
        }
    }

    /* renamed from: a */
    public static <T extends C15510f> boolean m41754a(Class<T> cls, Object obj, C38172g<T> gVar) {
        ArrayList arrayList = new ArrayList(16);
        C38167a aVar = (C38167a) m41759f(cls);
        C38167a.C38169b bVar = new C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (iVar.hasKey(obj) && m41757d(f100836c, iVar)) {
                arrayList.add(iVar);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException("More than one extension was registered on key '" + obj + "': " + arrayList);
        } else if (arrayList.size() == 1) {
            return gVar.invoke((C15510f) ((C38174i) arrayList.get(0)).get());
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static <T extends C15510f> boolean m41755b(Class<T> cls, C38172g<T> gVar) {
        C38167a aVar = (C38167a) m41759f(cls);
        C38167a.C38169b bVar = new C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (m41757d(f100836c, iVar) && gVar.invoke((C15510f) iVar.get())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static <T extends C15510f> boolean m41756c(Class<T> cls, Object obj, C38172g<T> gVar) {
        C38167a aVar = (C38167a) m41759f(cls);
        C38167a.C38169b bVar = new C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (iVar.hasKey(obj) && m41757d(f100836c, iVar) && gVar.invoke((C15510f) iVar.get())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static <T extends C15510f> boolean m41757d(Context context, C38174i<T> iVar) {
        if (!m41758e(context, iVar)) {
            return false;
        }
        Boolean bool = (Boolean) iVar.getQualifierAttribute("accountAware");
        if (bool != null && bool.booleanValue()) {
            if (!(f100835b != null && C86709a0.m107522a())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m41758e(Context context, C38174i<?> iVar) {
        Object qualifierAttribute = iVar.getQualifierAttribute("onProcess");
        if (qualifierAttribute == null) {
            return true;
        }
        if (qualifierAttribute instanceof C80625v0) {
            return ((C80625v0) qualifierAttribute).matches(context);
        }
        if (qualifierAttribute instanceof List) {
            List<C80625v0> list = (List) qualifierAttribute;
            if (list.isEmpty()) {
                return true;
            }
            for (C80625v0 matches : list) {
                if (matches.matches(context)) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException("Unexpected 'onProcess' value type '" + qualifierAttribute.getClass().getName() + "' of '" + iVar + "'");
    }

    /* renamed from: f */
    public static <T extends C15510f> C15509d<T> m41759f(Class<T> cls) {
        C38170c[] cVarArr = f100834a;
        if (cVarArr[0] == null) {
            synchronized (cVarArr) {
                if (cVarArr[0] == null) {
                    throw new IllegalStateException("Please call init(...) first.");
                }
            }
        }
        C38175j jVar = (C38175j) cVarArr[0];
        C15509d<T> dVar = (C15509d) ((ConcurrentHashMap) jVar.f100847d).get(cls);
        if (dVar == null) {
            dVar = C38165a.INSTANCE;
            C38175j.C38176a[] aVarArr = {C38175j.C38178b.INSTANCE};
            while (true) {
                C38175j.C38176a aVar = aVarArr[0];
                if (aVar == null) {
                    break;
                }
                dVar = aVar.mo61561a(cls, aVarArr);
            }
            ((ConcurrentHashMap) jVar.f100847d).put(cls, dVar);
        }
        return new C38167a(dVar);
    }

    /* renamed from: g */
    public static <T extends C15510f> C38174i<T> m41760g(Class<T> cls, Object obj) {
        C38167a aVar = (C38167a) m41759f(cls);
        C38167a.C38169b bVar = new C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        int i = 0;
        C38174i<T> iVar = null;
        while (bVar.hasNext()) {
            C38174i<T> iVar2 = (C38174i) bVar.next();
            if (iVar2.hasKey(obj)) {
                i++;
                if (iVar == null) {
                    iVar = iVar2;
                }
            }
        }
        if (i <= 1) {
            return iVar;
        }
        throw new IllegalStateException("More than one implementation of unique-expected extendable interface: " + cls.getName());
    }
}
