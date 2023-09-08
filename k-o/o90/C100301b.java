package o90;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p206nj.C11171e;
import p823sg.C101611g;
import p823sg.C101614i;
import p90.C100686a;
import p90.C100687b;
import q90.C101060a;
import q90.C101061b;
import q90.C101069i;
import q90.C62585c;

/* renamed from: o90.b */
public final class C100301b<V> extends C100300a<String, V, V, C100686a> {

    /* renamed from: j */
    public static ConcurrentHashMap<Class<?>, C100306e> f293824j;

    /* renamed from: f */
    public String f293825f;

    /* renamed from: g */
    public C101611g<String, Object> f293826g;

    /* renamed from: h */
    public C101611g.C101612b<String, C100686a> f293827h;

    /* renamed from: i */
    public C101611g.C101613c<String, C100686a> f293828i;

    /* renamed from: o90.b$a */
    public class C100302a implements C100306e<Bitmap> {
        /* renamed from: a */
        public int mo131148a(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null || bitmap.isRecycled()) {
                return 0;
            }
            return C11171e.m11044a(19) ? bitmap.getByteCount() : bitmap.getAllocationByteCount();
        }
    }

    /* renamed from: o90.b$b */
    public class C100303b implements C100306e<WeakReference<Bitmap>> {
        /* renamed from: a */
        public int mo131148a(Object obj) {
            Bitmap bitmap;
            WeakReference weakReference = (WeakReference) obj;
            if (weakReference == null || (bitmap = (Bitmap) weakReference.get()) == null || bitmap.isRecycled()) {
                return 0;
            }
            return C11171e.m11044a(19) ? bitmap.getByteCount() : bitmap.getAllocationByteCount();
        }
    }

    /* renamed from: o90.b$c */
    public class C100304c implements C101611g.C101612b<String, C100686a> {
        public C100304c() {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C100686a aVar = (C100686a) obj2;
            C100686a aVar2 = (C100686a) obj3;
            if (aVar != null && aVar2 != null && aVar.equals(aVar2)) {
                C101060a aVar3 = C101060a.f295868c;
            } else if (aVar2 == null || aVar == null || !aVar2.f294998a.equals(aVar.f294998a)) {
                C101060a aVar4 = C101060a.f295868c;
                String str2 = aVar.f294998a;
                if (str2 != null) {
                    C100301b.this.f295872b.remove(str2);
                }
            } else {
                C101060a aVar5 = C101060a.f295868c;
            }
        }
    }

    /* renamed from: o90.b$d */
    public class C100305d implements C101611g.C101613c<String, C100686a> {
        public C100305d(C100301b bVar) {
        }

        /* renamed from: a */
        public int mo139576a(Object obj, Object obj2) {
            String str = (String) obj;
            C100686a aVar = (C100686a) obj2;
            if (aVar != null) {
                return aVar.f295002e;
            }
            return 524288;
        }
    }

    /* renamed from: o90.b$e */
    public interface C100306e<T> {
        /* renamed from: a */
        int mo131148a(T t);
    }

    static {
        ConcurrentHashMap<Class<?>, C100306e> concurrentHashMap = new ConcurrentHashMap<>();
        f293824j = concurrentHashMap;
        concurrentHashMap.put(Bitmap.class, new C100302a());
        C100303b bVar = new C100303b();
        f293824j.put(WeakReference.class, bVar);
    }

    public C100301b(int i, C101611g.C101612b<String, V> bVar, Class<?> cls) {
        this(i, bVar, C101060a.f295868c, cls);
        mo139568m(cls);
    }

    /* renamed from: b */
    public Object mo139556b(Object obj) {
        C101611g gVar;
        String str = (String) obj;
        X b = this.f295872b.mo139556b(str);
        if (b == null && (gVar = this.f293826g) != null) {
            b = gVar.get(str);
        }
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            C101069i iVar = (C101069i) cVar;
            Object b2 = iVar.mo140123b(this.f293825f, str);
            C101061b bVar = (C101061b) iVar.f295881a.get(b2);
            C101061b bVar2 = (C101061b) ((C101614i) iVar.f295882b).mo139556b(b2);
            if (bVar == null) {
                bVar = bVar2;
            }
            C100686a aVar = (C100686a) bVar;
        }
        C101060a aVar2 = C101060a.f295868c;
        return b;
    }

    /* renamed from: c */
    public void mo139557c(Object obj, Object obj2) {
        C101611g<String, Object> gVar;
        String str = (String) obj;
        if (!mo139566k(obj2) || (gVar = this.f293826g) == null) {
            super.mo139557c(str, obj2);
        } else {
            gVar.put(str, obj2);
        }
    }

    /* renamed from: d */
    public Object mo139558d() {
        return this.f293825f;
    }

    /* renamed from: e */
    public C101611g mo139559e() {
        return new C101614i(this.f295874d, new C100307c(this));
    }

    /* renamed from: f */
    public C62585c<String, C100686a> mo139560f(C101060a aVar) {
        return C100687b.m131710a(aVar);
    }

    /* renamed from: g */
    public void mo139561g() {
        super.mo139561g();
    }

    /* renamed from: h */
    public Object mo139563h(Object obj, Object obj2) {
        String str = (String) obj;
        return obj2;
    }

    /* renamed from: i */
    public Object mo139564i(Object obj, Object obj2) {
        return new C100686a((String) obj, this.f293825f, obj2, mo139571p(obj2), this.f293827h, this.f293828i);
    }

    /* renamed from: j */
    public V mo139565j(V v) {
        return v;
    }

    /* renamed from: k */
    public final boolean mo139566k(V v) {
        int i;
        int p = mo139571p(v) * 2;
        C101060a aVar = this.f295871a;
        C100687b bVar = C100687b.f295005c;
        if (aVar == null || aVar.equals("")) {
            i = Integer.MAX_VALUE;
        } else if (C100687b.f295006d.equals(aVar)) {
            i = C100687b.m131711b().f295007a.mo140121c().f295869a;
        } else {
            C100687b.m131711b().getClass();
            i = C100687b.m131711b().f295008b.get(aVar.f295870b).mo140121c().f295869a;
        }
        return p >= i;
    }

    /* renamed from: l */
    public V get(String str) {
        C101611g gVar;
        V v = this.f295872b.get(str);
        if (v == null && (gVar = this.f293826g) != null) {
            v = gVar.get(str);
        }
        C62585c<T, Y> cVar = this.f295873c;
        if (cVar != null) {
            C101069i iVar = (C101069i) cVar;
            Object b = iVar.mo140123b(this.f293825f, str);
            C101061b bVar = (C101061b) iVar.f295881a.get(b);
            if (bVar == null) {
                bVar = (C101061b) iVar.f295882b.get(b);
            }
            C100686a aVar = (C100686a) bVar;
        }
        C101060a aVar2 = C101060a.f295868c;
        return v;
    }

    /* renamed from: m */
    public final void mo139568m(Class<?> cls) {
        C101611g<String, Object> gVar;
        this.f293825f = cls.getName();
        C101060a aVar = this.f295871a;
        C100687b bVar = C100687b.f295005c;
        if (aVar == null || aVar.equals("")) {
            gVar = null;
        } else if (C100687b.f295006d.equals(aVar)) {
            gVar = C100687b.m131711b().f295007a.mo140120b();
        } else {
            C100687b.m131711b().getClass();
            gVar = C100687b.m131711b().f295008b.get(aVar.f295870b).mo140120b();
        }
        this.f293826g = gVar;
    }

    /* renamed from: n */
    public V put(String str, V v) {
        C101611g<String, Object> gVar;
        if (!mo139566k(v) || (gVar = this.f293826g) == null) {
            return super.put(str, v);
        }
        gVar.put(str, v);
        return null;
    }

    /* renamed from: o */
    public V remove(String str) {
        C101611g<String, Object> gVar = this.f293826g;
        if (gVar != null) {
            gVar.remove(str);
        }
        return super.remove(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = f293824j.get(r3.getClass());
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo139571p(V r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0015
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, o90.b$e> r0 = f293824j
            java.lang.Class r1 = r3.getClass()
            java.lang.Object r0 = r0.get(r1)
            o90.b$e r0 = (o90.C100301b.C100306e) r0
            if (r0 == 0) goto L_0x0015
            int r3 = r0.mo131148a(r3)
            return r3
        L_0x0015:
            sg.g<T, X> r0 = r2.f295872b
            java.lang.String r1 = ""
            int r3 = r0.sizeOf(r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.C100301b.mo139571p(java.lang.Object):int");
    }

    public Map<String, V> snapshot() {
        return this.f295872b.snapshot();
    }

    public Collection<V> values() {
        return this.f295872b.values();
    }

    public C100301b(int i, Class<?> cls) {
        this(i, (C101611g.C101612b) null, cls);
        mo139568m(cls);
    }

    public C100301b(int i, C101611g.C101612b<String, V> bVar, C101060a aVar, Class<?> cls) {
        super(i, bVar, aVar);
        this.f293825f = "";
        this.f293826g = null;
        this.f293827h = new C100304c();
        this.f293828i = new C100305d(this);
        mo139568m(cls);
    }
}
